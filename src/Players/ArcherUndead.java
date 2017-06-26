package Players;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class ArcherUndead extends Player{

    private String name;
    private int energy;
    private int damageOne;
    private int damageTwo;
    private boolean privilege;
    Random rand = new Random();
    public int randAct  = rand.nextInt(2);;

    public ArcherUndead(String name) {
        this.name = name;
        energy = 100;
        privilege = false;
        damageOne = 4;
        damageTwo = 2;
        if (privilege == true) damageOne *= 2; damageTwo *= 2;
    }

    @Override
    public Player firstAct(Player player) {
        System.out.print("Постріл з лука. ");
        player.energy = player.energy - damageOne;
        if (player.dead() == true){
            System.out.println(name + " забрав у суперника " + damageOne + "hp, і вбив його");
            player = null;
        } else {
            System.out.println(name + " забрав у суперника " + damageOne + "hp, і тепер в нього залишилось " +
                    player.energy + "hp");
        }
        return player;
    }

    @Override
    public Player secondAct(Player player) {
        System.out.print("Атака. ");
        player.energy = player.energy - damageTwo;
        if (player.dead() == true){
            System.out.println(name + " забрав у " + player.name + " " + damageTwo + "hp, і вбив його");
            player = null;
        } else {
            System.out.println(name + " забрав у " + player.name + " " + damageTwo + "hp, і тепер в нього залишилось " +
                    player.energy + "hp");
        }
        return player;
    }

    @Override
    public Player randomAct(Player player) {

        if (randAct == 1) {
            firstAct(player);
        } else {
            secondAct(player);
        }
        return player;
    }

    @Override
    public String toString() {
        return name;
    }

}
