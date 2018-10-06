
public class Methods1 {

	public static void main(String[] args) {
		Methods1 a=new Methods1();
		a.food("apples");
		a.truth(5);
	}
	
	void food(String fruit) {

	       System.out.println("I like " + fruit); 

	}
	
	void truth(int x) {

	       if(x > 5) 

	              System.out.println("Geeks rule");

	       else

	              System.out.println("Nerds rule");

	}
}
