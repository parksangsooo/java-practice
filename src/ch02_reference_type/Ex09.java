package ch02_reference_type;

public class Ex09 {
    public static void main(String[] args) {
      /*
        ### 비교연산자
        | a == b | a와 b는 같다 |
        | a != b | a와 b는 다르다 |
        | a > b | a가 b 보다 크다 |
        | a >= b | a가 b보다 크거나 같다 |
        | a < b | a가 b보다 작다 |
        | a <= b | a가 b보다 작거나 같다 |
        - `boolean` 자료형의 값을 반환 (`true` 또는 `false`)
        - `=` *( 대입 연산자 )*와 혼동하지 말 것
        */

        //  값을 바꿔가면서 실행해 볼 것
        int int1 = 3;
        int int2 = 3;

        //  다른 정수 자료형끼리 사용 가능
        boolean bool1 = int1 == int2;
        boolean bool2 = int1 != int2;

        boolean bool3 = int1 > int2;
        boolean bool4 = int1 >= int2;

        boolean bool5 = int1 < int2;
        boolean bool6 = int1 <= int2;

        //  💡 우선순위에 따른 연산
        boolean bool7 = int1 * int2 > int1 + int2;
    }
}
