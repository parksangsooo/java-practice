package ch10_oop.extends_.ex02;
    /*
    ### 메소드 오버라이딩

    - 부모가 가진 같은 이름의 메소드를 자식이 다르게 정의
        - *‘저는 제 방식대로 하겠습니다.’*
    - 오버로딩과 혼동하지 말 것
     */

public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출
    }

    //  💡 부모의 메소드를 override
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
