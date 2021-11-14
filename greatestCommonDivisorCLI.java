/*
 * @Author: Zi_Gao
 * @Date: 2021-11-13 20:37:20
 * @LastEditTime: 2021-11-14 11:02:19
 * @LastEditors: Zi_Gao
 * @Description: command-line interface
 * @FilePath: /MathTools/greatestCommonDivisorCLI.java
 * @LICENSE: MIT License
 */
public class greatestCommonDivisorCLI {
    public static void main(String[] args) {
        while(true){
            System.out.println("Please input the numbers, separated by spaces, and enter to start the calculation:");
            long[] in = input.inputLongArray();
            System.out.println("The greatest common divisor is:" + greatestCommonDivisor.gcd(in));
            System.out.print("Do you exit?[Y/n]:");
            String strIn = input.inputString();
            if (strIn.equals("n") || strIn.equals("N")) {
                continue;
            } else {
                break;
            }
        }
    }
}