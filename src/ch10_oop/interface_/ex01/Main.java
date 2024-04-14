package ch10_oop.interface_.ex01;
/*
        - 인터페이스는 다수 적용할 수 있음 확인
        - 필드는 `public static final`
            - 명시할 필요 없음
            - 초기화 필수 *(생성자가 없으므로)*
        - 메소드는 `public abstract`
            - 명시할 필요 없음
            - 메소드는 적용 클래스에서 구현 필수
        - 인터페이스 적용 클래스 작성시 IDE 안내 이용
            - 메서드 구현
        - 나머지 동물들 *(날다람쥐, 거북, 펭귄)* 들도 구현해보기
            - 이후 강에서 사용할 것!

 */

public class Main {
    public static void main(String[] args) {
        //  ⭐ 다형성
        PolarBear polarBear = new PolarBear();
        Mammal mammal = polarBear;
        Swimmer swimmer = polarBear;

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters = {
                polarBear, glidingLizard, eagle
        };

        //  💡 인터페이스 역시 다형성에 의해 자료형으로 작용 가능
        for (Hunter hunter : hunters) {
            hunter.hunt();
        }
    }
}
