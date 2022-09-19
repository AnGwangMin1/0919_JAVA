package day01.ex03;

public class NoteBook<T,S> {
	private T brand;
	private S version;
	public T getBrand() {
		return brand;
	}
	public void setBrand(T brand) {
		this.brand = brand;
	}
	public S getVersion() {
		return version;
	}
	public void setVersion(S version) {
		this.version = version;
	}
	
}
