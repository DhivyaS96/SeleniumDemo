package test.oops.gym;

public class LeanCategory extends Workout{
	int wid;
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	@Override
	public void Cardio() {
		System.out.println("Day 1 workout for lean category is cardio");
	}
	@Override
	public void WeightTraining() {
		System.out.println("Day 2 workout for lean category is WeightTraining");
	}
	@Override
	public void Yoga() {
		System.out.println("Day 3 workout for lean category is Yoga");
	}
	@Override
	public void Pilates() {
		System.out.println("Day 4 workout for lean category is Pilates");
	}
	@Override
	public void PowerYoga() {
		System.out.println("Day 5 workout for lean category is PowerYoga");
	}
	@Override
	public void HiitWorkout() {
		System.out.println("Day 6 workout for lean category is HiitWorkout");
	}
}
