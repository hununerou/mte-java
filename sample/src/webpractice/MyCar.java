package webpractice;

public class MyCar extends AbstractAutomobile{
	//フィールド車種、乗車定員、車種区分
	private String carmodel;
	private int capacity;
	private CarType cartype;
	public MyCar() {
		super.setCarType(CarType.LARGE_CAR);
		this.carmodel = "自家用車";
		this.capacity = 2;
	}
	
	//車の車種を決める
	@Override
	public String getCarModel() {
		return this.carmodel;
	}
	@Override
	public int getCapacity() {
		return this.capacity;
	}
	@Override
	public CarType getCarType() {
		return this.cartype;
	}
}