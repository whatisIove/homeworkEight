package com.clothes.store;

/**
 *
 * В этом классе описывается и создается ассортимент магазина. Каждая вещь имеет свой кодовый номер, категорию,
 * наименование бренда и самой вещи, так же её описание, на распродаже ли она и возможность использовать бонусы.
 *
 */

public class Assortment {

    int productCode;
    String category;
    String brand;
    String title;
    String description;
    int price;
    int value;
    boolean onSale;
    boolean useBonuses;

}
