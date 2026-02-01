package artgallery.util;

import java.lang.reflect.Field;

public class ReflectionUtils {

    public static void inspectClass(Class<?> cls) {
        System.out.println("\n--- Reflection info for " + cls.getSimpleName() + " ---");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println("Field: " + f.getName());
        }
    }
}
