package org.vistula.basket;

public class BasketItem {

    private float price;
    boolean ageRestrictedItem;

    //Wygenerować przez IntelliJ konstruktory, gettery i settery w klasach BasketItem i Customer
//2. Napisać metodę, która zwraca true jeżeli wiek klienta jest większy lub równy 18 + testy

    public BasketItem(float price, boolean ageRestrictedItem) {
        this.price = price;
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public boolean isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public void setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
