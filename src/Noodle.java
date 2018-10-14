
class Noodle {

	String type = "slimy";
	
	void noodleFlavor(String flavor) {
		type = flavor;
	}
	
	void slurp() {
		System.out.println("yum yum");
	}
	
}

class Ninja {
	String alliegence;
	String enemy;
	Enemy eenemy = new Enemy("ENEMY CLAN THING");
	
	 Ninja(String enemy, String alliegence) {
		this.alliegence = alliegence;
		this.enemy=enemy;
	}
	
	void sabotage() {
		infiltrate("INFILTRATIO");
		setOnFire(eenemy.getLocation);
	}
	
	void infiltrate(String who) {
		System.out.println("YOUR NINJA INFILTRATED "+ who);
	}
	Ninja nagato = new Ninja("Momochi", "Nobunga");
	Ninja momochi = new Ninja("nagato", "Enemy dude");
	
}

class HauntedHouse{
	int skeletons;
	String name;
	
	HauntedHouse(String name, int skeletons){
		this.name=name;
		this.skeletons=skeletons;
	}
	
	void doScaryStuff(int pumpkins,String scaryPhrase) {
		System.out.println(pumpkins+ " pumpkins say "+scaryPhrase);
		
	}
	
	boolean isSpooky() {
		return true;
	}
	{
		HauntedHouse h = new HauntedHouse("SpookyZone", 3);
		h.doScaryStuff(40000000, "NO FORTNITE!!! HAHA BET THAT SCARED YOU!!");
		h.isSpooky();
	}
	
	
}






