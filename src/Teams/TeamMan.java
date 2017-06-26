package Teams;

import Players.*;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class TeamMan {

    Random rand = new Random();

    MagMan magMan = new MagMan("Людина Маг");

    ArcherMan archerMan1 = new ArcherMan("Людина Арбалетник Перший");
    ArcherMan archerMan2 = new ArcherMan("Людина Арбалетник Другий");
    ArcherMan archerMan3 = new ArcherMan("Людина Арбалетник Третій");

    WarriorMan warriorMan1 = new WarriorMan("Людина Піхотинець Перший");
    WarriorMan warriorMan2 = new WarriorMan("Людина Піхотинець Другий");
    WarriorMan warriorMan3 = new WarriorMan("Людина Піхотинець Третій");
    WarriorMan warriorMan4 = new WarriorMan("Людина Піхотинець Четвертий");

    public Player actionMan(Player player1, Player player2){
        System.out.print(player1 + " проти " + player2 + ". ");
        player1.randomAct(player2);
        return player2;
    }

    public void randFighters(Player player){
        int random = rand.nextInt(8);
        if(random == 0 & magMan.dead() == false){
            if (magMan.randAct == 1){privilageFighters();}
            if (magMan.randAct == 0){ actionMan(magMan, player);}
            }
        if(random == 1 & archerMan1.dead() == false){ actionMan(archerMan1, player);}
        if(random == 2 & archerMan2.dead() == false){ actionMan(archerMan2, player);}
        if(random == 3 & archerMan3.dead() == false){ actionMan(archerMan3, player);}
        if(random == 4 & warriorMan1.dead() == false){ actionMan(warriorMan1, player);}
        if(random == 5 & warriorMan2.dead() == false){ actionMan(warriorMan2, player);}
        if(random == 6 & warriorMan3.dead() == false){ actionMan(warriorMan3, player);}
        if(random == 7 & warriorMan4.dead() == false){ actionMan(warriorMan4, player);}
    }

    public void privilageFighters(){
            int random = rand.nextInt(7);
            if(random == 0){ actionMan(magMan, archerMan1);}
            if(random == 1){ actionMan(magMan, archerMan2);}
            if(random == 2){ actionMan(magMan, archerMan3);}
            if(random == 3){ actionMan(magMan, warriorMan1);}
            if(random == 4){ actionMan(magMan, warriorMan2);}
            if(random == 5){ actionMan(magMan, warriorMan3);}
            if(random == 6){ actionMan(magMan, warriorMan4);}
    }

}
