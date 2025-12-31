package in.hms.exception;

import org.springframework.http.HttpStatus;

public class AdminException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private HttpStatus httpStatus;

    public AdminException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus != null
                ? httpStatus
                : HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
