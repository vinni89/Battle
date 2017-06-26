package Players;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class WarriorOrc extends Player{

    private String name;
    private int energy;
    private int damageOne;
    private boolean privilege;
    Random rand = new Random();

    public WarriorOrc(String name) {
        this.name = name;
        energy = 100;
        privilege = false;
        damageOne = 20;
        if (privilege == true) damageOne *= 2;
    }

    @Override
    public Player firstAct(Player player) {
        System.out.print("Атака дубіною. ");
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
        return null;
    }

    @Override
    public Player randomAct(Player player) {
        firstAct(player);
        return player;
    }

    @Override
    public String toString() {
        return name;
    }

}
