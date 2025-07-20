import java.util.Scanner;
public class sum{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int firstNumber,secondNumber;
    System.out.println("enter the first number:");
    firstNumber=sc.nextInt();
    System.out.println("enter the second number:");
    secondNumber=sc.nextInt();
    System.out.println("sum:"+(firstNumber+secondNumber));
    }
} 
