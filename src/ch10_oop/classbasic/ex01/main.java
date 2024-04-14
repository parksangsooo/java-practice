package ch10_oop.classbasic.ex01;

public class main {
    public static void main(String[] args) {
        /*
        - 객체 *object* / 인스턴스 *instance* : 속성(프로퍼티)들과 기능(메소드)들의 묶음
        - 자바에서는 객체와 인스턴스를 같은 것으로 이해해도 됨
        - 인스턴스는 클래스에서 정의한 방식으로 양산됨
         */

        Button button1 = new Button('1', 1, "DARK");
        Button buttonPlus = new Button('+', 3, "DARK");
        Button buttonClear = new Button('C', 2, "DARK");

        button1.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
