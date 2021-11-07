package TABAQuestions;

public class FoodApp {

	public static void main(String[] args) {
		// Here we instantiate constructor
		FoodTree<Food> foodTree = new FoodTree<Food>();
		// here we are showing functionality of our binary tree with this 10 food products
		Food pizza = new Food("pizza", 5, 1);
		
		Food brocoli = new Food("brocoli", 2, 10);
		
		Food ham = new Food("ham", 1, 2);
		
		Food tomato = new Food("tomato", 2, 9);
		
		Food salad = new Food("salad", 1, 7);
		
		Food eggs = new Food("eggs", 3, 5);
		
		Food potato = new Food("pizza", 1, 6);
		
		Food rice = new Food("pizza", 2, 8);
		
		Food biscuit = new Food("biscuit", 2, 4);
		
		Food crisps = new Food("crisps", 2, 3);
		
		// here we are creating a nodes using methods in FoodTree app
		foodTree.insertNode(pizza);
		
		foodTree.insertNode(brocoli);
		
		foodTree.insertNode(ham);
		
		foodTree.insertNode(tomato);
		
		foodTree.insertNode(salad);
		
		foodTree.insertNode(eggs);
		
		foodTree.insertNode(potato);
		
		foodTree.insertNode(rice);
		
		foodTree.insertNode(biscuit);
		
		foodTree.insertNode(crisps);
		
		foodTree.inOrder();
		
		System.out.println(foodTree);
	}

}
