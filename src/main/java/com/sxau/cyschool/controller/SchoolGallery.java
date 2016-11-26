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
public class SchoolGallery extends ActionSupport {
    private SchoolGalleryService schoolGalleryService;

    private Image image;
    private Page<Image> page;

    private String des;
    private Integer nowPage;
    private List<Image> images;
    private File imagefile;
    private String imagefileFileName;
    private String imagefileContentType;
    private Integer imageId;

    public String findSchool() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        //todo 更具情况更改每页页数
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

    public String updateSchool() throws Exception {
        Image imageValue = schoolGalleryService.findImageById(imageId);
        imageValue.setIDes(des);
        String unique = UTimeUtil.timeRandom() + imagefileFileName;
        String path = ServletActionContext.getServletContext().getRealPath("/upload/gallery/" + unique);
        FileInputStream fis = new FileInputStream(imagefile);
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
        image.setILink("/upload/gallery/" + unique);
        schoolGalleryService.updatePhotoByPhoto(image);
        return "updateSchoolGallery";
    }

    public String deleteSchool() throws Exception {
        if (imageId != null) {
            schoolGalleryService.deletePhotoById(imageId);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String addSchool() throws Exception {
        String unique = UTimeUtil.timeRandom() + imagefileFileName;
        String path = ServletActionContext.getServletContext().getRealPath("/upload/gallery/");
        FileInputStream fis = new FileInputStream(imagefile);
        FileOutputStream fos = new FileOutputStream(new File(path,unique));
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
        image.setILink("/upload/gallery/" + unique);
        schoolGalleryService.savePhoto(image);
        return SUCCESS;
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

    public File getImagefile() {
        return imagefile;
    }

    public void setImagefile(File imagefile) {
        this.imagefile = imagefile;
    }

    public String getImagefileFileName() {
        return imagefileFileName;
    }

    public void setImagefileFileName(String imagefileFileName) {
        this.imagefileFileName = imagefileFileName;
    }

    public String getImagefileContentType() {
        return imagefileContentType;
    }

    public void setImagefileContentType(String imagefileContentType) {
        this.imagefileContentType = imagefileContentType;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
