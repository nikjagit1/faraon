import java.util.Scanner;

class Calc {
    public static void main(String[] args){
        int a;
        int b;
        try (Scanner consl = new Scanner(System.in)) {
            a = consl.nextInt();
            b = consl.nextInt();
        }

        System.out.println(a + b);
    }
}