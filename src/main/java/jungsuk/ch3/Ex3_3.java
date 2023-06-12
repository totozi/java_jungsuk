package jungsuk.ch3;

public class Ex3_3 {
    public static void main(String[] args) {
        int num = -100;

        String result = "";
        result = num > 0 ? "양수" : (num < 0 ? "음수" : "0" );
        System.out.println(result);
    }
}
