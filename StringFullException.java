
public class StringFullException extends Exception {
	@Override
	public String getMessage() {
		return "The line is busy";
	}
}
