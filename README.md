# Homework4.1_Magics_Dry_Solid_SHOP
### Ниже примечания где и как применены принципы Magics, Dry, Solid.
1. Magics - в коде практически не используются голые цифры не обозначенные конкретной заданной переменной с понятным именованием.
2. Dry - в коде отсутствуют повторения кода, вся  повторяющейся участки кода реализованы в методах.
3. SRP - каждый класс выполняют свою функцию (см. все классы) https://github.com/Ilcheg/Homework4.1_Magics_Dry_Solid_SHOP/tree/main/src/main/java/ru/netology/market
4. OSP - классы OrderWithEmailSend.java и OrderWithSmsSend.java расширяют функционал класса Order.java без его изменения согласно принципа OSP.
https://github.com/Ilcheg/Homework4.1_Magics_Dry_Solid_SHOP/tree/main/src/main/java/ru/netology/market/service
5. LSP - классы OrderWithEmailSend.java и OrderWithSmsSend.java переопределяют метод родительского класса Order.java без нарушения функционала переопределённого метода 
https://github.com/Ilcheg/Homework4.1_Magics_Dry_Solid_SHOP/tree/main/src/main/java/ru/netology/market/service
6. DIP - классы EmailNotification.java и SmsNotification.java имплементируют интерфейс Notification.java https://github.com/Ilcheg/Homework4.1_Magics_Dry_Solid_SHOP/blob/main/src/main/java/ru/netology/market/service/Notification.java
т.е. зависят от абстракций, а не от конкретных реализаций.
