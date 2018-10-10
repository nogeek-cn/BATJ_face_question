package com.darian.BaTJ_face_Question.partternDemo.fileUp_adapter;

/**
 * <br>
 * <br>Darian
 **/
public class CloudController {

    CloudService cloudService;

    public void storeFileToCloud(){
        cloudService.uploadFile("darian的私人项目");
    }
}
