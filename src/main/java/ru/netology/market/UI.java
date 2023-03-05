package ru.netology.market;

import ru.netology.market.service.Order;
import ru.netology.market.service.OrderWithEmailSend;
import ru.netology.market.service.OrderWithSmsSend;

import java.util.List;
import java.util.Scanner;

public class UI {

    Cart cart = new Cart();
    private int input = 0;

    public UI() {
        menu();
    }

    public void welcomeScreen() {
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В НАШ МАГАЗИН!");
    }

    public void startScreen() {
        System.out.println("Введите номер и нажмите Enter");
        System.out.println("1. Выбрать продукты для заказа");
        System.out.println("2. Корзина");
        System.out.println("3. Подтвердить заказ");
        System.out.println("0. Выход");
    }

    public void storeProductsMenu() {
        System.out.println();
        System.out.println("Введите номер действия:");
        System.out.println("1. Добавить в корзину");
        System.out.println("2. Удалить из корзины");
        System.out.println("0. Выход");
    }

    public void menu() {
        welcomeScreen();
        do {
            startScreen();
            getUserInput();

            switch (input) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    orderMenu();
                    break;
                case 2:
                    showCart();
                    break;
                case 3:
                    if (cart.cartItems.isEmpty()) {
                        System.out.println("Наполните корзину товарами, затем подтвердите заказ!");
                        break;
                    } else {
                        orderNotification();
                    }
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (input != 0);
    }

    private void orderMenu() {
        System.out.println("Введите номер продукта:");
        switch (input) {
            case 1 -> {
                getUserInput();
                addProductToCart();
                showCart();
            }
            case 2 -> {
                getUserInput();
                removeProductFromCart();
                showCart();
            }
            default -> {
            }
        }
    }

    private void orderNotification() {
        System.out.println("Куда отправить Вам подтверждение заказа?");
        System.out.println("1. Уведомление на сайте");
        System.out.println("2. Отправить по Email");
        System.out.println("3. Отправить по СМС");
        getUserInput();
        switch (input) {
            case 1 -> {
                Order order = new Order();
                order.orderConfirmation();
            }
            case 2 -> {
                OrderWithEmailSend orderWithEmailSend = new OrderWithEmailSend();
                orderWithEmailSend.orderConfirmation();
            }
            case 3 -> {
                OrderWithSmsSend orderWithSmsSend = new OrderWithSmsSend();
                orderWithSmsSend.orderConfirmation();
            }
            default -> {
            }
        }
    }

    private void getUserInput() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        input = Integer.parseInt(in.nextLine());
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        System.out.println("Продукты доступные к заказу: ");
        for (Product prod : products) {
            System.out.println(
                    prod.getId() + ". " +
                            prod.getName() + ". " +
                            "Цена: " + prod.getPrice() + ". " +
                            "Доступное кол-во: " + prod.getQuantity()
            );
        }
    }

    private void addProductToCart() {
        cart.addProductToCartByID(input);
    }

    private void showCart() {
        if (cart.cartItems.isEmpty()) {
            System.out.println("Корзина пуста!");
            System.out.println();
        } else {
            cart.printCartItems();
        }
    }

    private void removeProductFromCart() {
        //int id = getUserInput();
        cart.removeProductByID(input);
    }
}