package com.darian.BaTJ_face_Question.exceptionException;

public interface IUser {
    void changePwd() throws SafeException, RejectException; // RejectChangeException
}
