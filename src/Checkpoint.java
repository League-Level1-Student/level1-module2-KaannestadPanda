
public class Checkpoint {
private int age;
private String name;

public static void main(String[] args) {
	Checkpoint a=new Checkpoint();
	Checkpoint b = new Checkpoint();
a.Person(2, "bob");
System.out.println(a.getName());
System.out.println(a.getAge());
a.setName("Yeet");
a.setAge(1);
System.out.println(a.getName());
System.out.println(a.getAge());

b.Person(20, "bob0");
System.out.println(b.getName());
System.out.println(b.getAge());
b.setName("Yeet0");
b.setAge(10);
System.out.println(b.getName());
System.out.println(b.getAge());
}


public void Person(int age, String name) {
	this.age=age;
	this.name=name;
	
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public void setName(String newName) {
	name=newName;
}

public void setAge(int newAge) {
	age=newAge;
}





}


