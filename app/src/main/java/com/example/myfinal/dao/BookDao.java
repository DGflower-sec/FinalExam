package com.example.myfinal.dao;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class BookDao implements Serializable {

    public int id;
    public String name;
    public String container;
    public String picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @NonNull
    @Override
    public String toString() {
        return "BookDao{" +
            "picure'" + picture + '\'' +
                    ", name'" + name + '\'' +
                    ", container'" + container + '\'' +
                    '}';


    }

    public BookDao(int id, String name, String container, String picture) {
        this.id = id;
        this.name = name;
        this.container = container;
        this.picture = picture;
    }

    public BookDao() {

    }
}
