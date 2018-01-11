package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;


    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        basket = new ArrayList<BasketItem>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean ageRestrictedItem() {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = basket;
    }

    public float TotalBasketPrice() {
        float totalPrice = 0;
        for (int i = 0; basket.size() - 1 >= i; i++) {
            totalPrice = totalPrice + basket.get(i).getPrice();
        }
        return totalPrice;
    }

    public void AddItemToBasket(BasketItem item) {
        if (item.isAgeRestrictedItem()) {
            if (ageRestrictedItem()) {
                basket.add(item);
                System.out.println("Przedmiot dodany do koszyka");
            } else {
                System.out.println("Nie spełniasz wymogów wiekowych.");
            }
        } else {
            basket.add(item);
            System.out.println("Przedmiot dodany do koszyka");
        }
    }

    public void ProductsAddedToBasket() {
        for (int i = 0; basket.size() - 1 >= i; i++) {
            System.out.println("Produkt numer " + (i + 1) + " ma cenę: " + basket.get(i).getPrice());

        }

    }

    public void RemoveProductsFromBasket(BasketItem item) {
        if (basket.contains(item)) {
            basket.remove(item);


        } else {
            System.out.println(" Nie ma takiego przedmiotu w koszyku");
        }
    }
}
