package com.tka.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Teacher {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int TeaId;
	String Teaname;
	int TeaCapacity;
	String TeaLocation;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teaId, String teaname, int teaCapacity, String teaLocation) {
		super();
		TeaId = teaId;
		Teaname = teaname;
		TeaCapacity = teaCapacity;
		TeaLocation = teaLocation;
	}

	public int getTeaId() {
		return TeaId;
	}

	public void setTeaId(int teaId) {
		TeaId = teaId;
	}

	public String getTeaname() {
		return Teaname;
	}

	public void setTeaname(String teaname) {
		Teaname = teaname;
	}

	public int getTeaCapacity() {
		return TeaCapacity;
	}

	public void setTeaCapacity(int teaCapacity) {
		TeaCapacity = teaCapacity;
	}

	public String getTeaLocation() {
		return TeaLocation;
	}

	public void setTeaLocation(String teaLocation) {
		TeaLocation = teaLocation;
	}

	@Override
	public String toString() {
		return "Teacher [TeaId=" + TeaId + ", Teaname=" + Teaname + ", TeaCapacity=" + TeaCapacity + ", TeaLocation="
				+ TeaLocation + "]";
	}

}
