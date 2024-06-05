package androidx.webkit.internal;

import androidx.webkit.internal.a;
import j1.c;
import j1.d;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* compiled from: ProxyControllerImpl */
public class q extends d {

    /* renamed from: a  reason: collision with root package name */
    private ProxyControllerBoundaryInterface f5052a;

    private ProxyControllerBoundaryInterface d() {
        if (this.f5052a == null) {
            this.f5052a = h0.d().getProxyController();
        }
        return this.f5052a;
    }

    public static String[][] e(List<c.b> list) {
        int size = list.size();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = size;
        String[][] strArr = (String[][]) Array.newInstance(String.class, iArr);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).a();
            strArr[i10][1] = list.get(i10).b();
        }
        return strArr;
    }

    public void a(Executor executor, Runnable runnable) {
        if (g0.Q.c()) {
            d().clearProxyOverride(runnable, executor);
            return;
        }
        throw g0.a();
    }

    public void c(c cVar, Executor executor, Runnable runnable) {
        a.d dVar = g0.Q;
        a.d dVar2 = g0.X;
        String[][] e10 = e(cVar.b());
        String[] strArr = (String[]) cVar.a().toArray(new String[0]);
        if (dVar.c() && !cVar.c()) {
            d().setProxyOverride(e10, strArr, runnable, executor);
        } else if (!dVar.c() || !dVar2.c()) {
            throw g0.a();
        } else {
            d().setProxyOverride(e10, strArr, runnable, executor, cVar.c());
        }
    }
}
