package com.kalia.classloading;
class Test{
	
}
public class ApplicationClassLoader {

	public static void main(String[] args) {
		ClassLoader classLoader = Test.class.getClassLoader();
		System.out.println(classLoader);

	}

}
