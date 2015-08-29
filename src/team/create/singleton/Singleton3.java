package team.create.singleton;

/**
 * 单例模式
 * @author housir
 * 懒汉，线程安全 ： 双重检查锁定
 */
public class Singleton3 {
	private static Singleton3 instance = null;
	
	private Singleton3(){}
	
	public static Singleton3 getInstance() {
		// 先检查实例是否存在，如果不存在才进入下面的同步块
		if(instance == null)
		{
			// 同步块，线程安全的创建实例
			synchronized (Singleton3.class)
			{
				// 再次检查实例是否存在，如果不存在才真正的创建实例
				if(instance == null)
					instance = new Singleton3();
			}
		}
		return instance;
	}
	
}
