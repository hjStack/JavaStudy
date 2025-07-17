package lang.Object.poly;

public class ObjectPolyExampl2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Car car=new Car();
        Object object = new Object();  //Object 인스턴스도 만들 수 있음

        Object object1[]={dog,car,object};

        size(object1);
        // Object 타입만 사용
        // Object 타입의 배열은 세상의 모든 객체를 담을 수 있기 때문에
        // 새로운 클래스가 추가되거나 변경되어도 메서드를 수정하지 않아도 됨
    }

    private static void size(Object[] object1){
        System.out.println("전달된 객체의 수는 : " +object1.length);
    }
}