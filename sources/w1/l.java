package w1;

import android.content.Context;
import java.util.List;
import java.util.Objects;
import lc.j;
import lc.k;

/* compiled from: MethodCallHandlerImpl */
final class l implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23503a;

    /* renamed from: b  reason: collision with root package name */
    private final a f23504b;

    /* renamed from: c  reason: collision with root package name */
    private final n f23505c;

    /* renamed from: d  reason: collision with root package name */
    private final p f23506d;

    l(Context context, a aVar, n nVar, p pVar) {
        this.f23503a = context;
        this.f23504b = aVar;
        this.f23505c = nVar;
        this.f23506d = pVar;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(jVar.f36117b.toString());
                p pVar = this.f23506d;
                Context context = this.f23503a;
                Objects.requireNonNull(dVar);
                pVar.a(parseInt, context, new k(dVar), new e(dVar));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(jVar.f36117b.toString());
                n nVar = this.f23505c;
                Objects.requireNonNull(dVar);
                nVar.i(parseInt2, new j(dVar), new g(dVar));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(jVar.f36117b.toString());
                n nVar2 = this.f23505c;
                Objects.requireNonNull(dVar);
                nVar2.c(parseInt3, new h(dVar));
                return;
            case 3:
                a aVar = this.f23504b;
                Context context2 = this.f23503a;
                Objects.requireNonNull(dVar);
                aVar.a(context2, new c(dVar), new f(dVar));
                return;
            case 4:
                n nVar3 = this.f23505c;
                Objects.requireNonNull(dVar);
                nVar3.g((List) jVar.b(), new i(dVar), new d(dVar));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
