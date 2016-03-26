package prototype;

class WeeklyLog implements Cloneable{

	private String name;
	private String date;
	private String content;
	private Attachment attachment;
	
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Object clone()
    {
           Object obj = null;
           try
           {
                  obj = super.clone();
                  return (WeeklyLog)obj;
                       
           }
           catch(CloneNotSupportedException e)
           {
                  System.out.println("不支持复制！");
                  return null;
           }
    }
	

}
