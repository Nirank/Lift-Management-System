package Mock.Lift.Management.System.Controller;

import Mock.Lift.Management.System.Models.Lift;
import Mock.Lift.Management.System.Service.LiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lift")
public class LiftController {
    @Autowired
    LiftService liftService;

    @PostMapping("/add")
    public String addLift(@RequestBody Lift  lift){
        return liftService.addLift(lift);
    }

}
