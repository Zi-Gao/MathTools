import java.util.Scanner;
/*
 * @Author: Zi_Gao
 * @Date: 2021-11-14 10:42:06
 * @LastEditTime: 2021-11-14 11:08:54
 * @LastEditors: Zi_Gao
 * @Description: input
 * @FilePath: /MathTools/input.java
 * @LICENSE: MIT License
 */
public class input {
    /**
     * @description: Int input control
     * @param {}
     * @return {int}
     */
    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
        }catch(Exception e){
            System.out.print("Invalid input! Please input again:");
            return inputInt();
        }
    }
    /**
     * @description: Double input control
     * @param {}
     * @return {double}
     */
    public static double inputDouble() {
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextDouble();
        }catch(Exception e){
            System.out.print("Invalid input! Please input again:");
            return inputDouble();
        }
    }
    /**
     * @description: String input control
     * @param {}
     * @return {String}
     */
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextLine();
        }catch(Exception e){
            System.out.print("Invalid input! Please input again:");
            return inputString();
        }
    }

    /**
     * @description: Int Array input control
     * @param {}
     * @return {int[]}
     */
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
    /**
     * @description: Double Array input control
     * @param {}
     * @return {double[]}
     */
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
    /**
     * @description: String Array input control
     * @param {}
     * @return {String[]}
     */
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