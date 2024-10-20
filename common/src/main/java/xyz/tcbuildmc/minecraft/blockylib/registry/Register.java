package xyz.tcbuildmc.minecraft.blockylib.registry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * It shows that all the fields with {@code public} and {@code static} modifiers and annotated with {@link Entry} in a class will be registered.
 * @see AnnotatedRegister
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Register {
    /**
     * The mod id for registering entries.
     * @return The mod id.
     */
    String id();

    /**
     * The parent type of registering entries.
     * <p>
     * Such as {@link net.minecraft.block.Block}, {@link net.minecraft.item.Item}.
     * @return The type.
     */
    Class<?> type();
}
