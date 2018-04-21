package MainProject;

import UserInterface.UserDatabase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        State state = State.INIT;
        Scanner scanner = new Scanner(System.in);

        UserDatabase userDatabase = new UserDatabase();
        while (state != State.EXIT) {
            switch (state) {
                case INIT: {
                    System.out.println("CZESC, WYBIERZ CO CHCESZ ZROBIC");
                    System.out.println("1 - ZAREJESTRUJ SIE");
                    System.out.println("2 - ZALOGUJ SIE");
                    System.out.println("0 - WYJSCIE");

                    String answer = scanner.nextLine();

                    switch (answer) {
                        case ("1"):
                            state = State.REGISTRATION;
                            break;

                        case ("2"):
                            state = State.LOGGED;
                            break;

                        case ("0"):
                            state = State.EXIT;
                            break;

                        default:
                            System.out.println("ZLA ODPOWIEDZ");
                            state = State.INIT;
                            break;
                    }
                    break;
                }
                case REGISTRATION: {
                    System.out.println("PODAJ LOGIN");
                    String login = scanner.nextLine();
                    System.out.println("PODAJ HASLO");
                    String password = scanner.nextLine();
                    userDatabase.addUser(login, password);
                    state = State.INIT;
                    break;
                }
                case LOGGED: {
                    System.out.println("PODAJ KOMENDE");
                    System.out.println("1 - WYSWIETL AUKCJE");
                    System.out.println("2 - DODAJ AUKCJE");
                    System.out.println("3 - LICYTUJ");
                    String answer = scanner.nextLine();

                    switch (answer){
                        case ("1"):{


                            break;
                        }
                    }
                    break;
                }
            }
        }


    }
}
