package com.bridgeLabz.creational.singleton;

import java.lang.reflect.Constructor;
/**
 * @author Sourabh Magdum
 * @Purpose -  To check how singleton works with Reflection to destroyS ingleton test
 * Date - 03/11/2019
 */
public class ReflectiontodestroySingleton {
	public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getObj();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
