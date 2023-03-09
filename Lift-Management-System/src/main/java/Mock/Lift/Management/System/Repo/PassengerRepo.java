package Mock.Lift.Management.System.Repo;

import Mock.Lift.Management.System.Models.Passenger;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PassengerRepo {
    HashMap<Integer, Passenger> passengerHashMap;

    public PassengerRepo() {
        this.passengerHashMap = new HashMap<Integer, Passenger>();
    }
    public  String addPassenger( Passenger passenger){
        int id = passenger.getPassengerId();
        passengerHashMap.put(id, passenger);

        return  "passenger added SuccessFully";

    }

    public  void DeletePassengers( ){
        for(int key : passengerHashMap.keySet()){
            if(key < 5 ){
                passengerHashMap.remove(key);
            }
        }
    }
}
