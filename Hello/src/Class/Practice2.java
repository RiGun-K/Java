package Class;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		test();
		System.out.println("test 메소드 종료");
		
/*		int a = 128;
		int b = 956;
		sum(a,b);                        
		System.out.println("a:" + a);	          // 메인 메소드에있는 a,b 값을 받음
		System.out.println("b:" + b); 		  // 메인 메소드와 메소드는 별개임, 메인메소드로 불러주지않으면 인식안함
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		sum(array);
		System.out.println("array[0]:" + array[0]);
		System.out.println("array[1]:" + array[1]);    
		
		int sum = sum(664, 93821);
		if (sum > 15000) {
			System.out.println("만오천 보다 크네요");
	}   else (sum < 15000) {
			System.out.println("만오천 보다 작네요");
			}
		System.out.println("합은:" + sum); 
		} */
	
	}
	public static void sum(int[] arr) {                  
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("총 합:" + total);
		arr[0] = 100;
		arr[1] = 200;
	}
	
	public static void test() {
		System.out.println("test");
	}
	
	public static void test2() {
		System.out.println("test2");
	}
	
	public static void sum(int a, int b) {                   // void 는 값을 반환하지않음 int로 바꾸면 가능
		System.out.println(a  + "+" + b + "="+ (a+b));
		int total = a + b;
		a= 20;
		b= 30;
	}
	
	// main() 매개 변수
	
		
	
	
}
