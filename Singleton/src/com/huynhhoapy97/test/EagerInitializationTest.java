package com.huynhhoapy97.test;

import com.huynhhoapy97.EagerInitialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerInitializationTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        EagerInitialization instance = EagerInitialization.getInstance();

        /*Khong the khoi tao bang constructor*/
        //EagerInitialization eagerInitialization = new EagerInitialization();

        EagerInitialization eagerInitialization;
        /*Su dung Reflection de pha vo Eager Initialization Singleton*/
        Constructor<?>[] constructors = EagerInitialization.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            eagerInitialization = (EagerInitialization) constructor.newInstance();
        }
    }
}
