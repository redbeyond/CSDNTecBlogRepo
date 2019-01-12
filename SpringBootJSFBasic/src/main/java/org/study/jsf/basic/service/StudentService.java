package org.study.jsf.basic.service;

import java.util.List;

import org.study.jsf.basic.repository.data.Student;

public interface StudentService {

	Student findStudentById(long id);

	List<Student> findAllStudents();
}