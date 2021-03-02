package chap2_oop;
class animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
public class Polymorphism {
  public static void main(String[] args) {
    animal myAnimal = new animal();
    animal myPig =new Pig();
    animal myDog = new Dog();
    
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
