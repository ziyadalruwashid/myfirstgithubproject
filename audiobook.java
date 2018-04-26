
public class audiobook extends book {
private int duration ;
private String narrator;
public audiobook(String title, String author,int duration,String narrator) {
	super(title, author);
	this.duration=duration;
	this.narrator=narrator;
}
public int getDuration() {
	return duration;
}
public String getNarrator() {
	return narrator;
}
public String tostring() {
	return super.tostring()+"the duraion:"+duration+",the narrator is"+narrator;
	
}
}
