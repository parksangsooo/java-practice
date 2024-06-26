package ch09_controlstatement.method_;
public class Ex02 {
/*
    - `static` : 정적 메소드 *(클래스 메소드)* 에서 호출하려면(main 등) 붙어야 함
    - 정적이 아닌 메소드 *(인스턴스 메소드)* 는 객체지향 섹션에서 배울 것
    - **매개변수** *parameter* : 각각 자료형과 변수명을 적음. 없을 시 빈 괄호
    - 호출할 때 넣는 값 (`add(3, 4)` 의 3과 4)을 **인자 *argument*** 라고 함
    - 강의에서는 자주 인자라고 통일하여 부를 것
    - `return` : 반환하는 값이 있을 때, **맨 마지막에** 붙임
 */
    static int add (int num1, int num2) {
        return num1 + num2;
    }

    static boolean checkIfContain (String text, String token) {
        return text.toLowerCase().contains(token.toLowerCase());
    }

    public static void main(String[] args) {
        /*
        메소드의 의미 2. 값을 받고 연산하여 결과값을 반환 - 함수
         */

        //  ⭐️ 반환한다는 것: 바꿔 쓸 수 있다는 것
        //  메서드 실행문을 메서드의 반환값으로 치환
        int int1 = add(2, 3);
        System.out.println(int1);

        System.out.println(add(4, 5));

        int int2 = add(add(6, 7), add(8, 9));
        System.out.println(int2);

        System.out.println("\n- - - - -\n");

        if (
                checkIfContain(
                        "Hello World",
                        "hello"
                )
        ) {
            System.out.println("포함됨");
        } else {
            System.out.println("포함 안 됨");
        }

        System.out.println(
                checkIfContain(
                        "Hello World",
                        "hello"
                ) ? "포함됨" : "포함 안 됨"
        );
    }
}
