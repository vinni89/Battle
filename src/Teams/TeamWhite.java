package Teams;

import Players.MagOrc;
import Players.Player;

import java.util.Random;

/**
 * Created by А д м и н on 22.06.2017.
 */
public class TeamWhite {

    Random rand = new Random();
    public int randWhite = rand.nextInt(2);
    TeamMan teamMan = new TeamMan();
    TeamElf teamElf = new TeamElf();
    TeamOrc teamOrc = new TeamOrc();
    TeamUndead teamUndead = new TeamUndead();

    public TeamWhite(){
        randTeamWhite();
    }

    public void randTeamWhite(){
        if(randWhite == 1){
            System.out.println("В бій вступає команда людей");
            teamMan = new TeamMan();
        }
        if(randWhite == 0){
            System.out.println("В бій вступає команда ельфів");
            teamElf = new TeamElf();
        }
    }

    public void manWithOrc(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamOrc.magOrc.dead() == false) { teamMan.randFighters(teamOrc.magOrc);}
        if(randContenger == 1 & teamOrc.archerOrc1.dead() == false) { teamMan.randFighters(teamOrc.archerOrc1);}
        if(randContenger == 2 & teamOrc.archerOrc2.dead() == false) { teamMan.randFighters(teamOrc.archerOrc2);}
        if(randContenger == 3 & teamOrc.archerOrc3.dead() == false) { teamMan.randFighters(teamOrc.archerOrc3);}
        if(randContenger == 4 & teamOrc.warriorOrc1.dead() == false) { teamMan.randFighters(teamOrc.warriorOrc1);}
        if(randContenger == 5 & teamOrc.warriorOrc2.dead() == false) { teamMan.randFighters(teamOrc.warriorOrc2);}
        if(randContenger == 6 & teamOrc.warriorOrc3.dead() == false) { teamMan.randFighters(teamOrc.warriorOrc3);}
        if(randContenger == 7 & teamOrc.warriorOrc4.dead() == false) { teamMan.randFighters(teamOrc.warriorOrc4);}
    }

    public void elfWithOrc(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamOrc.magOrc.dead() == false) { teamElf.randFighters(teamOrc.magOrc);}
        if(randContenger == 1 & teamOrc.archerOrc1.dead() == false) { teamElf.randFighters(teamOrc.archerOrc1);}
        if(randContenger == 2 & teamOrc.archerOrc2.dead() == false) { teamElf.randFighters(teamOrc.archerOrc2);}
        if(randContenger == 3 & teamOrc.archerOrc3.dead() == false) { teamElf.randFighters(teamOrc.archerOrc3);}
        if(randContenger == 4 & teamOrc.warriorOrc1.dead() == false) { teamElf.randFighters(teamOrc.warriorOrc1);}
        if(randContenger == 5 & teamOrc.warriorOrc2.dead() == false) { teamElf.randFighters(teamOrc.warriorOrc2);}
        if(randContenger == 6 & teamOrc.warriorOrc3.dead() == false) { teamElf.randFighters(teamOrc.warriorOrc3);}
        if(randContenger == 7 & teamOrc.warriorOrc4.dead() == false) { teamElf.randFighters(teamOrc.warriorOrc4);}
    }

    public void manWithUndead(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamUndead.magUndead.dead() == false) { teamMan.randFighters(teamUndead.magUndead); }
        if(randContenger == 1 & teamUndead.archerUndead1.dead() == false) { teamMan.randFighters(teamUndead.archerUndead1);}
        if(randContenger == 2 & teamUndead.archerUndead2.dead() == false) { teamMan.randFighters(teamUndead.archerUndead2);}
        if(randContenger == 3 & teamUndead.archerUndead3.dead() == false) { teamMan.randFighters(teamUndead.archerUndead3);}
        if(randContenger == 4 & teamUndead.warriorUndead1.dead() == false) { teamMan.randFighters(teamUndead.warriorUndead1);}
        if(randContenger == 5 & teamUndead.warriorUndead2.dead() == false) { teamMan.randFighters(teamUndead.warriorUndead2);}
        if(randContenger == 6 & teamUndead.warriorUndead3.dead() == false) { teamMan.randFighters(teamUndead.warriorUndead3);}
        if(randContenger == 7 & teamUndead.warriorUndead4.dead() == false) { teamMan.randFighters(teamUndead.warriorUndead4);}
    }

    public void elfWithUndead(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamUndead.magUndead.dead() == false) { teamElf.randFighters(teamUndead.magUndead);}
        if(randContenger == 1 & teamUndead.archerUndead1.dead() == false) { teamElf.randFighters(teamUndead.archerUndead1);}
        if(randContenger == 2 & teamUndead.archerUndead2.dead() == false) { teamElf.randFighters(teamUndead.archerUndead2);}
        if(randContenger == 3 & teamUndead.archerUndead3.dead() == false) { teamElf.randFighters(teamUndead.archerUndead3);}
        if(randContenger == 4 & teamUndead.warriorUndead1.dead() == false) { teamElf.randFighters(teamUndead.warriorUndead1);}
        if(randContenger == 5 & teamUndead.warriorUndead2.dead() == false) { teamElf.randFighters(teamUndead.warriorUndead2);}
        if(randContenger == 6 & teamUndead.warriorUndead3.dead() == false) { teamElf.randFighters(teamUndead.warriorUndead3);}
        if(randContenger == 7 & teamUndead.warriorUndead4.dead() == false) { teamElf.randFighters(teamUndead.warriorUndead4);}
    }

}
