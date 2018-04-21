package MainProject;

import Auctions.AuctionsList;
import Auctions.Product;
import Controlers.LoginControler;
import UserInterface.UserDatabase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        State state = State.INIT;
        Scanner scanner = new Scanner(System.in);

        UserDatabase userDatabase = new UserDatabase();
        LoginControler loginControler = new LoginControler();
        AuctionsList auctionsList = new AuctionsList();
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
                            state = State.LOGGING;
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
                    System.out.println("PODAJ LOGIN DOREJESTRACJI");
                    String login = scanner.nextLine();
                    System.out.println("PODAJ HASLO DO REJESTRACJI");
                    String password = scanner.nextLine();
                    userDatabase.addUser(login, password);
                    state = State.INIT;
                    break;
                }
                case LOGGING: {
                    System.out.println("PODAJ LOGIN");
                    String login = scanner.nextLine();
                    System.out.println("PODAJ HASLO");
                    String password = scanner.nextLine();
                    if (loginControler.isRegistered(login,password)){
                        state = State.LOGGED;
                    }else {
                        System.out.println("BLEDNY LOGIN LUB HASLO");
                        state = State.INIT;
                    }
                }
                case LOGGED: {
                    System.out.println("PODAJ KOMENDE");
                    System.out.println("1 - WYSWIETL AUKCJE");
                    System.out.println("2 - DODAJ AUKCJE");
                    System.out.println("3 - LICYTUJ");
                    System.out.println("4 - WYJSCIE");
                    String answer = scanner.nextLine();

                    switch (answer) {
                        case ("1"): {
                            auctionsList.showAllAuctions();
                            break;
                        }
                        case ("2"): {
                            System.out.println("PODAJ NUMER OFERTY");
                            long ID = scanner.nextLong();
                            scanner.nextLine();
                            System.out.println("PODAJ NAZWE");
                            String nazwa = scanner.nextLine();
                            System.out.println("PODAJ OPIS");
                            String opis = scanner.nextLine();
                            System.out.println("PODAJ CENE");
                            double cena = scanner.nextDouble();
                            auctionsList.addProduct(new Product(ID,nazwa,opis,cena));
                            break;
                        }
                        case ("3"): {

                            break;
                        }
                        case ("4"):{
                            state = State.INIT;
                        }
                        default: {
                            System.out.println("ZLA KOMENDA");
                            state = State.LOGGED;
                        }
                    }
                    break;
                }
            }
        }
        scanner.close();

    }
}
