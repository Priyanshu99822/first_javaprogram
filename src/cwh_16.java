import java.util.Scanner;
public class cwh_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        boolean a=true;
//        boolean b=false;
//        boolean c=true;
//        if (a && b && c){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("n");
//        }

        switch (n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("write correct");
        }

    }
}

