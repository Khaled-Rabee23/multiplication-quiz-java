// Wildcard import
import java.util.*;

 public class MultiplyTest_3
 {
     Random randomNumbers = new Random();

    int answer; // the correct answer
    // Declaring the counters of the program
    int numOfQuestions ;
    int numOfCorrect = 0 ;
    int numOfWrong = 0 ;
    // Declaring the finalScore variable to store the final score of the question later
    double finalScore;
   // Declaring a variable input using the Scanner method
    Scanner input = new Scanner( System.in );
    
    
    // The beginning of the quiz method 
    public void quiz(){
        int guess; // the user's guess
  
        System.out.println( "To start the program press any number (-1 to exit)" );
       
        // Prompting the user to enter any number to start the program
         guess = input.nextInt();

        
         System.out.println ("Answer the following questions") ;
       
     // Begginning of the while loop that will ensures that the program keeps ruunning until the user enters -1
     while (guess != -1){
        
      numOfQuestions = 0 ;
    // A for loop to set the number of questions every 10 rounds
       for ( ; numOfQuestions < 10 ; numOfQuestions ++){
    
         // Calling the createQuestion method to create a new question for the user 
         createQuestion();
         System.out.println( "Enter your answer (-1 to exit):" );
         guess = input.nextInt();
 

           //Exiting the program if the user entered -1 mid program
            if(guess == -1){
             System.out.println("Exiting.... ");
             System.out.println("Thanks for using the program :) ");
             System.out.println("Please give us a feedback ");
             break;
            }
            checkResponse(guess);
        }
     // Calling the calcScore method to calculate the score 
     calcScore();
     // Resetting the counters
        numOfCorrect = 0;
        numOfQuestions = 0;
        numOfWrong = 0 ; 
        finalScore= 0;
    }
// end while

} // end method
 
 
 
 
 
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
    public void checkResponse(int guess)
     {
        /* Write code to test whether the answer is incorrect */
        if (guess != answer){
            while (guess != answer) { // Keep asking until the user provides the correct answer
             wrongAnswer();
             System.out.println("Enter your answer (-1 to exit):");
             guess = input.nextInt();

 
            }
        }
      
        else
            {
         //Displaying a motivating message using correctAnswer method
            correctAnswer();
             } // end else
      
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
    numOfCorrect ++  ;
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
                break ;
        }
        numOfWrong ++;

    }
    // Method to calculate the score of the user
    private void calcScore(){
   
     finalScore = (numOfCorrect * 100) / 10;
     System.out.println("Your score is " + finalScore +"\n");
    
     if(finalScore < 75){
         System.out.println("Please ask your instructor for extra help\n");
        }
       
    
        }
 // Main method
    public static void main( String args[] )
        {
     MultiplyTest_3 application = new MultiplyTest_3();
     application.quiz();
    } // end main
}



 