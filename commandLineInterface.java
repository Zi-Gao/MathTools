/*
 * @Author: Zi_Gao
 * @Date: 2021-11-13 20:24:47
 * @LastEditTime: 2021-11-14 11:34:46
 * @LastEditors: Zi_Gao
 * @Description: command-line interface
 * @FilePath: /MathTools/commandLineInterface.java
 * @LICENSE: MIT License
 */
public class commandLineInterface {
    public static void main(String[] args) {
        int choice;
        while(true) {
            System.out.println("-----------Tool list-----------");
            System.out.println("|1.greatest common divisor    |");
            System.out.println("|2.least common multiple      |");
            System.out.println("|3.exit                       |");
            System.out.println("-------------------------------");
            System.out.print("Please input your choice: ");
            choice = input.inputInt();
            if(choice == 1){
                greatestCommonDivisorCLI.main(args);
            }
            else if(choice == 2){
                leastCommonMultipleCLI.main(args);
            }
            else if(choice == 3){
                System.out.println("Bye!");
                break;
            }
            else{
                System.out.println("Invalid input! Please input again:");
            }
        }
    }
}