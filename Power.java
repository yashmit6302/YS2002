import java.util.Scanner;
public class Power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the base number: ");
int a=sc.nextInt();
System.out.print("Enter the power: ");
int b=sc.nextInt();
double pow=Math.pow(a,b);
System.out.println("power: "+pow);
}
}
