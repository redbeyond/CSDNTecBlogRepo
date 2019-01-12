	package org.study.jsf.basic.mvc.controller;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.SessionAttributes;
	import org.study.jsf.basic.mvc.view.StudentView;
	import org.study.jsf.basic.repository.data.Student;
	import org.study.jsf.basic.service.StudentService;
	
	@Controller
	@SessionAttributes("studentView")
	@RequestMapping("/student")
	public class StudentController {
	
		@Autowired
		private StudentService studentService;
	
		@RequestMapping(value = "/info", method = RequestMethod.GET)
		public String showInfo(Model model) {
			StudentView studentView = new StudentView();
			List<Student> students = this.studentService.findAllStudents();
			studentView.setStudents(students);
			model.addAttribute("studentView", studentView);
			return "showInfo";
		}
	
		@RequestMapping(value = "/dragabledisplay", method = RequestMethod.GET)
		public String dragableDisplay(Model model) {
			StudentView studentView = new StudentView();
			List<Student> students = this.studentService.findAllStudents();
			studentView.setStudents(students);
			studentView.setDroppedStudents(new ArrayList<Student>());
			model.addAttribute("studentView", studentView);
			return "dragableDisplay";
		}
	}
