package com.kalia.classloading;
class test {
	
}
public class PLatFromClassLoader {

	public static void main(String[] args) {
		   ClassLoader parent = test.class.getClassLoader().getParent();
		   System.out.println(parent);

	}

}
