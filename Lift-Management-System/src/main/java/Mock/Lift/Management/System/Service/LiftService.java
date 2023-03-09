package Mock.Lift.Management.System.Service;

import Mock.Lift.Management.System.Models.Lift;
import Mock.Lift.Management.System.Repo.LiftRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class LiftService {
    @Autowired
    LiftRepo liftRepo;

    public String addLift( Lift lift){
        return liftRepo.addLift(lift);
    }
}
