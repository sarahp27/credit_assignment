package com.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {
    @Test
    public void emptycart(){
        //Setup
        int items=0;
        //
        Cart cart=new Cart();
        int item=cart.getItem();
        //assert
        assertEquals(items, item);
    }

    @Test
    public void SumOfItems(){
        //Setup
        int items=1400;
        //
        Cart cart1=new Cart("Meezan Oil",700,2);
        
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getTotalSum();
        //Asset
        assertEquals(items, sum);

    }
}

