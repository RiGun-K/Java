package CH05.oop;

import java.util.Arrays;

public class Person {

	int age;
	int sid;
	String name;
	String gender;
	String dept;
	
	private String[] dpts = {"컴정", "컴기", "전기", "디자인", "유아", "관광", "간호"};
	
	String getDept() {
		return dept;
	}
	
	void setDept(String dept) {
		int i = 0;
		for (; i < dpts.length; i++) {
			if (dept.equals(dpts[i])) break;
		}
		// 0부터 도는데 break하면 다돌앗는데 못찾으면 deptslength하고 똑같음 그렇지 ㅇ낳으면 찾음거
		
		if (i == dpts.length) {
			System.out.println("소속학과는" + Arrays.toString(dpts)+ "중에 하나이어야 합니다.");
		} else { 
			dept = dept;
		}
		
}
	
}
