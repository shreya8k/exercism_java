public class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    boolean isVulnerable(){
        return false;
    }
    int getDamagePoints(Fighter w){
        return (w.isVulnerable())?10:6;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    private boolean s=true;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        s=false;
    }
    boolean isVulnerable(){
        return s;
    }
    int getDamagePoints(Fighter wa){
        return s?3:12;
    }
}
