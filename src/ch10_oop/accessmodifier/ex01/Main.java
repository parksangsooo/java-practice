package ch10_oop.accessmodifier.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; // ⚠️ 불가
    }
}
