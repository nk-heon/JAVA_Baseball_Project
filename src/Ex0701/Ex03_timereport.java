package Ex0701;

import java.util.Scanner;                                  
                                                          
public class Ex03_timereport {                            
                                                                
	public static void main(String[] args) {                   
		                                                       
		Scanner scan = new Scanner(System.in);                 
		                                                      
		int input = 0;                                      
		int second = 0;                                    
		int minit = 0;                                     
		int hour = 0;                                       
		System.out.print("초를 입력하시오. : ");             
		input = scan.nextInt();                            
		hour = input/3600;                                   
		minit = (input%3600)/60;                            
		second = (input%3600)%60;
		
		                                                    
		scan.close();                                       
		System.out.print(input+"초는"+hour+"시간"+minit+"분"+second+"초 입니다.");
	}	

}
