package Mock.Lift.Management.System.Service;

import Mock.Lift.Management.System.Models.Passenger;
import Mock.Lift.Management.System.Repo.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @Autowired
    PassengerRepo passengerRepo;



    public String addPassenger(Passenger passenger){
        return passengerRepo.addPassenger(passenger);
    }
    public void DeletePasenger(){
        passengerRepo.DeletePassengers();
    }


}
