package Ex0715;

public class Mobile {
	String company = "삼성";
	String model;
	String color;
	int type;//4G 5G
	
	//모든 필드를 매개변수로 하는 생성자   기본생성자 (매개변수)
	Mobile(String company,String model,String color,int type){
		//전달 받은 매개변수에 담긴 값을 각각 필드에 저장
		this.company = company;
		this.model = model;
		this.color = color;
		this.type = type;
	}	
	
	//기본생성자 선언(매개변수에 입력하지 않고 하려면  기본생성자 선언)
	Mobile(){
		
	}
	//생성자overloaing : 생성자를 여러 개 생성할 수 있음
	
	
	Mobile(String model,String color,int type){
		this.model = model;
		this.color = color;
		this.type = type;
		
		
	}
}
