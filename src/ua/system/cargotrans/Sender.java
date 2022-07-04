package ua.system.cargotrans;

/**
 *
 * Класс компании отправителя в котором будет указано имя организации, её месторасположение, адрес и номер складов,
 * категории товаров которые имеются и сам товар, его номер порядковый, цена, количество в остатке и лимит на заказ.
 *
 */

public class Sender {

    String senderCompany;
    String location;
    String adress;
    int warehouseNumber;
    String productCategory;
    String product;
    int productNumber;
    double productPrice;
    int valueProducts;
    int orderLimit;

}
