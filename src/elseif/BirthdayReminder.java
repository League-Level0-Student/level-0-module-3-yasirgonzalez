
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 30th";
		String dadsBirthday = "December 25";
		String myBirthday = "November 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog("What birthday do you want");
		// 3. Print out what the user typed
	System.out.println(Birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
	if(Birthday.equals("mom")) {
		System.out.println(momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	else if(Birthday.equals("dad")) {
		System.out.println(dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
	else if (Birthday.equals("my")) {
		System.out.println(myBirthday);
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		System.out.println("Sorry, I don't remeber that person's birtday!");
	}
	} 
}
