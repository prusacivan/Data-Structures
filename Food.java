package TABAQuestions;



public  class Food implements Comparable <Food>{
    private String name;
	private int price;
	private int healthIndex;
	
	// constructor for Food class
	public Food (String name, int price, int healthIndex) {
		
		this.name = name;
		this.price = price;
		this.healthIndex = healthIndex;
	}
		// Overridden compareTo method that compare 2 Food objects
	@Override
	public int compareTo(Food comparedFood) {
		//
		if (this.healthIndex == comparedFood.getHealthIndex()) 
			return 0;
		
		if (this.healthIndex > comparedFood.getHealthIndex()) {
			return 1;
			
		} else {
			return -1;
		}

	}
	
		
	// setter and getter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHealthIndex() {
		return healthIndex;
	}
	public void setHealthIndex(int healthIndex) {
		this.healthIndex = healthIndex;
	}
	
	
}
