package Teams;

import Players.*;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class TeamElf {

    Random rand = new Random();

    MagElf magElf = new MagElf("Ельф Маг");

    ArcherElf archerElf1 = new ArcherElf("Ельф Лучник Перший");
    ArcherElf archerElf2 = new ArcherElf("Ельф Лучник Другий");
    ArcherElf archerElf3 = new ArcherElf("Ельф Лучник Третій");

    WarriorElf warriorElf1 = new WarriorElf("Ельф Піхотинець Перший");
    WarriorElf warriorElf2 = new WarriorElf("Ельф Піхотинець Другий");
    WarriorElf warriorElf3 = new WarriorElf("Ельф Піхотинець Третій");
    WarriorElf warriorElf4 = new WarriorElf("Ельф Піхотинець Четвертий");

    public Player actionElf(Player player1, Player player2){
        System.out.print(player1 + " проти " + player2 + ". ");
        player1.randomAct(player2);
        return player2;
    }

    public void randFighters(Player player){
        int random = rand.nextInt(8);
        if(random == 0 & magElf.dead() == false){
            if (magElf.randAct == 1){privilageFighters();}
            if (magElf.randAct == 0){ actionElf(magElf, player);}
        }
        if(random == 1 & archerElf1.dead() == false){ actionElf(archerElf1, player);}
        if(random == 2 & archerElf2.dead() == false){ actionElf(archerElf2, player);}
        if(random == 3 & archerElf3.dead() == false){ actionElf(archerElf3, player);}
        if(random == 4 & warriorElf1.dead() == false){ actionElf(warriorElf1, player);}
        if(random == 5 & warriorElf2.dead() == false){ actionElf(warriorElf2, player);}
        if(random == 6 & warriorElf3.dead() == false){ actionElf(warriorElf3, player);}
        if(random == 7 & warriorElf4.dead() == false){ actionElf(warriorElf4, player);}
    }

    public void privilageFighters(){
        int random = rand.nextInt(7);
        if(random == 0){ actionElf(magElf, archerElf1);}
        if(random == 1){ actionElf(magElf, archerElf2);}
        if(random == 2){ actionElf(magElf, archerElf3);}
        if(random == 3){ actionElf(magElf, warriorElf1);}
        if(random == 4){ actionElf(magElf, warriorElf2);}
        if(random == 5){ actionElf(magElf, warriorElf3);}
        if(random == 6){ actionElf(magElf, warriorElf4);}
    }
}
