package com.dev.java.designpatterns.creational.singleton;

public class EagerInitilizationException {

	private static EagerInitilizationException eagerSingleton;

	static {

		try {
			eagerSingleton = new EagerInitilizationException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private EagerInitilizationException() {
	}

	public static EagerInitilizationException getEagerSingleton() {

		return eagerSingleton;
	}
}
