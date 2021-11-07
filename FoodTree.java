package TABAQuestions;

public class FoodTree<T extends Comparable<T>> implements Interface<T>{
	
	
	Node<T> root = null;
	
	
	//if root is empty we are inserting new root
	
	public void insertNode (T value){
		if (root == null) {
			root = new Node<T> (value);			
		} else {
			insertNode(root, value);			
		}
	}	
	
	public void insertNode(Node<T> current, T value) {
		//here we are checking food index, if its greater to compared one it goes right if its not it goes left
		if (value.compareTo(current.value) > 0) {
			// right path
			if (current.right == null) {
				current.right = new Node<T> (value);
				return;
			} else {
				//recursion
				insertNode(current.right, value);
			}
		} else { 
			//left path
			if (current.left == null) {
				current.left = new Node<T> (value);
				return;
			} else {
				
				insertNode(current.left, value);
			}
		}		
	}
	
    public int size() {
    	return(size(root));
    }
 // method that calculate number of nodes
    private int size(Node<T> current) {
		if (current==null) return (0);
		else {
			return (size(current.left) +1+ size (current.right));
		}
	}
    
    public int minValue () {
    	return (minValue (root));
    }
 // method that calculate minimum value
	private int minValue(Node<T> current) {
	
	while (current.left != null) {
		current = current.left;
	}
		return (int) (current.value);
	}
	
	// method that put nodes in order, from lowest to highest food index
	private void inOrder(Node<T> current) {
        if (current == null) {
            return;
        }

        inOrder(current.left);
        System.out.println(current);
        inOrder(current.right);
    }
    
    public void inOrder() {
        inOrder(root);
    }
}
