package team.create.singleton;

public class Singleton
{
	/**
	 * 饿汉式, 可以用反射破坏
	 */
	private final static Singleton INSTANCE = new Singleton();

	public static Singleton getInstance()
	{
		return INSTANCE;
	}

	/**
	 * 懒汉式, 线程不安全
	 */
//	private static Singleton instance = null;
//
//	public static Singleton getInstance()
//	{
//		if (instance == null)
//		{
//			instance = new Singleton();
//		}
//
//		return instance;
//	}

	/*--------------------------------------------------------------------------------------------*/
	/**
	 * 懒汉式, 线程安全(synchronized)
	 */
//	private static Singleton instance = null;
//
//	public synchronized static Singleton getInstance()
//	{
//		if (instance == null)
//		{
//			instance = new Singleton();
//		}
//
//		return instance;
//	}

	/**
	 * 懒汉式, 线程安全(双重校验锁) (还不理解原理 Java 1.5，volatile)
	 */
//	private volatile static Singleton instance = null;
//
//	public static Singleton getInstance()
//	{
//		if (instance == null)
//		{
//			synchronized (Singleton.class)
//			{
//				if(instance == null)
//				{
//					instance = new Singleton();
//				}
//			}
//		}
//
//		return instance;
//	}

	/**
	 * 懒汉式, 线程安全(静态类持有)
	 */
//	private static class SingletonHolder
//	{
//		private final static Singleton INSTANCE = new Singleton();
//	}
//
//	public static Singleton getInstance()
//	{
//		return SingletonHolder.INSTANCE;
//	}
}
