package Mock.Lift.Management.System.Controller;

import Mock.Lift.Management.System.Models.Lift;
import Mock.Lift.Management.System.Service.LiftService;
import Mock.Lift.Management.System.Service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;

    @PostMapping("/add")
    public String addPassenger( @RequestBody Lift lift){
        return passengerService.addPassenger(lift);
    }
    public  String getPassenger(@RequestBody Lift lift){
        return
    }
}
