package io.spring.part02;

public class ConstructorInjection {
	private String dependency;

	public ConstructorInjection(String dependency) {
		super();
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return "ConstructorInjection [dependency=" + dependency + "]";
	}

}
