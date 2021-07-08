package week05.first.templatemethod;

public abstract class Car {
	protected abstract void carStart();
	protected abstract void carSet();
	protected abstract void carmove();
	protected abstract void carStop();
	
	// 템플릿 메소드. 기능의 순서를 정한다.
	public final void drive() {
		carStart();
		carSet();
		carmove();
		carStop();
	}
}
