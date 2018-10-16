package com.darian.BaTJ_face_Question._05_partternDemo.pay_strategy;

import lombok.Data;

/**
 * 商品的细项
 * 名字
 * 价格
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
