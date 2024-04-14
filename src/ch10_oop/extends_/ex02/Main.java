package ch10_oop.extends_.ex02;

public class Main {
    public static void main(String[] args) {
        Button entrButton = new Button("Enter");
        ShutDownButton stdnButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);

        entrButton.func();

        System.out.println("\n- - - - -\n");

        stdnButton.func();

        System.out.println("\n- - - - -\n");

        tglButton.func();
        tglButton.func();
        tglButton.func();

        /*
        ### `super` 부모의 생성자/메소드 호출

        - 부모 클래스에 생성자가 작성되었을 시
            - 자식 클래스에도 생성자 작성 필요
                - 생성자를 제거해 볼 것
            - `super` 를 사용해서 부모의 생성자를 먼저 호출
                - 이후 추가로 필요한 내용 작성
                - 즉 부모의 인스턴스부터 생성 후 이를 기반으로 자식 인스턴스 생성
                - 자식 클래스의 생성자는 `super` 로 시작해야 함
                    - 순서 바꿔 볼 것
        - 부모의 기타 메소드를 자식 클래스에서 사용시 앞에 `super.` 를 붙임
            - 즉 `super` 는 부모 클래스의 인스턴스(실존하지 않음 - 자신 안의 부모 유전자)를 가리킴
                - `this` 가 해당 클래스의 인스턴스를 가리키듯…
            - 어떤 메소드에서든, 어떤 위치에서든 사용 가능

        ### `@Override` 어노테이션

        - 어노테이션 : 이후 배울 것
        - 부모의 특정 메소드를 오버라이드함을 명시
            - 없어도 오류가 나지는 않음
            - 붙였는데 메소드명이 다를 시 오류 (실수 방지)
         */
    }
}
