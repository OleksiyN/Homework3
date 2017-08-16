
public class NotFoundStudentException extends Exception{
	@Override
	public String getMessage() {
		return "A student with such a lastname is not on the list";
	}
}
