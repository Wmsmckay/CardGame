
public class Hydroflask extends WaterBottle {
	private double waterTemperature;
	
	
	// Constructor
	public Hydroflask(int volume, String color, String bottlePetName, double waterTempurature) {
		super(volume, color, bottlePetName, waterTempurature);
		this.waterTemperature = waterTempurature;
	}

	//getters and setters
	public double getWaterTemperature() {
		return waterTemperature;
	}


	public void setWaterTemperature(double waterTemperature) {
		this.waterTemperature = waterTemperature;
	}
	
	public void display() {
		System.out.println(super.getBottlePetName() + " holds " + super.getVolume() + "oz and is " + super.getColor() + ". The water tempurature is " + waterTemperature + " degrees F.");
	}
	
}
