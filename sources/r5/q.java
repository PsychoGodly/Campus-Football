package r5;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class q {
    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t10) {
        T t11 = bundle.get(str);
        if (t11 == null) {
            return t10;
        }
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t11.getClass().getCanonicalName()}));
    }

    public static void b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
