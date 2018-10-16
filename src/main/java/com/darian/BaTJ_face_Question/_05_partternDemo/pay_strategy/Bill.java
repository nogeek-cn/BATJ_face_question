package com.darian.BaTJ_face_Question._05_partternDemo.pay_strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个单据，里边有一个一个的细项 List
 **/
public class Bill {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item)
    ;}

    public void removeItem(Item item){
        items.remove(item);
    }

    public int getSumCents(){
        return items.stream().mapToInt(Item::getCents).sum();
    }

    public void pay(PaymentMethod paymentMethod){
        paymentMethod.pay(getSumCents());
    }
}
