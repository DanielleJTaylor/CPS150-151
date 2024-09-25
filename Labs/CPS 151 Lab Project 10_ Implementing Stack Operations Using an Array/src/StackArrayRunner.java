/*
 * StackArrayRunner.java
 */

/*
 * CPS 151, Fall 2018 semester
 *
 * Section: 02
 * 
 * Lab Project 15: Implementing Stack Operations Using an Array
 *
 * author *** Replace with your name ***
 */

public class StackArrayRunner
{
  public static void main(String[] args)
  {
    StackArray sa = new StackArray();
    sa.push("a");
    sa.push("b");
    sa.push("c");
    sa.push("d");
    sa.push("e");
    try
    {
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  } // end main
} // end class StackArrayRunner
