package prototype;

import java.io.IOException;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display1();//��Ҫ���ʹ��cloneable�ӿ�ʵ��
		//display2();//��������ǳ���¡
		display3();//����¡
	}

	private static void display3() {
		// TODO Auto-generated method stub
		DeepWeeklyLog pre_Log,new_Log = null;
		pre_Log = new DeepWeeklyLog();
		Attachment  attachment = new Attachment(); //������������
		pre_Log.setAttachment(attachment);  //��������ӵ��ܱ���
		
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

	//��������ǳ���¡
	private static void display2() {
		// TODO Auto-generated method stub
		WeeklyLog pre_Log = new WeeklyLog();
		Attachment attachment = new Attachment();
		pre_Log.setAttachment(attachment);
		WeeklyLog new_log = (WeeklyLog) pre_Log.clone();
		System.out.println(pre_Log == new_log);
		System.out.println(pre_Log.getAttachment() == new_log.getAttachment());
	}
	//��Ҫ���ʹ��cloneable�ӿ�ʵ��
	private static void display1() {
		WeeklyLog pre_Log = new WeeklyLog();
		pre_Log.setName("����");
		pre_Log.setDate("��ʮ����");
		pre_Log.setContent("�����ܱ�");
		System.out.println("�ܱ�");
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
