package team.create.singleton;

/**
 * 单例模式
 * @author housir
 * 懒汉，线程安全 ： 在 getInstance() 方法上加同步
 */
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private Singleton2(){}
	
	public static synchronized Singleton2 getInstance() {
		if(instance == null)
			instance = new Singleton2();
		return instance;
	}
	
}
