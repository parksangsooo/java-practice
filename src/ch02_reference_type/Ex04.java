package ch02_reference_type;

public class Ex04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //  int끼리 연산은 int 반환
        int c = a + b;

        long d = a + b;
//        short e = a + b; // 더 작은 통에는 ⚠️ 묵시적으로는 불가
        short f = (short) (a + b);

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

        //  ⚠️ 아래는 모두 불가
//        byte b3 = b1 + b2;
//        short s3 = b1 + b2;
//        short s4 = b1 + s2;
//        short s5 = s1 + s2;

        //  ⭐ byte와 short의 연산들은 int 반환
        //  그냥 int를 많이 쓰는 이유 중 하나
        int i1 = b1 + b2;
        int i2 = s1 + s2;
        int i3 = b1 + s1;

       /* - 메모리를 크게 절약해야 하는 상황이 아닌 이상 `int` 널리 사용
          - 1cm 단위로 끊어지는 화장지가 없듯이…

       💡 **int**를 널리 사용하는 기타 이유들

           - 자바 *(및 다수 언어들)* 에서 기본 자료형으로 지정됨
           - 라이브러리와 API 등에서 사용됨
           - 다른 언어들과 호환 *(널리 사용되는 자료형)*
           - 연산 속도가 타 자료형보다 빠름
           - 32비트 *( 4바이트 )* : 대부분의 CPU 에서 처리하기 적합한 크기
        */

        long l1 = 1;
        long l2 = 2;

        // long 끼리의 연산은 long 반환
        long l3 = l1 + l2;

        //  ⚠️ 정수 자료형의 계산은 소수점 아래를 '버림'
        byte int1 = 5/2;
        int int2 = 10;
        int int3 = 3;
        int int4 = int2 / int3;

        // 💡 홀수와 짝수 구분에 널리 사용
        int aa = 1 % 2;
        int bb = 2 % 2;
        int cc = 3 % 2;
        int dd = 4 % 2;
        int ee = 5 % 2;
        int ff = 6 % 2;
        int gg = 7 % 2;
    }
}
