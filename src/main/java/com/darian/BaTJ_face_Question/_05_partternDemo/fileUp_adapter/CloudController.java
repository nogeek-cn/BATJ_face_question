package com.darian.BaTJ_face_Question._05_partternDemo.fileUp_adapter;

/**
 * web 层对外提供，上传文件接口
 **/
public class CloudController {

    private CloudService cloudService;

    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void storeFileToCloud(){
        cloudService.uploadFile("darian的私人项目");
    }

}
