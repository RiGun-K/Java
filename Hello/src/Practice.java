import java.util.*;     // 모든 패키지를 입력받는다(import) , 단  java.lang 안에 있는 클래스는 import 안해도됨 자동으로 됨. System 등등...

public class Practice
/* Practice 가 클래스이름
 * class 는 객체를 만들기위한 설계서 이면서, 
 * 사용자가 정의한 데이터 타입 이므로 변수의 자료형으로 사용가능
 * Practice pt; 가 가능함 
 */
{

	public static void main(String[] args) {
		// practice();
		//  testBoolean();
		//  testConstant();
	    //  testServer();
		//  testService();
		//   testString();
		//	textScanner();
		//	testOricle();
		sceern();
		inondeon();
		
		
	}
		
		private static void inondeon() {
		// TODO Auto-generated method stub
		
	}

		// TODO Auto-generated method stub
        /* 6열의 메소드가 메인 메소드
         * 메인메소드가 없으면 프로그램 실행 X
         * 
         * 상단소스파일이름에 별표가 있으면 저장이 안된거임
         * 저장이 되어야만 컴파일이 됨
         * 오류발생시 빨간줄에 마우스 갖다되면 해결방안 제시해줌
         * 
         * 소스파일이름과 클래스이름은 반드시 같아야됨
         * 
         * 1행 = 클래스, 6행 = 메인 메소드, 그 이후는 문장  { <--block이라 부름
         */
		
		
		 public static void practice() {
			System.out.println("나는 최고의 개발자가 되겠다.");
			/* 화면출력할때 보이는문장=Statement 
			 * 자바에서는 문자열 데이터(한,영문자 , 숫자는 x)는 반드시 "~~"로 묶어주어야 됨 !
			 * 끝에 반드시 세미콜론(;)을 넣어야됨
			 * 내부적으로 쓸려면 public -> private 로 바꿔도 가능
			 */
			
			
			int a = 7;
			int b = 6;
			
			int result = a+b;
			
			System.out.println(result);
			
			//*Practice pt;
			
			
			
			System.out.println(Long.MAX_VALUE);
			System.out.println("1바이트의 최소값= " + Byte.MIN_VALUE);
			
			String s = "김리건의 나이는" + 26 + '세' ;  // "김리건의 나이는" + "20"
			System.out.println(s);
			/* 문자열과 숫자열은 같이 쓰일수없음 (+,- 등)
			 * "숫자" = 문자열로 변환하면 가능
			 *  40항 참조 
			 *  !!!! 왜 안되는지 질문할것 !!!!
			 */
	}

	
	/*public static int sum(int a, int b)
	{
		return a + b ;
	} */
		 
		 
		 
		 public static void testBoolean() {
			// boolean b;     / 변수 선언                           , boolean 은 참,거짓 판단하는 연산자
			// b = true;      / 변수에 값 할당
			 boolean b = true;  // 선언하면서 동시에 값을 할당하는것을 '초기화' 라고 함
			 
			 System.out.println("b의 값은 :" + b);  // " " 안에는 문자열 , 고로 문자열과 같이 연동되는 자료유형은 정수,실수,문자형,boolean 값
			 
			 b = (1>2); // 참,거짓을 구분하는 연산자 ( ) 를 치면 ( ) 먼저 대입
			 
			 System.out.println("b의 값은 :" + b); // 모두 맞으면 true 아니면 false 
		 }
		 	
		 	/* int = i;
		 	 * i = i + 1;  <-- X (i의 값이 할당되지않으므로 컴파일 오류)  
		 	 *
		 	 * int i = 0;  <-- O (변수 선언과 동시에 값 0 을 할당)
		 	 * 
		 	 * 변수 이름 지을때
		 	 * 1)첫 글자는 소문자로 2)특정한 의미가 있도록 3)낙타표기법 4)문자+숫자 가능 5)대신 첫문자는 문자,_,$만 가능   ex)1num (x) num2 (o) _num (o)
		 	 * 6)키워드 는 사용 X ex) int = class,super,if,int 등 ... 7)한글가능  ex) int 한글가능;
		 	 *
		 	 * 
		 	 * 클래스명, 참조형 데이터타입 (String 등) : 단어의 첫글자는 대문자 ex) ServerPc  
		 	 * 변수,메소드명 : 첫번째 단어는 소문자 , 그 이후 단어 첫글자는 대문자 ex) serverPc
		 	 * 상수       : 모두 대문자                  ex) final int = SERVERPC
		 	 */ 
		 
		 	private static void testConstant() {
		 	
		 		final double KM_PER_MILE = 1.6909344;
		 	
		 		double km;
		 		
		 		km = 60 * KM_PER_MILE;
		 		
		 		System.out.println("60마일의 값은 :" + km + "km");
		 		
		 		/* 60 마일은 몇 km인지 값을 구하는 문제
		 		 * 1km 당   1.6909344마일 의 상수
		 		 * 
		 		 *  60 * 1.6909344 라는 결론
		 		 *  km라는 변수 선언
		 		 *  km에 할당
		 		 *  (km + "km");
		 		 */
		 		
		 		System.out.println(12/5);       // 둘다 정수형이므로 소수점은 취급 X
		 		System.out.println(12.0/5);     // 12.0이 double 형 이므로 실수인 5가 큰쪽으로 자동으로 맞춰서 5.0이됨 
		 		System.out.println(12%5);       // %는 나머지값(몫) 
		 		System.out.println(12.0%5);		
		 //		System.out.println(12/0);       // NaN = Not a Number  , 0으로 나눠주는건 런타임에러
		 	
		 		
		 		int x = 3;
		 		System.out.println(x++);		// 피연산자인 x의 값 1증가 ,  !찍히는 값은 동일하게 3!!
					                            // ++x+y; x+++y; 의 값이 다름  , x값을 증가시키는 용도로 사용한다면 상관은 없음.
		 		
		 		System.out.println(x);
		     	System.out.println(++x);		// x의 값이 1증가  , 찍히는 값도 1증가
		 		
		 		System.out.println(x--);
		 		System.out.println(x);
		 		System.out.println(++x);
		 			
		 		// 관계 연산자 
		 		
		 		
		 		// println = 줄 바꿈        / 첫째줄 : ~ 둘쨰줄 : ~ ...
		 		// print   = 한 라인에 값을 보여줌   / 첫째줄 : ~~~~~~~~~....
		 		
		 		
		 	}
		 	
		 		public static void testServer() {
		 			
		 			int x = 7;
		 			int y = 5;
		 			
		 			System.out.print("x와y의 값이 같은가 :" + (x==y) );   // + 연산자가 우선순위 이기 때문에 x==y에 ( )를 씌워서  우선적으로 계산하도록함
		 			System.out.print("x와y의 값이 다른가 :" + (x!=y) );
		 			System.out.println("x가 y값보다 크거나 같은가 :" + (x>=y) );
		 			
		 			boolean c = true;
		 			boolean d = false;
		 			
		 			System.out.println("c와d가 모두 true인가 :" + (c&&d) );  // 모두 true이면 true 아니면 talse
		 			System.out.println("c와d 중에 하나라도 true인가 :" + (c||d)); // Shift + \ 누르면 됨. 앞에서 true이면 뒤에는 보고 실행하지도않고 끝남 !
		 			System.out.println(!c); // true 면 false , false 면 true ( 반대로 )
		 			
		 			
		 			int n = 123456789;
		 			double m = n;
		 			System.out.println(m);    // 1.23456789E8  = .을 오른쪽으로 8자리 이동  E-8이면 왼쪽으로 8번
		 			
		 			
		 		}
		 		
		 			
		 		private static void testService() {
		 			
		 			double x = 12.0;
		 			
		 			int y = (int)x;    // 바로 x를 넣으면 자료형이 다르기때문에 오류,, 따라서 ( )안에 자료형을 맞춰주면 형변환이 가능함..
		 			
		 			x = 12/5;         // 12와 5은 정수이므로 값이 2 지만, x가 double이기때문에 자동적으로 실수형으로 변환해서 계산해줌..
		 			
		 			System.out.println(x);   
		 
		 			
		 			x = (double)13/5;   // 우선순위가 밀리므로 13이 실수형으로 바껴짐 ,, ! 13/5의 값을 double로 변환하려면 (13/5)쳐주기
		 			      			    // 우선순위 1) ++ --  2) * / %  3) + -
		 			
		 			
		 		}
		 		
		 		public static void testString() {
		 			// 문자열 "Hello World!"를 변수 s1에 문자열 "I,m a Java Programmer" 를 변수 s2에 저장후 출력
		 			
		 //		String s1 = "Hello World!";
		 //		String s2 = "I,m a Java Programmer";
		 		
		 //		System.out.println(s1 + "\n" + s2);   // "\n" 줄바꿈 
		 	
		 		String s1 = "..........";
		 		String s2 = s1+"|"+s1;
		 		String s3 = s2+"|"+s2;
		 		
		 		System.out.println(s1+"\n"+s2+"\n"+s3);
		 		}
		 		
		 		
		 		private static void textScanner() {
		 			Scanner input = new Scanner(System.in);   // input는 변수이름 , main메소드에  private static + // 을 쓰면
		 													  // 따로 일일이 쓸 필요가 없음. 
		 			
		 		int n1, n2, sum;
		 		
		 		System.out.print("첫 번째 정수를 입력하시오.");
		 		n1 = input.nextInt();          // int n1 값에 대해서 사용자로부터 값을 입력받는다.
		 		
		 		System.out.print("두 번째 정수를 입럭하시오.");
		 		n2 = input.nextInt();		   // int n2 ~~~
		 		
		 		sum = n1 + n2;
		 		
		 		System.out.println("합은" + sum + "입니다.");
		 			
		 			
		 		}
		 		
		 		private static void testOricle() {
		 			/* 반지름을 사용자로부터 입력받아
		 			 * 원의 면적을 구해보자
		 			 * 원의면적은 r*r*3.14 
		 			 */
		 			  
		 			Scanner input = new Scanner(System.in);
		 			
		 	/*		double n1 , n2;
		 			
		 			n1 = 3.14;
		 			
		 			System.out.print("반지름을 입력하시오.");
		 			n2 = input.nextInt();
		 			System.out.print("원의 면적은" + n2*n2*n1 +"입니다.");		 // 78.5			
		 	*/
		 			
		 			double n1, n2;
		 			
		 			System.out.print("반지름을 입력하시오.");
		 			n1 = input.nextDouble();	// n1 값에 대해서 Double(실수형) 값을 입력받는다.
		 			
		 			n2 = n1*n1*3.14;
		 			
		 			System.out.print("원의 면적은" + n2 + "입니다.");
		 							 				
		 		}
		 		
		 		private static void sceern() {
		 			Scanner input = new Scanner(System.in);
		 					 			
		 			System.out.println("기말고사 점수를 입력하시오.");
		 			int number = input.nextInt();
		 			
		 			if ( number >= 60)  {                              
		 				System.out.print("합격입니다.");			//    if ( 조건식 ) {
		 			}											//   	System.out.print();	
		 			else {										//  } else {
		 				System.out.print("불합격입니다.");			//   	System.out.print();
		 			}											//  } 
		 				
		 			/* if와 else 사이에 한 문장밖에 오지못함
		 			 * 만약 두문장 이상이 올경우 { } 로 묶어야함 !! // 한 문장이라도 관례적으로 { } 를 쓰는 습관 들이기 ..
		 			 * 
		 			 * ex) if (조건식) {
		 			 * 		 System.out.print();
		 			 * 		 System.out.print();
		 			 *  }  else  {
		 			 *  	 System.out.print();
		 			 *  	 System.out.print();
		 			 * 	}
		 			 */
		 			
		 			
		 			
		 		}

		 		
		 		private static void inondeon() {
		 			Scanner input = new Scanner(System.in);
		 			if ()
		 		}
		 		
}
	


