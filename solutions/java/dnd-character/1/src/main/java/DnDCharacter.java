import java.util.*;

class DnDCharacter {
    private int stre,dex,con,inte,wis,cha;
    DnDCharacter(){
        stre=ability(rollDice());
        dex=ability(rollDice());
        con=ability(rollDice());
        inte=ability(rollDice());
        wis=ability(rollDice());
        cha=ability(rollDice());
    }
    int ability(List<Integer> scores) {
        int s=0, min=scores.get(0);
        for(Integer i:scores){
            if(min>i)min=i;
            s+=i;
        }
        return s-min;
    }

    List<Integer> rollDice() {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<4;i++){
            a.add((int)(Math.random()*6)+1);
        }
        return a;
    }

    int modifier(int input) {
        return (int)Math.floor((input-10)/2.0);
    }

    int getStrength() {
        return stre;
    }

    int getDexterity() {
        return dex;
    }

    int getConstitution() {
        return con;
    }

    int getIntelligence() {
        return inte;
    }

    int getWisdom() {
        return wis;
    }

    int getCharisma() {
        return cha;
    }

    int getHitpoints() {
        return 10 +modifier(con);
    }
}
