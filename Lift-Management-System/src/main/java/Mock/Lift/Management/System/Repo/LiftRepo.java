package Mock.Lift.Management.System.Repo;

import Mock.Lift.Management.System.Models.Lift;
import Mock.Lift.Management.System.Models.Passenger;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class LiftRepo {
    HashMap<Integer, Lift>  liftDB;


    public LiftRepo() {
        this.liftDB = liftDB;

    }
    public String addLift( Lift lift){
        int id = lift.getLiftNo();
        liftDB.put(id, lift);
        return "Lift Added Successfully";
    }
    public  String weightaboveFifty( Lift lift){
        Lift<Passenger> passengers = lift.getList();
        for( Passenger p : passengers){
            if( p.getWeight() > 50 ){
                return "Found Passenger";
            }
        }


    }




}
