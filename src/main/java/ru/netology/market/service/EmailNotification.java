package ru.netology.market.service;

public class EmailNotification implements Notification {

    @Override
    public void notificationMessage() {
        System.out.println("Мы отправили подтверждение заказа на Вашу почту!");
    }
}
