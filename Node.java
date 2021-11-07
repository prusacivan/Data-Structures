package TABAQuestions;

public class Node<T> {
	protected Node<T> left;
	protected Node<T> right;
	T value;
	
	public Node (T value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value.toString();
	}

}
