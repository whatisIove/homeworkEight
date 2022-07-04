package ua.system.cargotrans;

/**
 *
 * Класс заказа, который имеет свой номер, связанные с отправителем и получателем, наименованием кто, что  и
 * сколько отправляет товара куда, какой тип транспортировки, дата отправки и примерное время прибытия, сума и в
 * пути ли груз.
 *
 */

public class Order {

    int orderNumber;
    String companySender;
    String companyCustomer;
    String directionFrom;
    String directionTo;
    String transporationType;
    String dateOfDispatch;
    String arrivalDate;
    int amountCargo;
    double sumOrder;
    boolean inTransit;

}
