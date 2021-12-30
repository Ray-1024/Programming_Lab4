package labs.third;

public class ExtractionException extends RuntimeException {
    private Containable containable;

    public ExtractionException(Containable containable) {
        this.containable = containable;
    }

    public Containable getContainable() {
        return containable;
    }
    public ExtractionException(String message, Containable containable) {
        super(message);
        this.containable = containable;
    }

    public ExtractionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtractionException(Throwable cause) {
        super(cause);
    }

    public ExtractionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "ExtractionFromEmptyContainerException{}";
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
