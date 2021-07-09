package Class;

import java.util.Random;
import java.util.Scanner;


public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //testFor();
        //testFor2();
        //testFor3();
	    //testSum();
		//testDivisor();
		//testSumRandomNumber();
		//testNestedLoop();
		//testNestedLoop2();
		//testNestedLoop3();
	    //testNestedLoop4();
		//testNestedLoop5();
	    //getPrimeNumber();
		//getAverage();
		//countChar();	
		//guessNumber();
		//Lottery();
		//Pie();
		//arry();
		
	}	
	
			public static void arry() {
		
				
				Scanner input = new Scanner(System.in);
				System.out.println("몇 개의 점수를 입력하시겠습니까");
				
				int count = input.nextInt();
				
				int[] scores = new int[count];
				
				int sum = 0;
				
				for (int idx = 0; idx < count; idx++) {
					System.out.println(idx + 1 + "번째 점수를 입력하세요");
					int score = input.nextInt();
					
					scores[idx] = score;
					sum += score; // sum = sum + score
				}
				int max = scores[0];
				
				System.out.println("입력한 점수는 다음과 같습니다.");
				
				for (int idx = 0; idx < count; idx++) {
					System.out.println(idx+1+"번째 점수: " + scores[idx]);
					if (scores[idx] > max) {
					max = scores[idx];
										}
					
				}
				System.out.println("평균 : " + (double)sum/count);  // double 을 () 로 넣어 형변환 가능 , 
				System.out.println("최대 점수:" + max);
		
				
		
	}
	
			public static void Pie() {
				Scanner input = new Scanner(System.in);
				int n = input.nextInt();
				double a = 0; // 분모
				double b = -4; // 분자
				double pi = 0;
				for(int i= 1; i <= n; ++i) {
					a = (i-1)*2+1;
					b = b*-1;
					pi= pi+b/a;
				}
				System.out.println("파이는" + pi);
			}
			
	
	
	public static void Lottery() {
		double dividend = 45.0;
		double k = 6.0;
		double odds = 1.0;
		
		for ( int i = 1; i <= k; i++) {
			odds = odds * (dividend -i +1)/i;
		}
		System.out.println("로또 확률:" + odds);
	}
	
	
	public static void countChar() {
	  // String s = new String("no news is good news"); //
		String s = "no news is good news";
		System.out.println(s.length());
		System.out.println("첫번째 글자:" + s.charAt(0));
		System.out.println("두번째 글자:" + s.charAt(1));
		System.out.println("마지막 글자:" + s.charAt(19));
		char c = s.charAt(4);
		System.out.println("다섯번째 글자:" + c);
		//빈 공백도 하나로 침 no news 사이의 공백 3으로 계산, 0부터 시작함 // 
		
		/* 
		 * s의 첫번째 문자부터 마지막 문자까지 반복을 한다
		 * 문자가 'n'이면 count을 1 증가 시킨다.
		 * 
		 * count를 출력.
		 */
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'n') {
				count++;
			}
		}
		System.out.println("문자열에 있는 'n'의 개수:" + count);				
	}
	
	
	public static void guessNumber() {
		/* 
		 * int num = 59; 또는 num에 무작위 정수값( 1 ~ 1000 )을 할당한다.
		 * 
		 * int count = 0
		 * 사용자 num값을 맞출 때 까지 다음을 반복
		 * 	사용자로부터 정수값을 입력받는다.
		 * 	count++;
		 *  받은 값이 num가 같으면 반복 중단
		 * 	
		 * 
		 * 그 값이 num과 같다면 "count번에 맞췄습니다." 출력 		 
		 */
		Random random = new Random();
		
		int num = random.nextInt(1000)+1;
		
		int userInput = 0;
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		do {
		System.out.println("정답을 추측해보세요.(1~1000)");
		userInput = input.nextInt();
		count++;
		
		if ( userInput < num) {
			System.out.println("정답은 더 큰 값입니다.");
			} else if (userInput < num) {
			System.out.println("정답은 더 작은 값입니다.");
			}
		
		} while (userInput != num);
		
		System.out.println(count + "번 만에 맞췄습니다.");
		System.out.println("정답:" + num);
		input.close();
	}
	
	
	
	public static void getAverage () {
		/* 정수를 입력 받아서, 그 정수의 평균을 구하자.
		 * int jumsu = 0;
		 * int sum = 0;
		 * 
		 * 음수값이 입력될 때 까지는 다음을 반복한다.
		 * jumsu = 사용자가 입력한 값;
		 * count = count + 1;
		 * sum = sum + jumsu;
		 * 
		 * 평균 : sum/count;
		 */
		
		Scanner input = new Scanner(System.in);
		int jumsu=0,sum=0, count= 0;
		
		
		while(true) {
			System.out.print("점수를 입력하세요(종료:-1)");
			jumsu = input.nextInt();
			if (jumsu < 0) {
			break;
	 }
		sum = sum + jumsu;
		count = count+1;
		
		}
		System.out.println("평균:" +(double)sum/count);
		
		
		input.close();
	}
			
			
			
		
	
	
	
	
	public static void getPrimeNumber() {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long start = System.currentTimeMillis();
		for (int i = 2; i <= n; i++) {
			//각 반복마다 i가 소수인지 판단해서 
			//소수 이면 그 i값을 출력한다.
			//나눠지면 약수 나눠지지않으면 약수가 아님   10를 반으로 나눠서 6~는 나눠지지않음 고로, ~5까지만 나눠보는걸로 판단
			
			/* 2부터 (i-1)까지의 정수 중에 i를 나눌수 있는 
			 * 정수가 존재하면 소수가 아닌것으로 판단
			 */
			boolean isPrime = true;
			for (int j =2; j < i; j++) {
				if(i % j ==0) {
					isPrime = false;
					break;
 				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		    long end = System.currentTimeMillis();
		    System.out.println("\n경과시간 :" + (end-start) + "ms");
			input.close();
		}
	
	
	public static void testNestedLoop5() {
		/*
		 * 1행 :      * 공백 4 + 별표 1
		 * 2행 :     ** 공백 3 + 별표 2
		 * 3행 :    *** 공백 2 + 별표 3
	     * 4행 :   **** 공백 1 + 별표 4
		 * 5행 :  ***** 공백 0 + 별표 5
		 */
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n-1-i) {
				    System.out.print(" ");	
				}
				 else { // n-1-i 부터 별표 찍는다.
					System.out.print("*");
				}
	
			/*
			 *  i = 0
			 *      j= 0, 1 , 2 , 3 ,4  <--- j가 0~3까지는 공백, 4는 *
			 *  i = 1
			 *      j= 0,1,2,3,4 <-- j가 0~2까지는 공백, 3~4 는 *
			 *  i = 2  
			 *      j= 0,1,2,3,4 <-- j가 0~1까지는 공백, 2~4 는 *
			 *  i = 3
			 *      j= 0,1,2,3,4 <-- j가 0일때  공백, 1~4 는 *
			 *  i = 4
			 *      j= 0,1,2,3,4 <-- j가  '' 공백, 0~4 는 *          
			 */
			}
			System.out.println(); 
			
		}
	
	
	
	public static void testNestedLoop4() {
		/*
		 * 정수를 입력받아 변수 n에 저장
		 * n개의 행에 다음과 같이 출력한다.
		 * 첫행 * n개 : *****
		 * 둘쨰행 * n-1 : ****
		 * ...
		 * n 행 * 1 : *
		 */
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i=0; i < n; i++) {               // int i가 0부터 시작해서 n-1까지 반복하며 반복할떄마다 1씩증가  
		
		//각 행에 대해서 별표를 적절히 찍어라 ...  --> n-i개의 별표 찍어라
		/*
		 * 다음을 n-i번 반복하라
		 *
		 *	   System.out.print("*");
		 *System.out.println(); 줄바꿈
		 */
			for (int j= 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void testNestedLoop3() {
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
		/* 
		 * 별표를 찍어야 하는 행의 수만큼 반복
		 * 별표를 찍는다. (행의 번호만큼)
		 */
		
		for (int i =0; i < 5; i++) {
			// 별표 찍어라 행의 번호(i+1)만큼 else if 구문
		/*	if (i == 0)
			   System.out.print("*");
			else if (i == 1)
			   System.out.print("**");
			else if (i == 2)
				   System.out.print("***");
			else if (i == 3)
				   System.out.print("****");
			else if (i == 4)
				   System.out.print("*****");  */
			
			/* 
			 * i == 0 일 때 아래를 1번
			 * i == 1 일때 아래를 2번
			 * '''
			 * i == 4 일때 아래를 5번 수행
			 */
			for (int j =0; j <= i; j++) {
			    System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void testNestedLoop2() {
		/* 
		 * for 문을 이용해 " ***** " 5번을 출력
		 *
		for (int i = 0; i < 5; i++) {
			System.out.println("*****");
		}
	}
	    */
		
		for (int i =0; i < 5; i++) {
			// 별표 다섯개 찍기  = 중첩 반복문
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void testNestedLoop() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
			System.out.print("\t");
			
	    for(int j=0; j < 5; j++) {
			System.out.print(j + " ");		
	        System.out.println();
	         }
		}
	}
	
	public static void testSumRandomNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print(" 난수의 개수: ");
		int n = input.nextInt();
		/* 
		 * n개의 난수를 발생시켜서 총합을 구하자.
		 * int sum = 0;
		 * 1~n까지 아래를 반복한다.
		 * 난수발생시킨다. 그 난수를 더한다.
		 */
		
		
		Random rand = new Random();
		int sum = 0;
		int tmp = 0;
		for( int i = 0; i < n; i++) {
			tmp = rand.nextInt(100);
			System.out.print(tmp + " ");
			sum = sum + tmp;
		}
		System.out.println("/n난수의 합:" + sum);
		
		input.close();
	}
	
	
	public static void testDivisor() {
		Scanner input = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		int n = input.nextInt();
		System.out.println(n + "의 약수는 다음과 같습니다.");
		/* n의 약수를 구해서 출력하자
		 * 1부터 n까지 변수를 i를 증가시켜 가면서 다음을 반복하자.
		 * 만약 n을 i로 나눴더니 나머지가 0이면 약수이므로 
		 * i를 출력하자
		 */
		
		input.close();
		
		for( int i = 1; i <= n;  i ++ ) {
			if ( n % i == 0) {
			System.out.print(i);
			if(i != n) System.out.print(" , ");
			
			}
		}
		System.out.println(" 이상입니다.! ");
		input.close();
			
	
		
	}
	
	
		

	
	public static void testSum() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("시작과 끝 숫자를 입력하세요.");
		int start = input.nextInt();
		int end   = input.nextInt();
		
		int sum   =0;
		
		//sum =  start + (start+1) + (start+2) + ... + end;
		/* 
		 * sum = start;
		 * sum += (start+1);
		 * sum += (start+2);
		 * ...
		 * sum += end;
		 */
		int orgstart = start;
		
		for(; start<=end;  start++) {
			sum = sum + start;
		}
			
			
	//	while(start <= end) {
	//		sum += start;
	//		start++;
	//	}
		System.out.println (orgstart + "~" + end + "까지의 합:" + sum);
	
}
		 

	
	
	public static void testFor3() {
		for (int i = 10;  i >= 1;  i-=2) {
			System.out.println(i);
		}
	}
	
	
	
	public static void testFor2() {
		Scanner input = new Scanner(System.in);
		
		/*
		 * 사용자로부터 시작과 끝 숫자를 입력받는다.
		 * 시작 ~ 끝 사이의 짝수를 출력하자.
		 */
		
	System.out.println("시작과 끝 숫자를 입력하시오.");	
		int start = input.nextInt();
		int ent = input.nextInt();
	   // int r=0;
	    
	    for(; start<=ent; start++) {
	    	//r=+start;
	    	if(start%2==0) {
	    		System.out.println(start);
	    	}
	    }
	}	    
	
    public static void testFor() {
    	int i = 0;
    	for (; ;) {
    		System.out.println(i);
    		i++;
    		if (i > 4) {
    			break;
    		}
    	}
    	//block;
    	System.out.println("반복문이 끝난 후: " + i);
    }
    
 
}
