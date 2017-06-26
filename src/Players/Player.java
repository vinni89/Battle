package Players;

/**
 * Created by А д м и н on 21.06.2017.
 */
public abstract class Player {

    public String name;
    public int energy = 100;
    public int damageOne;
    public int damageTwo;
    public boolean privilege = false;

    public abstract Player firstAct(Player player);

    public abstract Player secondAct(Player player);

    public abstract Player randomAct(Player player);

    public boolean dead(){
        if (energy < 1) {
            return true;
        } else {
            return false;
        }
    }
}
