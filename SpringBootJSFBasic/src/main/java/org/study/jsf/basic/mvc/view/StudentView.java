package org.study.jsf.basic.mvc.view;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.DragDropEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.study.jsf.basic.repository.data.Student;

import lombok.Data;

@Data
public class StudentView {
	private Student selectedStudent;
	private List<Student> students;
	private List<Student> droppedStudents;

	// 对应的是数据行选择事件
	public void onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Student Selected", ((Student) event.getObject()).getName());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	// 对应的是数据行选择取消事件
	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Student Unselected", ((Student) event.getObject()).getName());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	// 对应拖动释放的动作
	public void onStudentDrop(DragDropEvent ddEvent) {
		Student student = ((Student) ddEvent.getData());
		droppedStudents.add(student);
		students.remove(student);
	}

}
