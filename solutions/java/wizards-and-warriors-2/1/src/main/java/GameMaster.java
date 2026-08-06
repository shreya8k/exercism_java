public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character ch){
        return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points.";
    }
    
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination d){
        return "You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
     public String describe(TravelMethod t){
         if(t==(TravelMethod.WALKING))
         return "You're traveling to your destination by walking.";
         else
             return "You're traveling to your destination on horseback.";
     }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character ch,Destination d, TravelMethod t){
        return describe(ch)+" "+describe(t)+" "+describe(d);
    }
    

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character ch, Destination d){
        return describe(ch)+" "+describe(TravelMethod.WALKING)+" "+describe(d);
    }
}
