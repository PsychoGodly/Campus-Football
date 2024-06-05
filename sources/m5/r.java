package m5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import h5.k;
import o5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class r {
    public static boolean a(Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return k.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static boolean b(Context context, int i10, String str) {
        return c.a(context).h(i10, str);
    }
}
