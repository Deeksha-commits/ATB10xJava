package Ex_9_SwitchCondition;

import java.util.Scanner;

public class Lab082_SwitchBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day no(1 to 7)");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("No idea what day is it???");
                break;
        }
    }
}
