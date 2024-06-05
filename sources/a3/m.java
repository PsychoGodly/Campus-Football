package a3;

import f3.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l3.c;
import n2.y2;
import r6.s;
import s2.a0;

/* compiled from: SefReader */
final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final s f313d = s.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final s f314e = s.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f315a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f316b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f317c;

    /* compiled from: SefReader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f318a;

        /* renamed from: b  reason: collision with root package name */
        public final long f319b;

        /* renamed from: c  reason: collision with root package name */
        public final int f320c;

        public a(int i10, long j10, int i11) {
            this.f318a = i10;
            this.f319b = j10;
            this.f320c = i11;
        }
    }

    private void a(s2.m mVar, a0 a0Var) throws IOException {
        k4.a0 a0Var2 = new k4.a0(8);
        mVar.readFully(a0Var2.e(), 0, 8);
        this.f317c = a0Var2.t() + 8;
        if (a0Var2.p() != 1397048916) {
            a0Var.f22378a = 0;
            return;
        }
        a0Var.f22378a = mVar.c() - ((long) (this.f317c - 12));
        this.f316b = 2;
    }

    private static int b(String str) throws y2 {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw y2.a("Invalid SEF name", (Throwable) null);
        }
    }

    private void d(s2.m mVar, a0 a0Var) throws IOException {
        long b10 = mVar.b();
        int i10 = (this.f317c - 12) - 8;
        k4.a0 a0Var2 = new k4.a0(i10);
        mVar.readFully(a0Var2.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            a0Var2.U(2);
            short v10 = a0Var2.v();
            if (v10 == 2192 || v10 == 2816 || v10 == 2817 || v10 == 2819 || v10 == 2820) {
                this.f315a.add(new a(v10, (b10 - ((long) this.f317c)) - ((long) a0Var2.t()), a0Var2.t()));
            } else {
                a0Var2.U(8);
            }
        }
        if (this.f315a.isEmpty()) {
            a0Var.f22378a = 0;
            return;
        }
        this.f316b = 3;
        a0Var.f22378a = this.f315a.get(0).f319b;
    }

    private void e(s2.m mVar, List<a.b> list) throws IOException {
        long c10 = mVar.c();
        int b10 = (int) ((mVar.b() - mVar.c()) - ((long) this.f317c));
        k4.a0 a0Var = new k4.a0(b10);
        mVar.readFully(a0Var.e(), 0, b10);
        for (int i10 = 0; i10 < this.f315a.size(); i10++) {
            a aVar = this.f315a.get(i10);
            a0Var.T((int) (aVar.f319b - c10));
            a0Var.U(4);
            int t10 = a0Var.t();
            int b11 = b(a0Var.D(t10));
            int i11 = aVar.f320c - (t10 + 8);
            if (b11 == 2192) {
                list.add(f(a0Var, i11));
            } else if (!(b11 == 2816 || b11 == 2817 || b11 == 2819 || b11 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    private static c f(k4.a0 a0Var, int i10) throws y2 {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f314e.f(a0Var.D(i10));
        int i11 = 0;
        while (i11 < f10.size()) {
            List<String> f11 = f313d.f(f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new c.b(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
                    i11++;
                } catch (NumberFormatException e10) {
                    throw y2.a((String) null, e10);
                }
            } else {
                throw y2.a((String) null, (Throwable) null);
            }
        }
        return new c(arrayList);
    }

    public int c(s2.m mVar, a0 a0Var, List<a.b> list) throws IOException {
        int i10 = this.f316b;
        long j10 = 0;
        if (i10 == 0) {
            long b10 = mVar.b();
            if (b10 != -1 && b10 >= 8) {
                j10 = b10 - 8;
            }
            a0Var.f22378a = j10;
            this.f316b = 1;
        } else if (i10 == 1) {
            a(mVar, a0Var);
        } else if (i10 == 2) {
            d(mVar, a0Var);
        } else if (i10 == 3) {
            e(mVar, list);
            a0Var.f22378a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f315a.clear();
        this.f316b = 0;
    }
}
