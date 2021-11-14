/*
 * @Author: Zi_Gao
 * @Date: 2021-11-14 11:19:13
 * @LastEditTime: 2021-11-14 11:32:27
 * @LastEditors: Zi_Gao
 * @Description: Least Common Multiple
 * @FilePath: /MathTools/leastCommonMultiple.java
 * @LICENSE: MIT License
 */
public class leastCommonMultiple {
    /**
     * @description: Least Common Multiple
     * @param {long} in1
     * @param {long} in2
     * @return {long}
     */
    public static long lcm(long in1,long in2){
        return in1*in2/greatestCommonDivisor.gcd(in1,in2);
    }
    /**
     * @description: Least Common Multiple
     * @param {long[]} in
     * @return {long}
     */
    public static long lcm(long[] in){
        long out=in[0];
        for(int i=1;i<in.length;i++){
            out=lcm(out,in[i]);
        }
        return out;
    }
}