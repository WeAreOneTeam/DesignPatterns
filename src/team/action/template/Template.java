package team.action.template;

public abstract class Template
{
	private void beforeOperation()
	{
		System.out.println("This acton before the operation!");
	}
	
	private void afterOperation()
	{
		System.out.println("This acton after the operation!");
	}
	
	//需要推迟到子类(实现类) 中实现
	protected abstract void operation();
	
	public void run()
	{
		beforeOperation();
		operation();
		afterOperation();
	}
}