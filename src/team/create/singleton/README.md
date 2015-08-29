# Singleton（单例）
单例模式有以下特点：

1. 单例类只能有一个实例。
2. 单例类必须自己创建自己的唯一实例。
3. 单例类必须给所有其他对象提供这一实例。

单例模式确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例。在计算机系统中，线程池、缓存、日志对象、对话框、打印机、显卡的驱动程序对象常被设计成单例。这些应用都或多或少具有资源管理器的功能。每台计算机可以有若干个打印机，但只能有一个Printer Spooler，以避免两个打印作业同时输出到打印机中。每台计算机可以有若干通信端口，系统应当集中管理这些通信端口，以避免一个通信端口同时被两个请求同时调用。总之，选择单例模式就是为了避免不一致状态，避免政出多头。

## Singleton1
懒汉，线程不安全 : 在调用函数 getInstance() 时才创建实例

## Singleton2
懒汉，线程安全 ： 在 getInstance() 方法上加同步

## Singleton3
懒汉，线程安全 ： 双重检查锁定

## Singleton4
懒汉，线程安全 ： 静态内部类(优于 Singleton1, Singleton2, Singleton3 )

## Singleton5
饿汉 ： 加载时初始化

##枚举
《Effective Java》作者推荐使用的方法，优点：不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象

``` java
enum EnumSingleton {
    INSTANCE;
    public void doSomeThing() {
    }
}
```