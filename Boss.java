import java.util.Random;


public class Boss {
    private int HitChance = 0;
    private boolean alive;
    private Random rand = new Random();

    public Boss(){
        HitChance = rand.nextInt(10);
    }


    //random encounter generator
    public String encounter(int num){
        switch (num){
        case 1:
            return "a small floating cat with a pink vibrant aura appears infront of you";
        case 2:
            return "A faint bubble gum smell fills the room, u look around to see a mush of bubblegum stuck on the cieling, it has sleepy eyes and a smile.";
        case 3:
            return "You should have never came here, says a creature of the dark and sprungs at you";
        case 4:
            return "3 bananas walk towards you the bananas have legs, hands, armor and swords";
        case 5:
            return "U hear heartbeats, coming closer to you, out of the dark comes out a brigt red heart shaped person with a sword";
        default:
            return "";
        }
        
    }


    //accessors
    public boolean getIsAlive(){
        return alive;
    }

    public int getHitChance(){
        return HitChance;
    }

    //mutators

    public void setIsAlive(boolean thisAlive){
        alive = thisAlive;
    }

    public void setHitChance(int thisHitChance){
        HitChance = thisHitChance;
    }

}
