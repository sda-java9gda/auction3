package UserInterface;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserDatabase {

    private Map <String, UserPersonalData> usersList = new HashMap<>();

    String fileName = "Baza użytkowników.txt";
    File fileUserDataBase = new File(fileName);


    public UserDatabase() {
        this.usersList = usersList;
    }

    public void addUser (String login, String password) throws IOException {



        usersList.put(login,new UserPersonalData(login,password));

        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        bufferedWriter.write(String.valueOf(usersList.get(login)));
        bufferedWriter.newLine();
        bufferedWriter.close();


    }

    public Map<String, UserPersonalData> getUsersList() {
        return usersList;
    }

}
