package day01.ex02;

public class Bike <T>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material+"소재의 자전거";
	}
}
