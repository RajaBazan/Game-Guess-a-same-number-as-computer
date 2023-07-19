package hello.com;
import java.util.Scanner;
class Game12 {
    private int counter = 0;
    private int myNumber;
    private int compNumber;
    public Game12(){
        compNumber = (int) (Math.random()*100);
    }
    public void setNumber(int n){
        myNumber = n;
    }
    public int isCorrect(){
        if (myNumber == compNumber){
            return 0;
        } else if (myNumber > compNumber) {
            return -1;

        }
        else {
            return 1;
        }
    }
    public void setCounter(){
        counter++;
    }
    public void getCounter(){
        System.out.println("The number of guess were: " + counter);
    }

}

public class Guess_Number_game {
    public static void main(String[] args) {
        Game12 obj = new Game12();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number betweeen 1-100:");
            int n = sc.nextInt();
            obj.setNumber(n);

            if (obj.isCorrect() == 0){
                obj.setCounter();
                System.out.println("Congrationation!! you guess the number");
                obj.getCounter();
                break;
            } else if (obj.isCorrect() == -1) {
                obj.setCounter();
                System.out.println("Enter smaller Number");
            } else if (obj.isCorrect() == 1) {
                obj.setCounter();
                System.out.println("Enter larger number");


            }
        }
    }  }