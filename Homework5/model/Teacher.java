package Homework5.model;

import java.util.Calendar;

public class Teacher extends User {
    private int id = 1;
    private String disciplines;
    private double rating;
    private String department;

    public Teacher(String name, String lastName, Calendar birhDay,
            String disciplines, double rating, String department) {
        super(name, lastName, birhDay);
        this.id = id++;
        this.disciplines = disciplines;
        this.rating = rating;
        this.department = department;
    }

    public String getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String disciplines) {
        this.disciplines = disciplines;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\n " + this.getClass().getName() +
                ", ID: " + getId() +
                " Name " + getName() + '\'' +
                " " + getLastName() + '\'' +
                " Discipline - " + disciplines +
                " Rating - " + rating +
                " Department: " + department;
    }

    public int getId() {
        return id;
    }



}
