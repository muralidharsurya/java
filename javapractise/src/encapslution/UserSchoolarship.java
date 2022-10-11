package encapslution;
class Schoolarship{
    private String appid;
    private long sscno;
    // setter appid
    public void setAppid(String appid){
        this.appid=appid;
    }
    // getter---->verification
    public String getAppid(){
        if (appid=="ts24928")
            return "id is verified";
        else
            return "id is not valid";
    }
    // setter sscno
    public void setSscno(long sscno){
        this.sscno=sscno;
    }
    // getter--->verification
    public long getSscno(){
        if (sscno==1203585938)
            return 1;
        else
            return 0;
    }

}
public class UserSchoolarship {
    public static void main(String[] args) {
        Schoolarship sp=new Schoolarship();
        sp.setAppid("TS556765");
        sp.setSscno(456567578);
        String appid_ad =sp.getAppid();
        long  sscno_sn= sp.getSscno();
        System.out.println(appid_ad);
        System.out.println(sscno_sn);


    }

}
