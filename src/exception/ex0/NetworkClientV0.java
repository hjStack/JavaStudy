package exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect(){
        System.out.println(address + "서버 연결 성공");
        return "success";
    }

    public String send(String data){
        // 연결한 외부 서버에 데이터를 전송함
        System.out.println(address + "서버에 데이터 전송 " + data);
        return "success";
    }

    public void disconnect(){
        // 외부 서버와 연결을 해제함
        System.out.println(address + "서버 연결 해제");
    }
}
