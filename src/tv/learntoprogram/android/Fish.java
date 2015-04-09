package tv.learntoprogram.android;

public class Fish extends Animal implements Pray {
	
	boolean scales;
	
	public Fish(int age, int length, String name, int weight, boolean scales)
	{
		super(age, length, name, weight);
		this.scales = scales;
	}
	
	public Fish()
	{
		
	}
	
	
	
	//New Method specific to the fish class
	public void swim()
	{
		System.out.println("Fish is swimming");
	}
	
	//Overriding the method in the parent class 
	public void breathe()
	{
		System.out.println("Fish is breathing through its gills");
	}

	@Override
	public void getChase() {
		System.out.println("Fish is being chased. ");
		
	}

	@Override
	public void getEatem() {
		System.out.println("Fish is being eaten. Goodbye");
		
	}

}
