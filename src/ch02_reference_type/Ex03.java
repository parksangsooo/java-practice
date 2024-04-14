package ch02_reference_type;

public class Ex03 {
    public static void main(String[] args) {
        int a = 1 + 2;
        int b = a - 1;
        int c = b * a;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;
        /*
        A가 B를 반환 (return) : 코드상 A를 B로 ‘바꿔 쓸 수 있다’는 의미
        - `1 + 2`가 `3`을 **반환** : `1 + 2`를 `3`으로 대체해 넣었을 때와 결과가 같음
        - 숫자 데이터(리터럴)과 변수 혼합 사용 가능
        - 다중으로 사용 가능, 단 연산자별 우선순위 있음
        - 괄호로 해결 가능
        - 부수효과 없음 확인
         */
    }
}
