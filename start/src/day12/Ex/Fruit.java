package day12.Ex;

public class Fruit extends Sample {
	private String name;

	public Fruit() {}
	public Fruit(String name) {
		this.name = name;
	}	

	@Override
	public String abc() {
		return name;
	}

}		
		