import javax.swing.*;

public class Main {
    public static String s = "Hello Wold";
    public static int i = 5;

    public static void main(String[] args) {
        int j = 10;
        if (j > i) {
            System.out.println("Hej");
        } else if(j<i) {
            System.out.printf(s);
        } else{
            System.out.printf("I did't know you!!");
        }
    }
}
