package TheGameofMasterNIM;


public class MasterNIM implements Human {

    String name;                //name of player
    boolean playerRequest = true;    //If player wants to go first


    public MasterNIM() {

        name = "Master Nim"; //AI Name
    }

    @Override
    public int move(int coinsAmount) { //Movement options for Master NIM. This represents the pattern in which NIM wins



        int coinTake = 0;

        if (coinsAmount == 11 || coinsAmount == 7 || coinsAmount == 3) {
            coinTake = 3;
        }


        if (coinsAmount == 10 || coinsAmount == 6 || coinsAmount == 2) {
            coinTake = 2;
        }


        if (coinsAmount == 9 || coinsAmount == 5 || coinsAmount == 1) {
            coinTake = 1;
        }

        if (coinsAmount == 12) {
            coinTake = 0;
        }








        return coinTake;



        }













    @Override
    public boolean wantsFirstPlay() {

        return playerRequest;      //returns if players wants first play

    }


    @Override
    public String getName() {

        return name;   //returns name of player

    }
}
