import java.util.Scanner;
public class userInfo{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String name;
        int age;
        long phoneNumber;
        double cgpa;
        System.out.print("enter your name:");
        name=input.nextLine();
        System.out.print("enter your age:");
        age=input.nextInt();
        System.out.print("enter your phone number:");
        phoneNumber=input.nextLong();
        System.out.print("enter your cgpa:");
        cgpa=input.nextDouble();
        System.out.println("Your details: ");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Phone No."+phoneNumber);
        System.out.println("CGPA:"+cgpa);
        input.close();
    }
}
