package oop2;

import java.util.Arrays;

public class Professor {
	private String[] lectures = new String[5];
	
	@Override
	public void print() {
			System.out.println("name:" + getName()+", sid:" + getSid() + ", phone:" + getPhone() + ", gender:" + getGender() + ", dept:" +
			getDept() + "lectures: " + lectures2Str() /* Arrays.toString(lectures) */ ); 
			}
	
	private String lectures2Str() {
		// "[프로그래밍기초, 웹프로그래밍(I)]"
		String result = "[";
		if (lectures[0] != null)
			result += lectures[0];
		
		for (int i = 0; i < lectures.length; i++) {
			if (lectures[i] != null)
				result += ("," + lectures[i]);
		}
		result += "]";
		
		return result;
	}
	
	
	public String[] getLectures() {
		return Arrays.class
	}
}
