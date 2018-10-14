import org.jointheleague.graphical.robot.Robot;

public class Methods1 {
	Robot Tortoise = new Robot();
	public static void main(String[] args) {
		
		Methods1 a=new Methods1();
		a.food("apples");
		a.truth(5);
		a.Tortoise.penDown();
		a.Tortoise.setSpeed(9001);
		for(int i=0; i<4; i++) {
			a.drawLine();
		}
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
	
	void drawLine() {

	       Tortoise.move(100);

	       Tortoise.turn(90); 
	}
	


}

class Hell {

    Hell(int hotness) {



    }

}

 class Bacon {

    String style = "streaky";

    Bacon (String style) {
          this.style = style;
    }

}

 class Unicorn {


 int horns;

	private Unicorn() {
          this.horns = 1;
    }

}


class Narwhal {

    public void Narwhale(){}

}
