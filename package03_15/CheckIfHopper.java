package package03_15;

public class CheckIfHopper implements CheckTrait{
	public boolean test(Animal a){
		return a.canHop();
	}
}