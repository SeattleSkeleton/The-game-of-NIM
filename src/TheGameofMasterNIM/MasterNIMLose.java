package TheGameofMasterNIM;
public class MasterNIMLose implements Human {
    String name;
    boolean playerRequest = true; //If player wants to go first

    public MasterNIMLose() {
        name = "Amateur NIM"; //AI Name
    }


    public boolean wantsFirstPlay() {

        return playerRequest;      //returns if players wants first play

    }

    public int move(int coinsAmount) {  //Alternative movement options from Master NIM that allows him to lose.
        int coinTake = 0;


        if (coinsAmount == 12 || coinsAmount == 8 || coinsAmount == 4 || coinsAmount == 1) {
            coinTake = 1;
        }

        if (coinsAmount == 9 || coinsAmount == 5 || coinsAmount == 2) {
            coinTake = 2;
        }

        if (coinsAmount == 10 || coinsAmount == 6) {
            coinTake = 3;
        }

        return coinTake;

    }

    public String getName() {
        return name;
    }
}
