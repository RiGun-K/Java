package CH05.oop;

import java.util.Arrays;

public class Student extends Person {
	
/*		int sid;
		int age;
		String gender;	
		String name;		
		private String dept; // 외부에서 막아놈. 특별한 이유가 없는한 공개 하지않음.
*/		
		public int slevel = 0; // 이 객체를 사용하는 사용자가 어디까지 접근할수있는지 접근여부를 제어할수 있음, private = 같은멤버끼리는 상관없지만
					// 바깥(외부)에서는 사용할수가 업다. Main.java (외부)에서는 실행이 안됨 ( 컴파일 오류 ) 
		
		
		int getSlevel() {
			return slevel;
		}	// 외부에서 selvel을 불러주는 방법은 단 하나(이 방법) 밖에없음. private 를 썼기때문
/*		
	private String[] dpts = {"컴정", "컴기", "전기", "디자인", "유아", "관광", "간호"};
		
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
		
	}	// 0부터 도는데 break하면 다돌앗는데 , 못찾으면 depts.length하고 똑같음 ,, 그렇지 않으면 찾음.
	
	
	String getDept() {
		return dept;
	}
*/	
	// 데이터 (변수) 를 담아두는 곳
	
	void study() {
		slevel++;
		System.out.println(name+"이 공부합니다.");
	}

	void play() {
	//	System.out.println(n); // X, study안에서만 보이는 n값이라서..
		slevel--;
		System.out.println(name+"의 나이는"+age+"입니다.");
	}
	
	// 메소드 , 메인메소드가 없으므로 실행 x , 객체를 찍어내기 위한 설계도
}
