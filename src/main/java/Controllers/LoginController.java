package Controllers;

import UserInterface.UserDatabase;



public class LoginController {


    public boolean isRegistered (String login, String password){
        if (UserDatabase.getInstance().getUsersList().containsKey(login) && UserDatabase.getInstance().getUsersList().get(login).getPassword().equals(password)){
            return true;
        }
        return false;
    }




}
