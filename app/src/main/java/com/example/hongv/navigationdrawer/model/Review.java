package com.example.hongv.navigationdrawer.model;

import java.util.Date;

/**
 * Created by Administrator on 03/02/2018.
 */

public class Review {
    private int idReview;
    private int idCenter;
    private int idUser;
    private String content;
    private String  date;
    private int quality;

    public Review(int idReview, int idCenter, int idUser, String content, String date, int quality) {
        this.idReview = idReview;
        this.idCenter = idCenter;
        this.idUser = idUser;
        this.content = content;
        this.date = date;
        this.quality = quality;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public int getIdCenter() {
        return idCenter;
    }

    public void setIdCenter(int idCenter) {
        this.idCenter = idCenter;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuanlity() {
        return quality;
    }

    public void setQuanlity(int quanlity) {
        this.quality = quanlity;
    }

    @Override
    public String toString() {
        return "com.example.killerb.test.model.Review{" +
                "idReview=" + idReview +
                ", idCenter=" + idCenter +
                ", idUser=" + idUser +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", quanlity=" + quality +
                '}';
    }
}
