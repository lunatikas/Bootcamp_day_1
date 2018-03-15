public class suPerduodam {
    public static void main (String[] args){
        System.out.println(suPerduodam("b"));

    }
    private static String  suPerduodam (String word){
        StringBuilder sb= new StringBuilder();
        sb.append(word).append(" ").append(50);
        return sb.toString();


    }
}
