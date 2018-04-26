
public class printedbook extends writtenbook {
private int isbn;
private boolean hardcover ;
public int getIsbn() {
	return isbn;
}
public printedbook(String title, String author, int npages,int isbn,boolean hardcover) {
	super(title, author, npages);
	this.isbn=isbn;
	this.hardcover=hardcover;
}
printedbook(String title , String author ,int npages ){
	this(title,author,npages,0,false);
	
}

}
