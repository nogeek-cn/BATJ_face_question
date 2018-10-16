package com.darian.BaTJ_face_Question._08_cloneDemo;

/**
 * <br>
 * <br>Darian
 **/
public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Email email = new Email("今晚20点30分准时上课");
        User user = new User("darian", email);

        User user1 = (User) user.clone();
        user1.setName("james");
        user1.getEmail().setContext("8点来上课");
        System.out.println(user);

        System.out.println(user1);
    }
}
