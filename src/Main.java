public class Main {
    public static String s;
    public static int i;

    public static void main(String[] args) {
        int j=i; i=3;
        if (j >= i) {
            System.out.println("Hej");
        } else if(j<i) {
            System.out.println(s);
        } else{
            System.out.println("I did't know you!!");
        }
    }
}
