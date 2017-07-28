package com.ttn.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@SuppressWarnings("rawtypes")
public final class BreakingSingleton {

	public static void main(String[] args) throws ReflectiveOperationException, RuntimeException {
		
		AlmostPerfectSingleton singleton = AlmostPerfectSingleton.getInstance();
		
		Field field = AlmostPerfectSingleton.class.getDeclaredField("SINGLETON");
		field.setAccessible(true);
		
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
		
		field.set(null, null);
		
		Constructor constructor = AlmostPerfectSingleton.class.getDeclaredConstructor(new Class<?>[] {});
		constructor.setAccessible(true);
		AlmostPerfectSingleton singleton2 = (AlmostPerfectSingleton) constructor.newInstance(new Object[] {});
		
		System.out.println(singleton == singleton2);
	}
}
