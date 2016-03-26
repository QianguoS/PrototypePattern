package prototype;

import java.io.IOException;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display1();//主要完成使用cloneable接口实现
		//display2();//用来测试浅层克隆
		display3();//深层克隆
	}

	private static void display3() {
		// TODO Auto-generated method stub
		DeepWeeklyLog pre_Log,new_Log = null;
		pre_Log = new DeepWeeklyLog();
		Attachment  attachment = new Attachment(); //创建附件对象
		pre_Log.setAttachment(attachment);  //将附件添加到周报中
		
		try {
			new_Log = pre_Log.deepclone();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pre_Log == new_Log);
		System.out.println(pre_Log.getAttachment() == new_Log.getAttachment());
	}

	//用来测试浅层克隆
	private static void display2() {
		// TODO Auto-generated method stub
		WeeklyLog pre_Log = new WeeklyLog();
		Attachment attachment = new Attachment();
		pre_Log.setAttachment(attachment);
		WeeklyLog new_log = (WeeklyLog) pre_Log.clone();
		System.out.println(pre_Log == new_log);
		System.out.println(pre_Log.getAttachment() == new_log.getAttachment());
	}
	//主要完成使用cloneable接口实现
	private static void display1() {
		WeeklyLog pre_Log = new WeeklyLog();
		pre_Log.setName("张三");
		pre_Log.setDate("第十二周");
		pre_Log.setContent("工作周报");
		System.out.println("周报");
		System.out.println(pre_Log.getName());
		System.out.println(pre_Log.getDate());
		System.out.println(pre_Log.getContent());
		
		WeeklyLog new_Log;
		new_Log = (WeeklyLog) pre_Log.clone();
		System.out.println(new_Log.getName());
		System.out.println(new_Log.getDate());
		System.out.println(new_Log.getContent());
	}

}
