package ch06_String.reference;

public class Ex01 {
    public static void main(String[] args) {
        /*
        ### `String` : 문자열 자료형

        - 0~다수의 문자들로 구성
        - 쌍따옴표로 둘러쌈
                - 이제까지 배운 자료형들과 달리 **참조 자료형**
        - 그러나 특별히 원시값과 유사하게 사용될 수 있음

         */

        //  리터럴 방식
        String str1 = "Hello World!";
        String str2 = "안녕하세요 😆 반갑습니다~ 🖐️🖐️🖐️";

        // 빈 문자열 가능
        String str3 = "";

        //  인스턴스 생성 방식
        String str4 = new String("나중에 자세히 배웁니다.");

        /*
        - 클래스의 인스턴스
                - 일단, 단순 값 뿐 아니라 특정 기능들을 가진 무언가로 이해할 것
                - 객체지향 섹션에서 상세히 다룸

         */
    }
}
