import java.util.*;

public class Practice3 {

   public static void main(String[] args) {
      writeSpace();   //필기
      //twoDimensionalArray();   //2차원배열출력
      ticTacToe();   //틱택톡
   }
//--------------------------------------------------------------필기
   public static void writeSpace() {
      /*
       * 2차원배열출력
       * 우리가 만약에 2차원배열에 각 원소를 출력해보고 싶으면
       * 행의 수만큼 반복을 하고 행에대해서 열의 수만큼 반복을 하면 된다
       * 즉 중첩반복문을 쓰면된다.
       * 
       * 틱택토
       * 디스플레이호출했을때 메소드 내부에 보드가 없기 때문에 디스플레이() 괄호에 보드를 입력.
       * 보드는 char[][] 배열이므로 메소드() 괄호에 char[][] 입력.
       */
   }
//---------------------------------------------------------------틱택톡
   public static void ticTacToe() {
      char[][] board = new char[3][3];
      
      initialize(board);
      Scanner input = new Scanner(System.in);
      boolean isOver = false;
      while(true) {
         /*
          * 1. 현재 보드의 상태를 디스플레이
          * 2. 좌표를 입력받는다. (row, col) <= 1 1은 board[0][0]을 의미.
          *                         <= 1 2는 board[0][1]을 의미.
          * 3. 입력받은 좌표의 값이 빈공간인지 체크
          *       if(board[row-1][col-1] == ' ') { // 빈 공간이면
          *          board[row-1][col-1] = 'X';
          *       } else {   /빈 공간이 아니면...
          *          잘못된 위치입니다를 출력...
          *          continue;
          *       }
          * 
          * 4. 컴퓨터가 빈 공간에 'O'을 놓는다.
          *    board[i][j] = 'O';
          */
         // step 1
         display(board);
         if(isOver == true) break;   // 끝났는지 확인해서 끝났으면 종료...
         
         
         // step 2
         System.out.println("다음에 놓을 좌표를 입력하세요...(1 1 ~ 2 2):");
         int row = input.nextInt();   // 1 2
         int col = input.nextInt();
         
         // step 3
         if (board[row-1][col-1] == ' ') { // 빈 공간이면..
            board[row-1][col-1] = 'X';
            // 끝났는지 확인.. 끝났으면 isOver를 true로 ...
         } else { // 빈 공간이 아니면 ...
            System.out.println("잘못된 위치입니다...");
            continue;
         }
         
         // step 4)
         if (isOver == false) {
            //computerPlay(board);   //서순
            computerPlayV2(board);   //무작위
            // 끝났는지 확인하고 끝났으면 isOver를 true로 설정..
         }
      }
   }
   public static void computerPlayV2(char[][] board) {
      Random random = new Random();
      while(true) {
         // row 값을 1~3의 무작위 값으로 발생시키고 
         // col 값을 1~3의 무작위 값으로 발생시키고
         int row = random.nextInt(3) + 1;
         int col = random.nextInt(3) + 1;
         
         // 빈 공간이면 그 자리에 'O'를 놓고 끝내고.. 아니면 계속 try...
         if (board[row-1][col-1] == ' ') {
            board[row-1][col-1] = 'O';
            break;
         }
      }
   }
   private static void initialize(char[][] board) {
   for (int i=0; i<board.length; i++) {
      for (int j=0; j<board.length; j++) {
         board[i][j] = ' ';
      }
   }
   }
   public static void computerPlay(char[][] board) {
      /*
       * 일단, 단순하게 구현한다.
       *  => 가장 처음에 발견되는 빈자리에 'O'를 놓는다.
       */
      for (int i=0; i<board.length; i++) { // 각 행에 대해서...
         // 각 행을 반복할 때마다 그 행에서 빈 공간이 발견되어 'O'를 놓았는지\
         // 체크하기 위한 변수 found를 false로 초기화 하자.
         // 혹시나 발견되면 found를 true로 변경하자.
         boolean found = false;
         for (int j=0; j<board[i].length; j++) { // 각 열에 대해서...
            if (board[i][j] == ' ') { // i행, j열이 빈 공간이면 거기에 'O'를 놓는다.
               board[i][j] = 'O';
               found = true;
               break;
            }
         }
         // i행의 특정 열에 'O'를 놓았으면 break;
         if (found) break;
      }
   }
   public static void display(char[][] board) {
      for (int i=0; i<board.length; i++) { //각 행에 대해서
         for (int j=0; j<board[i].length; j++) { //각 열에 대해서..
            if (j < board[i].length-1)   // 마지막 열 바로 전까지는 요렇게 찍고
            System.out.print(board[i][j] + " | "); // i번째 행에 j번째 열 값을 출력
            else // 마지막 열이면 아래처럼 찍고...
               System.out.print(board[i][j]);
         }
         System.out.println();
         System.out.println("__|___|___");
      }
   }
//---------------------------------------------------------------2차원배열출력
   public static void twoDimensionalArray() {
      //int[] nums = new int[5];
      //int[] nums = {1, 2, 3, 4, 5};
//---------------배열생성방법1 바로생성
//      int[][] table = {
//                  {10, 20, 30, 40, 50},
//                  {60, 70, 80, 90, 100},
//                  {110, 120, 130, 140}
//                  }; 
//---------------배열생성방법2 단계대로생성
      int[][] table = new int[3][];
      table[0] = new int[5];
      table[1] = new int[5];
      table[2] = new int[4];
      int value = 10;
      for (int i=0; i<table.length; i++) {
         for (int j=0; j<table[i].length; j++) {
            table[i][j] = value;
            value += 10;
         }
      }
      // 아래는 중첩반복문으로 출력하는 문장
      for (int i=0; i<table.length; i++) {
      for (int j=0; j<table[i].length; j++) {
         System.out.print(table[i][j] + " ");
      }
      System.out.println();
      }
   }
}
