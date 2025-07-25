package lang.wrapper;

public class MyInterMethodMain1 {
    public static void main(String[] args) {

        MyInteger myInteger=new MyInteger(10);
        int i1=myInteger.compareTo(10);
        int i2=myInteger.compareTo(5);
        int i3=myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " +i2);
        System.out.println("i3 = " + i3);

        // 기본형은 메서드를 정의할 수 없음
        // 기본형은 객체가 아니기 때문 -> wrapper를 통해
    }
}
