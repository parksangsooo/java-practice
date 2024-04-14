package ch07_arrays;

public class Ex01 {
    public static void main(String[] args) {
        /*
        - 특정 타입의 데이터를 묶음으로 다루기 위해 사용
        - 지정된 자료형과 개수만큼 메모리 공간을 나란히 확보
        - ⚠️ 개수의 변경이 불가능함
        - 각각이 담는 자료형의 크기만큼 요소당 메모리 차지
        - 💡 문자열의 경우: 각 문자열이 저장된 주소값을 담음
         */

        //  💡 사용할 자료형 뒤에 []를 붙여 선언
        char[] yutnori = {'도', '개', '걸', '윷', '모'};

        //  💡 length : 배열의 길이 반환
        int length = yutnori.length;

        //  💡 [] 안에 인덱스 정수를 넣어 접근
        //  ⭐ 0부터 시작
        char first = yutnori[0];
        char last = yutnori[yutnori.length - 1];

        //  💡 초기화하지 않고 일단 선언하기
        //  ⭐ 어떤 값으로 초기화되는지 확인
        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        double[] dblAry = new double[3];
        char[] chrAry = new char[3]; // 아래 확인
        String[] strAry = new String[3];

        //  아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
        char NUL = chrAry[0];

        //  다음과 같이 원하는 위치의 값 변경
        intAry[0] = 123;
        intAry[1] = 456;
        intAry[2] = 789;
    }
}
