/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan.util;

/**
 *
 * @author Nam
 */
public class MathUtil {
    
    //class nay chuawas cac tien ich dung chung cho moi noi do do no hai nen la static
    public static final double PI=3.1415;
    //ham tinh n giai thua n>-= ,111
    //neu qua 20 tran kieu long
    //0! = 1, 1! = 1, n!=1.2.3...n
    public static long getFactorial(int n){
        if (n < 0 || n > 20) 
            throw  new IllegalArgumentException("n must be greater than 0 and less than 20");
        //dua dau vao ca chiwn , minh khong them tra ve gias tri am chinsai rooi
        
        if ( n == 0 || n == 1) {
            return 1;//0! = 1! = 1
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    
}
