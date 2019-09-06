
public class No_3 {

	abstract public static class Animal {
		 abstract public void greeting();
	}
	
	public static class Cat extends Animal {
		 @Override
		 public void greeting() {
			 System.out.println("Meow!");
		 }
	}
	
	public static class Dog extends Animal {
		 @Override
		 public void greeting() {
			 System.out.println("Woof!");
		 }

		 public void greeting(Dog another) {
			 System.out.println("Woooooooooof!");
		 }
	}
	
	public static class BigDog extends Dog {
		 @Override
		 public void greeting() {
			 System.out.println("Woow!");
		 }
		 @Override
		 public void greeting(Dog another) {
			 System.out.println("Woooooowwwww!");
		 }
	}
	
	
	
	public static void main(String[] args) {
			 // Using the subclasses
			 Cat cat1 = new Cat();
			 cat1.greeting();
			 Dog dog1 = new Dog();
			 dog1.greeting();
			 BigDog bigDog1 = new BigDog();
			 bigDog1.greeting();

			 // Using Polymorphism
			 Animal animal1 = new Cat();
			 animal1.greeting();
			 Animal animal2 = new Dog();
			 animal2.greeting();
			 Animal animal3 = new BigDog();
			 animal3.greeting();
			 //Animal animal4 = new Animal(); 抽象类不能实例化
			 
			// Downcast
			 Dog dog2 = (Dog)animal2;
			 BigDog bigDog2 = (BigDog)animal3;
			 Dog dog3 = (Dog)animal3;
			 // cat2 = (Cat)animal2; 狗不能转化为猫
			 dog2.greeting(dog3);
			 dog3.greeting(dog2);
			 dog2.greeting(bigDog2);
			 bigDog2.greeting(dog2);
			 bigDog2.greeting(bigDog1);

	}

}
