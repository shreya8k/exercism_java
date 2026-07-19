public class Lasagna {
    int exp=40;
    public int expectedMinutesInOven(){
        return exp;
    }

    public int remainingMinutesInOven(int a){
      return exp-a;  
    }

    public int preparationTimeInMinutes(int b){
        return 2*b;
    }

    public int totalTimeInMinutes(int l, int t){
        return (2*l)+t;
    }
}
