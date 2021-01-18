package tuan.util;

import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Modern 15
 */
public class mathTest {

    // minh test các tình huống xài hàm get factorial ở đay
    // các tham số đưa vào
    // âm dương trong khoảng 0-20 ngoài khoảng test hàm
    // tiếng anh gọi là test cases
    // có tình huống thành công và thất bại thành công đưa vào value hợp lệ
    // thất bại  đưa vào vlue ko hợp lệ hàm phải bắt các tình huống này luôn xem hàm sử lí đúng không
    @Test
    public void getFactorial_RunsWell_IfValidArgument() {
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    // test thành công hoặc thất bại
    // tách hàm thành các tình huống khác nhau 
    // tên hàm test đặt tên riêng
    // mặc định code xanh mới ra file chấm war hoặc jar  nếu code màu đỏ thì phải disable
    // cái nut clean and buil

}
