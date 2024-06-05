package androidx.work;

import android.util.Log;

/* compiled from: Logger */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f5331a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f5332b = 20;

    /* compiled from: Logger */
    public static class a extends p {

        /* renamed from: c  reason: collision with root package name */
        private int f5333c;

        public a(int i10) {
            super(i10);
            this.f5333c = i10;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.f5333c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.f5333c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.f5333c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        public void g(String str, String str2, Throwable... thArr) {
            if (this.f5333c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        public void h(String str, String str2, Throwable... thArr) {
            if (this.f5333c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public p(int i10) {
    }

    public static synchronized p c() {
        p pVar;
        synchronized (p.class) {
            if (f5331a == null) {
                f5331a = new a(3);
            }
            pVar = f5331a;
        }
        return pVar;
    }

    public static synchronized void e(p pVar) {
        synchronized (p.class) {
            f5331a = pVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f5332b;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
