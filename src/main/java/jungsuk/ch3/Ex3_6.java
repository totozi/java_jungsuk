package jungsuk.ch3;

public class Ex3_6 {
    public static void main(String[] args) {
        /**
         * 문자형 변수 ch가 영문자이거나 숫자일 때만 변수 b의 값이 true가 되도록
         */

        char ch = 'z';
        boolean b = false;

        if((ch >= 'A' && ch <= 'z') ||
           (ch >= '0' && ch <= '9'))
        {
            b = true;
        }
        System.out.println(b);


    }
}
