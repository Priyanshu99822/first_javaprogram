import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class Main { static int x=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            int factorial=i*x;
             x=i;
        }


    }
}