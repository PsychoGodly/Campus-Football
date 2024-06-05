package k5;

import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.i;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f19825a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19826b;

    /* renamed from: c  reason: collision with root package name */
    private final i f19827c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19828d;

    public a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = MaxReward.DEFAULT_LABEL;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f19826b = str2;
        this.f19825a = str;
        this.f19827c = new i(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f19825a, i10)) {
            i10++;
        }
        this.f19828d = i10;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f19825a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.e(this.f19825a, d(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f19825a, d(str, objArr));
    }

    /* access modifiers changed from: protected */
    public String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f19826b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f19825a, d(str, objArr));
    }

    public boolean f(int i10) {
        return this.f19828d <= i10;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f19825a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f19825a, d(str, objArr));
    }

    public void i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f19825a, d(str, objArr), th);
    }

    public void j(Throwable th) {
        Log.wtf(this.f19825a, th);
    }
}
