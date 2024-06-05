package z9;

import android.content.Context;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static f f31529b = new f();

    /* renamed from: a  reason: collision with root package name */
    private Context f31530a;

    private f() {
    }

    public static f c() {
        return f31529b;
    }

    public Context a() {
        return this.f31530a;
    }

    public void b(Context context) {
        this.f31530a = context != null ? context.getApplicationContext() : null;
    }
}
