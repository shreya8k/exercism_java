
class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
       return this.birdsPerDay[this.birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i:birdsPerDay){
            if(i==0)return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int s=0;
        for(int i=0;i<numberOfDays && i<birdsPerDay.length;i++){
            s+=birdsPerDay[i];
        }
        return s;
    }

    public int getBusyDays() {
        int c=0;
        for(int i:birdsPerDay){
            if(i>=5)c++;
        }
        return c;
    }
}
