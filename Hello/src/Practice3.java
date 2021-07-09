//import java.util.*;

//import com.sun.java.swing.action.NextAction;

public class Practice3 {

	public static void main(String[] args) {
		if (args.length > 0) {
			int n1, n2;
	// wrapper class : int -> Integer,  short -> Short  , long -> Long
			if (args.length !=2) {
				System.out.println("사용법 => java Practice3 num1 num2");
				return;
			}
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			System.out.println(n1 +"과" + n2+"의 합:" + (n1+n2));
			
			
	/*	System.out.println("메인 메소드로 전달된 인자");
			for (int i = 0; i < args.length; i++) {
		System.out.println(args[i]); 
			}  */
			
		} else {
			System.out.println("메인 메소드로 전달된 인자가 없습니다.");
				}
   
	//	sortArray();
		sort();
	}
	
	private static void sort() {
	
		int[] s = new int[10];
		
		for(int i =0; i < s.length; i++) {
			s[i] = i;
		}
		for(int i =0; i < s.length; i++) {
			System.out.println(s[i]+"");
		}
		
/*		int[][] s = new int[3][5];
		
		for(int i =0; i < 2; i++) 
			for(int j=0; j<4; j++)
				System.out.println(s[i][j]);
*/		
	}
	
	private static void sortArray() {
		Random random = new Random();
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] =  random.nextInt(100)+1;
		}
		display(nums);
		
		Arrays.sort(nums);
	
		System.out.println("After sorting...");
		
		display(nums);
	}
	private static void display(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
		private static void selectionSort(int[] arr) {
				for (int i = 0; i < arr.length-1; i++) {
					int minIdx = 1;
					/* 배열의 인덱스를 i+1 부터 마지막 원소의 인덱스까지 증가시키면서
					 * 제일작은 원소값의 인덱스를 찾아 minIdx에 넣자.
					 */
				for (int j = i+1; j < arr.length; j++) {
					if (arr[minIdx] > arr[j])
					minIdx = j;
								}
				swap(arr, i, minIdx);
				}
	
	}
		private static void swap(int[] arr, int idx1, int idx2) {
			int tmp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = tmp;
	}
		
		
		// 2차원 배열 int[][] ja = new int [2][40]  배열의수 2개 에 각 배열의 최대값은 40 
		
		private static void twoDimensinonalArray() {
			int[][] ja = new int[2][10];
			
			Random random = new Random();
			
			for(int i = 0; i < ja.length; i++) {
				for(int j = 0; j < ja[i].length; j++) {
					ja[i][j] = random.nextInt(100) + 1;	
				}
			}
			
			/*
			 * i가 0 일때 - j는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			 * i가 1 일때 - j는 0, 1, 2, 3, 4, 5, 6 ,7, 8, 9
			 * 		
			 */
		System.out.println("  0   1 2 3 4 5 6 7 7 8 9 ");
		for (int i = 0; i < ja.length; i++) {
			System.out.print(1 + ":");
			for (int j = 0; j < ja[i].length; j++) {
				System.out.printf("%3d ", ja[i][j]);
			}
			System.out.println();
		}
		
		
		}
		
		private static void twoDimensinonalArray2() {
			// int[] nums = new int[5];
			// int[] nums = {1, 2, 3, 4, 5};
			
	/*		int[][] table = { {10, 20, 30, 40, 50},
					          {60, 70, 80, 90, 100},
					          {110, 120, 130, 140}
							};
		
			for (int i = 0; i < table.length; i++) {
				for(int j = 0; j < table[i].length; i++) {
					System.out.println(table[i][j] + " ");
				}
				System.out.println();
		
		}      */
			
			// 위 코드와 아래 코드가 같은 방식임,,
			
			int[][] table = new int[3][];
			table[0] = new int[5];
			table[1] = new int[5];
			table[2] = new int[4];
			int value = 10;
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					table[i][j] = value;
					value += 10;
				}
				}
			
		}
			
		
		
		private static void generateRandomInt(int[] arr) {
			Random random = new Random();
			int [] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100)+1;
		}
		display(nums);
		}

		
		private static void ticTacToe() {
			char[][] board = new char[3][3];
//			board[0][0] = ' ';
//			System.out.println("[" + board[0][0]+ "]");
	
			Scanner input = new Scanner(System.in);
			boolean isOver = false;
			
			while(true) {
				/*
				 * 1. 현재 보드의 상태를 디스플레이
				 * 2. 좌표를 입력받는다. ( row, col ) <= 1 1 은 board[0][0] 을 의미.
				 * 							   	<= 1 2 는 board[0][1] 을 의미.
				 * 3. 입력받은 좌표의 값이 빈공간인지 체크
				 * 		if(board[row-1][col-1] == ' ') { // 빈 공간 이면
				 * 			board[row-1][col-1] = 'X';
				 * 		} else { // 빈 공간이 아니면...
				 * 			잘못된 위치입니다를 출력...
				 * 		continue;
				 * 		}  
				 * 4. 컴퓨터가 빈 공간에 'O'를 놓는다. 위치 i, j 를 찾는다.
				 * 		board[i][j] = 'O';
				 */
				// step 1
				display(board);
				if (isOver == true) break;
				
				// step 2
				System.out.println("다음에 놓을 좌표를 입력하세요...(1 1 ~ 2 2):");
				int row = input.nextInt(); 
				int col = input.nextInt();
				
				// step 3
				if (board[row-1][col-1] == ' ') { // 빈 공간이면..
					board[row-1][col-1] = 'X';
					// 끝났는지 확인.. 끝났으면 isOver를 true로 ...
				} else { // 빈 공간이 아니면...
					System.out.println("잘못된 위치입니다...");
					continue;
				}
				
				if (isOver == false) {
					// computerPlay(board); 
					   computerPlayV2(board);
					// 끝났는지 확인하고 끝났으면 isOver를 true로 설정...
				}
			
				
				
			
			}
		}
		
		// 매개 변수가 필요함 , 자료유형이 같아야함.
		
		private static void display(char[][] board) {
			for (int i = 0; i < board.length; i++) { // 각 행에 대해서
				for(int j = 0; j < board[i].length; j++) { // 각 열에 대해서
					if ( j < board[i].length-1) 
						System.out.print(board[i][j] + " | "); // i번째 행에 j번째 열 값을 출력.
					else // 마지막 열이면 아래처럼 찍고...
						System.out.print(board[i][j]); 
				}
				System.out.println();
				System.out.println("__|__|__");
		}


		}
		
		private static void computerPlay(char[][] board) {
			/* 
			 * 일단 , 단순하게 구현한다.
			 * => 가장 처음에 발견되는 빈자리에 'O'를 놓는다.
			 */
			for (int i = 0; i < board.length; i++) { // 각 행에 대해서...
					// 각 행을 반복할 때마다 그 행에서 빈 공간이 발견되어 'O'를 놓았는지
					// 체크하기 위한 변수 found를 false로 초기화 하자.
					// 혹시나 발견되면 found 를 true로 변경하자.
				boolean found = false;
				for (int j = 0; j < board[i].length; j++) { // 각 열에 대해서...
					if (board[i][j] == ' ') { // i행, j열이 빈 공간이면 거기에 'O'를 넣는다.
						board[i][j] = 'O';
						found = true;
						break;
					                        }
			     } 
			} 
			// i행의 특정 열에 'O'를 놓았으면 break;
			
			
		}
		
		private static void initialize(char[][] board) {
			for (int = 0; i < board.length; i++) {
				fot(int j = 0; j < board.length; i++) {
					board[i][j] = ' ';
					
					
				}
			}
		}
		
		private static void (char[][] board) {
			Random random = Next Random();
			while(true) {
				// row 값을 1~3회 무작위 값으로 발생시키고
			    // col 값을 1~3회 무작위 값으로 발생시키고
				int row = random.nextInt(3) + 1;
				int col = random.nextInt(4) + 1;
				
			}
			
		}
		
		
	
		
}


