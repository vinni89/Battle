package Teams;

import Players.ArcherOrc;
import Players.MagOrc;
import Players.Player;
import Players.WarriorOrc;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class TeamOrc {

    Random rand = new Random();

    MagOrc magOrc = new MagOrc("Орк Шаман");

    ArcherOrc archerOrc1 = new ArcherOrc("Орк Лучник Перший");
    ArcherOrc archerOrc2 = new ArcherOrc("Орк Лучник Другий");
    ArcherOrc archerOrc3 = new ArcherOrc("Орк Лучник Третій");

    WarriorOrc warriorOrc1 = new WarriorOrc("Орк Гоблін Перший");
    WarriorOrc warriorOrc2 = new WarriorOrc("Орк Гоблін Другий");
    WarriorOrc warriorOrc3 = new WarriorOrc("Орк Гоблін Третій");
    WarriorOrc warriorOrc4 = new WarriorOrc("Орк Гоблін Четвертий");

    public Player actionOrc(Player player1, Player player2){
        System.out.print(player1 + " проти " + player2 + ". ");
        player1.randomAct(player2);
        return player2;
    }

    public void randFighters(Player player){
        int random = rand.nextInt(8);
        if(random == 0 & magOrc.dead() == false){
            if (magOrc.randAct == 1){privilageFighters();}
            if (magOrc.randAct == 0){ actionOrc(magOrc, player);}
        }
        if(random == 1 & archerOrc1.dead() == false){ actionOrc(archerOrc1, player);}
        if(random == 2 & archerOrc2.dead() == false){ actionOrc(archerOrc2, player);}
        if(random == 3 & archerOrc3.dead() == false){ actionOrc(archerOrc3, player);}
        if(random == 4 & warriorOrc1.dead() == false){ actionOrc(warriorOrc1, player);}
        if(random == 5 & warriorOrc2.dead() == false){ actionOrc(warriorOrc2, player);}
        if(random == 6 & warriorOrc3.dead() == false){ actionOrc(warriorOrc3, player);}
        if(random == 7 & warriorOrc4.dead() == false){ actionOrc(warriorOrc4, player);}
    }

    public void privilageFighters(){
        int random = rand.nextInt(7);
        if(random == 0){ actionOrc(magOrc, archerOrc1);}
        if(random == 1){ actionOrc(magOrc, archerOrc2);}
        if(random == 2){ actionOrc(magOrc, archerOrc3);}
        if(random == 3){ actionOrc(magOrc, warriorOrc1);}
        if(random == 4){ actionOrc(magOrc, warriorOrc2);}
        if(random == 5){ actionOrc(magOrc, warriorOrc3);}
        if(random == 6){ actionOrc(magOrc, warriorOrc4);}
    }
}
