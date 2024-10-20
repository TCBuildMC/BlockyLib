package xyz.tcbuildmc.minecraft.blockylib.registry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * It shows that the field is a registry entry.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Entry {
    /**
     * The id of the entry.
     * @return The id.
     */
    String value() default "";
}
