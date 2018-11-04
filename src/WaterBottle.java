
public abstract class WaterBottle {
	
	private int volume;
	private String color;
	private String bottlePetName;
	
	//constructor
	public WaterBottle(int volume, String color, String bottlePetName, double waterTempurature) {
		this.volume = volume;
		this.color = color;
		this.bottlePetName = bottlePetName;
	}
	
	//getters and setters
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBottlePetName() {
		return bottlePetName;
	}
	public void setBottlePetName(String bottlePetName) {
		this.bottlePetName = bottlePetName;
	}
	
	
}
