package jungsuk.ch3;

public class Ex3_1 {
    public static void main(String[] args) {
        int  x = 2   ;
        int  y = 5   ;
        char c = 'A' ; // 'A'의 문자코드는 65

        System.out.println(1 + x << 33);
        System.out.println((2 << 1) == (2 << 33)); // 둘 다 4로 true
        System.out.println(y >= 5 || x < 0 && x > 2); // true
        // &&는 ||보다 우선순위가 높기 때문에 true || false && false 는 true || flase가 된다.
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println(!('A' <= c || c < 'Z'));
        System.out.println(++c); // 단항연산자 ++은 이항연산자와 달리 int보다 작은 타입도 형변환을 하지 않는다.
        System.out.println(c++);

    }
}
