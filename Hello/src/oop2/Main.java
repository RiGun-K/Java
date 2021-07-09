package oop2;

import CH05.oop.Person;
import oop.Student;

public class Main {
	
/*	private static void nameNphonOnly(Student std) {
		System.out.println("이름은 " + std.getName() + "이고 전화번호는 " + std.getPhone() + "입니다." );
	}
	// method overloading 
	private static void nameNphonOnly(Professor p) {
		System.out.println("이름은 " + p.getName() + "이고 전화번호는 " + p.getPhone() + "입니다");
	}
*/	
	private static void nameNphoneOnly(Person p) {
		System.out.println("이름은 " + p.getName() + "이고 전화번호는 " + p.getPhone() + "입니다");
	}  // std + prof 을 모두 담을수 있는 person을 사용하여 한번에 받아들일수 있음.
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setDept("컴정");
		person.setGender("남자");
		person.setName("아이언맨");
		person.setPhone("010-111-222");
		person.setSid("2001234");
		
		person.print();
		person = std;
		nameNphonOnly(std); // 15~17
	

		Student std = new Student();
		std.setDept("컴정");
		std.setGender("여자");
		std.setName("스칼렛요한슨");
		std.setPhone("010-1234-1111");
		std.setSid("2001234");
		std.addGrade(98);
		std.addGrade(97);
		
		std.print();
		
		Professor prof = new Profeesor();
		prof.setDept("컴정");
		prof.setGender("남자");
		prof.setName("홍길동");
		prof.setLectures(new String[] {"프로그래밍기초", "웹프로그래밍(I)"});
		prof.setPhone("010-1111-2312");
		prof.setSid("1012345");
		
		prof.print();
		person = prof;  
		
		nameNphoneOnly(prof);  // 15~17 
		
		Person[] parr = new Person[3];
		Student[] stdarr = new Student[3];
		Professor[] profarr = new Professor[3];
		
		stdarr[0] = std;
//		stdarr[1] = prof;
//		stdarr[2] = person;
		
		profarr[0] = prof;
//		profarr[1] = std;
//		profarr[2] = person;
		
		parr[0] = person;
		parr[1] = std;
		parr[2] = prof;           
		
		printAll(parr);
	}
	
	
		private static void printAll(Person[] parr) {
			for (int i = 0; i < parr.length; i++)
				parr[i].print();
		}

		private static void printAll(Person[] parr) {
			for (int i = 0; i < parr.length; i++) {
				System.out.println(+ ": Instance of Person? " + (parr[i] instanceof person));
				
				
			}
		}
}
