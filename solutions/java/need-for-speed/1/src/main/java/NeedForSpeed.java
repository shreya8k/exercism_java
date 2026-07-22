class NeedForSpeed {
    int speed;
     int batteryDrain;
    private int dist=0;
    private int bat=100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
    }

    public boolean batteryDrained() {
        if(bat<batteryDrain)return true;
        else return false;
    }

    public int distanceDriven() {
        return dist;
    }

    public void drive() {
        if(bat>=batteryDrain){
        dist+=speed;
        bat=bat-batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        double r=(double)this.distance/car.speed;
        double bl=100.0-(car.batteryDrain*r);
        if(bl<0.0)return false;
        return true;
    }
}
