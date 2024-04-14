package ch06_String.method;

public class Ex01 {
    public static void main(String[] args) {
       /* ### 문자열은 **불변** *immutable*

        - 문자열 스스로를 변경하는 메소드는 없음 - *”문자열 고쳐 쓰는 거 아니다”*
        - 새 문자열 또는 다른 값을 반환
        - ⚠️문자열 변수에 다른 값을 넣을 수 없다는 뜻이 아님

        ### ⭐️ 반환값과 인자의 자료형 등을 살펴볼 것

        ### 문자열 길이 반환*/

        int int1 = "".length();
        int int2 = "헬로".length();
        int int3 = "Hello".length();
        int int4 = "김수한무 거북이와 두루미".length();
    }
}
