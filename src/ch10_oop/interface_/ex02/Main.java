package ch10_oop.interface_.ex02;
/*
        ### `default` 로 구상 메소드를 넣을 수 있도록 한 이유

        - 사용되던 인터페이스에 새로운 기능을 추가해야 한다면?
            - 새로운 자바 버전의 라이브러리 인터페이스에 새 기능이 추가되어야 한다면?
            - 이를 적용하여 사용하던 클래스가 매우 많을 경우…
        - 해당 인터페이스의 하위 클래스들을 일일이 수정하지 않아도 되도록
            - **하위호환성**
 */

public class Main {
    public static void main(String[] args) {
        FoodSafety.announcement();

        YalcoChicken store1 = new YalcoChicken();

        store1.regularInspection();
        store1.cleanKitchen();
        store1.employeeEducation();
    }
}
