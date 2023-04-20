package book;

public class Book {
	String _name;
	String _author;
	int _copy;
	
	public Book(String _name, String _author, int _copy) {
        this._name = _name;
        this._author = _author;
        this._copy = _copy;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_author() {
		return _author;
	}
	public void set_author(String _author) {
		this._author = _author;
	}
	public int get_copy() {
		return _copy;
	}
	public void set_copy(int _copy) {
		this._copy = _copy;
	}
	

}
