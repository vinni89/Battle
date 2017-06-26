package Teams;

import Players.Player;

import java.util.Random;

/**
 * Created by А д м и н on 22.06.2017.
 */
public class TeamBlack {

    Random rand = new Random();
    public int randBlack = rand.nextInt(2);
    TeamOrc teamOrc = new TeamOrc();
    TeamUndead teamUndead = new TeamUndead();
    TeamMan teamMan = new TeamMan();
    TeamElf teamElf = new TeamElf();

    public TeamBlack(){
        randTeamBlack();
    }

    public void randTeamBlack(){
        if(randBlack == 1){
            System.out.println("В бій вступає команда орків");
            teamOrc = new TeamOrc();
        }
        if(randBlack == 0){
            System.out.println("В бій вступає команда нежиті");
            teamUndead = new TeamUndead();
        }
    }

    public void orcWithMan(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamMan.magMan.dead() == false) { teamOrc.randFighters(teamMan.magMan);}
        if(randContenger == 1 & teamMan.archerMan1.dead() == false) { teamOrc.randFighters(teamMan.archerMan1);}
        if(randContenger == 2 & teamMan.archerMan2.dead() == false) { teamOrc.randFighters(teamMan.archerMan2);}
        if(randContenger == 3 & teamMan.archerMan3.dead() == false) { teamOrc.randFighters(teamMan.archerMan3);}
        if(randContenger == 4 & teamMan.warriorMan1.dead() == false) { teamOrc.randFighters(teamMan.warriorMan1);}
        if(randContenger == 5 & teamMan.warriorMan2.dead() == false) { teamOrc.randFighters(teamMan.warriorMan2);}
        if(randContenger == 6 & teamMan.warriorMan3.dead() == false) { teamOrc.randFighters(teamMan.warriorMan3);}
        if(randContenger == 7 & teamMan.warriorMan4.dead() == false) { teamOrc.randFighters(teamMan.warriorMan4);}
    }

    public void undeadWithMan(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamMan.magMan.dead() == false) { teamUndead.randFighters(teamMan.magMan);}
        if(randContenger == 1 & teamMan.archerMan1.dead() == false) { teamUndead.randFighters(teamMan.archerMan1);}
        if(randContenger == 2 & teamMan.archerMan2.dead() == false) { teamUndead.randFighters(teamMan.archerMan2);}
        if(randContenger == 3 & teamMan.archerMan3.dead() == false) { teamUndead.randFighters(teamMan.archerMan3);}
        if(randContenger == 4 & teamMan.warriorMan1.dead() == false) { teamUndead.randFighters(teamMan.warriorMan1);}
        if(randContenger == 5 & teamMan.warriorMan2.dead() == false) { teamUndead.randFighters(teamMan.warriorMan2);}
        if(randContenger == 6 & teamMan.warriorMan3.dead() == false) { teamUndead.randFighters(teamMan.warriorMan3);}
        if(randContenger == 7 & teamMan.warriorMan4.dead() == false) { teamUndead.randFighters(teamMan.warriorMan4);}
    }

    public void orcWithElf(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamElf.magElf.dead() == false) { teamOrc.randFighters(teamElf.magElf);}
        if(randContenger == 1 & teamElf.archerElf1.dead() == false) { teamOrc.randFighters(teamElf.archerElf1);}
        if(randContenger == 2 & teamElf.archerElf2.dead() == false) { teamOrc.randFighters(teamElf.archerElf2);}
        if(randContenger == 3 & teamElf.archerElf3.dead() == false) { teamOrc.randFighters(teamElf.archerElf3);}
        if(randContenger == 4 & teamElf.warriorElf1.dead() == false) { teamOrc.randFighters(teamElf.warriorElf1);}
        if(randContenger == 5 & teamElf.warriorElf2.dead() == false) { teamOrc.randFighters(teamElf.warriorElf2);}
        if(randContenger == 6 & teamElf.warriorElf3.dead() == false) { teamOrc.randFighters(teamElf.warriorElf3);}
        if(randContenger == 7 & teamElf.warriorElf4.dead() == false) { teamOrc.randFighters(teamElf.warriorElf4);}
    }

    public void undeadWithElf(){
        int randContenger = rand.nextInt(8);
        if(randContenger == 0 & teamElf.magElf.dead() == false) { teamUndead.randFighters(teamElf.magElf);}
        if(randContenger == 1 & teamElf.archerElf1.dead() == false) { teamUndead.randFighters(teamElf.archerElf1);}
        if(randContenger == 2 & teamElf.archerElf2.dead() == false) { teamUndead.randFighters(teamElf.archerElf2);}
        if(randContenger == 3 & teamElf.archerElf3.dead() == false) { teamUndead.randFighters(teamElf.archerElf3);}
        if(randContenger == 4 & teamElf.warriorElf1.dead() == false) { teamUndead.randFighters(teamElf.warriorElf1);}
        if(randContenger == 5 & teamElf.warriorElf2.dead() == false) { teamUndead.randFighters(teamElf.warriorElf2);}
        if(randContenger == 6 & teamElf.warriorElf3.dead() == false) { teamUndead.randFighters(teamElf.warriorElf3);}
        if(randContenger == 7 & teamElf.warriorElf4.dead() == false) { teamUndead.randFighters(teamElf.warriorElf4);}
    }

}
