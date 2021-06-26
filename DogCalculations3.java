package Sprint3;

import java.util.Random;
import java.util.Scanner;

//Casey Sloan
//Made during Summer 2021 in my COP 2006 class to exemplify all of the skills that I've learned in my programming 1 course.
/* Data Type in Java: Primitive Data Types & Non-Primitive Data Types
* 	Primitive Data Types: Boolean Type & Numeric Type
* 	 	Boolean Type: boolean
* 		Numeric Type: Character Value & Integral Value
* 			Character Value: char
*				Integral Value: Integer & Floating-Point
* 				Integer: byte, short, int, & long
* 				Floating-Point: float, & double
* 	Non-Primitive Data Types: String, Array, etc.
*  Source: https://www.geeksforgeeks.org/data-types-in-java/
*/
/* Define Variable
* A Java "variable" is thought of as a storage for memory. It contains the data types (above) 
* as to which offer different rules for input and output in order for your program to run properly.
*  Source: Jenkov, J. (2018). Java Variables. Jenkov. http://tutorials.jenkov.com/java/variables.html#:%7E:text=A%20Java%20variable%20is%20a,needs%20to%20do%20its%20job.
*/
/* Define Scope
*  Java's "scope" of a variable is the area of the program in which you can use this variable by name.
*  Java's 3 types of Scope: Class Level Scope (Member Variables), Method Level Scope (Local Variables), & Block Scope (Loop Variables)
*   Source: GeeksforGeeks. (2021, January 18). Scope of Variables In Java. https://www.geeksforgeeks.org/variable-scope-in-java/
*   		 Scope in Java. (2021). Codecademy. https://www.codecademy.com/articles/variable-scope-in-java
*/




public class DogCalculations3 {
	

	
	// Identify a method call and argument in comments Part A | Source https://www.w3schools.com/java/java_methods_param.asp
	static void dLife(String dname, int dage) { // Identify a header [static void dLife] and parameter [String dname, int dage] in comments | Source: https://www.cs.cmu.edu/~pattis/15-1XX/15-200/lectures/writingclasses/lecture.html
		System.out.println(dname + "'s average life span is: " + dage + " years old");
	}

		public static void main(String[] args) {
		
			
			Scanner input = new Scanner(System.in); //"input" is the Scanner object we've created | this allows for user input
			boolean boolYard = true;
			int intOutside = 5;
			final double DBL_KENNEL = 5.5;
			/* To declare a variable "final": what you are doing is making it's value unchangeable.
			 * Source: JFo 3–2: Numeric Data. (2021). ORACLE Academy. https://myacademy.oracle.com/lmt/clmsCourseDetails.prMain?in_sessionId=4A81313J538159J4&in_offeringId=71239041&in_from_module=LMTLOGIN.PRMENU
			 */
			String strMedFood = "200";
			short shtOutside = 4;


			intOutside = (int)shtOutside;
			/* Define Casting
			 * In Java, "casting" is used to change the size in memory that you want to use. Start with a double, it's to cut it off to change space.
			 * Source: Rachel Matthews. (2021, May 26).
			 */
			System.out.println("\tHello! Congratulations on your new bordercollie/sheltie mix puppy/dog!");
			System.out.println("We just need some information from you to make sure you're new family member will be happy in his/her forever home <3");
			System.out.println("\nIs it " + boolYard + " that you have a yard for your new puppy/dog to get adequate amount of exercise in? \n AND/OR that you have the means to bring your dog to a dog park, or other area of grass for your new puppy/dog to get the adequate amount of exercise in?");
			System.out.println("Enter: Yes or No");
			String park = input.next();

			if (park.equals("No")) {
					System.out.println(park + "??? Don't get a dog, you monster.");
					System.exit(0); //SOURCE THIS https://www.geeksforgeeks.org/system-exit-in-java/
			}
			

			System.out.println("Will you be leaving your new puppy/dog in a kennel for any amount of time? \n\tIf yes, will it be for more than " + DBL_KENNEL + " hours per day?");
			System.out.println("Enter: Yes or No");
			String kennelz = input.next();
			if (kennelz.equals("Yes")) {
				System.out.println(kennelz + "??? Don't get a dog, you're selfish.");
				System.exit(0);
			}

			
			System.out.println("Will you have the ability (& act in such way) as to take your new puppy/dog outside to use the restroom at least " + intOutside + " times per day?");
			System.out.println("Enter: Yes or No");
			String potty = input.next();
			
			//Create and use while loops
			while (potty.equals("No")) {
				System.out.println(potty + "??? Don't get a dog. You try being a puppy and holding your little bladder (or other) in for that long. You selfish, monster.");
				System.exit(0);
			}
			/*
			System.out.println("Do you have a minimum of $" + strMedFood + " set aside every month for your dogs necessary needs (ie. vet, medication, flea/tick prevention, "
					+ "food, toys, bed, etc)?");
			System.out.println("Enter: Yes or No");
			String money = input.next();
			if (money.equals("No")) {
				System.out.println("Sorry, but to be honest, this is the MINIMUM you should have on hand for your puppy/dog. If you can't afford one, you shouldn't get one.");
				System.exit(0);
			}*/
			
			//Source for below: https://www.youtube.com/watch?v=p71GSNn7AlM
			//Create a method with arguments and return values below:
			System.out.println("How much money are you willing to put aside each month for your dogs food?");
			System.out.println("please enter a whole number: ");
			int food = input.nextInt();
			
			System.out.println("How much money are you willing to put aside each month for your dogs vet needs?");
			System.out.println("please enter a whole number: ");
			int vet = input.nextInt();
			
			System.out.println("How much money are you willing to put aside each month for your dogs toys?");
			System.out.println("please enter a whole number: ");
			int toys = input.nextInt();
			
			int average = 1;
			average = avgfin(food, vet, toys);
			System.out.println("\nThe average amount you're willing to set aside each week is: $" + average);
			// Create if/else constructs below:
			if (average < 50) {
				System.out.println("You should be more willing to share your income with your new forever friend. You do not deserve a puppy/dog.");
				System.exit(0);
			} else {
				System.out.println("Congratulations! We always advise to have set aside a weekly minimum of $50 for your puppy/dog's needs.");
			}
			System.out.println();
			
			// Identify a method call and argument in comments Part B
			System.out.println("Are you aware of the average life-span of a bordercollie/sheltie mix?");
			
			//myMethod("French Mastiff", 7); //Source https://www.familyminded.com/s/dog-breeds-with-shortest-lifespans-5497a1ef327b4fb3#:~:text=The%20Dogue%20de%20Bordeaux%20has,stillbirth%20than%20most%20other%20dogs.
			//myMethod("Chihuaha", 18); //Source https://www.petbacker.com/blog/how-to/top-10-dog-breeds-that-live-the-longest
			dLife("Sheltie", 15); //Source https://www.cuteness.com/article/lifespan-sheltie
			dLife("Border Collie", 13); //Source https://bordercolliehealth.com/border-collie-lifespan/
			dLife("Sheltie/Border Collie", 14); //Source https://www.familylifeshare.com/shetland-sheepdog-border-collie-mix-everything-you-need-to-know/#:~:text=The%20Border%20Sheepdog%20mix%20has,and%20mitigation%20of%20genetic%20problems.
			System.out.println("We want you to be aware of this as taking one of the glorious beings in is a commitment, and not just a temporary thing.");
			// Use the Random class, below:
			Random rand = new Random(); //https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
			int bigRand = 100;
			int randoAge = rand.nextInt(bigRand);
			System.out.println("It's better to be made informed of things like this now, instead of just assuming their average age by just pulling some (age) number out of thin air...");
			System.out.print("...like say this number: "  + randoAge + ", for example... That could really put things into an unrealistic perspective.");
			System.out.println("\n");
			
			// Use the Math class | Source https://www.javatpoint.com/java-math
			int sqrtX = 8691;
			System.out.println("Your dog may not beable to help you solve for the square root of 8691 ... (which is: " + Math.sqrt(sqrtX) + " by the way) ... But they are some of the bestfriends you can ever have.");
			System.out.println("Don't forget, dogs age is different than humans. By an average of");
			System.out.println("So, you should also consider your age before commiting to one of these dogs.");
			System.out.println("\n");
			
			//Create ternary constructs & Use conditional operators
			Scanner inTern = new Scanner(System.in);
			System.out.println("Enter your love for animals on a scale of 1-10: ");
			int ternScale = input.nextInt();
			String result = (ternScale > 9) ? "ADORE" : "not care at all about";
			System.out.println("You must really " + result + " animals!"); //Use +, -, *, /, %, ++, --, += 
			System.out.println("\n");
			//inTern.close();
			
			//Use a switch statement | Sources: http://www.beginwithjava.com/java/decisions/switch-statement.html & https://www.pitpat.com/exercise/how-much-exercise-does-a-border-collie-need/
		    int play;
		    Scanner pTime = new Scanner(System.in);
		    System.out.println("Do you know how many minimum hours a day of runing around/play time your forever friend needs on average?");
		    System.out.println("I'll give you a hint...it's less than 5.");
		    play = pTime.nextInt();
		    switch (play) {
		        case 0:
		            System.out.println("Come on now...be realistic.");
		            break;
		        case 1:
		            System.out.println("Yes! Well...close! your forever friend needs an average of 1-2 hours a day for playtime.");
		            break;
		        case 2:
		            System.out.println("Yes! Between 1-2 hours a day for playtime is going to make your forever friend very happy.");
		            break;
		        default:
		            System.out.println("Well...as long as your forever friend is happy with this amount of playtime, then we are as well. But a minimm of 1-2 hours is adequate.");
		            break;
		    }
		    System.out.println("\n");
		    
		    //Compare two String objects by using the compareTo and equals methods and make a comment describing how == works with objects | Source: https://www.geeksforgeeks.org/java-equals-compareto-equalsignorecase-and-compare/
		    // == compares whether or not 2 things are identical or not | Source: https://www.javatpoint.com/how-to-compare-two-objects-in-java
		    System.out.println("Comparing Border Collie's to Sheltie's...");
		    String s1 = "Border Collie";
		    String s2 = "Sheltie";
		    System.out.println(s1 + "'s are equivalent to " + s2 + "'s? : " + s1.equals(s2)); //equals method
		    System.out.println("Border Collie's and Sheltie's look pretty similar, are both dogs, and are both extremely beautiful...However, they are not one in the same.");
		    System.out.println("For example, comparing for instance how many letters are in each dogs breed..." + s1 + " in comparison to " + s2 + " : has " + s2.compareTo(s1) + " letters in it's breed name, vs the 7 letters in Sheltie."); //compareTo method
		    System.out.println("\n");
		    
		    //Use relational operators | Source: https://www.journaldev.com/31883/relational-operators-in-java
		    int lil = 10;
		    int big = 20;
		    System.out.println("Does a dog need to go to the vet at least once a year? " + (lil != big));
		    System.out.println("Does a dog need to be walked at least once a day? " + (big > lil));
		    System.out.println("Should a dog be sharing his food bowl with another dog? " + (lil == big));
		    System.out.println("Should your dog be protected from fleas & ticks year round? " + (lil <= big));
		    System.out.println("Should dogs eat chocolate? " + (big < lil));
		    System.out.println("Should a dog get at least one bath a month? "+ (big >= lil));
			System.out.println("\n");
			
			//Describe operator precedence as a comment
				// "Operator precedence determines the order in which the operators in an expression are evaluated." Source, quoted directly from: https://www.programiz.com/java-programming/operator-precedence
				//...meaning, PEMDAS...Parenthesis, Exponent, Multiplication, Division, Addition, Subtraction.


			
			//Create and use do/while loops | Source: https://www.w3schools.com/java/java_break.asp
			int dW = 9;
			do {
				System.out.println("Are you ready for your new addition to the family???");
				dW++; //Use +, -, *, /, %, ++, --, += 
			} while (dW <= 9);
			
			//Use break in a loop with a comment describing what it does
			for (int p = 5; p < 10; p++) {
				  if (p == 9) {
				    break; //a break stops the loop once the desired condition is met. Here, the condition is once p is equivalent to 9, which happens after 4 loops.
				  }System.out.println("YES!");
				}
			System.out.println();
			
			//Use continue in a loop with a comment describing what it does | Source: https://www.w3schools.com/java/java_break.asp
			for (int i = 16; i < 20; i++) {
				  if (i == 17) {
				    continue; //continue just continues over the condition, sort of as if it's not even there...it continues.
				  }
				  System.out.println("Alllll riiiiiiiiiiight");
				}
			System.out.println();
			
			//Create and use for loops
			System.out.println("At the count of 1...2...3... you will be approved for your forever friend!");
			for (int i = 1; i < 4; i++) { //Use +, -, *, /, %, ++, --, += 
				System.out.println(i);
			}
			System.out.println("Congrats!!! You have been approved for the most wonderful give life can bring you...your puppy/dog <3");
			
			//Create and use the enhanced for loop | Source: https://www.youtube.com/watch?v=pL0I9nGph7c
			String doody[] = {"He/she", "is", "going", "to", "love", "you!!!"};
			for(String element : doody) {
				System.out.print(element + " ");
			}
			
		
		}
		
		//Create a method with arguments and return values
		public static int avgfin(int a, int b, int c) {
			int avg = (a+b+c)/4;
			return avg;
		}

	}

//Describe inheritance and its benefits
	//Inheritance -> inheriting stuff from another class
 	// it's being able to modify a method (that is being used in multiple classes) in just 1 place (instead of going in and modifying them individually in each class)
	//Source: https://www.youtube.com/watch?v=9JpNY-XAseg

//Describe polymorphism
	//A Polymorphic Array -> it stores objects of differ. classes in the Superclass type
	//they loop through an array, & it calls each method of the classes (for ex the subclasses Potpie & Tuna in Bucky's videos.)
	//Source: https://www.youtube.com/watch?v=0xw06loTm1k






