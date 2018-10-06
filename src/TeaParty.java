
public class TeaParty {

	String greeting;
	String finalGreeting;
	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		if(isWoman&&isKnighted) {
			greeting="Lady";
		}
		else if(isWoman==false&&isKnighted){
			greeting="Sir";
		}
		else if(isWoman) {
			greeting="Ms.";
		}
		else {
			greeting="Mr.";
		}
		
		finalGreeting=greeting+" "+name;
		
		return "Hello "+finalGreeting;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

