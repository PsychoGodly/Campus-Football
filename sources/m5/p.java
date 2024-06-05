package m5;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class p {
    @Deprecated
    public static void a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
