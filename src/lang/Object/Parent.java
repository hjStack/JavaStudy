package lang.Object;

// 부모가 없으면 암묵적으로 Object 클래스를 상속받음
public class Parent extends Object {

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
