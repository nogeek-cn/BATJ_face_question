package com.darian.BaTJ_face_Question._05_partternDemo.pay_strategy;

import org.springframework.stereotype.Service;

/**
 * 借记卡
 **/
@Service
public class CreditCard extends Card {

    @Override
    protected String getType() {
        return "credit";
    }

    @Override
    protected void excetuTransation(int cents) {
        System.out.println("doTranstion with credit:" + cents);
    }
}
