package ch10_oop.polymorphism.ex01;

public class Main {
    public static void main(String[] args) {
        /*
        - 자식 클래스의 인스턴스는 부모 클래스 자료형에 속함
             - *모든 셧다운버튼과 토글버튼은 버튼이다.*
        - 다른 방향으로는 불가
            - *모든 버튼이 셧다운 버튼이거나 토글버튼인 것은 아니다.*
            - *셧다운 버튼은 토글 버튼이 아니다.*
         */

        //  💡 가능 - 자식 클래스는 부모 클래스에 속함
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);

        //  ⚠️ 불가
//        ShutDownButton button4 = new Button("Enter");     자식이 부모를 만들 수는 없거
//        ToggleButton button5 = new ShutDownButton();      형제여도 서로 상속받지 않으면 만들 수 없다.

        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
//        Button[] buttons = {
//                new Button("Space"),
//                new ToggleButton("NumLock", false),
//                new ShutDownButton()
//        };
//
//        for (Button button : buttons) {
//            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
//            button.func();
//        }

        /*
        - ⭐️ 이처럼 특정 자료형의 자리에 여러 종류가 들어올 수 있는 것 - **다형성**
            - 상속, 오버라이딩, 이후 배울 인터페이스 등을 통해 구현 가능
         */


        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        //  true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        //  false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton;

        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons) {
            if (btn instanceof ShutDownButton) continue; // ⭐️  셧다운버튼은 제끼고 나머지만 실행
            btn.func();
        }

    }
}
