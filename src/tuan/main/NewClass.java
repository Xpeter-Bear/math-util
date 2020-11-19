/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan.main;

import tuan.util.MathUtil;

/**
 *
 * @author Nam
 */
public class NewClass {

    public static void main(String[] args) {
            //2. test hàm bằng mắt
            System.out.println("5!: " + MathUtil.getFactorial(5));
            // t hi vọng m ra 120 khi t gọi m
            System.out.println("0!: " + MathUtil.getFactorial(0));
            //                  e:1, a:1 -> okie
            
            //e: ném về ngoại lệ IllegalArgumentException
            //                  e:1, a:1 -> okie
            System.out.println("CI for today");
    }
}
//code viet ra thi DEV pahi test truoc da , co vai hinh thuc test code khac nhau
//1TDD,test Driven Development
        //viet danf khung cuả hàm getFactorial(int n)
        // sau đó dungwh hà test
//2. sout(kem hàm data) để coi kết quả ra sao, có đúng như mình kì vọng
//nó phải trả về như thế hay không xem kết quả bằng mắt
//3. JOptionPane cảu bên javades phải popup lên màn hình
//4.viết  1 trang web gọi hàm xử lý , hao sức
//ta làm cách 1 và 2
