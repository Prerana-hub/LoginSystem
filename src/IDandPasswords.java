import java.util.HashMap;

public class IDandPasswords {
//Hashmaps store key-value pairs, here Key is the username, value is the password.
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Bro","pizza");
        logininfo.put("Bujji", "cutubujji");
        logininfo.put("Perugannam","Abc123");
    }
   protected HashMap getLoginInfo(){
        return logininfo;
    }
}
