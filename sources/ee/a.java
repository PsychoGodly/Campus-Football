package ee;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import le.c;

/* compiled from: JvmClassMapping.kt */
public final class a {
    public static final <T> Class<T> a(c<T> cVar) {
        m.e(cVar, "<this>");
        Class<?> b10 = ((e) cVar).b();
        m.c(b10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b10;
    }

    public static final <T> Class<T> b(c<T> cVar) {
        m.e(cVar, "<this>");
        Class b10 = ((e) cVar).b();
        if (!b10.isPrimitive()) {
            m.c(b10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b10;
        }
        String name = b10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b10 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b10 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b10 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b10 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b10 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b10 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b10 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b10 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b10 = Short.class;
                    break;
                }
                break;
        }
        m.c(b10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b10;
    }

    public static final <T> c<T> c(Class<T> cls) {
        m.e(cls, "<this>");
        return a0.b(cls);
    }
}
