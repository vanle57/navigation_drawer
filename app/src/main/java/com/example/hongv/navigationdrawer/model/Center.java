package com.example.hongv.navigationdrawer.model;

import java.io.Serializable;

/**
 * Created by Administrator on 03/02/2018.
 */

public class Center implements Serializable{
    private  int idCenter;
    private  String nameCenter;
    private  String address;
    private  String phone;
    private  int picture;
    private  float quality;

    public Center(int idCenter, String nameCenter, String address, String phone, int picture, float quality) {
        this.idCenter = idCenter;
        this.nameCenter = nameCenter;
        this.address = address;
        this.phone = phone;
        this.picture = picture;
        this.quality = quality;
    }

    public int getIdCenter() {
        return idCenter;
    }

    public String getNameCenter() {
        return nameCenter;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getPicture() {
        return picture;
    }

    public float getQuality() {
        return quality;
    }

    public void setIdCenter(int idCenter) {
        this.idCenter = idCenter;
    }

    public void setNameCenter(String nameCenter) {
        this.nameCenter = nameCenter;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void setQuality(float quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Center{" +
                "idCenter=" + idCenter +
                ", nameCenter='" + nameCenter + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", picture='" + picture + '\'' +
                ", quality=" + quality +
                '}';
    }
}
