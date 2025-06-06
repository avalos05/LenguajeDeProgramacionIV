import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("ingresa un texto para A: \n");
        String A=sc.nextLine();
        System.out.print("ingresa un texto para B: \n");
        String B=sc.nextLine();
        String res=A+ " " +B;
        System.out.print(res);
    }
}
