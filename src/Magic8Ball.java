import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[]args){
        int x;
        String FirstAnswer;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("What is your question for The 8 Ball?");
        FirstAnswer = Keyboard.nextLine();
        System.out.println("Now a number in between 1-100");
        x = Keyboard.nextInt();
         if(x>0 && x < 11){
            System.out.println("Impossible");
        }
        else if(x>11 && x<21){
            System.out.println("Not likely");
        }
        else if(x>21 && x<31){
            System.out.println("Wouldn't count on it");
        }
        else if(x>31 && x<41){
            System.out.println("Doesn't look good");
        }
        else if(x>41 && x<51){
            System.out.println("The outcome is in your hands");
        }
        else if(x>51 && x<61){
            System.out.println("Looks probable");
        }
        else if(x>61 && x<71){
            System.out.println("The future looks good");
        }
        else if(x>71 && x<81){
            System.out.println("it is almost destiny");
        }
        else if(x>81 && x<91){
            System.out.println("Luck will be on your side");
        }
        else if(x>91 && x<101){
            System.out.println("The gods will make it happen");
        }


































    }






        }

