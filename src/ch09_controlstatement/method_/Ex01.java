package ch09_controlstatement.method_;

public class Ex01 {
    public static void main(String[] args) {
    /*
        # 메소드

        - 타 언어의 함수 *function* 과 같은 개념
        - 자바는 모든 것이 클래스의 요소이므로 메소드 *method 라 부름*

        ### 메소드의 의미 1. 반복을 최소화

        - 한 번 이상 실행될 수 있는 일련의 작업들을 묶어두는 것

     */

//        double x = 3, y = 4;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);
//
//        x = 10; y = 2;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);
//
//        x = 7; y = 5;
//
//        System.out.printf("%f + %f = %f%n", x, y, x + y);
//        System.out.printf("%f - %f = %f%n", x, y, x - y);
//        System.out.printf("%f * %f = %f%n", x, y, x * y);
//        System.out.printf("%f / %f = %f%n", x, y, x / y);

        double xx = 3, yy = 4;
        addSubtMultDiv(xx, yy);

        xx = 10; yy = 2;
        addSubtMultDiv(xx, yy);

        xx = 7; yy = 5;
        addSubtMultDiv(xx, yy);

    }

    //  ⭐️ 메인 메소드 외부에 선언할 것
    static void addSubtMultDiv(double a, double b) {
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }

}
