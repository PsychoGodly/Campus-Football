package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import io.flutter.plugins.webviewflutter.n;

/* compiled from: JavaScriptChannelHostApiImpl */
public class j4 implements n.t {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34283a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34284b;

    /* renamed from: c  reason: collision with root package name */
    private final i4 f34285c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f34286d;

    /* compiled from: JavaScriptChannelHostApiImpl */
    public static class a {
        public h4 a(i4 i4Var, String str, Handler handler) {
            return new h4(i4Var, str, handler);
        }
    }

    public j4(d4 d4Var, a aVar, i4 i4Var, Handler handler) {
        this.f34283a = d4Var;
        this.f34284b = aVar;
        this.f34285c = i4Var;
        this.f34286d = handler;
    }

    public void a(Long l10, String str) {
        this.f34283a.b(this.f34284b.a(this.f34285c, str, this.f34286d), l10.longValue());
    }

    public void b(Handler handler) {
        this.f34286d = handler;
    }
}
