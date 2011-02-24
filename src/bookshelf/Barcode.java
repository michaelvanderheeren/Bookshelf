package bookshelf;


public class Barcode {
	public final String value;

	public Barcode(String value) {
		// Remove all dashes
		value = value.replaceAll("-", "");
		value = value.trim();
		
		this.value = value;
	}
	
	@Override
	public String toString() {
		return getValue();
	}

	public String getValue() {
		return this.value;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Barcode))
			return false;
		
		Barcode code = (Barcode) o;
		return getValue().equals(code.getValue());
	}
}
