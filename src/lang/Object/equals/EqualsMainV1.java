package lang.Object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        userV1 user1=new userV1("id-100");
        userV1 user2=new userV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

        // 결과
        // identity = false
        // equality = false

        // equals : true가 되려면 오버라이딩 해야 함
        // Object는 equals라도 하더라도 동일성 비교를 기본으로 제공하기 때문에
        // equality도 false가 나오는것임

    }
}
