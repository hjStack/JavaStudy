package lang.wrapper;

public class MyInterMethodMain0 {
    public static void main(String[] args) {
        int value=10;

        int i1=compareTo(10,5);
        int i2=compareTo(10,10);
        int i3=compareTo(10,20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int value,int target){
        if(value < target){
            return -1;
        }
        else if(value > target){
            return 1;
        }
        else{
            return 0;
        }
    }

    // 기본형 데이터를 wrap

}
