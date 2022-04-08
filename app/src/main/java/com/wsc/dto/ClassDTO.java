package com.wsc.dto;

public class ClassDTO {

    private String className;
    private String classTime;
    private int classImage;

    // Constructor
    public ClassDTO(String className, String classTime, int classImage) {
        this.className = className;
        this.classTime = classTime;
        this.classImage = classImage;
    }

    // Getter and Setter
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public int getClassImage() {
        return classImage;
    }

    public void setClassImage(int classImage) {
        this.classImage = classImage;
    }
}
