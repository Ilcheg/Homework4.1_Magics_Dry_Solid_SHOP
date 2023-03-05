package ru.netology.market.service;

public class OrderWithEmailSend extends Order {
    @Override
    public void orderConfirmation() {
        super.orderConfirmation();
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.notificationMessage();
    }
}
