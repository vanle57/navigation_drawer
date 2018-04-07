package com.example.hongv.navigationdrawer.controller;

import com.example.hongv.navigationdrawer.model.Center;
import com.example.hongv.navigationdrawer.model.Course;
import com.example.hongv.navigationdrawer.model.Review;
import com.example.hongv.navigationdrawer.model.Subject;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Administrator on 03/02/2018.
 */

public class RECManager {
     private  ArrayList<Center> mCenterArraylist;
     private  ArrayList<Course> mCourseArraylist;
     private  ArrayList<Subject> mSubjectArrayList;
     private  ArrayList<Review> mReviewArrayList;

     private static RECManager sInstance =null;

     private RECManager (){
         mCenterArraylist= new ArrayList<>();
         mCourseArraylist= new ArrayList<>();
         mSubjectArrayList= new ArrayList<>();
         mReviewArrayList = new ArrayList<>();


     }

    public  static  RECManager getsInstance(){
        if (sInstance==null){
            sInstance= new RECManager();
        }
        return  sInstance;
    }

    public void  load(){
        mCenterArraylist.clear();
        mCourseArraylist.clear();
        mSubjectArrayList.clear();
        mReviewArrayList.clear();

        mSubjectArrayList.add(new Subject(1, "Math"));
        mSubjectArrayList.add(new Subject(2, "Literature"));
        mSubjectArrayList.add(new Subject(3, "Physical"));
        mSubjectArrayList.add(new Subject(4, "Foreign Languages"));

        mCourseArraylist.add(new Course(1, "Lop 1", 1, 1, "Toan danh cho lop 1"));
        mCourseArraylist.add(new Course(2, "Lop 12 va on thi dai hoc", 2, 1, "Luyen thi dai hoc mon Ngu Van cap toc"));
        mCourseArraylist.add(new Course(3, "Lop 9", 3, 4, "Chuyen on thi len lop 10. Dam bao dau 100%"));
        mCourseArraylist.add(new Course(4, "Toan THCS", 1, 3, "Chuyen day toan cap THCS va on thi len lop 10"));
        mCourseArraylist.add(new Course(5, "Khoa Pronunciation", 4, 5, "Khoa hoc tieng Anh giao tiep danh cho nguoi moi bat dau" ));

        Calendar cal = Calendar.getInstance();

        mReviewArrayList.add(new Review(1,1,1,"Giờ học linh hoạt. Do mình đi làm nên thời gian rảnh rỗi ko nhiều, ở WSE mình có thể tự sắp xếp lịch học, bữa nào bận quá có thể báo PT chuyển sang bữa khác học bù.", Calendar.getInstance().getTime(), 1));
        mReviewArrayList.add(new Review(2,2,2,"Giáo viên rất giỏi và tận tình, rất chịu khó nói chuyện với mình để mình khá lên và tự tin hơn.", Calendar.getInstance().getTime(),2));
        mReviewArrayList.add(new Review(3,3,3,"Có nhiều hoạt động ngoại khóa như mấy buổi workshop hay seminar, diễn giả toàn là chuyên gia nổi tiếng, mình biết thêm được rất nhiều kiến thức bên ngoài.", Calendar.getInstance().getTime(),4));
        mReviewArrayList.add(new Review(5,4,4,"Môi trường 100% giao tiếp bằng Tiếng Anh, nên mỗi lần vô học là mình thích lắm, cảm giác cứ như là đang ở bên nước ngoài thực thụ. Bên cạnh đó, cơ sở vật chất ở đây là cực kì tốt, đầy đủ tiện nghi luôn nha.", Calendar.getInstance().getTime(),4));
        mReviewArrayList.add(new Review(5,5,5,"Giáo viên rất giỏi và tận tình, rất chịu khó nói chuyện với mình để mình khá lên và tự tin hơn.", Calendar.getInstance().getTime(),4));



    }

    public ArrayList<Subject> getSubjects () {
        if (mSubjectArrayList.isEmpty()) {
            load();
        }
        return mSubjectArrayList;
    }
    public ArrayList<Center> getCenter (){
        if (mCenterArraylist.isEmpty()){
            load();
        }
        return mCenterArraylist;

    }

    public  ArrayList<Review> getReview(){
        if (mReviewArrayList.isEmpty()){
            load();
        }
        return  mReviewArrayList;

    }
    public ArrayList<Course> getCourses (Subject subject) {
        ArrayList<Course> list = new ArrayList<>();
        for (Course c : list) {
            if(c.getIdSubject()==subject.getIdSubject()) {
                list.add(c);
            }
        }
        return list;
    }

}
