##Abstract Factory�����󹤳���

##��ͼ��
�ṩһ������һϵ����ػ��໥��������Ľӿڣ�������ָ�����Ǿ�����ࡣ

##�����ԣ�
* һ��ϵͳҪ���������Ĳ�Ʒ�Ĵ�������Ϻͱ�ʾʱ��
* һ��ϵͳҪ�ɶ����Ʒϵ���е�һ��������ʱ��
* ����Ҫǿ��һϵ����صĲ�Ʒ���������Ա��������ʹ��ʱ��
* �����ṩһ����Ʒ��⣬��ֻ����ʾ���ǵĽӿڶ�����ʵ��ʱ��

##See More:
http://design-patterns.readthedocs.org/zh_CN/latest/creational_patterns/abstract_factory.html

##������ͣ�
* App: ����
* CarFactory: ���������������ࡣ�����������ֱ�����CarFrame(����)��CarWheel�����֣�
* ACarFactory: ��������A��ʵ����CarFactory����������A�ĳ��ܺ����ӡ�
* BCarFactory: ��������B������ACarFactory��
* CarFrame: ���ܣ������ࡣ�����ǳ������͡�
* ACarFrame��A�����ܣ�ʵ����CarFrame�����������͸�ֵ��
* BCarFrame: B�����ܣ�����ACarFrame��
* CarWheel: ���֣�����CarFrame��
* ACarWheel: A�����֣�����ACarFrame��
* BCarWheel: B�����֣�����ACarWheel��

##�ܽ�
�ܵ���˵���ǣ�����һ������������Aֻ����A�Ĳ�Ʒ������Bֻ����B�Ĳ�Ʒ��

