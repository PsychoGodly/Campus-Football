package nd;

import dc.a;
import kotlin.jvm.internal.m;
import pd.b;
import sb.a;

/* compiled from: PdfxPlugin.kt */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final pd.a f36509a = new pd.a();

    /* renamed from: b  reason: collision with root package name */
    private final b f36510b = new b();

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "flutterPluginBinding");
        sb.m.x(bVar.b(), new a(bVar, this.f36509a, this.f36510b));
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "binding");
        sb.m.x(bVar.b(), (a.g) null);
        this.f36509a.a();
        this.f36510b.a();
    }
}
