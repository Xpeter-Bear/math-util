package tuan.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Modern 15
 */
@RunWith(value = Parameterized.class) // báo cho junit biết cần
                                        // chuẩn bị data và nhồi vào hàm 
public class AdvancedMathTest {
    // chua cac ham arssert x nao đó chứa các lời goij hàm cần test 
    // mình làm thêm việc tách data cần test ra triêng 1 chỗ , ko nhúng 
    // hẳn vào trong câu lệnh test như phiên bản cũ,
    // kỹ thuật tham số hóa - parameterrized
    
    // chuẩn bị mảng 2 chiều chứa data đâu vào và đầu ra
    // ta cần quy ước của Junit
    // Integer Hoa , kieu Wrapper class
    
    // bo data se duoc trich ra tung dong tung cap la input vaf expected cho ham tinh giai thua
    // trich ra thi phai luu vaof bien lat hoi do vao assert hamf tinh giai thua
    // chi can bao cho Junit biet  cot nao ung voi bien nao
    @Parameter(value = 0)
    public int input; // se tu dong lay cot 1 cua mang 2 chieu gan vao bien nay
                        // 
    
    @Parameter(value = 1)
    public long expected; // lay cot 2 cua tung phan tu trong mang 2 chieu gan vao bien nay
   
    
    @Parameters
    public  static Integer[][] initData() {
        return  new Integer[][] {
                                        {0,1},
                                        {1,1},
                                        {2,2},
                                        {5,120},
                                        {6,720},
                                        {7,5040},
                                };
    }
    
    // chuan bi data xong, feed vao ham
    @Test
    public void checkFactorialCorrectArgumentReturnsCorrectResult() {
        assertEquals(expected, MathUtil.getFactorial(input));
        // goi dung 1 lan cho tinh huong thanh cong
        // va Junit se tu dong for qua tung cap Data trong mang 
        // vaf dien vao assert();
    }
    
}
