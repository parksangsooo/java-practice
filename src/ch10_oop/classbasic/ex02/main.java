package ch10_oop.classbasic.ex02;

public class main {
    public static void main(String[] args) {
        //  본사 소속의 매장을 내는 코드
        YalcoChicken store1 = new YalcoChicken();
        store1.no = 3; // 🔴
        store1.name = "판교";

        YalcoChicken store2 = new YalcoChicken();
        store2.no = 17;
        store2.name = "강남";


        //  인스턴스의 필드들에 접근
        int store1No = store1.no;
        String store2Name = store2.name;

        //  인스턴스의 메소드 호출
        String store1Intro = store1.intro();

        /*
        - 디버깅 툴로 인스턴스들 살펴볼 것
        - `out` 디렉토리 살펴볼 것 - 클래스들이 `.class` 파일로 생성
         */
    }
}
