package com.example.dynex_000.fooditem;

/**
 * Created by admin on 3/22/2016.
 */
public class BeanClassForListView2 {

    private String image;
    private  String title;
    private String description;
    private String prc;


    public BeanClassForListView2(String image, String title, String description,String prc) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.prc = prc;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getprc() {
        return prc;
    }

    public void setPrc(String prc) {
        this.prc = prc;
    }



}
