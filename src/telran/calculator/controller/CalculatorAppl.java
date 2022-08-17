package telran.calculator.controller;

import telran.calculator.dao.Calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CalculatorAppl {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Wrong arguments number");
            return;
        }

        try {
            Method method = Calculator.class.getDeclaredMethod(args[2].toLowerCase(), double.class, double.class);
            Constructor<Calculator> calculatorConstructor = Calculator.class.getConstructor();
            method.setAccessible(true);
            System.out.println(method.invoke(calculatorConstructor.newInstance(), Double.valueOf(args[0]), Double.valueOf(args[1]))
            );


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

//    public static void getClassInfo(Class<?> clazz) {
//        System.out.println(clazz.getSimpleName());
//
//
//    }
}
