package day12.Ex;

public class Fish extends Sample {
	private String name ;
	
	public Fish() {}
	public Fish(String name) {
		this.name = name;
	}
	
	@Override
	public String abc() {
		return name;
	}

	@Override
	public String toString() {
		return "물고기";
	}
}
