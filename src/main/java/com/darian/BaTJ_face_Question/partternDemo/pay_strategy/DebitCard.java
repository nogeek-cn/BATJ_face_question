package com.darian.BaTJ_face_Question.partternDemo.pay_strategy;

import org.springframework.stereotype.Service;

/**
 * 信用卡
 **/
@Service
public class DebitCard extends Card{
    @Override
    protected String getType() {
        return "debit";
    }

    @Override
    protected void excetuTransation(int cents) {
        System.out.println("doTranstion with Debit:" + cents);
    }
}
