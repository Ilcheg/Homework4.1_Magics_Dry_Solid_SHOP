package ru.netology.market.service;

public class SmsNotification implements Notification {
    @Override
    public void notificationMessage() {
        System.out.println("Мы отправили подтверждение заказа по СМС");
    }
}
