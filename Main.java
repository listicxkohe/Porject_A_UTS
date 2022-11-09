import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String playerName;
        int playerDecision;
        int helper = 0;



        Boss b1,b2,b3;
        Player p1;
        
        System.out.println("Enter your name");
        playerName = scan.nextLine();
        p1 =  new Player(playerName);
        b1 = new Boss();

        for(int i = 1; i != 2; helper++){
            p1.setIsAlive(true);

            System.out.println("-------------------------------------------------");
            System.out.println("You wake up inside a dark room, the ground feels metal and shaking, you hear the sound of train engine, and wheels grinding on metal.");
            System.out.println("In the corner of this room u notices to glowing white eyes glaring at you, before anything the beast jumps on you");
            System.out.println(">> what do you do? move?(1) or put ur fist out to punch?(2) <<");
            playerDecision = scan.nextInt();

            //first encounter
            if(playerDecision == 1){
                p1.fight(b1,2+helper);
            }else{
                p1.fight(b1,0+helper);
            }

            if(p1.getIsAlive()){
                System.out.println("You survived and run to the next room");
            }else if(!p1.getIsAlive()){
                System.out.println("You are dead");
                System.out.println("Retry?(1) or (2) to quit");
                playerDecision = scan.nextInt();
                i = playerDecision;
            }

            //second encounter
            if(p1.getIsAlive()){
                b2 = new Boss();

                System.out.println("-------------------------------------------------");
                System.out.println("you find another beast");
                System.out.println("what do you do? run past?(1) or attack(2)");
                playerDecision = scan.nextInt();


                if(playerDecision == 1){
                    p1.fight(b2,2+helper);
                }else{
                    p1.fight(b2,-2+helper);
                }

                if(p1.getIsAlive()){
                    System.out.println("You survived and run to the next room");
                }else{
                    System.out.println("WASTED");
                    System.out.println("Retry?(1) or (2) to quit");
                    playerDecision = scan.nextInt();
                    i = playerDecision;
                }
            }


            //third encounter
            if(p1.getIsAlive()){
                b3 = new Boss();

                System.out.println("-------------------------------------------------");
                System.out.println("a big wall of flesh stands infront of you");
                System.out.println("what do you do? giveup?(1) or be brave and start punching it(2)");
                playerDecision = scan.nextInt();


                if(playerDecision == 1){
                    p1.fight(b3,-10+helper);
                }else{
                    p1.fight(b3,-3+helper);
                }

                if(p1.getIsAlive()){
                    System.out.println("you are alive barely");
                }else{
                    System.out.println("YOU DIED");
                    System.out.println("Retry?(1) or (2) to quit");
                    playerDecision = scan.nextInt();
                    i = playerDecision;
                }
            }


            
            if(p1.getIsAlive()){
                System.out.println("you have made it to the end!");
                i=2;
            }

        }

    }


}
