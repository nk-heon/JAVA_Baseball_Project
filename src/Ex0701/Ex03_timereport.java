package Ex0701;

import java.util.Scanner;                                  
                                                          
public class Ex03_timereport {                            
                                                                
	public static void main(String[] args) {                   
		                                                       
		Scanner scan = new Scanner(System.in);                 
		                                                      
		int input = 0;                                      
		int second = 0;                                    
		int minit = 0;                                     
		int hour = 0;                                       
		System.out.print("�ʸ� �Է��Ͻÿ�. : ");             
		input = scan.nextInt();                            
		hour = input/3600;                                   
		minit = (input%3600)/60;                            
		second = (input%3600)%60;
		
		                                                    
		scan.close();                                       
		System.out.print(input+"�ʴ�"+hour+"�ð�"+minit+"��"+second+"�� �Դϴ�.");
	}	

}
