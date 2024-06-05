package z9;

import android.content.Context;
import ca.f;
import java.util.Date;
import x9.o;
import z9.d;

public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f31512f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected f f31513a = new f();

    /* renamed from: b  reason: collision with root package name */
    private Date f31514b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31515c;

    /* renamed from: d  reason: collision with root package name */
    private d f31516d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31517e;

    private a(d dVar) {
        this.f31516d = dVar;
    }

    public static a a() {
        return f31512f;
    }

    private void d() {
        if (this.f31515c && this.f31514b != null) {
            for (o p10 : c.e().a()) {
                p10.p().e(c());
            }
        }
    }

    public void a(boolean z10) {
        if (!this.f31517e && z10) {
            e();
        }
        this.f31517e = z10;
    }

    public void b(Context context) {
        if (!this.f31515c) {
            this.f31516d.a(context);
            this.f31516d.b(this);
            this.f31516d.i();
            this.f31517e = this.f31516d.g();
            this.f31515c = true;
        }
    }

    public Date c() {
        Date date = this.f31514b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date a10 = this.f31513a.a();
        Date date = this.f31514b;
        if (date == null || a10.after(date)) {
            this.f31514b = a10;
            d();
        }
    }
}
