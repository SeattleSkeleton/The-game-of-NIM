package TheGameofMasterNIM;
import javax.swing.*;

//The Game of NIM: Designed by Matthew Ryan with a little help from:

//Jaiden Felizardo
//Carmen Figueroa
// Richard (Alex) Lukens

//Resources: GitHub for certain parts AI design and player movements

public class MainNIM {



    public static void main(String[] args) {

        String input;
        System.out.println("Welcome to The Game of NIM!!! Take 1 - 3 coins and try to get the last one to win!!");

        do {
            Player.resetHumanCount();
            Human player = new Player();

            Coins coins = new Coins();

            NIMgame game = new NIMgame(player, getRequest(), coins);

            game.play();

            input = JOptionPane.showInputDialog("Play again? ('N' to exit)");

        }
        while (input.equalsIgnoreCase("y")); {

        }


    }

    private static Human getRequest() {

        Human playerRequest;

        String input2 = JOptionPane.showInputDialog("Human (H), MasterNIM (C), AmateurNIM (A)?");

        if (input2.equalsIgnoreCase("C")) {

            playerRequest = new MasterNIM();

        }
        else if (input2.equalsIgnoreCase("A")) {
            playerRequest = new MasterNIMLose();
        }

        else {

            playerRequest = new Player();

        }


        return playerRequest;

    }


}