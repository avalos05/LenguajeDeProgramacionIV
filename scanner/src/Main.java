import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("ingresa un valor para x: \n");
        double x=sc.nextDouble();
        System.out.print("ingresa un valor para y: \n");
        double y=sc.nextDouble();
        double res=x+y;
        System.out.print(res);
    }
}