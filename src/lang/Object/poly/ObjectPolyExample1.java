package lang.Object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Car car=new Car();

        action(dog);
        action(car);
    }

    private static void action(Object Obj){
//      obj.sound();  // 컴파일 오류  // object는 sound()가 없음
        // Object는 모든 객채의 부모
        // Dog 타입을 참조

        // 객체에 맞는 다운캐스팅 필요
        // Object에는 sound()가 없기 때문
        // Object에는 모든 객체를 담을 수 있음
        if(Obj instanceof Dog dog){
            dog.sound();
        }
        else if(Obj instanceof Car car){
            car.move();
        }
    }
}
