package ch09_controlstatement.method_;

public class Ex03 {
    public static void main(String[] args) {
        sayHello();

        int count1 = getCount();
        int count2 = getCount();
        int count3 = getCount();
        int count4 = getCount();
    }
    //  매개변수도, 반환값도 없는 메소드

    static int count = 0;

    //  매개변수 없이 값만 반환하는 메소드
    //  외부 변수 값을 변화시킴 (static이므로 static 변수만 가능)
    static int getCount () {
        System.out.println("카운트 증가");
        return ++count;
    }
    /*
    - `return` 을 `println` 윗줄로 옮겨 볼 것
    - `return` 은 블록을 종료하므로 이후의 코드 무효화 - 컴파일 에러 발생
    - 반환값의 자료형을 바꿔 볼 것 *(`short`, `long`, 기타…)
    - 반환값이나 인자의 자료형에 어긋날 경우 컴파일 에러 발생
    - ⚠️외부의 변수 값을 바꾸는 것은 좋은 메서드가 아님
     */

    static void sayHello () {
        System.out.println("안녕하세요!");
    }


}
