package m5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f20094a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            q.k(context);
            q.k(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
