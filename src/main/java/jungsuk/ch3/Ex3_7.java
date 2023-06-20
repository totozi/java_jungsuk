package jungsuk.ch3;

public class Ex3_7 {
    public static void main(String[] args) {
        
        /**
         *  대문자일 떄 소문자로 변경
         */

        char ch = 'A';

        if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char) (ch + 32);
        }

        System.out.println(ch);


    }
}
