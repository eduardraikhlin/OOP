package Homework5.service;

import java.util.Calendar;

public class UserService  implements DataService {

  @Override
  public Student createStudent(String name, String lastName, Calendar birthDay, int group, String speciality,
      double meanBall) {
    Student student = new Student(name, lastName, birthDay, group, speciality, meanBall);
    return student;
  }

  @Override
  public Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    Teacher teacher = new Teacher(name, lastName, birthDay, disciplines, rating, department);
    return teacher;
  }

}