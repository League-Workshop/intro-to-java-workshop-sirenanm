package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	

	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		JOptionPane.showMessageDialog(null,"if you get 2 or below, you cannot join us to find de wea");
		int score = (0);
		// 2.  Ask the user a question 
		String name=JOptionPane.showInputDialog("do u have e-bolah");
		// 3.  Use an if statement to check if their answer is correct
		if(name.equals("yes")) {score++;}
		if(name.equals("no")) {score--;}
		// 4.  if the user's answer is correct 
		// -- add one to their score 
		{score++;}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String name1=JOptionPane.showInputDialog("are you stipid");
		if(name.equals("yes")) {score++;}
		if(name.equals("no")) {score--;}
		String name2=JOptionPane.showInputDialog("do you hail de queen");
		if(name.equals("yes")) {score++;}
		if(name.equals("no")) {score--;}
		String name11=JOptionPane.showInputDialog("do u hate de penguinz");
		if(name.equals("yes")) {score++;}
		if(name.equals("no")) {score--;}
		String name3=JOptionPane.showInputDialog("are you genetically modified");
		if(name.equals("yes")) {score++;}
		if(name.equals("no")) {score++;}
		if(name.equals("maybe")) {score--;}
		String a=JOptionPane.showInputDialog("ARE U UGANDAN");
		if(name.equals("yes")) {score--;}
		if(name.equals("no")) {score++;}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
		JOptionPane.showMessageDialog(null,"you scored "+score);
		if(score>2) {JOptionPane.showMessageDialog(null, "you know de wea");}
		if(score<2) {JOptionPane.showMessageDialog(null, "you do not know de wea");}
	}
}
