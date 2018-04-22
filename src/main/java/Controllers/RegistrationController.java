package Controllers;

import Dataworkspace.UserDatabase;

import java.io.IOException;


public class RegistrationController {


    UserDatabase userDatabase = UserDatabase.getInstance();

    public boolean isRegistered (String login, String password){
        if (UserDatabase.getInstance().getUsersList().containsKey(login) && UserDatabase.getInstance().getUsersList().get(login).getPassword().equals(password)){
            return true;
        }
        return false;
    }


    public boolean addUser (String login, String password){
        try {
            userDatabase.addUser(login,password);
            return true;
        } catch (IOException e) {
            return false;
        }
    }




}
