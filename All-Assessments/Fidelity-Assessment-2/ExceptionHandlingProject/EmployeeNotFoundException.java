package ExceptionHandlingProject;

public class EmployeeNotFoundException extends Throwable {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
