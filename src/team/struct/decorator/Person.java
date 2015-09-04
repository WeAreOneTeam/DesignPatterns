package team.struct.decorator;

//定义被装饰者，被装饰者初始状态有些自己的装饰
public class Person implements Human {

	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		System.out.println("穿什么呢。。");
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		System.out.println("去哪里呢。。");
	}
}
