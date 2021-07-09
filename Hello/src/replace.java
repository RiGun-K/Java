import java.util.*;

public class replace {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	replace(); //메인 메소드에서 불러줘야 실행이 됨 
	//	calLightSpeed();
	//	paran();
		parana();
	}
	
	public static void replace() {
		// 내부적으로 쓸려면 public -> private 로 바꿔도 가능
		
		/* 빛이 1년동안 이동한 거리를 계산
		 * 빛의 속도는 1초에 30만 km로 움직인다 
		 * 빛의 초당속도 * 60 * 60 * 24 * 365 만큼 이동한다.
		 */
		
		long lightSpeed = 300000;
		
		long distance = lightSpeed * 60 * 60 * 24 * 365;
		
		System.out.println("빛이 1년동안 이동하는 거리 :" + distance);
	}
	
	public static void calLightSpeed() {
		// 원의 면적: r*r*3.141592
	
	
	int r = 5;
	
	double p1 = 3.141592; // 3.141592(실수형리터널) 의 데이터타입은 double
                          // 3.141592 = 314.1592E-2
	double area = r*r*p1;
	
	System.out.println("원의 면적 : " + area);
   
	}
	
	final double KM_PER_MILE = 3.141592;
	
	
	public static void paran() {	//사람5명의 평균성적을 구하라.
		final int STUDENETS = 5;
		int total = 0;
		Scanner input = new Scanner(System.in);
		int scores[] = new int[STUDENETS];
		
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하시오");
			scores[i]= input.nextInt();
		}
		for(int i =0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("평균성적은" + total / STUDENETS + "입니다");
	
}
	// 10개중에 가장 작은 최소값을 구하시오.
	public static void parana() {
		int arrays[] = {15,2,4,3,1};
		int min;
		min = arrays[0];
		
		for (int i =0; i<arrays.length; i++) {
			if (arrays[i] < min) // > 
				min = arrays[i];
		}
		System.out.print("최소값은"+min);
	}
	
	public static void paranb() {
		int arrays[] = new int[10];
		Random random = new Random();
		
		for(int i=0; i<arrays.length; i++) {
			
		}
	}
	
	//특정한 값을 찾기
	
	public static void paranc() {
		int arrays[] = {12,34,133,54,13};
		int value ,index = -1;
		
			}
		
	
	
	
	
}
