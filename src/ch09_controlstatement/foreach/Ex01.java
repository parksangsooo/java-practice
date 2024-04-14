package ch09_controlstatement.foreach;

public class Ex01 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i); // 🔴
        }
        /*
        - 실행 과정
         1. 루프 안에서 사용할 변수 초기화
         2. 루프를 실행하기 위한 조건 확인
         3. 조건을 충족시 실행할 내용
         4. 각 루프가 끝날때마다 이행할 내용
        - 1번 이후 2를 충족할 동안 2~4 반복
        - 변수명은 원하는대로 사용 가능
        - 일반적으로 기본형에는 `i` 를 많이 사용 - *문맥에 따라 index를 뜻함*
         */

        //  루프 블록 안에서 변수값을 바꾸는 것으로 4번 과정 대신 가능
        for (int i = 0; i < 10;) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("\n- - - - -\n");

        for (double d = 123.45; d > 0; d -= 32.1) {
            System.out.println(d);
        }

        for (String s = ""; s.length() < 11; s += s.length()) {
            System.out.println(s);
        }

        System.out.println("\n- - - - -\n");

        //  💡 쉼표로 구분하여 여럿 사용 가능
        //  ⚠️ 변수의 자료형은 한 종류만 가능 (혼용 안 됨)
        for (byte a = 0, b = 10; a <= b;) {
            System.out.printf("a: %d, b: %d%n", a++, b--);
        }

        System.out.println("\n- - - - -\n");

        //  윷놀이 예제에 적용
        String yuts = "도개걸윷모";
        char yut = '도';

        boolean isValid = false;
        for (int i = 0; i <= yuts.indexOf(yut); i++) {
            isValid = true;
            System.out.println("앞으로");
        }
        if (!isValid) System.out.println("무효");

    }
}
