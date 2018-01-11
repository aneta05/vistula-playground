package org.vistula.customer;

import org.junit.Test;
import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    @Test
    public void AgeRestrictedItemTest1() {
        Customer klient = new Customer("Aneta", "Kowalska", 18);
        assert klient.ageRestrictedItem() == true;


    }

    @Test
    public void AgeRestrictedItemTest2() {
        Customer klient = new Customer("Aneta", "Kowalska", 17);
        assert klient.ageRestrictedItem() == false;
    }

    @Test
    public void TotalPriceTest() {
        Customer customer = new Customer("Aneta", "Kowalska", 17);
        BasketItem item1 = new BasketItem(6.99f, true);
        BasketItem item2 = new BasketItem(8.99f, false);
        List<BasketItem> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        customer.setBasket(itemList);
        System.out.println(customer.TotalBasketPrice());
        assert customer.TotalBasketPrice() == 15.98f;
    }

    @Test
    public void AddingToBasketTest() {
        Customer customer = new Customer("Aneta", "Kowalska", 17);
        BasketItem item1 = new BasketItem(6.99f, true);
        BasketItem item2 = new BasketItem(8.99f, false);
        customer.AddItemToBasket(item1);
        customer.AddItemToBasket(item2);

        assert customer.getBasket().contains(item1) == false;
        assert customer.getBasket().contains(item2) == true;
    }

    @Test
    public void AddingToBasketTest2() {
        Customer customer = new Customer("Aneta", "Kowalska", 18);
        BasketItem item1 = new BasketItem(6.99f, true);
        BasketItem item2 = new BasketItem(8.99f, false);
        customer.AddItemToBasket(item1);
        customer.AddItemToBasket(item2);
        assert customer.getBasket().contains(item1) == true;
        assert customer.getBasket().contains(item2) == true;

    }

    @Test
    public void ProductAddedToBasketTest() {
        Customer customer = new Customer("Aneta", "Kowalska", 18);
        BasketItem item1 = new BasketItem(6.99f, true);
        BasketItem item2 = new BasketItem(8.99f, false);
        customer.AddItemToBasket(item1);
        customer.AddItemToBasket(item2);

        customer.ProductsAddedToBasket();
    }

    @Test
    public void RemoveProductsFromBasketTest() {
        Customer customer = new Customer("Aneta", "Kowalska", 18);
        BasketItem item1 = new BasketItem(6.99f, true);
        BasketItem item2 = new BasketItem(8.99f, false);
        customer.AddItemToBasket(item1);
        customer.AddItemToBasket(item2);
        assert customer.getBasket().size() == 2;
        customer.RemoveProductsFromBasket((item2));
        assert customer.getBasket().size() == 1;
    }

    @Test
    public void RemoveProductsFromBasketNegativeTest() {
        Customer customer = new Customer("Aneta", "Kowalska", 18);
        BasketItem item1 = new BasketItem(6.99f, true);
        BasketItem item2 = new BasketItem(8.99f, false);
        customer.AddItemToBasket(item1);
        assert customer.getBasket().size() == 1;
        customer.RemoveProductsFromBasket(item2);
        assert customer.getBasket().size() == 1;


    }

}