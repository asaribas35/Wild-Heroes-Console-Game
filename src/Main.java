import java.util.Scanner;



public class Main {
    public static void clearScreen() {
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome To Wild Heroes");
        System.out.print("Username : ");
        String userName = inp.nextLine();
        clearScreen();
        Player user = new Player(userName);
        user.selectChar();


        Game wh = new Game(user);

        clearScreen();
        wh.start();
        inp.close();


    }





}
