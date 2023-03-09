package Mock.Lift.Management.System.Models;

public class Passenger {
   private int PassengerId;
     private Lift  lift;
     private  int Weight;

    public Passenger() {
    }

    public Passenger(int passengerId, Lift lift, int weight) {
        PassengerId = passengerId;
        this.lift = lift;
        Weight = weight;
    }

    public int getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(int passengerId) {
        PassengerId = passengerId;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
}
