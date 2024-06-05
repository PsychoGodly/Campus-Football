package ca;

import android.text.TextUtils;
import android.util.Log;
import w9.b;

public final class d {
    public static void a(String str) {
        if (b.f30854a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    public static void b(String str, Exception exc) {
        if ((b.f30854a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
