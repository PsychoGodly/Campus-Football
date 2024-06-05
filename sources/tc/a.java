package tc;

import android.content.Context;
import android.util.Log;

/* compiled from: ContextHolder */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f38555a;

    public static Context a() {
        return f38555a;
    }

    public static void b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        f38555a = context;
    }
}
