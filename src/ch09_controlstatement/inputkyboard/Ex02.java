package ch09_controlstatement.inputkyboard;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();
        // 🧪 기타 next~ 메서드들 확인해 볼 것

        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);


        // ⚠️ 적절한 자료형의 값이 입력되지 않을 경우
        //- 오류가 발생하는 줄 번호를 확인
    }
}
