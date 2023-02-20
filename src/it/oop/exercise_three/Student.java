package it.oop.exercise_three;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Student {
    private String name;
    private int age;
    private String course;
    private double gradesMean;
    private ArrayList<Double> grades = new ArrayList<>();
    private static int studentCounter = 0;
    private static int underageStudentCounter = 0;

    public Student(String name, int age, String course){
        this.setName(name);
        this.setAge(age);
        this.setCourse(course);
        studentCounter++;
    }

    public Student(String name, int age){
        this.setName(name);
        this.setAge(age);
        this.course = "Unknown";
        studentCounter++;
    }

    public Student(int age){
        this.age = age;
        this.name = "Unknown";
        this.course = "Unknown";
        studentCounter++;
    }


    public Student(String name){
        this.name = name;
        this.age = 0;
        this.course = "Unknown";
        studentCounter++;
    }

    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.course = "Unknown";
        studentCounter++;
    }

    public void setName(String name) {
        if(Pattern.compile("\\d").asPredicate().test(name)){
            System.out.println("Invalid Name!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid age!");
        }
        else if(age < 18){
            this.age = age;
            underageStudentCounter++;
        } else {
            this.age = age;
        }
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrades(double grade) {
        if(grade >= 0 && grade <= 30){
            this.grades.add(grade);
        } else {
            System.out.println("Invalid Grade!");
        }
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getGrades() {
        return this.grades;
    }

    private void setGradesMean() {
        this.gradesMean = 0;
        int gradesCounter = 0;
        if (this.grades.size() > 0) {
            for (double grade : this.grades) {
                this.gradesMean += grade;
                gradesCounter++;
            }
            this.gradesMean /= gradesCounter;
        } else {
            this.gradesMean = 0;
        }
    }

    public double getGradesMean() {
        setGradesMean();
        return this.gradesMean;
    }


    public int getAge() {
        return this.age;
    }

    public String getCourse() {
        return course;
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public static int getUnderageStudentCounter() {
        return underageStudentCounter;
    }

    public static int getAdultStudentCounter(){
        return studentCounter - underageStudentCounter;
    }
}
