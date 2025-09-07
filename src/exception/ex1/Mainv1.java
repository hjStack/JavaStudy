package exception.ex1;


import java.util.Scanner;

public class Mainv1 {
    public static void main(String[] args) {
//        NetworkServicev_1 networkService = new NetworkServicev_1();
//        NetworkServicev_2 networkService = new NetworkServicev_2();
        NetworkServicev_3 networkService = new NetworkServicev_3();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자 :");
            String input=scanner.nextLine();

            if (input.equals("exit")){
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");
    }
}
