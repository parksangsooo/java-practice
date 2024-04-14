package ch10_oop.accessmodifier.ex02;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1);

//        Button.mode = "OCEAN"; // ⚠️ private 라서 접근불가
        Button.switchMode();

//        button1.space = 3; // ⚠️ private 라서 접근불가
        button1.setSpace(3);
        button1.setSpace(-1); // 메소드상 가능하지 않기 때문에 알아서 걸러짐

//        char button1Print = button1.print; // ⚠️ private 라서 접근불가
        String button1Info = button1.getButtonInfo();
    }
}
