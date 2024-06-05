package e5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f17930c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f17931d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f17932a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f17933b;

    a(Context context) {
        this.f17933b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        q.k(context);
        Lock lock = f17930c;
        lock.lock();
        try {
            if (f17931d == null) {
                f17931d = new a(context.getApplicationContext());
            }
            a aVar = f17931d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f17930c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.J(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        this.f17932a.lock();
        try {
            return this.f17933b.getString(str, (String) null);
        } finally {
            this.f17932a.unlock();
        }
    }
}
