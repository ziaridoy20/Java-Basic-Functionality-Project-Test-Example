package tv.learntoprogram.android;

public class Animal {
	
	/*
	 * Private - Accessible only with the class
	 * Public - Accessible within the class and to other classes
	 * Protected - Accessible within the class and to children of the class (subclasses)
	 */
	
	//Properties of Animal
	//Known as "members"
	//Instance Member
	
	private int age;
	private int length;
	private String name;
	private int weight;
	
	// static variable - we don`t address through the instance 
	// we address through the class
	public static int numAnimals;
	
	
	//Constructor - A constructor runs when a class is created.
	public Animal(int age, int length, String name,int weight)
	{
		this.age = age;
		this.length = length;
		this.name = name;
		this.weight = weight;
		numAnimals++;
		
	}
	
	//Default Constructor - Overriding method, same name as constructor
	//Simple put empty 
	public Animal()
	{
		numAnimals++;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0){
			this.age = age;
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length>0){
			this.length = length;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight>0){
			this.weight = weight; 
		}
	}
	//Methods
	public void eat (String food)
	{
		System.out.println("Animal is eating " + food);
		
	}
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	
	public void breathe()
	{
		System.out.println("Animal is breathing");
	}
	

}
