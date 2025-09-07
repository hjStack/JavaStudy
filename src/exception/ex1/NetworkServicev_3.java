package exception.ex1;

public class NetworkServicev_3 {

    public void sendMessage(String data){
        String address="http://example.com";
        NetworkClientV1 client=new NetworkClientV1(address);
        client.initError(data);  // 추가

        String connectResult=client.connect();

        if (isError(connectResult)){   // 오류가 발생하면
            System.out.println("[네트워크 오류 발생] 오류 코드 : "+connectResult);
        }

        else {  // 오류가 발생하지 않으면
            String sendResult=client.send(data);
            if (isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드 : "+sendResult);
            }
        }
        client.disconnect();
    }

    private boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
