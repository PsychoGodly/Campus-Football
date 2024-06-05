package u3;

import a3.g;
import a3.o;
import android.net.Uri;
import android.text.TextUtils;
import c3.b;
import c3.h;
import c3.h0;
import c3.i0;
import c3.j;
import com.unity3d.services.core.device.MimeTypes;
import f3.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.j0;
import k4.k;
import k4.v;
import n2.r1;
import o2.u1;
import s2.l;
import s2.m;
import v6.e;
import z2.f;

/* compiled from: DefaultHlsExtractorFactory */
public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f22849d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f22850b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22851c;

    public d() {
        this(0, true);
    }

    private static void b(int i10, List<Integer> list) {
        if (e.h(f22849d, i10) != -1 && !list.contains(Integer.valueOf(i10))) {
            list.add(Integer.valueOf(i10));
        }
    }

    private l d(int i10, r1 r1Var, List<r1> list, j0 j0Var) {
        if (i10 == 0) {
            return new b();
        }
        if (i10 == 1) {
            return new c3.e();
        }
        if (i10 == 2) {
            return new h();
        }
        if (i10 == 7) {
            return new f(0, 0);
        }
        if (i10 == 8) {
            return e(j0Var, r1Var, list);
        }
        if (i10 == 11) {
            return f(this.f22850b, this.f22851c, r1Var, list, j0Var);
        }
        if (i10 != 13) {
            return null;
        }
        return new t(r1Var.f20645c, j0Var);
    }

    private static g e(j0 j0Var, r1 r1Var, List<r1> list) {
        int i10 = g(r1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new g(i10, j0Var, (o) null, list);
    }

    private static h0 f(int i10, boolean z10, r1 r1Var, List<r1> list, j0 j0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else if (z10) {
            list = Collections.singletonList(new r1.b().g0("application/cea-608").G());
        } else {
            list = Collections.emptyList();
        }
        String str = r1Var.f20651j;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!v.b(str, MimeTypes.VIDEO_H264)) {
                i11 |= 4;
            }
        }
        return new h0(2, j0Var, (i0.c) new j(i11, list));
    }

    private static boolean g(r1 r1Var) {
        a aVar = r1Var.f20652k;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof q) {
                return !((q) d10).f22966c.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private static boolean h(l lVar, m mVar) throws IOException {
        try {
            boolean e10 = lVar.e(mVar);
            mVar.l();
            return e10;
        } catch (EOFException unused) {
            mVar.l();
            return false;
        } catch (Throwable th) {
            mVar.l();
            throw th;
        }
    }

    /* renamed from: c */
    public b a(Uri uri, r1 r1Var, List<r1> list, j0 j0Var, Map<String, List<String>> map, m mVar, u1 u1Var) throws IOException {
        int a10 = k.a(r1Var.f20654m);
        int b10 = k.b(map);
        int c10 = k.c(uri);
        int[] iArr = f22849d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int b11 : iArr) {
            b(b11, arrayList);
        }
        l lVar = null;
        mVar.l();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            l lVar2 = (l) k4.a.e(d(intValue, r1Var, list, j0Var));
            if (h(lVar2, mVar)) {
                return new b(lVar2, r1Var, j0Var);
            }
            if (lVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                lVar = lVar2;
            }
        }
        return new b((l) k4.a.e(lVar), r1Var, j0Var);
    }

    public d(int i10, boolean z10) {
        this.f22850b = i10;
        this.f22851c = z10;
    }
}
