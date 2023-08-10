package Homework5.model;

import java.util.ArrayList;
import java.util.List;

public class DataBase<T extends User> {

  private List<Student> listStudents = new ArrayList<>();

  public void initStudents(List<Student> students) {
    this.listStudents = students;
  }

  private List<Teacher> listTeachers = new ArrayList<>();

  public void initTeachers(List<Teacher> teachers) {
    this.listTeachers = teachers;
  }

  public List<Student> getListStudents() {
    return listStudents;
  }

  public void setListStudents(List<Student> students) {
    this.listStudents = students;
  }

  public List<Teacher> getListTeachers() {
    return listTeachers;
  }

  public void setListTeachers(List<Teacher> teachers) {
    this.listTeachers = teachers;
  }

  @Override
  public String toString() {
    String result = "";
    for (Student student : listStudents) {
      result += student.toString() + "\n";
    }
    for (Teacher teacher : listTeachers) {
      result += teacher.toString() + "\n";
    }
    return result;
  }

}