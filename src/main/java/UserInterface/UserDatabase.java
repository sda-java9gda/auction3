package UserInterface;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {


    private static UserDatabase Instance;
    private Map<String, UserPersonalData> usersList = new HashMap<>();

    public UserDatabase() {
    }

    public static UserDatabase getInstance() {
        if (Instance == null){
            Instance = new UserDatabase();
        }
        return Instance;
    }



    public void addUser(String login, String password) {
        usersList.put(login, new UserPersonalData(login, password));
    }

    public Map<String, UserPersonalData> getUsersList() {
        return usersList;
    }
}
