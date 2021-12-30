package labs.third;

public class GetOutFromVoidException extends Exception{
    public GetOutFromVoidException() {
    }

    public GetOutFromVoidException(String message) {
        super(message);
    }

    public GetOutFromVoidException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetOutFromVoidException(Throwable cause) {
        super(cause);
    }

    public GetOutFromVoidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "GetOutFromVoidException{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
