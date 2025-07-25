package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger=Integer.valueOf(10);  // 대신에 valueOf()
        Integer integerObj=Integer.valueOf(10);  // -128 ~ -127 자주 사용하는 값 재사용
        Long longObj=Long.valueOf(100);
        Double doubleObj=Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // 내부 값 읽기
        System.out.println("내부 값 읽기");
        int intValue=integerObj.intValue();
        // intValue : 내부값을 읽는것
        // 기본형의 값을 꺼내오는것 -> unboxing
        System.out.println(intValue);
        long longValue=longObj.longValue();

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));  // 문자열 풀
        System.out.println("equals : " + (newInteger.equals(integerObj)));
    }
}
