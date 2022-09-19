package day01.ex01;

public class Cup<E> {
	private E things;

	public E get() {
		return things;
	}

	public void set(E things) {
		this.things = things;
	}
	public void hold() {
		System.out.println(things+"를 담은 컵");
	}
}
