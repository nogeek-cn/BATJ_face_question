package com.darian.BaTJ_face_Question.partternDemo.pay_strategy;

import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class Item {
    private String des;
    private int cents;

    public Item(String des, int cents) {
        this.des = des;
        this.cents = cents;
    }
}
