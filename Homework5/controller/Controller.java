package Homework5.controller;

import java.util.Calendar;

public class Controller {

    private DataService serviceStud = new UserService();
    public Student createNewStudent(String name, String lastName, Calendar birthday, int group, String speciality,
            double meanBall) {
        return serviceStud.createStudent(name, lastName, birthday, group, speciality, meanBall);
    }

    private DataService serviceTeach = new UserService();
    public Teacher createNewTeacher(String name, String lastName, Calendar birthday, String disciplines,
            String department, double rating) {
                return serviceTeach.createTeacher(name, lastName, birthday, disciplines, department, rating);
    }

}
