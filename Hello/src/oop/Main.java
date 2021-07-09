package oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setName("홍길동");
		std1.study();
		std1.study();
		std1.play();
		std1.setSid("200123a"); // 공개 해도됨
	//	std1.isNumeric("123");  // 공개 해도됨
		std1.setGender("남자");
		System.out.println(std1.getName() + "의 성별:" + std1.getGender());
		
		System.out.println(std1.FEMALE);
		System.out.println(std1.MALE);
		
		std1.addGrade(100);
		std1.addGrade(90);
		std1.addGrade(80);
		std1.addGrade(70);
	    System.out.println(std1.add(10,20));
	    System.out.println(std1.add(10.5, 20.4));
	//	System.out.println(std1.getAllGrades());
		
		System.out.println(std1.getName() + "의 최고점수:" + std1.getMaxGrade());
		System.out.println(std1.getName() + "의 최저점수:" + std1.getMinGrade());
		System.out.println(std1.getName() + "의 평균점수:" + std1.getAverageGrade());
		
		
		
/*		
		int max = -1;
		for (int i = 0; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
			    max = jumsu[i];
			}
*/
		
		System.out.println(std1.getName() + "의 학번:" +std1.getSid());

		Student std2 = new Student();
		std2.setName("일지매");
		std2.setGender(std2.FEMALE);
		System.out.println(std2.getName() + "의 학번 " +std2.getGender());
		
/*		System.out.println(std1.slevel);
		std1.slevel = 100;
		std1.dept = "abc";
		std1.sid = "동해물과 ";
		
		Student std2 = new Student();
		std2.name = "일지매";
		std2.study();
*/		
	}
		
		
}
