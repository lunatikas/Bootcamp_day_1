import java.sql.SQLOutput;
import java.util.Scanner;

public class antrasUzdav {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu ivesite?");
        int num = sc.nextInt();
        for(int i= 0; i< num; i++){
            System.out.println("Iveskite"+ i + "elementa");
            int numb= sc.nextInt();
            if(numb>=100){
                System.out.println(numb);
            }
        }

    }
}
