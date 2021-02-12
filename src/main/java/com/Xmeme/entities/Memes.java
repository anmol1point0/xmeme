package com.Xmeme.entities;

import java.io.Serializable;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mongodb.lang.NonNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MYDATE")
//@CompoundIndex(def = "{'Name':1,'Caption':1, 'Imageaddress':1}", unique = true)
public class Memes implements Serializable {

    /**
     * 
     */
    //private static final long serialVersionUID = 1L;

    /**
     *
     */
    
    @Id
    private String id;
    
    
    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	private String Name;

    private String Caption;

    @Indexed(unique=true)
    private String Imageaddress;


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


	public String getImageaddress() {
		return Imageaddress;
	}


	public void setImageaddress(String imageaddress) {
		Imageaddress = imageaddress;
	}


	public Memes(String name, String caption, String imageaddress) {
		super();
		Name = name;
		Caption = caption;
		Imageaddress = imageaddress;
	}


	public Memes() {
		super();
		// TODO Auto-generated constructor stub
	}

    

}
