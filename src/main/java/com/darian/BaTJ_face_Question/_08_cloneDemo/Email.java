package com.darian.BaTJ_face_Question._08_cloneDemo;

import lombok.Data;

/**
 * 子类
 **/
@Data
public class Email implements Cloneable {
    private String context;

    public Email(String context) {
        this.context = context;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
