package jungsuk.ch3;

public class Ex3_4 {
    public static void main(String[] args) {
        // 백의 자리 이하를 버리는 코드

        int num = 456;

        num = 400/100 * 100;

        System.out.println(num);

        // 일의 자리를 1로 바꾸는 코드

        num = 333;

        num = num/10 * 10 + 1;

        System.out.println(num);

        // 변수의 값보다 크면서도 가장 가까운 10의 배수에서 변수의 값을 뺀 나머지를 구하는 코드

        num = 24;

        num = 10 - (num % 10);

        System.out.println(num);

    }
}
