package tv.learntoprogram.android;

public class Animal_driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal doggie = new Animal();
		
		doggie.setName("Rover");
		doggie.setAge(3);
		doggie.setLength(36);
		doggie.setWeight(17);
		
		doggie.breathe();
		doggie.eat("Vittles");
		doggie.sleep();
		
		System.out.println("The animal`s name is: " + doggie.getName());
		System.out.println("The animal`s age is: " + doggie.getAge());
		System.out.println("The animal`s length is: " + doggie.getLength());
		
		Animal kittie = new Animal(1, 23, "Kitty", 5);
		
		System.out.println("The second animals`s name " + kittie.getName());
		kittie.eat("shrimp");
		
		Fish goldfish = new Fish(1, 2, "Goldie", 1, true);
		System.out.println("The fish`s name is: " + goldfish.getName());
		goldfish.setWeight(2);
		System.out.println("The fish`s weight is: " + goldfish.getWeight());
		
		goldfish.getChase();
		
		Lion leo = new Lion(4, 240, "Leo The Lion", 420);
		leo.eatPray();
		
		System.out.println("You produced " + Animal.numAnimals + " animals");

	}

}
