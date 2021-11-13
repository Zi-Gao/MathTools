/*
 * @Author: Zi_Gao
 * @Date: 2021-11-13 20:05:19
 * @LastEditTime: 2021-11-13 20:16:57
 * @LastEditors: Zi_Gao
 * @Description: greatest common divisor
 * @FilePath: /MathTools/greatestCommonDivisor.java
 * @LICENSE: MIT License
 */
public class greatestCommonDivisor {
    /**
     * @description: greatest common divisor
     * @param {long} in1
     * @param {long} in2
     * @return {long}
     */
    public static long gcd(long in1, long in2) {
        if (in2 == 0) {
            return in1;
        }
        return gcd(in2, in1 % in2);
    }

    /**
     * @description: greatest common divisor
     * @param {long[]} in
     * @return {long}
     */
    public static long gcd(long[] in) {
        long out = in[0];
        for (int i = 1; i < in.length; i++) {
            out = gcd(out, in[i]);
        }
        return out;
    }
}