import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Credentials {

    HashMap<String, String> map = new HashMap<>();
    HashMap<String, List<String>> mapP = new HashMap<String, List<String>>();

    public void add(String username, String password) {

        if(!map.containsKey(username)){
            map.put(username, password);
            List<String> temp = new ArrayList<>();
            temp.add(password);
            mapP.put(username, temp);
            System.out.println("ENROLL success");
        }
        else{
            System.out.println("ENROLL fail");
        }

    }
    public void auth(String username, String password) {

        for (String key:map.keySet()) {
            if(key.equals(username)){
                String value = map.get(key);
                if(value.equals(password)){

                    System.out.println("AUTH success");
                }
                else{
                    System.out.println("AUTH fail");
                }
            }
        }

    }
    public void chpass(String username, String password, String newPassword) {


        map.forEach((key, value) ->{
            if(key.equals(username)){
                if(value.equals(password)){
                    List<String> temp = mapP.get(username);
                    if(temp.contains(newPassword)){
                        System.out.println("CHPASS fail");
                        //System.out.println("old password was already used");
                    }
                    else{
                        map.put(username, newPassword);
                        temp.add(newPassword);
                        mapP.put(username, temp);
                        System.out.println("CHPASS success");
                    }
                }
                else{
                    System.out.println("CHPASS fail");
                   // System.out.println(value);
                }

            }
        });
    }
}
