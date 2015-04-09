package tv.learntoprogram.android;

public class Lion extends Animal implements predator {

	public Lion(int age, int length, String name, int weight) {
		super(age, length, name, weight);
		// TODO Auto-generated constructor stub
	}

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chasePray() {
		System.out.println("The Lion is chasing some pray");

	}

	@Override
	public void eatPray() {
		System.out.println("The Lion is eating it`s pray");

	}
	
	public void roar(){
		System.out.println("ROARRR!!");
	}

}
