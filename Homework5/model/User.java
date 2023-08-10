package Homework5.model;

import java.util.Calendar;

public abstract class User {
    private String name;
    private String lastName;
    private Calendar birhDay;
    
    public User(String name, String lastName, Calendar birhDay) {
        this.name = name;
        this.lastName = lastName;
        this.birhDay = birhDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getBirhDay() {
        return birhDay;
    }

    public void setBirhDay(Calendar birhDay) {
        this.birhDay = birhDay;
    }

}
