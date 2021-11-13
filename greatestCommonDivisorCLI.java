import java.util.Scanner;

/*
 * @Author: Zi_Gao
 * @Date: 2021-11-13 20:37:20
 * @LastEditTime: 2021-11-13 21:14:55
 * @LastEditors: Zi_Gao
 * @Description: command-line interface
 * @FilePath: /MathTools/greatestCommonDivisorCLI.java
 * @LICENSE: MIT License
 */
public class greatestCommonDivisorCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please input the number, input 0 to start the calculation:");
            long[] in = new long[1000];
            for (int i = 0;i < 1000;i++) {
                in[i] = sc.nextLong();
                if (in[i] == 0) {
                    break;
                }
            }
            System.out.println("The greatest common divisor is:" + greatestCommonDivisor.gcd(in));
            System.out.print("Do you exit?[Y/n]:");
            String strIn = sc.next();
            if (strIn.equals("n") || strIn.equals("N")) {
                continue;
            } else {
                break;
            }
        }
    }
}