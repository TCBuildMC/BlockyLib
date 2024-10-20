package xyz.tcbuildmc.minecraft.blockylib.util;

import net.minecraft.util.Identifier;

/**
 * General utilities.
 */
public class Util {
    /**
     * Create an {@link Identifier} from two strings.
     * @param s1 The namespace of the {@link Identifier}.
     * @param s2 The path of the {@link Identifier}.
     * @return The created {@link Identifier}.
     */
    public static Identifier id(String s1, String s2) {
        return new Identifier(s1, s2);
    }
}
