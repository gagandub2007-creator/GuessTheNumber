/* Create a class game, which allows a user to play "Guess the Number"
  game once. Game should have the following method:
  1. Constructor to generate the random number
  2. takeUserInput() to take a user input of number
  3. isCorrectNumber() to detect whether the number entered by the user is true
  4. getters and setters for noOfGuesses
  Use properties such as noOfGuesses(int), etc to get this task done!
      */
import java.util.Random;
import java.util.Scanner;


class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100) ;
    }
    void takeUserInput(){
        System.out.println("Please enter the number you want to guess: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
boolean isCorrectNumber(){
        if(inputNumber == number){
            return true;
        }
        else if(inputNumber < number){
          System.out.println("Number is less than number");
        }
        else if(inputNumber > number){
            System.out.println("Number is  greater than number");
        }
        return false;

}
}
public class Guess_The_Number {
    public static void main(String[] args) {



       Game g =  new Game();
        boolean b = false;
       while(!b) {
           g.takeUserInput();
           b = g.isCorrectNumber();
           System.out.println(b);
       }






    }
}
