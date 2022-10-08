/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thuongng.mathutil.main;

import com.thuongng.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MathUtil.PI
        System.out.println("This message come from the main[]");
        TryTDDFirst();

    }

    public static void TryTDDFirst() {
        //Testcase #1 : tình huongs xài hàm số 1 
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //xài hàm vừa viết;
        //để xem hàm viết đúng hay ko??
        // so sánh 2 giá trị để hàm viết đúng hay không ? 
        //3 thứ này tổ hợp lại nên 1 thứ gọi là testcase
        System.out.println("0! Status | expected = " + expected
                + " | actual = " + actual);
        // test case số 2 : n = 1, kỳ vọng 1 , thực tế là mấy , chạy hàm mới biết 
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status | expected = " + expected
                + " | actual = " + actual);
        // test case số 3 : n = 2, kỳ vọng 2 , thực tế là mấy , chạy hàm mới biết 
        expected = 2;
        actual = MathUtil.getFactorial(2);
        System.out.println("2! Status | expected = " + expected
                + " | actual = " + actual);

    }
}
