package com.darian.BaTJ_face_Question._08_cloneDemo;

import lombok.Data;

/**
 * 父类
 * Cloneable 接口中没有任何实现实现，也没有定义方法。
 * 它是一种标志
 * 告诉别人：这个类重写了 clone() 方法，并加上了 Cloneable 标志。
 **/
@Data
public class User implements Cloneable {

    private String name;

    private Email email;

    public User(String name, Email email) {
        this.name = name;
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.setEmail((Email) getEmail().clone());
        return user;
    }

}