import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class cwh_4ps1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        int a=10;
//        if(a==11) {
//            System.out.println("tes");
//        } else{
//            System.out.println("np");
//        }
        //problem2.
//        System.out.println("enter the number of subject 1: ");
//        int m1=sc.nextInt();
//        System.out.println("enter the number of second  subject: ");
//        int m2=sc.nextInt();
//        System.out.println("enter the number of third subject: ");
//        int m3=sc.nextInt();
//        float average=(m1+m2+m3)/3.0f;
//        if(average>=40 &&m1>=33 &&m2>=33 &&m3>=33) {
//            System.out.println("congrats you are pass");
//        }
//        else{
//            System.out.println("sorry try again");
//            System.out.println("your overall percentage is less than 40");
//        }
//        System.out.println(average);

        //problem3:
//        System.out.println("entre the salary");
//        int n=sc.nextInt();
//        if(n>=2 && n<=5){
//            System.out.println("pay 5%");}
//           else (n>5 && n<=10){
//                System.out.println("pay 10%");}
//               // else(n>=10.0)
//              //  System.out.println("pay 15%");
//

        //problem6.
//        System.out.println("enter the website name:  ");
//        String web=sc.next();
//        if(web.endsWith(".org")){
//            System.out.println("it is an organisation website");
//        }else if (web.endsWith(".com")){
//            System.out.println("it is an commercial website");
//        }else if(web.endsWith(".in")){
//            System.out.println("it is an indian website");
//        }else{
//            System.out.println("abe dhang se likh");
//        }


          //problem5.
        System.out.println("enter the year");
        int n=sc.nextInt();
        if(n%400==0 && n%100!=0 ){
            System.out.println("yes it is a leap year");
        }else{
            System.out.println("nope");
        }
    }
}


