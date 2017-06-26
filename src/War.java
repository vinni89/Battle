import Teams.TeamBlack;
import Teams.TeamWhite;

import java.io.*;

/**
 * Created by А д м и н on 22.06.2017.
 */
public class War {

    TeamWhite teamWhite = new TeamWhite();
    TeamBlack teamBlack = new TeamBlack();

    public static void main(String[] args) throws FileNotFoundException {

        //System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("text.txt")), true));
        War war = new War();
        war.battle();
    }

    public void rivals(){
        if(teamWhite.randWhite == 0 & teamBlack.randBlack == 0){
            teamWhite.elfWithUndead();
            teamBlack.undeadWithElf();
        }
        if(teamWhite.randWhite == 1 & teamBlack.randBlack == 0){
            teamWhite.manWithUndead();
            teamBlack.undeadWithMan();
        }
        if(teamWhite.randWhite == 0 & teamBlack.randBlack == 1){
            teamWhite.elfWithOrc();
            teamBlack.orcWithElf();
        }
        if(teamWhite.randWhite == 1 & teamBlack.randBlack == 1){
            teamWhite.manWithOrc();
            teamBlack.orcWithMan();
        }
    }

    public void battle(){
        for(int i = 0; i < 100; i++){
            rivals();
        }
    }
}
