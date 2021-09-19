package getSet;

public class gs {
	private int id= 101;
	private String name="parvaiz";
//	public void display() {
//		System.out.println("id \t"+id+"\t name "+name);
//	}
		public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id < 100) {
			System.out.println("please enter age greater than 100");
			return;
		}
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
