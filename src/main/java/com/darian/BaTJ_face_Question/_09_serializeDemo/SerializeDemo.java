package com.darian.BaTJ_face_Question._09_serializeDemo;

import java.io.*;

/**
 * <br>
 * <br>Darian
 **/
public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("darian");
        user.setSex("男");
        user.setAge("23");

//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user"));
        objectOutputStream.writeObject(user);

//        byte[] bytes = byteArrayOutputStream.toByteArray();
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user"));

        User userSerialize = (User)objectInputStream.readObject();
        System.out.println(userSerialize);
    }
}
