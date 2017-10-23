package com.mms.application.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by olatu on 26/12/2015.
 */
@Entity
@Table(name = "user_album")
public class Album implements Serializable{

    private int id;
    private Profile profile;
    private Collection<Image> images;

    public Album(){}

    @Id
    @GeneratedValue
    @Column (name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "album", fetch= FetchType.EAGER)
    public Collection<Image> getImages() {
        return images;
    }

    public void setImages(Collection<Image> images) {
        this.images = images;
    }

    @OneToOne (cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "profile_id",referencedColumnName = "id")
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
