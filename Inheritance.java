class Animal{
	void bark() {System.out.println("Barking.");
	
	}
}
class Dog extends Animal{
	void meaw() {System.out.println("meaaww.");
	
	}
}
class lion extends Animal{
	void roar() {System.out.println("roaaaar.");
}
}
public class Inheritance {
public static void main(String[] args) {
	lion Tommy= new lion();
	Tommy.bark();

	Tommy.roar();
}
}
