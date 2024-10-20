package xyz.tcbuildmc.minecraft.blockylib.registry;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import xyz.tcbuildmc.minecraft.blockylib.BlockyLib;
import xyz.tcbuildmc.minecraft.blockylib.util.ReflectionUtils;
import xyz.tcbuildmc.minecraft.blockylib.util.Util;

import java.lang.reflect.Field;

/**
 * Annotation-powered register.
 * @see DeferredRegister
 */
public final class AnnotatedRegister {
    /**
     * Register all the fields with {@code public} and {@code static} modifiers and annotated with {@link Entry} in a class.
     * @param clazz The class.
     * @param registryKey The registry key.
     * @param <R> The type of the registry.
     */
    public static <R> void register(Class<?> clazz, RegistryKey<Registry<R>> registryKey) {
        if (clazz.isAnnotationPresent(Register.class)) {
            Register r = clazz.getAnnotation(Register.class);
            String modId = r.id();
            Class<?> type = r.type();
            DeferredRegister<R> register = DeferredRegister.create(modId, registryKey);

            for (Field f : clazz.getFields()) {
                if (f.isAnnotationPresent(Entry.class) && ReflectionUtils.checkPublicStatic(f) && type.isAssignableFrom(f.getType())) {
                    Entry e = f.getAnnotation(Entry.class);
                    String id = e.value();

                    try {
                        R entry = (R) f.get(null);

                        if (id.isEmpty()) {
                            id = f.getName().toLowerCase();
                        }

                        register.register(Util.id(modId, id), () -> entry);
                    } catch (ClassCastException t) {
                        BlockyLib.LOGGER.error("A ClassCastException occurred when registering {}", id, t);
                    } catch (IllegalAccessException t) {
                        throw new AssertionError(t);
                    }
                }
            }

            register.register();
        }
    }
}
