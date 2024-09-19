package ReStart01;

import java.util.Scanner;

public class JavaProgramming02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요 : ");
        
        double a = sc.nextDouble(); 
        
       if((a%2) == 0) {
    	   System.out.println("홀수");
       } else {
    	   System.out.println("짝수");
  
    }
    }
}
// 아직 못 풀음 정수가 제대로 나오지 않음