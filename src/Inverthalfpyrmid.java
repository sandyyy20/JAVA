import java.util.Scanner;
public class Inverthalfpyrmid {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        int i,j;
        for (i=1;i<=n;i++) {
            for (j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}