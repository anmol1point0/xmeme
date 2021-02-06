package com.Xmeme.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mongodb.lang.NonNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MYDATE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Memes implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */

    private String Name;

    private String Caption;

    @Id
    @NonNull
    private String Image_url;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

    public Memes(String name, String caption, String image_url) {
        Name = name;
        Caption = caption;
        Image_url = image_url;
    }

    public Memes() {
        super();
    }

}
