
public class Tester {
	public static void main(String[] args) {
	     
		  LispList list1 = new EmptyList();
	      System.out.println(list1.length());
	      System.out.println("Expected: 0");

	      LispList list2 = new NonEmptyList("A", new EmptyList());
	      System.out.println(list2.length());
	      System.out.println("Expected: 1");

	      LispList list3 = new NonEmptyList("A", new NonEmptyList("B",
	         new NonEmptyList("C", new EmptyList())));
	      System.out.println(list3.length());
	      System.out.println("Expected: 3");

	      LispList list4 = LispList.NIL.cons("E").cons("D").cons("C").cons("B").cons("A");
	      System.out.println(list4.length());
	      System.out.println("Expected: 5");



	 
		
	}
}
