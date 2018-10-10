package com.darian.BaTJ_face_Question.partternDemo.pay_strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * <br>Darian
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
