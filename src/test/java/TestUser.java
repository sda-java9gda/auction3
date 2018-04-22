import UserInterface.UserDatabase;
import UserInterface.UserPersonalData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.verify;

public class TestUser {
    private UserDatabase userDatabase;

    @Before
    public void setUp() {
        userDatabase = new UserDatabase();
    }

    @Test
<<<<<<< HEAD
    public void addUserAddsLoginAsAKey() throws IOException {
=======
    public void addUserAddsLoginAsAKey() throws Exception {
>>>>>>> 7cd717399809d4bd528ae8d7760fe18c8d78899d
        String login = "a";
        String password = "b";

        userDatabase.addUser(login, password);

        assertTrue(userDatabase.getUsersList().containsKey(login));

    }
    @Test
<<<<<<< HEAD
    public void userAddedCorrectlyTest() throws IOException {
=======
    public void userAddedCorrectlyTest() throws Exception{
>>>>>>> 7cd717399809d4bd528ae8d7760fe18c8d78899d
        String login = "a";
        String password = "b";
//        jcjianjcoasn

        userDatabase.addUser(login, password);
        assertTrue(userDatabase.getUsersList().get(login).equals(new UserPersonalData(login, password)));
    }

}