import javax.swing.*;

public class Main {
    public static String s = "Hello Wold";
    public static int i = 5;

    public static void main(String[] args) {
        int i = 10;
        System.out.println("Hello World" + i); //local > global
        JOptionPane.showMessageDialog(null,s);
    }
}
