import java.util.*;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        // List<ProductionRemoteControlCar> li=new ArrayList<>(); 
        // ProductionRemoteControlCar temp;
        // for (int i=0;i<cars.size();i++){
        //     for(int j=i+1;j<cars.size();j++){
        //         if(cars.get(i).compareTo(cars.get(j))<0){
        //             temp=cars.get(i);
        //             cars.set(i,cars.get(j));
        //             cars.set(j,temp);
        //         }
        //     }
        //     li.add(cars.get(i));
        // }
        Collections.sort(cars);
        return cars;
    }
}
