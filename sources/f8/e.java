package f8;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter */
class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f28883d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f28884e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f28885a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f28886b;

    /* renamed from: c  reason: collision with root package name */
    private int f28887c;

    e() {
    }

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f28883d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f28887c) + ((double) this.f28885a.e()), (double) f28884e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f28887c = 0;
    }

    public synchronized boolean b() {
        return this.f28887c == 0 || this.f28885a.a() > this.f28886b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f28887c++;
        this.f28886b = this.f28885a.a() + a(i10);
    }
}
