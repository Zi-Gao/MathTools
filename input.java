import java.util.Scanner;
/*
 * @Author: Zi_Gao
 * @Date: 2021-11-14 10:42:06
 * @LastEditTime: 2021-11-14 10:58:40
 * @LastEditors: Zi_Gao
 * @Description: input
 * @FilePath: /MathTools/input.java
 * @LICENSE: MIT License
 */
public class input {
    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
        }catch(Exception e){
            System.out.print("Invalid input! Please input again:");
            return inputInt();
        }
    }
    public static double inputDouble() {
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextDouble();
        }catch(Exception e){
            System.out.print("Invalid input! Please input again:");
            return inputDouble();
        }
    }
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextLine();
        }catch(Exception e){
            System.out.print("Invalid input! Please input again:");
            return inputString();
        }
    }
    public static int[] inputIntArray() {
        Scanner sc = new Scanner(System.in);
        String strIn = sc.nextLine();
        String[] strArray = strIn.split(" ");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            try{
                intArray[i] = Integer.parseInt(strArray[i]);
            }catch(Exception e){
                System.out.println("Invalid input! Please input again:");
                intArray = inputIntArray();
            }
        }
        return intArray;
    }
    public static double[] inputDoubleArray() {
        Scanner sc = new Scanner(System.in);
        String strIn = sc.nextLine();
        String[] strArray = strIn.split(" ");
        double[] doubleArray = new double[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            try{
                doubleArray[i] = Double.parseDouble(strArray[i]);
            }catch(Exception e){
                System.out.println("Invalid input! Please input again:");
                doubleArray = inputDoubleArray();
            }
        }
        return doubleArray;
    }
    public static long[] inputLongArray() {
        Scanner sc = new Scanner(System.in);
        String strIn = sc.nextLine();
        String[] strArray = strIn.split(" ");
        long[] longArray = new long[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            try{
                longArray[i] = Long.parseLong(strArray[i]);
            }catch(Exception e){
                System.out.println("Invalid input! Please input again:");
                longArray = inputLongArray();
            }
        }
        return longArray;
    }
}