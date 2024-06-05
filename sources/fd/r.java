package fd;

import dd.m0;
import dd.y0;
import hd.d;
import io.grpc.internal.m2;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: Utils */
class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f32771a = Logger.getLogger(r.class.getName());

    private r() {
    }

    public static y0 a(List<d> list) {
        return m0.c(b(list));
    }

    private static byte[][] b(List<d> list) {
        byte[][] bArr = new byte[(list.size() * 2)][];
        int i10 = 0;
        for (d next : list) {
            int i11 = i10 + 1;
            bArr[i10] = next.f33004a.t();
            i10 = i11 + 1;
            bArr[i11] = next.f33005b.t();
        }
        return m2.e(bArr);
    }

    public static y0 c(List<d> list) {
        return m0.c(b(list));
    }
}
