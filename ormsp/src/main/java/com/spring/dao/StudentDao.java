package com.spring.dao;

import java.util.List;

import com.spring.entities.Student;

public interface StudentDao {
  public int insert(Student student);
  public List<Student> getAllStudent();
  public Student getStudent(int studentId);
  public void deleteStudent(Student student);
  public void updateStudent(Student student);
}
