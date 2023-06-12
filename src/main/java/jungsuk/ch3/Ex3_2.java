package jungsuk.ch3;

public class Ex3_2 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10;
        int numOfBuckets = -1;

        numOfBuckets = numOfApples / 10;
        numOfBuckets += numOfApples % 10 > 0 ? 1 : 0;

        System.out.println("필요한 바구니 수 : " + numOfBuckets);
    }
}
