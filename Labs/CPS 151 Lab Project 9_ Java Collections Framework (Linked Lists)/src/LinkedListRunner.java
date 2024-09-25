import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList <String> animals = new LinkedList<>();
boolean found = false;
String vowels = "aeiou";

animals.add("alligator");
animals.add("bear");
animals.add("camel");
animals.add("dinosaur");
animals.add("elephant");
animals.add("fish");
animals.add("gorilla");
animals.add("hen");
animals.add("iguana");
animals.add("jellyfish");
animals.add("kangaroo");
animals.add("lion");
animals.add("monkey");
animals.add("nightingale");
animals.add("otter");
animals.add("penguin");
animals.add("quail");
animals.add("rabbit");
animals.add("snake");
animals.add("turtle");
animals.add("uakari");
animals.add("viper");
animals.add("worm");
animals.add("xenon");
animals.add("yak");
animals.add("zebra");


ListIterator<String> iterate  = animals.listIterator();
while (iterate.hasNext()) {
String animal = iterate.next();
System.out.println(animal);
	}
//end of next iterator

System.out.println(" "
		+ " " );

while (iterate.hasPrevious()) {
String animal = iterate.previous();
for(int counter = 0; counter < vowels.length(); counter++)
if(vowels.charAt(counter) == animal.charAt(0)) {
    found = true;
    break;
 }
if(found) { 
	iterate.remove();
	found = false;
}
}
//end of previous iterator
System.out.println("Does not start with vowel");
while (iterate.hasNext()) {
String animal = iterate.next();
System.out.println(animal);
	}
}



	

	}

