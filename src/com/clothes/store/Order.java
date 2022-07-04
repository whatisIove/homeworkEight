package com.clothes.store;

/**
 *
 * Если клиент зарегистрирован, он будет иметь доступ к этой форме при помощи которой, сможет заказать нужные ему
 * вещи исходя из нужд в определённом количестве, оплатить свой заказ, применить скидку и указать адрес доставки.
 *
 */

public class Order {

    int orderNumber;
    int clientNumber;
    int productCode;
    int valueClothes;
    double orderPrice;
    double discountAmount;
    String deliveryAddress;
    boolean hasPaid;
    boolean orderDelivered;

}
