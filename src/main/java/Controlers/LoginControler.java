package Controlers;

import UserInterface.UserDatabase;



public class LoginControler {


    public boolean isRegistered (String login, String password){
        if (UserDatabase.getInstance().getUsersList().containsKey(login) && UserDatabase.getInstance().getUsersList().get(login).getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
