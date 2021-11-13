import java.util.Scanner;
/*
 * @Author: Zi_Gao
 * @Date: 2021-11-13 20:24:47
 * @LastEditTime: 2021-11-13 21:14:47
 * @LastEditors: Zi_Gao
 * @Description: command-line interface
 * @FilePath: /MathTools/commandLineInterface.java
 * @LICENSE: MIT License
 */
public class commandLineInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true) {
            System.out.println("-----------Tool list-----------");
            System.out.println("|1.greatest common divisor    |");
            System.out.println("|2.exit                       |");
            System.out.println("-------------------------------");
            System.out.print("Please input your choice: ");
            choice = sc.nextInt();
            if(choice == 1){
                greatestCommonDivisorCLI.main(args);
            }
            else if(choice == 2){
                System.out.println("Bye!");
                sc.close();
                break;
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }
}