package Homework5.model;

import java.util.Calendar;

public class Student extends User {
    private int id = 1;
    private int numgroup;
    private String speciality;
    private double averageRating;

    public Student(String name, String lastName, Calendar birhDay, int numgroup,
            String speciality, double averageRating) {
        super(name, lastName, birhDay);
        this.id = id++;
        this.numgroup = numgroup;
        this.speciality = speciality;
        this.averageRating = averageRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumgroup() {
        return numgroup;
    }

    public void setNumgroup(int numgroup) {
        this.numgroup = numgroup;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "\n " + this.getClass().getName() +
                ", ID: " + getId() +
                " Name " + getName() + '\'' +
                " " + getLastName() + '\'' +
                " Group - " + numgroup +
                " Speciality - " + speciality +
                " Average rating: " + averageRating;
    }









}