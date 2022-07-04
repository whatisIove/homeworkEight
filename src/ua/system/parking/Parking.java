package ua.system.parking;

/**
 *
 * Класс, который позволяет организовать работу парковки, где все места будут распределеными под четким порядковым
 * номером и под определёенную категорию транспортного средства (легковые, грузовые и т.п) сколько будет стоит
 * почасовая оплата, количество парковочного времени, сумму оплаты и проверка, занято место или нет.
 *
 */

public class Parking {

    int parkingNumber;
    String carCategory;
    int placesParking;
    int priceHour;
    int hoursParking;
    double sum;
    boolean placeTaken;

}
