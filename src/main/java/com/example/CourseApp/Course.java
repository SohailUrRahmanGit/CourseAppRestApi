package com.example.CourseApp;

public class Course {
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAutherName(String authorName) {
        this.authorName = authorName;
    }

    private String courseId;
    private String courseName;
    private String authorName;

    public Course(String courseId, String courseName, String authorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
    }
}
