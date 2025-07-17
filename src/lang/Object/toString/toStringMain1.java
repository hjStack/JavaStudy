package lang.Object.toString;

public class toStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();

        String string=object.toString();

        System.out.println(string);
        System.out.println(object);

        // 결과값
        // java.lang.Object@2a84aee7
        // java.lang.Object@2a84aee7

        // cf) 해시 : 객체의 참조값
    }
}
