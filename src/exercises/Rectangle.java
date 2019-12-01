package exercises;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        Integer x = input.nextInt();
        System.out.println("What is the width of your rectangle?");
        Integer y = input.nextInt();
        System.out.println(String.format("The area of your rectangle is %s", x*y));
    }
}
