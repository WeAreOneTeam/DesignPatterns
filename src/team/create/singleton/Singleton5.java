package team.create.singleton;

/**
 * 单例模式
 * @author housir
 * 饿汉 ： 加载时初始化
 */
public class Singleton5 {
	private static final Singleton5 instance = new Singleton5();
	
	private Singleton5(){}
	
	public static Singleton5 getInstance() {
		return instance;
	}
	
}
