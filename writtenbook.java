
public class writtenbook extends book {
protected int npages;
public writtenbook(String title ,String author ,int npages ) {
	super(title,author);
	this.npages=npages;
	
}
public int gtNpages() {
	return npages;
}
public String tostring() {
	return super.toString()+",number of pages:"+npages;
}

}
