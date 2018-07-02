package io.spring.part02;

public class SetterInjection {
	private String dependency;

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return "SetterInjection [dependency=" + dependency + "]";
	}

}
