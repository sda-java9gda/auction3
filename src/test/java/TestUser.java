import UserInterface.UserDatabase;
import UserInterface.UserPersonalData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.verify;

public class TestUser {
    private UserDatabase userDatabase;

    @Before
    public void setUp() {
        userDatabase = new UserDatabase();
    }

    @Test
    public void addUserAddsLoginAsAKey() throws Exception {
        String login = "a";
        String password = "b";

        userDatabase.addUser(login, password);

        assertTrue(userDatabase.getUsersList().containsKey(login));

    }
    @Test
    public void userAddedCorrectlyTest() throws Exception{
        String login = "a";
        String password = "b";
//        jcjianjcoasn

        userDatabase.addUser(login, password);
        assertTrue(userDatabase.getUsersList().get(login).equals(new UserPersonalData(login, password)));
    }

}