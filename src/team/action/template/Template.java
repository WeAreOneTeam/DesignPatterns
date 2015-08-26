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
	
	//��Ҫ�Ƴٵ�����(ʵ����) ��ʵ��
	protected abstract void operation();
	
	public void run()
	{
		beforeOperation();
		operation();
		afterOperation();
	}
}