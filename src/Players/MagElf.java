package Players;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class MagElf extends Player{

    private String name;
    private int energy;
    private int damageOne;
    private boolean privilege;
    Random rand = new Random();
    public int randAct = rand.nextInt(2);

    public MagElf(String name) {
        this.name = name;
        energy = 100;
        privilege = false;
        damageOne = 10;
        if (privilege == true) damageOne *= 2;
    }

    @Override
    public Player firstAct(Player player) {
        System.out.print("Накладання покращення на персонажа своєї команди. ");
        player.privilege = true;
        System.out.println(name + " додав персонажа в привілейовану групу");
        return player;
    }

    @Override
    public Player secondAct(Player player) {
        System.out.print("Нанесення удару персонажу противника магією. ");
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
