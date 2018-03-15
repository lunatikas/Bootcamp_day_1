import java.sql.SQLOutput;
import java.util.Scanner;

public class pirmasUzdav {


    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int num = sc.nextInt();

        if(num %2==0) {
            System.out.println("Lyginis");
        }else{
            System.out.println("Nelyginis");

        }


    }
}
