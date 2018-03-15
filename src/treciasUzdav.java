import java.util.Scanner;

public class treciasUzdav {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite tik 0 kitu atveju busi neteisus");
        int num = sc.nextInt();


        if(num == 0){
           System.out.println("Jus ivedete teisinga skaiciu");
        }else {
           System.out.println("Bandykite dar karta");
        }

    }

}
