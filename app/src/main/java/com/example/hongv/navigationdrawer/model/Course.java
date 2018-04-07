package com.example.hongv.navigationdrawer.model;

/**
 * Created by Administrator on 03/02/2018.
 */

public class Course {
    private int idCourse;
    private String nameCourse;
    private int idSubject;
    private int idCenter;
    private String information;

    public Course(int idCourse, String nameCourse, int idSubject, int idCenter, String information) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.idSubject = idSubject;
        this.idCenter = idCenter;
        this.information = information;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public int getIdCenter() {
        return idCenter;
    }

    public void setIdCenter(int idCenter) {
        this.idCenter = idCenter;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                ", idSubject=" + idSubject +
                ", idCenter=" + idCenter +
                ", information='" + information + '\'' +
                '}';
    }
}
