import java.util.*;

public class Conditional {
    public static void main(String args[]) {
        // int age = 22;
        // if(age>=18){
        // System.out.println("Adult : drive , vote");

        // }

        // int age = 16;
        // if(age>13 && age <18){
        // System.out.println("Adult : drive , vote");

        // }

        // else {
        // System.out.println("Not Adult");
        // }

        // int A = 1;
        // int B = 3;
        // if(A>B){
        // System.out.println("A is largest");

        // }
        // else {
        // System.out.println("B is largest");
        // }

        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // System.out.println(number);

        // if(number%2==0){
        // System.out.println("Even");
        // }
        // else {
        // System.out.println("Odd");
        // }

        // int  age = 26;
        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else if(age>=13&&age<18){
        //         System.out.println("Teenager");
        //     }
        //     else {
        //         System.out.println("Child");
        //     }

            // int income = sc.nextInt();
            // int tax;

            // if(income<500000){
            //     tax=0;
            // }
            // else if (income>=500000 && income <1000000){
            //     tax = (int) (income * 0.2 );
            // }
            // else {
            //     tax = (int) (income * 0.3 );
            // }

            // System.out.println("Your tax is : " + tax );

                // int number = 4;
                // //ternary operator

                // String type =((number%2)==0)? "even": "odd";
                // System.out.println(type);
        
                // int marks = sc.nextInt();

                // String status = (marks>=33)? "Pass": "Fail";
                // System.out.println(status);


                //SWITCH STATEMENT

                // int number = sc.nextInt();
                // switch (number) {
                //     case 1:System.out.println("samosa");
                //         break;
                //     case 2:System.out.println("Burger");
                //     break;
                //     case 3 :System.out.println("Mango");
                //     break;
                //     default:System.out.println("WAke up");
                //         break;
                    System.out.println("Enter a : ");
                 int a = sc.nextInt();
                 System.out.println("Enter b :");
                 int b = sc.nextInt();
                    System.out.println("Enter operator");
                 char operator = sc.next().charAt(0);

                 switch (operator) {
                    case '+':System.out.println(a+b);
                    break;
                    case '-':System.out.println(a-b);
                    break;
                    case '*':System.out.println(a*b);
                    break;
                    case '/':System.out.println(a/b);
                    break;
                    case '%':System.out.println(a%b);
                     break;
                 default:System.out.println("Not an advacance calculator");
                        break;
                 }
                }



            }
    


