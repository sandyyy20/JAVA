import java.util.Scanner;
public class floydstrianglePattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int number = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
