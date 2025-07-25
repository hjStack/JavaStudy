package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {

        Address address1=new Address("서울");
        Address address2=new Address("서울");
        MemberV1 memberA=new MemberV1("회원A",address1);
        MemberV1 memberB=new MemberV1("회원 B",address2);

        // 회원 A, 회원 B
        System.out.println("member A =" +memberA);
        System.out.println("member B = " + memberB);

        memberB.getAddress().setValue("부산");

        System.out.println(memberA);
        System.out.println(memberB);

        // memberA와 memberB는 같은 주소를 공유하기 때문에
        // 두 회원 모두 주소가 부산으로 나옴 => 사이드 이펙트 발생

        // 같은 주소를 공유하지 않으면 되는거 아닝가유 ?
    }
}
