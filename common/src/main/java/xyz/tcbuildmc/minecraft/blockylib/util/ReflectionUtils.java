package xyz.tcbuildmc.minecraft.blockylib.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * {@link java.lang.reflect} Utilities.
 */
public final class ReflectionUtils {
    /**
     * Checks if a field is public and static.
     * @param field The field to check.
     * @return true if the field is public and static, false otherwise.
     */
    public static boolean checkPublicStatic(Field field) {
        return Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers());
    }
}
