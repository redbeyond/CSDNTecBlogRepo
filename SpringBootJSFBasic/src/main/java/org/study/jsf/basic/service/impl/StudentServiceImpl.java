package org.study.jsf.basic.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.study.jsf.basic.repository.data.Student;
import org.study.jsf.basic.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private Map<Long, Student> mapStudent;

	public StudentServiceImpl() {
		this.initForTest();
	}

	@Override
	public Student findStudentById(long id) {
		return this.mapStudent.get(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return new ArrayList<Student>(this.mapStudent.values());
	}

	private void initForTest() {
		this.mapStudent = new HashMap<Long, Student>();
		this.mapStudent.put(1L, new Student(1, "学生一", 25, "擅长前端开发"));
		this.mapStudent.put(2L, new Student(2, "学生二", 26, "擅长后端开发"));
		this.mapStudent.put(3L, new Student(3, "学生三", 24, "擅长算法设计"));
	}
}
