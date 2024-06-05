package n2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import k4.n0;
import n2.h;

/* compiled from: PlaybackException */
public class c3 extends Exception implements h {

    /* renamed from: c  reason: collision with root package name */
    private static final String f20197c = n0.r0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f20198d = n0.r0(1);

    /* renamed from: f  reason: collision with root package name */
    private static final String f20199f = n0.r0(2);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20200g = n0.r0(3);

    /* renamed from: h  reason: collision with root package name */
    private static final String f20201h = n0.r0(4);

    /* renamed from: i  reason: collision with root package name */
    public static final h.a<c3> f20202i = b3.f36371a;

    /* renamed from: a  reason: collision with root package name */
    public final int f20203a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20204b;

    protected c3(Bundle bundle) {
        this(bundle.getString(f20199f), c(bundle), bundle.getInt(f20197c, 1000), bundle.getLong(f20198d, SystemClock.elapsedRealtime()));
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(f20200g);
        String string2 = bundle.getString(f20201h);
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, c3.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = b(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    protected c3(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f20203a = i10;
        this.f20204b = j10;
    }
}
