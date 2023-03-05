package ru.netology.market.service;

public class OrderWithSmsSend extends Order {
    @Override
    public void orderConfirmation() {
        super.orderConfirmation();
        SmsNotification smsNotification = new SmsNotification();
        smsNotification.notificationMessage();
    }
}
