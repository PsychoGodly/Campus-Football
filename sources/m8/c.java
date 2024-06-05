package m8;

import android.os.Build;
import android.os.Trace;

/* compiled from: FirebaseTrace */
public final class c {
    public static void a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void b(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
