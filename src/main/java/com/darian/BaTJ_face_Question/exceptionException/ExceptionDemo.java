package com.darian.BaTJ_face_Question.exceptionException;

/**
 * <br>
 * <br>Darian
 **/
public class ExceptionDemo {
    public static void main(String[] args)  {
//        try {
//            throw new SQLException("sql Exception");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        throw new RuntimeException("运行时异常");
        IUser iUser = null;
        try {
            iUser.changePwd();
        } catch (SafeException e) {
            e.printStackTrace();
        } catch (RejectException e) {
            e.printStackTrace();
        }
    }
}
