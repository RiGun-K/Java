package oop;

import java.util.Arrays;

public class Student {
	final public int FEMALE = 0;
	final public int MALE   = 1;
	
	private String name;
	private String sid;
	private String phone;
	private String gender;
	private String dept;
	private int slevel;	// 특별한 이유가 없는한 private를 함
	private int[] grades = new int[10];
	private int count = 0; // 멤버변수
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public double addDouble(double n1, double n2) {
		return n1+n2;
	}
	
	public void addGrade(int jumsu) {
		
		grades[count++] = jumsu;
	}
	
	public int getMaxGrade() {
		int max = -1;
		for (int i = 0; i < count; i++) {
			if (max < grades[i]) {
				max = grades[i];	
			}
			return max;
		}
		return max;
	}
	
	public int getMinGrade() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <count; i++) {
			if (min > grades[i]) {
				min = grades[i];
			}
		}
		return min;
	}
	
	public double getAverageGarde() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += grades[i];
		}
		return (double)sum/count;
	}
	
	public int[] getGardes() {
	// return grades; // return 하는순간 grades 의 주소값이 넘어감
		int[] copy = Arrays.copyOf(grades, count);
		return copy;
		
	}
	
	public String getAllGrades() {
		String result = "[";
		for (int i = 0; grades[i] > 0; i++) {
			result += grades[i] + " ";
		}
		result += "]";
		return result;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name.length() <2) {
			System.out.println("이름은 2자 이상이어야 합니다.");
		} else {
		this.name = name;
				}
	}
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		if (sid.length() != 7) {
			System.out.println("학번은 7자리 이어야 합니다.");
			return; // return 문을 만나면 종료 
		}
		
		if (isNumeric(sid) == true) {
			this.sid = sid; // sid를 할당한다.
			} else {
				System.out.println("학번은 숫자로만 구성되어야 합니다.");
					}
		
	}

	public boolean isNumeric(String sid) {
		for (int i = 0; i <sid.length(); i++) {
			char c = sid.charAt(i);
			if (c < '0' || c >'9') {
				return false;
								}
		}
		return true;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setGender(int gender) {
		if (gender)
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSlevel() {
		return slevel;
	}

	public void setSlevel(int slevel) {
		this.slevel = slevel;
	}

	public void study() {
		
		slevel++; //1 증가한다.
		System.out.println(name+ "이(가) 공부를 합니다.");
	}
	
	public void play() {
		slevel--; //1감소한다
		System.out.println(name+ "이(가) 공부를 합니다.");
	}
}
