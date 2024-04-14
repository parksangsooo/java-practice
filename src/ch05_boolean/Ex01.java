package ch05_boolean;

public class Ex01 {
    public static void main(String[] args) {
        /*
        ### `boolean`  자료형

- 참/거짓 둘 중 한 값을 가짐
- 1바이트 *(8비트)* 공간 차지
    - 하드웨어 구조와의 호환성 - *CPU가 수월히 다룰 수 있는 최소 단위*
- 리터럴보다는 반환값으로 많이 사용됨
         */

        boolean bool1 = true;
        boolean bool2 = false;

        boolean bool3 = !true;
        boolean bool4 = !false;

        boolean bool5 = !!bool3;
        boolean bool6 = !!!bool3;


        boolean bool7 = !(1 > 2);
        boolean bool8 = !((5 / 2) == 2.5);
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));
    }
}
