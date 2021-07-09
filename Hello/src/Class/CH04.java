package Class;

import java.util.*;  // Scanner 를 연동하려면 반드시 필요함  util.Scanner; or util.*; 을 쓰자 

public class CH04 {

	public static void main(String[] args) {
		//  arry();
		  //testStringArray();
		  getMinimum();
		  //sequentialSearch();
		  //dice();
		  //teaterRservation();
		  //anonymousArray();
		  //mineSweeper();
		  //randomWalk();
			//maratoner();
		//play();
			
	/*		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
			int[] array2 = array;
			
			array2[0] = 200;
			
			System.out.println("array의 내용:");
			for (int n : array) {
				System.out.println(n + " ");
			}
			
			int n1 = 10;
			int n2 = n1;
		      //n2 = 20;
			System.out.println("n1:" + n1);
			System.out.println("n2:" + n2);               */
			
		//	int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//	int[] array2 = Arrays.copyOf(array1, array1.length);
		//	int[] array2 = arrayCopy(array1, array1.length);
			
		//	array2[0] = 10000;
			
		//	System.out.println("array의 내용:");
		//	System.out.println(Arrays.toString(array1));
			
		//	System.out.println("\n\narray2의 내용:");
		//	System.out.println(Arrays.toString(array2));
			
			
		//	 for (int n : array) {				 // 루프돌때마다 각 원소를 n에 넣음 = for-each 루프
		//		 System.out.println(n);     
		//	 }
	}
			
		// TODO Auto-generated method stub
		
		
		/* 기초형 자료 = byte short int long float double char boolean */ 
		  	     
		// 배열 , arry

		int array[] = new int[7];
	

	    /* int score1, score2, score3;
	
		Scanner input = new Scanner(System.in);
		score1 = input.nextInt();
		// 변수 하나하나에 값을 따로 지정해주기엔 그수가 많으면 너무많으면 물리적으로 힘들기 때문에 배열이 필요함
		// 여러개의 변수를 하나로 묶어줌 , 참조형 변수
		 
		// 참조형은 할당된 값이 찍히지않음 , 주소만 들어감 
		// 기초형은 값이 들어감 
		
		/* index 첫번쨰 원소는 0부터 ㅅㅣ작
		 * Scores[0] = 10;  , 0은 첫번쨰 자리부터이므로 첫번째 자리에 10을 할당 , 10개가 최대
		 */
			
		// 배열 실습
		public static void arry() {
		
		
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[5]; // = int scores[] = new int[5];  
		
		for (int i = 0; i < 5; i++) {
			System.out.println("점수를 입력하시오");
			scores[i] = input.nextInt();
			
		    }
	/*	
		System.out.println("-----------");
		for (int i = 0; i < scores.length; i++) {
			int value = scores[i];
			System.out.println(i+1+"번째 원소:" + value);
			}
		
		int n = 3;
		int[] arr = {3,4,5,6,7}; //  배열도 초기화 값을 선언가능	
		int[] arr = new int[5];
		
 //			  arr = {7,8,9,1,2}; //  안됨
 //	     int[5] arr = new int[];  //  안됨 
		
		
		/* 사용자로부터 몇개의 점수를 입력할지 그 크기를 입력받는다.
		 * 그 크기의 배열변수를 생성한다.
		 * 
		 * 배열의 크기만큼 다음을 반복한다
		 * 사용자로부터 점수를 입력받아 배열에 순서대로 저장한다
		 * 
		 * 배열의 첫번째 원소부터 마지막 원소까지 출력한다
		 * 그 점수들의 평균을 출력한다
		 * 입력된 점수 중 최대점수를 출력한다.
		 */
		
			final int STUDENTS = 5;
			Scanner inputo = new Scanner(System.in);
			int sum;
			
			int score[] = new int [STUDENTS];
			
			for(int i = 0; i < score.length; i++) {
				System.out.println("성적입력");
				score[i] = inputo.nextInt();
				
			for(int i = 0; i < score.length; i++) {
				sum += score[i];
			
			}
			}
		
		
			private static void sort() {
				
				int[][] s = new int[3][5];
				
				for(int i =0; i < 2; i++) 
					for(int j=0; j<4; j++)
						System.out.println(s[i][j]);
		
		
			
		//	Scanner input = new Scanner(System.in);
			System.out.println("몇 개의 점수를 입력하시겠습니까");
			
			int count = input.nextInt();
			
	//		int[] scores = new int[count];
			
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
		// 문자열 배열 실습 
		private static void testStringArray() {
			String s = "동해물과 백두산이 마르고 닳도록";
			String[] strArr = {"동해","서해","남해","백두산","한라산"}; //입력이 되어있음
			
			System.out.println("strArr 배열의 값입니다...");
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			                                        }
			
			
			String[] strArr2 = new String[5]; //5가지에 값을 넣을수 있음
			
			strArr2[0] = "한국";
			strArr2[1] = "일본";
			strArr2[2] = "바이든";
			strArr2[3] = "트럼프";
			strArr2[4] = "미국";
			
			System.out.println("***************");
			System.out.println("strArr2 배열의 값입니다...");
			for (int i = 0; i < strArr2.length; i++) {
				System.out.println(strArr2[i]);
			}
			String[] hobbies = new String[5];
			System.out.println("자신의 취미를 반드시 5개를 입력하세요...");
			
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < hobbies.length; i++) {
				System.out.println(i+1+"번쨰 취미를 입력하세요.");
		//		String hobby = input.nextLine();
		//		hobbies[i] = hobby;
				hobbies[i] = input.nextLine();
			}
			System.out.println("당신의 취미는 다음과 같습니다.");
			for (int i = 0; i < hobbies.length; i++) {
				System.out.println(hobbies[i]);
			}
		}
		
		public static void getMinimum() {
			int[] prices = new int[10];
			
			//Random random = new Random();
			
			Random random = new Random();  // import.*; 를 사용해서 연동시킴
			for(int i = 0; i < prices.length; i ++) {
				prices[i] = random.nextInt(20)+10; // 100 ~ 199
			}
			
			int min = prices[0];
			
			for (int i = 1; i < prices.length; i++) {
				if (prices[i] < min) {
					min = prices[i];
				}
			}
			System.out.println("최소 가격:" + min + "만원");
			
			//System.out.println(prices);  <-- 주소값이 나옴 , 값을 확인하고자 한다면 일일이 하나하나 다 찍어봐야함
			System.out.println(Arrays.toString(prices));   // Array 를 활용해서 prices 값을 String으로 변환하여 값을 나타내줌
			  
						  
		}
		// CH04 PART2 P04
		public static void sequentialSearch() {
			int[] source =	new int [10];
			Random random = new Random();
			for	(int i = 0; i < source.length; i++) {
				source[i] = random.nextInt(100)+i;
				}
			
			System.out.println("1~100 사이의 정수 중 찾고싶은 값은?");
			Scanner input = new Scanner(System.in);
			int value = input.nextInt();
			
			int i = 0; 
			for (; i < source.length; i++) {
				if (source[i] == value);
				break;
			}
			if (i < source.length)
				System.out.println("그 값은" + (i+1) + "번째 있습니다.");
			else 
				System.out.println("못 찾음...");
			
			System.out.println(source);     // 주소값이 나옴 참조형이기 때문에..
			for (i =0; i < source.length; i++) {
				System.out.print(source[i] + "  ");
			}
		}
			//CH04 PART2 P06
			private static void dice() {
				/* 주사위를 만번 던졌을때
				 * 1~6면이 각각 몇 번 나오는지를 배열에 저장하고 출력하자.
				 * 배열 인덱스 0은 1면,
				 * ....
				 * 배열 인덱스 5는 6면을 나타낸다고 가정하자.
				 */
				
				final int SIZE = 6;
				
				int[] dice = new int[SIZE];
				
				for(int i =0; i < dice.length; i++) {
				/*  System.out.println((int)(Math.random()*SIZE));      // (int) 는 값을 정수로 계산
					int num = ((int)(Math.random()*SIZE));       	    // 0 ~ 5사이의 값
					dice[num] = dice[num] + 1;		
					++dice[num];  										//dice[num] = dice[num] + 1;
				*/	
					++dice[(int)(Math.random()*SIZE)];
				}	
				
				int total = 0;
				for (int i =0; i <dice.length; i++) {
					System.out.println(i+1+"면이 나온 수 :" + dice[i]);
					total += dice[i];
				}
				System.out.println("총 던진 횟수:" + total);
			}
				// CH04 PART2 P08
				private static void theaterRservation() {
					/* 좌석수는 10개, 정수형 배열로 표현.
					 * 배열 인덱스 0은 좌석번호 1번
					 *    ''   1은     ''  2번
					 *       .....
					 *    ''   9는     '' 10번
					 * 
			 		 *
					 * 다음을 무한 반복한다.
					 * 현재 극장 좌석 상태를 출력한다.
					 * 사용자로부터 예약 좌석 번호를 입	력받는다. 
					 * 사용자가 좌석번호를 음수값을 입력하면 반복을 종료한다.
					 * 입력된 좌석을 예약한다(예약된 자리는 1로 저장) 
					 * 이미 이전에 예약된 좌석이라면 이미 예약된 좌석이라고 출력한다.
					 */
					
					final int numOfSeats = 10;
					int[] seats = new int[numOfSeats];
					
					Scanner input = new Scanner(System.in);
					while(true) {
						System.out.println("\n#############################");
						//현재 좌석 상태
						for (int i = 1; i <= seats.length; i++) {
							System.out.printf("%2d ", i);     // print(i+" ");
						}
						System.out.println();
						for (int i = 0; i < seats.length; i++) {
							System.out.printf("%2d ", seats[i]);  // seats[i] + "  "
						}
						System.out.println("\n#############################");
						
						System.out.println("예약할 좌석번호 :");
						int seatNumber = input.nextInt();
						if (seatNumber < 0) break; // 입력된 좌석번호가 음수면 반복 종료
						
						if (seatNumber > seats.length) {
							System.out.println("좌석번호는 1에서" + seats.length + " 번까지 입니다.");
							continue;
						}
					
					// 이미 예약된 자리인지 체크
					if (seats[seatNumber-1] == 1) {
						System.out.println("이미 예약된 좌석입니다.");
					} else { // 예약된 자리임을 표시하기 위해 1을 저장.
						seats[seatNumber-1] = 1;
					}
					System.out.println("좌석 예약 시스템을 종료합니다...");
				 }
					
		}
				private static void anonymousArray() {
					int[] arr = new int[10];
			//		arr = {1, 2, 3, 4, 5};  // 변수를 만들고나서는 값을 할당하려면 하나씩 할당해야됨
			//		arr = new int[] {1, 2, 3, 4, 5};  // 이것은 가능함
					
					int[] arr2 = {12, 13, 1, 3, 4};
				}
				
				
					// 지뢰 찾기 //
				
				private static void mineSweeper() {
					boolean[][] board = new boolean[10][10];
		//			for (int i =0; i < board.length; i++) 
		//				System.out.println(Arrays.toString(board[i]));
					
					for (int i = 0; i < board.length; i++) {
						for(int j = 0; j < board[i].length; j++) {
							if (Math.random() < 0.3)     // = double v = Math.random(); // 30% 확률로 지뢰를 생성한다.
									board[i][j] = true;
			
						}
					}
					
					for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
							if (board[i][j] == true) {
								System.out.print(" # ");
							} else {
								System.out.print(" . ");
							}
						}
						System.out.println();
					}
				}
					// 벌레 찾기 //
				
				private static void randomWalk() {
					boolean[][] tiles = new boolean[10][10];
					
					tiles[5][5] = true;
					
					int steps = 10;
					int row   = 5;
					int col   = 5;
					
					for (int i = 0; i < steps; i++) {
						/*
						 * 1. 무작위로 0~3 사이의 값을 발생시키고
						 * 2. 그 값이 0 이면 위로 , 1 이면 오른쪽 , 2 면 아래 , 3 이면 왼쪽으로
						 *		위   로 이동 :  row --	오른쪽 이동 : col++
						 *		아래로 이동 :  row ++	왼   쪽 이동 : col--
						 *	
						 *		tiles[row][col] = true;
						 * 3. 현재 tiles의 상태를 출력
						 */
						
						// step 1
						int direction = (int)(Math.random()*4);
						
						// step 2
						if (direction == 0) { // 위로 이동
							if (row-1 > 0) row--;
						} else if (direction == 1) { // 오른쪽으로 이동
							if (col+1 < tiles.length) col++;
						} else if (direction == 2) { // 아래 이동
							if (row+1 < tiles.length) row++;
						} else { // 왼쪽 이동
							if (col - 1 >= 0) col--;
						}	
						
						tiles[row][col] = true;
						
						// step3
						
						for (int k = 0; k < tiles.length; k++) {
							for (int j = 0; j < tiles[k].length; j++) {
								if (tiles[k][j] == true) {
							 System.out.print(" # ");
								} else {
									System.out.print(" . ");
										}
								}
						 System.out.println();
							} System.out.println("\n\n");
						
						
						 
					}
				}
				
				 // 이름이 같은 마라톤 선수 //
				
				private static void maratoner() {
			//	String[] participant = {"leo", "kiki", "eden"};
					String[] participant = {"mislav", "stanko", "mislav", "ana"};
			//	String[] completion  = {"eden", "kiki"};
					String[] completion =  {"stanko", "ana", "mislav"}; 
				
				/* participant 의 각 원소에 대해서
				 * completion 의 모든 원소와 각각 비교해본다.
				 * 다 비교했음에도 자기 이름이 없으면  그 놈이 완주 못한 놈이다.
				 * 비교하다가 자기 이름이 발견되면.. break;
				 */
				int idx = -1;
				for (int i = 0; i < participant.length; i++) {
					boolean found = false;
					for (int j = 0; j < completion.length; j++) {
						if (participant[i].equals(completion[j])); { // 다 비교했음에 발견되면 break
							completion[j] = "";
							found = true;
							break;
						}
					}	
				if (found == false) {
					idx = i;
					break;
				}
				
				}
				String answer = participant[idx];
				System.out.println(answer);
				}
				
				// 온라인 퀴즈 //
				
				private static void play () {
					int[] nums1 = {1,2,3,4,5};
					int[] nums2 = {10,9,8,7,6};
					
					int[] nums3 = new int[nums1.length];
					
					for (int i =0; i < nums1.length; i++) {
						nums3[i] = nums1[i] + nums2[i];
						if(i >0) {
							nums3[i] = nums3[i-1] + nums3[i];
						}
					}
					System.out.println(nums3[nums3.length-1]);
						}
					
				
				
}

