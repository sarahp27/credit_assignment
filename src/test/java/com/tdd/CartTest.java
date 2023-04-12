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
}