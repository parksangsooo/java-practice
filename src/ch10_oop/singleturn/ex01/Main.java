package ch10_oop.singleturn.ex01;
/*
    - 프로그램 상에서 특정 인스턴스가 딱 하나만 있어야 할 때
        - 🏪본사직영매장 하나만 운영하는 회사
        - 프로그램상 여러 곳에서 공유되는 설정
        - 멀티쓰레딩 환경에서 공유되는 리소스
        - 기타 전역으로 공유되는 인스턴스가 필요한 경우
 */

public class Main {
    public static void main(String[] args) {
        Tab tab1 = new Tab();
        Tab tab2 = new Tab();
        Tab tab3 = new Tab();

        System.out.println(tab1.getSetting().getVolume());

        System.out.println("\n- - - - -\n");

        tab1.getSetting().incVolume();
        tab1.getSetting().incVolume();

        System.out.println(tab1.getSetting().getVolume());

        //  ⚠️ 각 인스턴스는 서로 다른 Setting 인스턴스를 가짐
        //  - 설정값이 공유되지 못함
        System.out.println(tab2.getSetting().getVolume());
        System.out.println(tab3.getSetting().getVolume());
    }
}
