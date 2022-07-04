package ua.system.cargotrans;

/**
 *
 * Класс компании, которая делает заказ, в нём есть баланс компании, которая платит за заказ, её название,
 * месторасположение, адрес и номер склада на который приедет товар со склада отправителя.
 *
 */

public class Customer {

    String customerCompany;
    String location;
    String adress;
    int warehouseNumber;
    double balance;

}
