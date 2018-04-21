package Controlers;

import UserInterface.UserDatabase;

public class LoginControler {
    UserDatabase userDatabase = new UserDatabase();

    public boolean isRegistered (String login, String password){
        if (userDatabase.getUsersList().containsKey(login) && userDatabase.getUsersList().get(login).getPassword().equals(password)){
            return true;
        }
        else {
            return false;
        }
    }
}
