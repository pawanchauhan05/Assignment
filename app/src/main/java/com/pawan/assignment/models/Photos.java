package com.pawan.assignment.models;

import com.pawan.assignment.models.ImagesMap;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class Photos {
    private String title;
    private ImagesMap imagesMap;
    private String name;
    private boolean displayPic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImagesMap getImagesMap() {
        return imagesMap;
    }

    public void setImagesMap(ImagesMap imagesMap) {
        this.imagesMap = imagesMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisplayPic() {
        return displayPic;
    }

    public void setDisplayPic(boolean displayPic) {
        this.displayPic = displayPic;
    }

    @Override
    public String toString() {
        return "Photos{" +
                "title='" + title + '\'' +
                ", imagesMap=" + imagesMap +
                ", name='" + name + '\'' +
                ", displayPic=" + displayPic +
                '}';
    }
}
