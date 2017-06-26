package Players;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class MagOrc extends Player{

    private String name;
    private int energy;
    private boolean privilege;
    Random rand = new Random();
    public int randAct = rand.nextInt(2);

    public MagOrc(String name) {
        this.name = name;
        energy = 100;
        privilege = false;
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
        System.out.print("Накладання прокляття на суперника. ");
        player.privilege = false;
        System.out.println(name + " вибив суперника з привілейованої групи");
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
