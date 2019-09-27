import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[]args){
        int x;
        String FirstAnswer;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("What is your question for The 8 Ball?");
        FirstAnswer = Keyboard.nextLine();
        System.out.println("Now a number for the 8 ball");
        x = Keyboard.nextInt();
        if(x < 11)
            System.out.println("Impossible");
        else if(x<21){
            System.out.println("Not likely");
        }
        else if(x<31){
            System.out.println("Wouldn't count on it");
        }
        else if(x<41){
            System.out.println("Doesn't look good");
        }
        else if(x<51){}





























    }






        }

