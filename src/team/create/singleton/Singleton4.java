package team.create.singleton;

/**
 * 单例模式
 * @author housir
 * 懒汉，线程安全 ： 静态内部类;
 * 优点：加载时不会初始化静态变量 instance，因为没有主动使用，达到Lazy loading;
 * 既实现了线程安全，又避免了同步带来的性能影响
 */
public class Singleton4 {
	private static class innerHolder {
		private static final Singleton4 instance = new Singleton4();
	}
	
	private Singleton4(){}
	
	public static Singleton4 getInstance() {
		
		return innerHolder.instance;
	}
	
}
