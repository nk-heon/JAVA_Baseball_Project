package Ex0713;

import java.util.Scanner;

public class Ex04_Array2D_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] str = {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"pencil","연필"},
				{"watch","시계"}};
		String input = "";
		int i = 0;
		double count = 0;
		
		for(i=0;i<str.length;i++){
				System.out.println("문제"+(i+1)+"."+str[i][0]+"의 뜻은 무엇인가요?");
				input = scan.nextLine();
				if(str[i][1].equals(input)) {
					System.out.println("정답");
					count++;
				}else {
					System.out.println("틀렸습니다.");
					System.out.println("정답은"+str[i][1]+"입니다");
				}
				
		}
		System.out.println("총"+count+"개 정답입니다.");
		System.out.println("정답률은"+(100*(count/5))+"입니다");

	}

}
