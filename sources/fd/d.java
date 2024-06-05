package fd;

import com.unity3d.services.core.network.model.HttpRequest;
import dd.m0;
import dd.y0;
import io.grpc.internal.m2;
import io.grpc.internal.r0;
import java.util.ArrayList;
import java.util.List;
import lf.f;
import r6.o;

/* compiled from: Headers */
class d {

    /* renamed from: a  reason: collision with root package name */
    public static final hd.d f32615a;

    /* renamed from: b  reason: collision with root package name */
    public static final hd.d f32616b;

    /* renamed from: c  reason: collision with root package name */
    public static final hd.d f32617c;

    /* renamed from: d  reason: collision with root package name */
    public static final hd.d f32618d;

    /* renamed from: e  reason: collision with root package name */
    public static final hd.d f32619e = new hd.d(r0.f35309j.d(), "application/grpc");

    /* renamed from: f  reason: collision with root package name */
    public static final hd.d f32620f = new hd.d("te", "trailers");

    static {
        f fVar = hd.d.f33000g;
        f32615a = new hd.d(fVar, HttpRequest.DEFAULT_SCHEME);
        f32616b = new hd.d(fVar, "http");
        f fVar2 = hd.d.f32998e;
        f32617c = new hd.d(fVar2, "POST");
        f32618d = new hd.d(fVar2, "GET");
    }

    private static List<hd.d> a(List<hd.d> list, y0 y0Var) {
        byte[][] d10 = m2.d(y0Var);
        for (int i10 = 0; i10 < d10.length; i10 += 2) {
            f k10 = f.k(d10[i10]);
            if (!(k10.p() == 0 || k10.i(0) == 58)) {
                list.add(new hd.d(k10, f.k(d10[i10 + 1])));
            }
        }
        return list;
    }

    public static List<hd.d> b(y0 y0Var, String str, String str2, String str3, boolean z10, boolean z11) {
        o.p(y0Var, "headers");
        o.p(str, "defaultPath");
        o.p(str2, "authority");
        c(y0Var);
        ArrayList arrayList = new ArrayList(m0.a(y0Var) + 7);
        if (z11) {
            arrayList.add(f32616b);
        } else {
            arrayList.add(f32615a);
        }
        if (z10) {
            arrayList.add(f32618d);
        } else {
            arrayList.add(f32617c);
        }
        arrayList.add(new hd.d(hd.d.f33001h, str2));
        arrayList.add(new hd.d(hd.d.f32999f, str));
        arrayList.add(new hd.d(r0.f35311l.d(), str3));
        arrayList.add(f32619e);
        arrayList.add(f32620f);
        return a(arrayList, y0Var);
    }

    private static void c(y0 y0Var) {
        y0Var.e(r0.f35309j);
        y0Var.e(r0.f35310k);
        y0Var.e(r0.f35311l);
    }
}
