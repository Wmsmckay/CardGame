
public class NalgeneBottle extends WaterBottle{
	private int numberOfLameStickers;
	
	
	//constucter
	public NalgeneBottle(int volume, String color, String bottlePetName, int numberOfLameStickers) {
		super(numberOfLameStickers, color, bottlePetName, numberOfLameStickers);
		this.numberOfLameStickers = numberOfLameStickers;
	}
	
	//getter and setters
	public int getNumberOfLameStickers() {
		return numberOfLameStickers;
	}

	public void setNumberOfLameStickers(int numberOfLameStickers) {
		this.numberOfLameStickers = numberOfLameStickers;
	}
	
	public void display() {
		System.out.println(super.getBottlePetName() + " holds " + super.getVolume() + "oz and is " + super.getColor() + ". The bottle is covered in " + numberOfLameStickers + " lame stickers from around the world.");
	}
	
}
