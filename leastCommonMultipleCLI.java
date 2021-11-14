/*
 * @Author: Zi_Gao
 * @Date: 2021-11-14 11:25:40
 * @LastEditTime: 2021-11-14 11:31:48
 * @LastEditors: Zi_Gao
 * @Description: command-line interface
 * @FilePath: /MathTools/leastCommonMultipleCLI.java
 * @LICENSE: MIT License
 */
public class leastCommonMultipleCLI {
    public static void main(String[] args) {
        while(true){
            System.out.println("Please input the numbers, separated by spaces, and enter to start the calculation:");
            long[] in = input.inputLongArray();
            System.out.println("The least common multiple is:" + leastCommonMultiple.lcm(in));
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