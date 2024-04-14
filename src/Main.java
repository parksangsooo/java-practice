import ch10_oop.accessmodifier.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {
       // ### 타입 추론 (Java 10+)###
        /*
        - Java 10 에서 도입됨
        - `var` 연산자로 변수 선언 - 타입을 명시하지 않음
        - 대입된 값을 통해 컴파일러가 추론
        - 지역 변수에서만 사용 가능
        - 이후 배울 클래스의 필드로는 불가
         */

        var intNum = 1;
        var doubleNum = 3.14;
        var charLet = 'A';
        var StringWord = "안녕하세요";

        //  ⚠️ 아래와 같이는 사용 불가
        //  컴파일러가 타입을 추론할 수 없는 상황
//        var notInit; // 초기화가 안 됨
//        var nullVar = null; // null로 초기화

        //  ⚠️ 자료형을 변경 불가
//        intNum = 1.23;
//        StringWord = 123;

        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

//        String pb = smartPhone.powerButton; // ⚠️ 불가
        String ss = smartPhone.sdCardSlot;
    }
}