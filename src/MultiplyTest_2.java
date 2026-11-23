import java.util.*;

public class MultiplyTest_2 {
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
            // Telling the user to try again because the answer is incorrect using wrongAnswer method
            wrongAnswer();
        } 
      
        else {
            // Displaying a motivating message using correctAnswer method
            correctAnswer();

            /* Calling the createQuestion method to display another question */
            createQuestion();
        }
        // end else
    } // end method checkResponse
    
    // Creating a method to vary the comments that are displayed for each correct answer
    public void correctAnswer(){
        // Using randomNumbers method to create a random number from 0 to 3 and adding 1 to the result
            int r = randomNumbers.nextInt(4) + 1;
            switch (r) {
             case 1:
                 System.out.println("Very good!");
                     break;
             case 2:
                 System.out.println("Excellent!");
                     break;
             case 3:
                 System.out.println("Nice work!");
                     break;
             case 4:
                  System.out.println("Keep up the good work!");
                     break;
            default:
                     break;
            }
             
         }
          // Creating a method to vary the comments that are displayed for each incorrect answer
         public void wrongAnswer(){
            // Using randomNumbers method to create a random number from 0 to 3 and adding 1 to the result
            int r = randomNumbers.nextInt(4) + 1 ;
            switch(r){
            case 1:
                  System.out.println("No. Please try again.");
                     break;
             case 2:
                  System.out.println("Wrong. Try once more.");
                     break;
             case 3:
                  System.out.println("Don't give up!");
                     break;
             case 4:
                  System.out.println("No. Keep trying.");
                     break;
            default:
                 break;
        
            }
}
public static void main( String args[] )
{
MultiplyTest_2 application = new MultiplyTest_2();
application.quiz();
} // end main
}