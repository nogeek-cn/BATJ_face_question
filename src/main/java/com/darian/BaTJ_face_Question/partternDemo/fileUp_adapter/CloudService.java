package com.darian.BaTJ_face_Question.partternDemo.fileUp_adapter;

/**
 * <br>
 * <br>Darian
 **/
public class CloudService {

    AWSJDK awsjdk;

    public void uploadFile(String fileName){
        awsjdk.putObject(fileName);
    }
}
