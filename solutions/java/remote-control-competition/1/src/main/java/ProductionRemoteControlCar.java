class ProductionRemoteControlCar implements RemoteControlCar ,Comparable<ProductionRemoteControlCar>{
    private int distance=0;
    private int v=0;
    public void drive() {
       this.distance+=10;
    }

    public int getDistanceTravelled() {
       return distance;
    }
    public int getNumberOfVictories() {
       return v;
    }
    public int compareTo(ProductionRemoteControlCar c){
        if(this.getNumberOfVictories()<c.getNumberOfVictories())return -1;
        return 1;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.v= numberOfVictories;
    }
}
