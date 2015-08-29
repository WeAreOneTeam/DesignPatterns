package team.create.singleton;

/**
 * 单例模式
 * @author housir
 * 懒汉，线程不安全 : 在调用函数 getInstance() 时才创建实例，
 * 当多个线程同时调用时，可能创建多个对象；
 * Singleton2, Singleton3, Singleton4 是其改进版，是线程安全的
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1(){}
	
	public static Singleton1 getInstance() {
		if(instance == null)
			instance = new Singleton1();
		return instance;
	}
	
}
