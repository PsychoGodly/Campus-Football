package i4;

import android.os.SystemClock;
import i4.u;
import j4.g0;
import java.util.Arrays;
import java.util.List;
import n2.h4;
import p3.x0;
import p3.z0;
import s6.u;

/* compiled from: TrackSelectionUtil */
public final class a0 {
    public static h4 a(u.a aVar, v[] vVarArr) {
        List[] listArr = new List[vVarArr.length];
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            v vVar = vVarArr[i10];
            listArr[i10] = vVar != null ? s6.u.z(vVar) : s6.u.y();
        }
        return b(aVar, listArr);
    }

    public static h4 b(u.a aVar, List<? extends v>[] listArr) {
        boolean z10;
        u.a aVar2 = aVar;
        u.a aVar3 = new u.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            z0 f10 = aVar2.f(i10);
            List<? extends v> list = listArr[i10];
            for (int i11 = 0; i11 < f10.f21696a; i11++) {
                x0 b10 = f10.b(i11);
                boolean z11 = aVar2.a(i10, i11, false) != 0;
                int i12 = b10.f21688a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f21688a; i13++) {
                    iArr[i13] = aVar2.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        v vVar = (v) list.get(i14);
                        if (vVar.a().equals(b10) && vVar.u(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar3.a(new h4.a(b10, z11, iArr, zArr));
            }
        }
        z0 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f21696a; i15++) {
            x0 b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f21688a];
            Arrays.fill(iArr2, 0);
            aVar3.a(new h4.a(b11, false, iArr2, new boolean[b11.f21688a]));
        }
        return new h4(aVar3.k());
    }

    public static g0.a c(s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.h(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new g0.a(1, 0, length, i10);
    }
}
