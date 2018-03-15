public class Masyvai {
    public static void main (String[] args){
        String[] mas = new String[5];
        mas [0] = "Andrius";
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas [i]);
        }
        String[] mas2 = {"Andrius","jonas","antanas","jOKUBAS" };

        for(String m : mas2){
            System.out.println(m);
        }
    }
}
