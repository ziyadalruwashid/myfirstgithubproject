
public class book {
protected String title ;
protected String author ;
public book(String title, String author) {
	
	this.title = title;
	this.author = author;
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
 public String tostring() {
	 return "title:"+title+",author :"+author ;
 }

}
