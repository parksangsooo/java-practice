package ch10_oop.abstractclass.ex01;
/*
        # . 추상 클래스

        - 스스로는 인스턴스를 만들 수 없음
            - 그냥 ‘포유류’라고 불리는 동물은 없는 것처럼…
        - 자식 클래스로 파생되기 위한 클래스
            - 개, 고양이, 말 등의 클래스로서 인스턴스 생성 *(구상 클래스)*
            - 관련된 여러 클래스들의 공통분모를 정의하기 위한 클래스
 */

/*
        ### `abstract` 클래스
        - 그 자체로 인스턴스 생성 불가
            - 얄코그룹에서 매장을 내지는 않음
        - 부모 클래스로서는 일반 클래스와 같음
            - 다형성 역시 구현됨
                - *얄코치킨과 얄코카페의 매장은 얄코그룹 소속*
 */
public abstract class YalcoGroup {
    protected static final String CREED = "우리의 %s 얄팍하다";

    //  💡 클래스 메소드는 abstract 불가
    //  abstract static String getCreed ();

    protected final int no;
    protected final String name;

    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro () {
        return "%d호 %s점입니다.".formatted(no, name);
    }

    /*
     ### `abstract` 메소드
        - 추상 클래스에서만 사용 가능
        - 스스로는 선언만 하고 구현하지 않음
            - ⭐ 자식 클래스에서 반드시 구현
            - 구현하지 않을 시 컴파일 에러
                - 메뉴 - 코드 - 메서드 구현 / IDE의 오류 안내 클릭
            - 접근 제어자 의미 없음
        - 클래스 메소드는 추상 메소드로 작성할 수 없음
            - 인스턴스를 생성해서 쓰는 것이 아니므로 맞지 않음
     */
    //  이후 다른 패키지에서의 실습을 위해 public으로
    public abstract void takeOrder ();
}
