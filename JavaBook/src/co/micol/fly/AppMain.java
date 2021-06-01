package co.micol.fly;

public class AppMain {

	public static void main(String[] args) {
		Human human = new Human();
		human.sleep();
		human.think();
		
		Bird bird = new Bird();
		bird.layEggs();
		bird.eat();
		
		Superman superMan = new Superman();
		superMan.fly();
	}

}
