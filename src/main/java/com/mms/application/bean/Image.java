package com.mms.application.bean;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by olatu on 26/12/2015.
 */
@Entity
@Table(name = "user_image")
public class Image implements Serializable{

    private int id;
    private byte[] image;
    private boolean heroImage;
    private String caption;
    private Album album;
    public Image(){}

    @Id
    @GeneratedValue
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column (name = "image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column (name = "hero_image", columnDefinition = "TINYINT")
    public boolean isHeroImage() {
        return heroImage;
    }

    public void setHeroImage(boolean heroImage) {
        this.heroImage = heroImage;
    }

    @Column (name = "caption")
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @ManyToOne()
    @JoinColumn(name = "album_id", referencedColumnName="id")
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
