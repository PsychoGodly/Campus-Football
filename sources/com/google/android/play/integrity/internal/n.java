package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f26080a;

    public n(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f26080a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    private static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f26080a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f26080a, "Phonesky is not installed.", objArr));
        }
        return 0;
    }

    public final int c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f26080a, str, objArr), th);
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f26080a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f26080a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
