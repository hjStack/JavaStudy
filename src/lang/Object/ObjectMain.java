package lang.Object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child=new Child();
        child.childMethod();
        child.parentMethod();

        // toString은 object 클래스의 메서드
        String string=child.toString();
        System.out.println(string);  // lang.Object.Child@30f39991

    }
}
