package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.service.SchoolGalleryService;
import com.sxau.cyschool.utils.Page;
import com.sxau.cyschool.utils.UTimeUtil;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by gaohailong on 2016/11/24.
 */
public class SchoolGalleryAction extends ActionSupport {
    private SchoolGalleryService schoolGalleryService;

    private Image image;
    private Page<Image> page;

    private String des;
    private Integer nowPage;
    private List<Image> images;
    private File imagea;
    private String imageaFileName;
    private String imageaContentType;
    private Integer imageId;
    private String messageDes;
    private String messagePic;

    public String findSchool() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = schoolGalleryService.queryImageByCondition(image, nowPage, 20);
        images = page.getRows();
        return "findSchoolGallery";
    }

    public String findOneSchool() throws Exception {
        if (imageId != null) {
            image = schoolGalleryService.findImageById(imageId);
            return "updateSchoolGallery";
        } else {
            return ERROR;
        }
    }

    public String addSchool() throws Exception {
        if(des==null||"".equals(des)){
            messageDes="描述不能为空";
            return "addSchoolGallery";
        }
        if(imageaFileName==null||"".equals(imageaFileName)){
            messagePic="图片不能为空";
            return "addSchoolGallery";
        }
        String unique = UTimeUtil.timeRandom() + imageaFileName;
        System.out.print("文件名" + imageaFileName + "===");
        String path = ServletActionContext.getServletContext().getRealPath("/upload/gallery/"+unique);
        File file = new File(path);
        if (!file.exists())
            file.createNewFile();
        FileInputStream fis = new FileInputStream(imagea);
        FileOutputStream fos = new FileOutputStream(path);
        int length = -1;
        byte[] bytes = new byte[1024];
        do {
            length = fis.read(bytes);
            if (length != -1) {
                fos.write(bytes, 0, length);
            }
        } while (length != -1);
        fos.flush();
        fos.close();
        fis.close();
        Image image = new Image();
        image.setIDes(des);
        image.setIClick(0);
        image.setILink("/upload/gallery/" + unique);
        schoolGalleryService.savePhoto(image);
        return SUCCESS;

    }

    public String updateSchool() throws Exception {
        String unique = UTimeUtil.timeRandom() + imageaFileName;
        Image imageValue = schoolGalleryService.findImageById(imageId);
        if(des!=null&&!"".equals(des)){
            imageValue.setIDes(des);
        }
        if(imageaFileName!=null&&!"".equals(imageaFileName)){
            imageValue.setILink("/upload/gallery/" + unique);
            String path = ServletActionContext.getServletContext().getRealPath("/upload/gallery/" + unique);
            File file = new File(path);
            if (!file.exists())
                file.createNewFile();
            FileInputStream fis = new FileInputStream(imagea);
            FileOutputStream fos = new FileOutputStream(path);
            int length = -1;
            byte[] bytes = new byte[1024];
            do {
                length = fis.read(bytes);
                if (length != -1) {
                    fos.write(bytes, 0, length);
                }
            } while (length != -1);
            fos.flush();
            fos.close();
            fis.close();
        }
        schoolGalleryService.updatePhotoByPhoto(imageValue);
        return SUCCESS;
    }

    public String deleteSchool() throws Exception {
        if (imageId != null) {
            schoolGalleryService.deletePhotoById(imageId);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }


    public SchoolGalleryService getSchoolGalleryService() {
        return schoolGalleryService;
    }

    public void setSchoolGalleryService(SchoolGalleryService schoolGalleryService) {
        this.schoolGalleryService = schoolGalleryService;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public File getImagea() {
        return imagea;
    }

    public void setImagea(File imagea) {
        this.imagea = imagea;
    }

    public String getImageaFileName() {
        return imageaFileName;
    }

    public void setImageaFileName(String imageaFileName) {
        this.imageaFileName = imageaFileName;
    }

    public String getImageaContentType() {
        return imageaContentType;
    }

    public void setImageaContentType(String imageaContentType) {
        this.imageaContentType = imageaContentType;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getMessageDes() {
        return messageDes;
    }

    public void setMessageDes(String messageDes) {
        this.messageDes = messageDes;
    }

    public String getMessagePic() {
        return messagePic;
    }

    public void setMessagePic(String messagePic) {
        this.messagePic = messagePic;
    }
}
