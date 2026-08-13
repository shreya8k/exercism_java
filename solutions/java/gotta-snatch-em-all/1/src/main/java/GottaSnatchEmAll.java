import java.util.List;
import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> s=new HashSet<>();
        for(String c:cards)s.add(c);
        return s;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.size()==0 || theirCollection.size()==0)return false;
        if(theirCollection.size()<myCollection.size()){
                for(String c:theirCollection){
                    if(!myCollection.contains(c))return true;
                }
            return false;
        }else{
                for(String c:myCollection){
                    if(!theirCollection.contains(c))return true;
                }
            return false;
        }
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> s=new HashSet<>(collections.get(0));
        for(int i=0;i<collections.size()-1;i++){
            for(String c:collections.get(i)){
                if(collections.get(i+1).contains(c) && s.contains(c))s.add(c);
                    else s.remove(c);
            }
        }if(s.size()==0)return new HashSet<>(Set.of());
        return s;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> s=new HashSet<>();
        for(int i=0;i<collections.size();i++){
            for(String st:collections.get(i)){
                s.add(st);
            }
        }
        return s;
    }
}
