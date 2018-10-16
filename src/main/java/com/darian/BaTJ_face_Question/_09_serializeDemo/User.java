package com.darian.BaTJ_face_Question._09_serializeDemo;

import lombok.Data;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class User implements Serializable {

    // 标识 最好设置这个标志指纹
    private static final long serialVersionUID = -2454516515575292214L;

    private String name;

    private transient  String sex;

    private transient  String age;

    public User(String name) {
        this.name = name;
    }

    private void writeObject(ObjectOutputStream out)throws IOException{
        out.defaultWriteObject();
        out.writeObject(sex);
        out.writeObject(age);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        sex = (String) in.readObject();
        age = (String) in.readObject();
    }
}
