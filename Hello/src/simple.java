import java.util.Scanner;

public class simple {
   public static void main(String[] args) 
   {
      Scanner stdin = new Scanner(System.in);
      System.out.print("1~99 사이의 숫자를 입력하세요" );
      int a=stdin.nextInt(); //숫자 읽기
      
      int b= a/10; //10의 자리 설정
      int c= a%10; //1의 자리 설정

      
      if((b==3 || b==6 || b==9)&&(c ==3 || c ==6 || c ==9 ))//둘 다 3,6,9가 존재
          System.out.println("박수짝짝");
        
      else if((b==3 || b==6 || b==9)&&(c !=3 || c !=6 || c !=9 ))//10의 자리만 3,6,9
         System.out.println("박수짝");
      
      else if((b !=3 || b !=6 || b !=9)&&(c ==3 || c ==6 || c ==9 ))//1의 자리만 3,6,9
         System.out.println("박수짝");
      
      else if((b !=3 || b !=6 || b !=9)&&(c !=3 || c !=6 || c !=9 ))
         System.out.println("NO 3, 6, OR 9"); // 둘 다 3,6,9존재 안함
      stdin.close();
   }

}