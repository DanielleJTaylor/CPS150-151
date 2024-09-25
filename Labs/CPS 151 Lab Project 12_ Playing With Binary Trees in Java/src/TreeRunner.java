
class TreeRunner {

	public static void main(String[] args) {
// new Tree calls public Tree method
		Tree t1 = new Tree("A");
		Tree t2 = new Tree("B");
		t1.addSubtree(t2);
		Tree t3 = new Tree("C");
		t1.addSubtree(t3);
		Tree t6 = new Tree("D");
		t2.addSubtree(t6);
		Tree t7 = new Tree("E");
		t2.addSubtree(t7);
		Tree t4 = new Tree("F");
		t3.addSubtree(t4);
		Tree t5 = new Tree("G");
		t3.addSubtree(t5);
	
		System.out.println(t1);
	}

}
