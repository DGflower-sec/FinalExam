package com.example.myfinal.vo;

import java.io.Serializable;

public class Connect implements Serializable {
    int id;
    int u_id;
    int b_id;

    public Connect() {
    }

    public Connect(int id, int u_id, int b_id) {
        this.id = id;
        this.u_id = u_id;
        this.b_id = b_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }
}
