package CH05.oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행시키기 위한 클래스
			Student std1 = new Student();  // 내가 만든 설계도도 데이터 타입이 될수 있음 (사용자 정의 타입) 
			std1.age = 19;
		//	std1.dept = "컴정";
			std1.name = "홍길동";
			std1.sid = 1234;
			std1.slevel = 0;	// std1 학생에 대한 데이터 값
	//		std1.play();	// Student 의 play의 변수에 대해서 출력함. 실제 실행,입력 하는 문
			
			std1.study();
			std1.study();
			std1.study();
			std1.play();
			std1.play();// std1이 공부합니다.
	//		std1.slevel = 100; // 학습레벨은 100
			
			int level = std1.getSlevel();
			System.out.println(std1.name + "의 학습 레벨:" + level); // Studenet의 12~14문항의 값을 출력.
			
			
	//		System.out.println(std1.name+"의 학습레벨은 "+ std1.slevel);
			System.out.println(std1.name+"의 소속은 :" + std1.getDept());
			
			Student std2 =  new Student();
			std2.age = 18;
	//		std2.dept = "컴정";
			std2.gender = "여";
			std2.name = "일지매";
			std2.sid = 1235;
	//		std2.slevel = 0;
			
			//std2.dept = "컴정";
			std2.setDept("사회복지");
			
			std2.study();
			System.out.println(std2.name+"의 학습레벨은"+std2.slevel);
			System.out.println(std2.name+"의 소속은 :" + std2.getDept());

	
			Professor pf1 = new Professor();
			pf1.name = "박문수";
			pf1.setDept("컴정");
			pf1.lecture();
			System.out.println(pf1.name + "교수의 소속은" + pf1.getDept());
			
			Professor pf2 = new Professor();
			pf2.name = "이몽룡";
			pf2.setDept("컴퓨터정보");
			pf2.lecture();
			System.out.println(pf2.name + "교수의 소속은" + pf2.getDept());
	
	}
	
	
	// 학생과 교수는(자식클래스) 모두 사람이라는 (부모클래스)에 상속을 받는다 . 		
}
