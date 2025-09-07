package exception.ex1;

public class NetworkServicev_2 {

    public void sendMessage(String data){
        String address="http://example.com";
        NetworkClientV1 client=new NetworkClientV1(address);
        client.initError(data);  // 추가

        String connectResult=client.connect();
        // 결과가 성공이 아님 -> 오류
        // 오류가 발생한 경우 오류 코드를 출력으로 남김
        // 오류가 발생한 경우 더 이상 발생하지 않도록 함
        if (isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : "+connectResult);
            return;
        }

        String sendResult=client.send(data);

        if (isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : "+sendResult);
            return;
        }

        client.disconnect();
        // 현재는 연결을 끊지 않고 새로운 연결만 계속 생김
        // 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않음
        // 외부 자원을 사용한 후에는 연결을 해제해서 외부 자원을 반드시 반납해야 함
    }

    private boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
