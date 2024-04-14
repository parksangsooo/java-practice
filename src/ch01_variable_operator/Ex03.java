package ch01_variable_operator;

public class Ex03 {
    public static void main(String[] args) {
        // ### ⭐️ 대입(할당) 연산자 *assignment operator*
        //- 왼쪽의 주머니에 오른쪽의 값을 넣음
        //- 이후 다른 대입 연산자도 배울 것

        String 대학 = "학생";

        //  일반적으로는 아래와 같이 선언과 초기화를 동시에
        //  자료형(주머니에 담길 데이터 종류)_주머니의 이름들(맘대로)_주머니에 담은(담긴) 데이터
        int age = 20;
        boolean isMarried = false;
        double height = 179.99;
        char sex = 'M';
        String name = "홍길동";

        // - 오른쪽의 값(변수가 아닌, 데이터 표현)들을 리터럴 *literal* 이라 부름

       //  변수 - 값을 변경할 수 있다는 의미
        age = 21;

        //  ⭐️ 자바는 정적 자료형
        //  ⚠️ 주머니와 자료형이 다른 데이터는 넣을 수 없음
        //  - 크기가 다른 주판으로 갈아끼울 수 없음
        //  컴파일 단계에서 차단됨

//        age = false;
//        isMarried = "안함";
//        sex = 1.2
//        name = 3;
    }
}
