public class JedliksToyCar {
    private int c=0;
    private int b=100;
    public static JedliksToyCar buy() {
        
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        if (b<=0) return "Driven 2000 meters";
        else
        return "Driven "+c+" meters";
    }

    public String batteryDisplay() {
        if (b<=0) return "Battery empty";
        else
        return "Battery at "+b+"%";
    }

    public void drive() {
        c=c+20;
        b=b-1;
    }
}
