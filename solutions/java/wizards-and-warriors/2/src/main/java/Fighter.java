public class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    boolean isVulnerable(){
        return false;
    }
    @Override
    int getDamagePoints(Fighter w){
        return (w.isVulnerable())?10:6;
    }
}

class Wizard extends Fighter{
    private boolean s=true;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        s=false;
    }
    @Override
    boolean isVulnerable(){
        return s;
    }
    @Override
    int getDamagePoints(Fighter wa){
        return s?3:12;
    }
}
