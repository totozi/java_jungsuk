package jungsuk.ch3;

public class Ex3_5 {
    public static void main(String[] args) {
        // 화씨 섭씨 변환
        // 섭씨 = 5/9 * (화씨 - 32)
        // 소수 둘쨰짜리까지 반올림하여 나타내기
        int fahrenheit = 100;

        // 섭씨 변환
        float celcius = 5.0f / 9 * (fahrenheit - 32);

        // 반올림
        //celcius = ((int) ((celcius + 0.005f) * 100)) / 100f;
        celcius = (int) (celcius * 100 + 0.5f) / 100f;

        System.out.println(fahrenheit);
        System.out.println(celcius);

    }
}
