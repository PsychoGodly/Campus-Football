package ka;

import com.onesignal.t2;

/* compiled from: LanguageContext */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f29175b;

    /* renamed from: a  reason: collision with root package name */
    private b f29176a;

    public a(t2 t2Var) {
        f29175b = this;
        if (t2Var.e(t2Var.f(), "PREFS_OS_LANGUAGE", (String) null) != null) {
            this.f29176a = new c(t2Var);
        } else {
            this.f29176a = new d();
        }
    }

    public static a a() {
        return f29175b;
    }

    public String b() {
        return this.f29176a.a();
    }

    public void c(b bVar) {
        this.f29176a = bVar;
    }
}
