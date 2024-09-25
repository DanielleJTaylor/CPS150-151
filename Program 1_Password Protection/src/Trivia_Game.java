import java.util.Scanner;

/*
 *Program 1.java
 * Danielle Taylor, taylord24
 */

/*
 *
 * Name: Danielle Taylor
 * User Name: taylord24
 * Assignment: 1
 *
 * Description:
 *    
 *     

Write a program that plays a simple trivia game. 
The game should have five questions. 
Each question has a corresponding answer and point value 
between 1 and 3 based on the difficulty of the question. 
Another array of type String should be used to store the answers.
An array of type int should be used for the point values.
Implement the game using three arrays.
Your program should ask the player each question one at a time 
and allow the player to enter an answer. 
If the player’s answer matches the actual answer, 
the player wins the number of points for that question.
After the player has answered all five questions, the game is over, 
and your program should display the player’s total score.


 *
 * Bug Report:
 *   Works great now 
 *   Thank you
 *
 */


public class Trivia_Game {
	
	public static void main(String[] args) {
	int[] value = {3,1,2,2,3};
	String [] questions = {"What was the first pokemon created (not put in the games but designed)?",
			"Who was the first president?",
			"What is the largest country?",
			"What country has the highest population (now in 2023)?",
			"What is China's most popular book?"};
	String [] answers = {"Rhydon",
			"George Washington",
			"Russia",
			"India",
			"Journey to the West"};
	 
	Scanner scan = new Scanner(System.in);

	
	 
int score = 0;
String [] user_answer = new String[5];

for (int i=0; i<value.length; i++) {
	
//	System.out.println("DEBUG: i = " + i);
	
	System.out.println(questions[i]);
	
	
	 user_answer[i] = scan.nextLine();
	
	 if(user_answer[i].equalsIgnoreCase(answers[i])) {
		score = score + value[i];
		System.out.println("Your score is " + score);
		}
	
	else { 
		System.out.println("The correct answer is " + answers[i]);
		System.out.println("Your score is " + score);
	}
	
	System.out.println(" ");
}

System.out.println("Your score is " + score);
System.out.println("Game over!  Thanks for playing!");
	}
}