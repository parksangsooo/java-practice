package ch09_controlstatement.inputkyboard;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
        - `Scanner` : 키보드 입력이나 파일 등로부터 텍스트 값을 받아오기 위한 클래스
        - `[System.in](http://System.in)` : `InputStream` 의 인스턴스, 입력받은 값들의 흐름
         */
        //  IDE가 최상단에 import java.util.Scanner 자동 작성
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.nextLine();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        /*
        `next` : 스페이스를 비롯한 공백 단위로 끊어서 *(토큰으로)* 문자열을 받음
        `nextLine` : 줄바꿈 단위로 끊어서 문자열을 받음
         */

    }
}
