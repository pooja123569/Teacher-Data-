package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.Dao.TeacherDao;
import com.tka.Entity.Teacher;

@Service
public class TeacherService {
	@Autowired
	TeacherDao TeacherD;

	public Teacher fetchTeacher(int TeaId) {
		return TeacherD.fetchTeacher(TeaId);
	}
	

	public void insertdata() {
		TeacherD.insertdata();
		
	}

	public void updateData(int TeaId) {
		TeacherD.updateData(TeaId);
		
	}



	public void deleteData(int TeaId) {
		TeacherD.deleteData(TeaId);
		
	}

}
