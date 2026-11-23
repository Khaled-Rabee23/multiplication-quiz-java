// Wildcard import
import java.util.*;

public class MultiplyTest_1 {
    Random randomNumbers = new Random(); // Random number generator
    int answer; // The correct answer

    // The method quiz
    public void quiz() {
        Scanner input = new Scanner(System.in);

        int guess; // The user's guess

        // Asking user to answer the following questions
        System.out.println("Answer the following questions");

        // Calling createQuestion method to create a question for the user
        createQuestion();

        // Prompting the user to enter their answer 'guess'
        System.out.println("Enter your answer (-1 to exit):");

        // Storing the user's answer in the variable guess that we declared earlier
        guess = input.nextInt();

        // A while loop to ensure the program keeps running unless the user enters -1
        while (guess != -1) {
            // Calling the checkResponse method to check the user's answer
            checkResponse(guess);

            // Prompting the user to enter the next question answer
            System.out.println("Enter your answer (-1 to exit):");
            guess = input.nextInt();
        }
        // end while
    } // end of quiz method

    
    
    
    /* createQuestion method */
    public void createQuestion() {
        // Get two random numbers between 0 and 9 and store them in digit1 and digit2
        int digit1 = randomNumbers.nextInt(10);
        int digit2 = randomNumbers.nextInt(10);

        /* Multiply the two variables and store the result in variable answer */
        answer = digit1 * digit2;

        // Asking the user the question
        System.out.printf("How much is %d times %d?\n", digit1, digit2);
    } // end method createQuestion

    
    
    
    /* checkResponse method */
    public void checkResponse(int guess) {
        /* Check if the answer is incorrect */
       if (guess != answer) {
            // Telling the user to try again because the answer is incorrect
            System.out.println("No. Try again.");
        } 
     else {
            // Displaying a motivating message
            System.out.println("Very Good!");

            /* Calling the createQuestion method to display another question */
            createQuestion();
        }
        // end else
     }  // end method checkResponse
     public static void main( String args[] )
 {
 MultiplyTest_1 application = new MultiplyTest_1();
 application.quiz();
 } // end main
 } // end class MultiplyTest



