package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tka.Service.TeacherService;
import com.tka.Entity.Teacher;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/getTeacher/{TeaId}") // Correct mapping
	public Teacher fetchTeacher(@PathVariable int teaId) {
		System.out.println("I have reached the Controller layer");
		Teacher teacher = teacherService.fetchTeacher(teaId);
		return teacher;
	}

	@GetMapping("insert")
	public void insertdata() {
		teacherService.insertdata();
	}

	@PutMapping("update/{TeaId}")
	public void updateData(@PathVariable int TeaId) {
		teacherService.updateData(TeaId);
	}
	@DeleteMapping("delete/{TeaId}")
	public void deleteData(@PathVariable int TeaId )
	{
		teacherService.deleteData(TeaId);
	}
}
