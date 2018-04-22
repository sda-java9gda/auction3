package MainProject;

import Auctions.AuctionsList;
import Auctions.Product;
import Controllers.LoginController;
import UserInterface.UserDatabase;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        State state = State.INIT;
        Scanner scanner = new Scanner(System.in);

        UserDatabase userDatabase = UserDatabase.getInstance();
        LoginController loginController = new LoginController();
        AuctionsList auctionsList = new AuctionsList();
        while (state != State.EXIT) {
            switch (state) {
                case INIT:
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
                            state = State.LOGGING;
                            break;

                        case ("0"):
                            state = State.EXIT;
                            break;

                        default: {
                            System.out.println("ZLA ODPOWIEDZ");
                            state = State.INIT;
                            break;
                        }
                    }
                    break;

                case REGISTRATION:
                    System.out.println("PODAJ LOGIN DO REJESTRACJI");
                    String login = scanner.nextLine();
                    System.out.println("PODAJ HASLO DO REJESTRACJI");
                    String password = scanner.nextLine();
                    userDatabase.addUser(login, password);
                    System.out.println("GRATULACJE, JESTES ZAREJESTROWANY");
                    state = State.INIT;
                    break;

                case LOGGING:
                    System.out.println("PODAJ LOGIN");
                    String login2 = scanner.nextLine();
                    System.out.println("PODAJ HASLO");
                    String password2 = scanner.nextLine();
                    if (loginController.isRegistered(login2, password2)==true) {
                        System.out.println("ZALOGOWALES SIE " + login2);
                        state = State.LOGGED;
                        break;
                    } else {
                        System.out.println("BLEDNY LOGIN LUB HASLO");
                        state = State.INIT;
                        break;
                    }

                case LOGGED:
                    System.out.println("PODAJ KOMENDE");
                    System.out.println("1 - WYSWIETL AUKCJE");
                    System.out.println("2 - DODAJ AUKCJE");
                    System.out.println("3 - USUN AUKCJE");
                    System.out.println("4 - WYJSCIE");
                    String answer2 = scanner.nextLine();

                    switch (answer2) {
                        case ("1"):
                            auctionsList.showAllAuctions();
                            System.out.println();
                            break;

                        case ("2"):
                            System.out.println("PODAJ NUMER OFERTY");
                            long ID = scanner.nextLong();
                            scanner.nextLine();
                            System.out.println("PODAJ NAZWE");
                            String nazwa = scanner.nextLine();
                            System.out.println("PODAJ OPIS");
                            String opis = scanner.nextLine();
                            System.out.println("PODAJ CENE");
                            int cena = scanner.nextInt();
                            auctionsList.addProduct(new Product(ID, nazwa, opis, cena));
                            scanner.nextLine();
                            break;

                        case ("3"):
                            System.out.println("PODAJ INDEKS AUKCJI DO USUNIECIA");
                            int index = scanner.nextInt();
                            auctionsList.removeProduct(index);
                            break;

                        case ("4"):
                            state = State.INIT;
                            break;

                        default: {
                            System.out.println("ZLA KOMENDA");
                            break;
                        }
                    }
                    break;

            }
        }
        scanner.close();

    }
}
