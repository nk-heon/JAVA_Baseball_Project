package Ex0723;

public class Animalmain {

	public static void main(String[] args) {
		// Animal 클래스 객체 생성
//		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.sound();
		dog.breath();
		Cat cat = new Cat();
		cat.sound();
		cat.breath();
		
		//다형성(polymorphism)
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
//		cat = new Dog();
	}

}
