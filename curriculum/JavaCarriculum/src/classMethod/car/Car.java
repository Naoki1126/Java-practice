package classMethod.car;

public class Car {
	//燃費(km/L)
	private double fuelCost;
	//残量(L)
	private double fuelAmount;

	//コントラクタの作成
	public Car(double fuelCost,double fuelAmount){
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int move) {
		System.out.println(move + "km" + " " + "走ります");
		this.fuelAmount -= (move / fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
