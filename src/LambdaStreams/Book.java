
package LambdaStreams;

public class Book {
	private int id;
	private String title;
	private String author;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
        public String toString() {
            return title + " by " + author;
        }
        public boolean match(Book b) {
        if(b.getAuthor().startsWith("A")) {
            return true;
        } else if(b.getAuthor().startsWith("B")) {
            return true;
        } else if(b.getAuthor().startsWith("C")) {
            return true;
        }
        return false;
    }
}


