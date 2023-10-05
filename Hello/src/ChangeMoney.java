import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int[] arrayMoney= {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; //돈 단위 지정
		String[] names= {"50000","10000", "5000", "1000","500","100","50","10","1"};//돈 단위를 문자열로 지정
		
		System.out.println("input price(won): ");
        Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		for(int i=0; i<arrayMoney.length; i++) {
			int a = money/arrayMoney[i];//a가 돈의 개수로 지정
			int b = money%arrayMoney[i];//b는 돈의 나머지로 지정(남은 돈)
			money= b;//남은 돈을 money로 지정
			if(a >0) {
			System.out.println(names[i]+": "+a);
			}//문자열로 지정한 돈 단위 + : + 개수 				

		}		
	}

}

