import java.util.Scanner;
public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("");
        num = scan.nextInt();

        for(int i = num; i<=100; i++) {
            System.out.println(i);
        }
    }
}
