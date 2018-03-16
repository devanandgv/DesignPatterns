package com.dev.java.designpatterns.creational.singleton;

public class LazyInitilization {

	private static LazyInitilization lazySingleton;

	private LazyInitilization() {
	}

	public static LazyInitilization getLazySingleton() {

		if (lazySingleton == null)
			return new LazyInitilization();
		else
			return lazySingleton;
	}
}
