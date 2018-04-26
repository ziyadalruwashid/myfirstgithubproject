
public class ebook extends writtenbook {
private int size ;

public ebook(String title, String author, int npages,int size) {
	super(title, author, npages);
	this.size=size;
	
}

public int getSize() {
	return size;
}
public String tostring() {
	return super.tostring()+"the size:"+size;
}

}
