package 정기역략평가01;

public class Exercise16 {
    // 인터페이스의 사용 목적에 대해 기술해보도록 한다.
    // 무엇 보다 먼저 프로젝트는 협업이기 때문이다
    // 인터페이스는 프로토타입의 메소드를 만들도록 되어 있는데,
    // 같은 성과를 위해서 여러 사람이 업무를 하게 된다면 누군가는 업무를 기달리는
    // 상황이 나올 수 있다. 그렇게 되면 프로젝트가 완성되는 시간이 점점 길어지게 된다.
    // 그렇게 되면 시간과 돈이 낭비가 올라간다.
    // 인터페이스를 이용해 프로토 타입을 만들어 놓으면 그에 맞춰 각자 만들 수 있기 때문에
    // 이러한 낭비되는 시간과 돈을 절약할 수 있다.
    // 또한 이렇게 표준화를 해놓으면 유지 보수에도 유리하다 이는 우리가 야근을 피할 수 있는 좋은 방법이다.

    // 두번째로는 다형성 때문이다.
    // 하나의 메소드나 클래가 있을 때 이것들을 다양한 방법으로 동작하는 것을 말한다
    // 리그 오브 레전드의 예를 들어보자
    // 이 게임의 스킬을 쓰기 위한 키는 Q,W,E,R이다. 이것이 인터페스에 있는 메소드인 것이다.
    // 스킬을 쓰기 위해서는 이 키들 중 한개를 눌러라 (프로토타입)을 해놓은 것이다.
    // 하지만 게임의 캐릭터들은 153개의 종류가 있다 모두 같은 키를 눌러 스킬을 쓰지만
    // 각자 캐릭터만의 개성이 담은 스킬들이 다 다르다 이것이 다형성이라는 것이다
    // 하나의 메소드나 클래스(Q,W,E,R 스킬 키)가 여러 형식으로 구현(각 캐릭터만의 스킬)되는 것을 말한다.

}
