##Abstract Factory（抽象工厂）

##意图：
提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

##适用性：
* 一个系统要独立于它的产品的创建、组合和表示时。
* 一个系统要由多个产品系列中的一个来配置时。
* 当你要强调一系列相关的产品对象的设计以便进行联合使用时。
* 当你提供一个产品类库，而只想显示它们的接口而不是实现时。

##See More:
http://design-patterns.readthedocs.org/zh_CN/latest/creational_patterns/abstract_factory.html

##代码解释：
* App: 主类
* CarFactory: 汽车工厂，抽象类。两个函数，分别生产CarFrame(车架)和CarWheel（车轮）
* ACarFactory: 汽车工厂A，实现类CarFactory，生产工厂A的车架和轮子。
* BCarFactory: 汽车工厂B，类于ACarFactory。
* CarFrame: 车架，抽象类。属性是车架类型。
* ACarFrame：A厂车架，实现类CarFrame。给车架类型赋值。
* BCarFrame: B厂车架，类于ACarFrame。
* CarWheel: 车轮，类于CarFrame。
* ACarWheel: A厂车轮，类于ACarFrame。
* BCarWheel: B厂车轮，类于ACarWheel。

##总结
总的来说就是，生成一个工厂，工厂A只生产A的产品，工厂B只生产B的产品。

