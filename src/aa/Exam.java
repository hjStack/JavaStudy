package 정처기;

public class Exam {
    public static void main(String[] args) {
        int v[]={1,2,3,4,5,6,7,8,9};
        NaturalNumber num=new NaturalNumber();
        System.out.println(num.add(v,true) + ", " + num.add(v,false));
    }
}
