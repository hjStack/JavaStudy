package lang.Object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        UserV2 userV2=(UserV2) obj; // Obj타입이므로 다운캐스팅 해야 함
        return  id.equals(userV2.id);
    }
}
