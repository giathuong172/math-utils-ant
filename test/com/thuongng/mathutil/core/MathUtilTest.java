/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thuongng.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    @Test(expected = Exception.class) // chạy hàm này xem thử có 1 exception hay hay không.
    // nó xuất hiện bằng cách new IllegalArgumentException ở đâu đó.
    // kì vọng xuất hiện dù mày là exception , và m xh thật , màu xanh.
    // hàm getF() đc trả về con long nếu n đưa vào 0 tới 20;
    // hàm getF() đc thiết kế ném ra EXCEPTION nếu n < 0 || n > 20
    // tức là nếu gọi getF(-5) thì chỗ gọ sẽ nhận về Exception tên là 
    // IllegalArgumentException 
    // đưa cà chớn , nhận ngoại lệ.
    // bắt xem hàm mình có đúng ném ngoại lệ hay không nếu data cà chớn
    // thấy ngoại lệ mừng rơi nước mắt .
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        // test 3 ! 
        // test 4 !
        // test 5 !
        // test 6!
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }

    @Test // ten ham test bao gom luon y nghia test cai gi
    // quy uoc dan kiem thu 
    // test hàm giai thừa khi đưa tham số đúng , m phải trả về 
    // đúng ,viết code theo quy tắc - CODING CONVENTION RULE 
    // camelcase 
    public void testFactorialGivenRightArgumentReturnsWell() {
        //test case 1 kiểm thử tình huống 0 ! coi thử có đúng hay không ? 
        // n = 0 ? hi vọng hàm ói về expected = 1 , actual thực tế 
        // chạy ra mấy đoán xem ??? 
        long expected = 1;
        long actual = MathUtil.getFactorial(0);    //gọi hàm để kiểm tra.
        // so sánh 2 giá trị có tương đồng hông ? có đúng thì đúng , nếu không là bug
        // so sánh = sout() cũ , sửa dụng assert
        //tescase 2
        Assert.assertEquals(expected, actual);
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        // test case 3 :
        expected = 2;
        actual = MathUtil.getFactorial(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tryJunitFirst() {
        Assert.assertEquals(69, 69);
    }
}
// class này ta viết các đoạn code như bth 
// nhưng đoạn code này dùng code để test code , chính bên mathutil
// viết code để test code chính , thì các ddaonj test này được gọi là test script
// test script là những đoạn code đc viết ra để test code khác ,
// những đoạn code này sẽ đc gọi các hàm bên code chính , so sánh giá trị
// những đoạn code này / test script này sẽ phải bao gồm các test cáe
// bên trong 
//test script chứa các test case 
// trong test script này sẽ có test 5! 6! 7! -5! -> Test case
// @Test annotation , kí hiệu , flag đánh dấu đoạn code mang 1 ý nghĩa nào đó,
// khi biên dịch code/ compile code thì thư viện đi kèm nó sẽ tự động generate 
//code cho mình 
// ví dụ @Test thì thư viện JUnit nãy import nó sẽ ngầm ngầm tự generate 
// hàm này thành public static void main() và gửi main này cho JVM
// Kĩ thuật dùng thư viện , bị ép phải theo cú pháp của nó qua những 
// @,thư viện này gọi là framework
//fw : là thư viện là những file .jar .dll chứa một đống class bên trong
// ép ta phải xài theo cách của nó , theo dàn khung code mà nó quy ước 
// dàn khung template ta điền nốt code vào chỗ trống 
// thư viện - library , cũng là những file .jar .dll chứa 1 đống class bên trong
// ta thoải mái dùng hàm của nó theo cách của ta

// Quy tac choi xanh do , xanh thì tất cả các test case đều xanh , tức là tất cả
// expected == actual không ngoại lệ ? 
// đỏ : chỉ cần 1 test case màu đỏ , xem như hàm toang , tạch 
// chỉ cần có 1 expected != actual , xem như bỏ đi hết các template
// 1 thằng gây sai tất cả
// hàm đã đúng thì phải đúng hết cho tất cả các case đã đc nêu ra ,
// chỉ cần 1 sự ko = nhau của actual vs expected , hàm không ổn định,
// kq -> sai
// k thể test hết tất cả case , nhưng test case nào phải ngon xanh case đó .
// nói thêm về màu đỏ :
// màu đỏ xảy ra khi có 1 sự không bằng nhau của expected và actual .
// lý do gì expected != actual 
// có 2 lý do 
// ld1 : expected đúng, mình tính bên ngoài , = tay khi chưa có hàm 
// actual sai , tình huống này hàm cùi bắp , bug , bug
// ld2 : expected sai , vứt luôn test case đi, anh chàng QC/DEV sai .
// kì vọng sai , hi vọng gì ở actual .
// DDT - Data Driven Testing
// tách bộ data kiểm thử ra 1 chỗ 
// lát hồi nhồi/ nạp/gill/điền/feed data này tuần tự vào chỗ kiểm thử 
// ví dụ tách data đã kiểm thử ở trên thành 
//  1 0 
//  1 1
//........
// thay vì lệnh so sánh gọi viết cho từ case , ta biến lệnh này
// trở nên tổng quát . không điền data cụ thể, mà điền từ đâu đó
// Assert.assertEquals(???? , MathUtil.getFactorial(???));
// kĩ thuật tách code test ra khỏi data của nó , lát hồi fill lại sau
// đc gọi là kĩ thuật viết test case theo kiểu tham số hóa
// PARAMETERIZED  còn gọi là DDT.
// viết kiểm thử hướng về tách data riêng ra !!!


