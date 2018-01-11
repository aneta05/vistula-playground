package org.vistula.basket;

import org.junit.Test;

public class BasketItemTest {

    @Test
    public void MakeDiscountTest() {
        PromoItem item = new PromoItem(10.0f, true, 20);
       assert item.getPrice()==2.0f;
    }
}


