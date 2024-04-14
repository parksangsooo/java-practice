package ch10_oop.finalclass;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //  ⚠️ 불가
//        store1 = new YalcoChicken(17, "강남");
        //  💡 요소 변경은 가능
        store1.name = "선릉";

        /*
        ### final 필드
        - 값 변경 불가
        - 필드 선언시 또는 생성자에서 초기화해야 함
            - 수정이 불가하므로…

        ### final 메서드
        - 자식 클래스에서 오버라이드 불가

        ### final 인스턴스
        - 다른 값을 넣는 것은 불가
        - 필드는 변경 가능
            - 주소는 바꾸지 못하지만 인테리어는 바꿀 수 있음

        ### final 클래스
        - 하위 확장 불가 (자식 클래스를 만들 수 없음)
         */
    }
}
