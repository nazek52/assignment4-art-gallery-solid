package artgallery.util;

public interface Validatable {

    boolean isValid();

    default void validate() {
        if (!isValid()) {
            throw new IllegalStateException("Validation failed");
        }
    }

    static void info() {
        System.out.println("Validatable interface used");
    }
}
