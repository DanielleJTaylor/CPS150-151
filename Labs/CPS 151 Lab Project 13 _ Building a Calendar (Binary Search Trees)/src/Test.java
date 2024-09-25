
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST myTree = new BST();
		

        myTree.insert(new Event("Lunch hour", new Time(12, 10), new Time(13, 10)));
        
        System.out.println(myTree);

	}

}
