package Ex0722;

public class Library_BookDTO {

	int booknumber;
	String bookname;
	String author;
	boolean check;
	int clientnumber;
	
	public int getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean getCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public int getClientnumber() {
		return clientnumber;
	}
	public void setClientnumber(int clientnumber) {
		this.clientnumber = clientnumber;
	}
	
	
	public Library_BookDTO() {	
	}
	
	
	
	public String toString() {
		return "Library_BookDTO [booknumber=" + booknumber + ", bookname=" + bookname + ", author=" + author
				+ ", check=" + check + ", clientnumber=" + clientnumber + "]";
	}
	
	
	
	
	
	
}
