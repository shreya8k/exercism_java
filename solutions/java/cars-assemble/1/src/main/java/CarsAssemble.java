public class CarsAssemble {

    public double productionRatePerHour(int speed) {
       double result=speed*221;
        if(speed>=1 && speed<=4)return result;
        else if(speed>=5 && speed<=8)return 0.9*result;
        else if(speed==9)return 0.8*result;
        else if(speed==10)return 0.77*result;
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
        
    }
}
