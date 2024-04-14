package ch10_oop.singleturn.ex03;

public class Tab {
    //  ⭐️ 공유되는 유일한 인스턴스를 받아옴
    private Setting setting = Setting.getInstance();

    public Setting getSetting() {
        return setting;
    }
}