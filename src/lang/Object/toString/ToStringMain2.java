package lang.Object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("model Y");
        Dog dog1 = new Dog("멍멍이1",2);
        Dog dog2=new Dog("멍멍이2",5);

        System.out.println("1. 단순 toString 호출 : ");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println내부에서 toString 호출 : ");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        // 1. 단순 toString 호출 :
        //lang.Object.toString.Car@30f39991
        //dogName = 멍멍이1/age = 2
        //dogName = 멍멍이2/age = 5

        //2. println내부에서 toString 호출 :
        //lang.Object.toString.Car@30f39991
        //dogName = 멍멍이1/age = 2
        //dogName = 멍멍이2/age = 5

        System.out.println("3. Object 다형성 활용 ");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

    }
}
