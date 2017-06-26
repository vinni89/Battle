package Teams;

import Players.*;

import java.util.Random;

/**
 * Created by А д м и н on 21.06.2017.
 */
public class TeamUndead {

    Random rand = new Random();

    MagUndead magUndead = new MagUndead("Нежить Некромант");

    ArcherUndead archerUndead1 = new ArcherUndead("Нежить Мисливець Перший");
    ArcherUndead archerUndead2 = new ArcherUndead("Нежить Мисливець Другий");
    ArcherUndead archerUndead3 = new ArcherUndead("Нежить Мисливець Третій");

    WarriorUndead warriorUndead1 = new WarriorUndead("Нежить Гоблін Перший");
    WarriorUndead warriorUndead2 = new WarriorUndead("Нежить Гоблін Другий");
    WarriorUndead warriorUndead3 = new WarriorUndead("Нежить Гоблін Третій");
    WarriorUndead warriorUndead4 = new WarriorUndead("Нежить Гоблін Четвертий");

    public Player actionUndead(Player player1, Player player2){
        System.out.print(player1 + " проти " + player2 + ". ");
        player1.randomAct(player2);
        return player2;
    }

    public void randFighters(Player player){
        int random = rand.nextInt(8);
        if(random == 0 & magUndead.dead() == false){ actionUndead(magUndead, player);}
        if(random == 1 & archerUndead1.dead() == false){ actionUndead(archerUndead1, player);}
        if(random == 2 & archerUndead2.dead() == false){ actionUndead(archerUndead2, player);}
        if(random == 3 & archerUndead3.dead() == false){ actionUndead(archerUndead3, player);}
        if(random == 4 & warriorUndead1.dead() == false){ actionUndead(warriorUndead1, player);}
        if(random == 5 & warriorUndead2.dead() == false){ actionUndead(warriorUndead2, player);}
        if(random == 6 & warriorUndead3.dead() == false){ actionUndead(warriorUndead3, player);}
        if(random == 7 & warriorUndead4.dead() == false){ actionUndead(warriorUndead4, player);}
    }

}
