import java.sql.SQLOutput;

public class MethodExample {
    public static void main (String[] args) {
        MethodExample methodExample = new MethodExample();
    System.out.println(methodExample.sayHelooToUser("Andrius"));
     String t= methodExample.sayHelooToUser("Jonas");
     System.out.println(t);
     sum(13,56);
    }
        private String sayHelooToUser(String name){
            String result = "Labas" + name;
            return result;
    } public static void  sum(int numb, int numb2){
        int result = numb + numb2;
        System.out.println(result);
    }

}
