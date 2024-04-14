package ch09_controlstatement.foreach;

public class Ex03 {
    public static void main(String[] args) {
    // ### 배열의 루프 ###

        //  4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i;
            }
        }

        //  💡 배열 순환 (기본적인 방법)
        for (int i = 0; i < multiOf4.length; i++) {
            System.out.println(multiOf4[i]);
        }

        System.out.println("\n- - - - -\n");

        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용
        for (int num : multiOf4) {
            System.out.println(num);
        }

        System.out.println("\n- - - - -\n");

        int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }

        // ### 배열의 특정 개수만 사용할 때는 for 문, 전부 사용할 때는 foreach 문
        System.out.println("\n- - - - -\n");

        for (String s : "호롤롤로".split("")) {
            System.out.println(s);
        }
    }
}
