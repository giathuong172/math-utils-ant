/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuongng.mathutil.core;
// ta xẽ clone bộ thư viện / công cụ Math.util của JDK
// những gì mà là công cụ dùng cho người khác , hàm khác , class khác thì thường được
//thiết kế lại  static , chấm trực tiếp qua tên class , éo có new
//
/**
 *
 * @author Admin
 */
public class MathUtil {
    public static final double PI = 3.14159265;
    // hàm tính n! = 1.2.3.4.5.....n 
    //quy ước 0! = 1! = 1
    //quy ước 21! vượt 18 số 0 , vượt kiểu long 
    // hàm của chúng ta design : chỉ chấp nhận tính giai thừa từ 0 tới 20 
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw  new IllegalArgumentException("Invalid n . n must be between 0...20");
        if(n == 0 || n == 1)
            return 1;
        // sống sót đến đây sure n từ 2...20 
        long product = 1;//acc-accumulation 
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    // kỹ thuật lập trình - giữ khái niêm  kiến thực  cũ , plugin mới ,
    // cho trình độ của dev- viết code chú ý chất lượng phần mềm ,
    // kĩ thuật tdd-test driven developement
    // viết code để test code song song với nhau , mỗi hàm developer phải viết ngay cái test case .
    // phải viết ngay hành động kiểm thử hàm để biết rằng hàm vừa viết chạy sai hay đúng .
    // java -jar ...tên project :)))
}
