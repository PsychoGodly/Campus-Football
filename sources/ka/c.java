package ka;

import com.onesignal.t2;

/* compiled from: LanguageProviderAppDefined */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final t2 f29177a;

    public c(t2 t2Var) {
        this.f29177a = t2Var;
    }

    public String a() {
        t2 t2Var = this.f29177a;
        return t2Var.e(t2Var.f(), "PREFS_OS_LANGUAGE", "en");
    }

    public void b(String str) {
        t2 t2Var = this.f29177a;
        t2Var.i(t2Var.f(), "PREFS_OS_LANGUAGE", str);
    }
}
