package TheGameofMasterNIM;
import javax.swing.JOptionPane;


public class Player implements Human {

    String name;                //name of player
    boolean playerRequest = false;    //player doesn't have first move
    static int humanCount = 0;          //amount of human players

    //Constructs human player
    public Player() {
        //asks user what is this player's name?
        String alias = JOptionPane.showInputDialog("What is this player's " //Simple dialogue box pop-up
                + "name?");
        //ask the user if he/she wants this human player to play first & what

        //(only asks once)
        if (humanCount == 0) {
            //will this player play first?
            String input1 = JOptionPane.showInputDialog("Do you want to go first? (As Human) ");

            if (input1.equalsIgnoreCase("y")) {

                playerRequest = true;

            }





        }
        name = alias;     //name is what the human player enters
        //as his/her name when prompted

        humanCount++;           //increments amount of human players

    }


    @Override
    public int move(int coinsAmount) {

        int take;

        String input;

        boolean invalidTake;
        //prompts the user for how many coins to take from pile
        //user then enters his/her desired amount
        input = JOptionPane.showInputDialog("Enter the amount of"
                + " coins you wish to take " + this.getName() + "!");

        take = Integer.parseInt(input); //Player input

        invalidTake = (take > 3);
        //if user requests to take an invalid number of coins...
        if (invalidTake) {

            do {
                //notify user of invalid input and prompt for another selection
                input = JOptionPane.showInputDialog("Sorry, that is not a valid move!");

                take = Integer.parseInt(input);

                invalidTake = (take > 3 || take < 1);

            } while (invalidTake);      //repeat while coin take is invalid
        }

        return take;                //returns how many coins player takes

    }


    @Override
    public boolean wantsFirstPlay() {

        return playerRequest;      //returns if players wants first play

    }


    @Override
    public String getName() {

        return name;                        //returns name of player

    }


    public static void resetHumanCount() {

        humanCount = 0;                         //resets the amount of humans playing
        //players to zero

    }



}
