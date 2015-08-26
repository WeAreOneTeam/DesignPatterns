#Template Method（模板方法）
![image](http://img.my.csdn.net/uploads/201101/2/0_12939589765AQh.gif)

##意图
定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。TemplateMethod 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

##适用性
一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。<br />
各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。<br />

##Sample 1
Template, ConcreteTemplete, Test is a simple demo.

Template 中定义一个完成的操作步骤，以及实现一部分步骤，另一部分以abstract 函数存在。
在具体的类 ConcreteTemplete 中实现这些抽象方法。
