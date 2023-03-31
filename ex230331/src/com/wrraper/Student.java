package com.wrraper;

public class Student {
	private String studentNum;
	
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNUM(){
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (studentNum.equals((Student)obj)) {
				return true;
			} 
		}
		return false;
	}

	
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}
