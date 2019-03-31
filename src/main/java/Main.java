import encryption.EncryptDecrypt;
import encryption.ROT13;
import encryption.ROT18;
import usersInfo.Adress;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<User> lista = new ArrayList<>();
    public static char[] paswd;
    private static User tempUser;

    /* public static void main2(String[] args) {
     *//* System.out.println("Hello");
        Arrays.stream(args).forEach(System.out::println);
        run();*//*
        String userName = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter User Name");
        userName = scan.nextLine();
        System.out.println("Hello: " + userName);
        try {
            int digit = scan.nextInt();
            System.out.println("Digit: " + digit);
        } catch (InputMismatchException e) {
            System.out.println("Wrong data format - expected number. ");
            scan.next();
            int digit2 = scan.nextInt();
            System.out.println("Digit: " + digit2);
        }
    }*/


    public static void main(String[] args) throws IOException {

        lista.add(new User("Mariusz", "Mierzwiński", new Adress(), "Ghandi".toCharArray()));
        lista.add(new User("Miś    ", "Uszatek", new Adress(), "Miodek".toCharArray()));
        lista.add(new User("Miś2   ", "Kolargol", new Adress(), "Miodek2".toCharArray()));

        System.out.println("dsaddsa");
        Runtime.getRuntime().exec("clear");
        String userName2 = "";
        char[] passwd;
        if (args.length != 2) {

            menu1();

        } else if (args.length == 2) {
            userName2 = args[0];
            passwd = args[1].toCharArray();
        }
        Boolean isClosed = false;

        while (!isClosed) {
            Runtime.getRuntime().exec("clear");
            Scanner scan = new Scanner(System.in);
            System.out.println("Hello " + userName2);
            System.out.println("=========================================");
            System.out.println("|| This is manu:                       ||\n" +
                    "||  1.Lista Userów i Haseł             ||\n" +
                    "||  2.Adres Usera                      ||\n" +
                    "||  3.Exit                             ||\n" +
                    "=========================================");
            int digit = scan.nextInt();
            switch (digit) {
                case 1:
                    lista.stream().forEach(x -> System.out.println("Uzytkownik :" + x.getName() + " pasw " + (new String(x.getPaswd()))));
                    break;
                case 2:
                    String adressTemp=lista.get(lista.indexOf(tempUser)).getAdres().toString();
                    System.out.println(adressTemp);
                    break;
                case 3:
                    isClosed = true;
                    break;
            }

        }
    }

    private static void menu1() {
        System.out.println("Zła ilość parametrów podaj użytkownika");
        System.out.println(" i podaj hasło ");
        System.out.println("====================");
        Boolean isClosed = true;
        tempUser=new User(new Scanner(System.in).nextLine(), getPaswd());
        System.out.println("Podaj Użytkownika");
        while (isClosed) {
            if (lista.contains(tempUser)) {
                System.out.println("Welcome");
                isClosed = false;
            } else {
                System.out.println("Wrong User  or  Pasword");
            }
        }
       /* while (!isClosed) {
            Scanner scan = new Scanner(System.in);
            int i = 0;
            for (User user : lista) {
                System.out.println("|| " + (i++) + " " + user.getName() + " ||");
            }
            System.out.println("====================");
            int digit = scan.nextInt();
            switch (digit) {
                case 0:

                    if (checkPaswd(0)) {
                        System.out.println("Welcome: " + lista.get(0).getName());
                    }
                    break;
                case 1:
                    isClosed = true;
                    break;
                case 2:
                    isClosed = true;
                    break;
            }
        }*/
    }

    public void run() {

    }

    public static boolean checkPaswd(int i) {
        return (new String(lista.get(i).getPaswd()).equals(new String(getPaswd())));

    }

    public static char[] getPaswd() {
        Console console = System.console();
        return paswd = console.readPassword("Enter Pasword");
    }

    private static void run2() {
        List<EncryptDecrypt> list = new ArrayList<>();
        EncryptDecrypt root13 = new ROT13();
        EncryptDecrypt root18 = new ROT18();
        list.add(root13);
        list.add(root18);
        for (EncryptDecrypt encryptorDescryptor : list) {
            System.out.println();

        }
    }
}