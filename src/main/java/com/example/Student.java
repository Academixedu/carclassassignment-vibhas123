package com.example;

// Starter code for Student class
public class Student {
    // Attributes
    private String name;
    private int age;
    private String studentId;
    private String major;

    // Add a constructor here
    // public Student(String name, int age, String studentId, String major) { ... }

    // Add getter and setter methods here
    // public String getName() { ... }
    // public void setName(String name) { ... }
    // public int getAge() { ... }
    // public void setAge(int age) { ... }
    // public String getStudentId() { ... }
    // public void setStudentId(String studentId) { ... }
    // public String getMajor() { ... }
    // public void setMajor(String major) { ... }

    
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(studentId);
        System.out.println(major);
        // TODO: Implement this method
    }

    public Student(String name, int age, String studentId, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    // Method to update major
    public void updateMajor(String newMajor) {

        setMajor(newMajor);
        // TODO: Implement this method
    }
}
