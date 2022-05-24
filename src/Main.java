import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome To Wild Heroes");
        System.out.print("Username : ");
        String userName = inp.nextLine();
        Player user = new Player(userName);
        user.selectChar();


        Game wh = new Game(user);

        wh.start();
        inp.close();


    }




}