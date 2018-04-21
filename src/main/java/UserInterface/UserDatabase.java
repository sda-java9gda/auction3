package UserInterface;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {

    private Map <String, UserPersonalData> usersList = new HashMap<>();

    public UserDatabase() {
        this.usersList = usersList;
    }

    public void addUser (String login, String password){
        usersList.put(login,new UserPersonalData(login,password));
    }


}
