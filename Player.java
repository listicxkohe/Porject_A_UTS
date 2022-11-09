import java.util.Random;

public class Player {
    private boolean alive;
    private String playerName;

    public Player(String thisPlayerName){
        alive = true;
        playerName = thisPlayerName;
    }



    //combat module, takes in boss object and modifier
    public void fight(Boss thisBoss, int mod){

        int rng;
        Random rand = new Random();

        rng = rand.nextInt(10); //generates random number + modifier
        rng += mod;
        System.out.println("|||rng: " + rng + " vs bosshit: " + thisBoss.getHitChance());

        if(rng < thisBoss.getHitChance()){ //if rng less than equals to bosses hitchance, player dies
            alive = false;
        }
        else if(rng > thisBoss.getHitChance()){ //if rng greater than bosses hitchance, boss dies
            thisBoss.setIsAlive(false);
        }
    }


    //accessors
    public boolean getIsAlive(){
        return alive;
    }

    public String getPlayerName(){
        return playerName;
    }


    //mutators
    public void setIsAlive(boolean thisAlive){
        alive = thisAlive;
    }

    public void setPlayerName(String thisPlayerName){
        playerName = thisPlayerName;
    }


}
