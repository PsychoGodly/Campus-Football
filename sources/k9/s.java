package k9;

import v8.f;
import v8.j;
import z8.a;

/* compiled from: GeneralAppIdDecoder */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final a f29172a;

    /* renamed from: b  reason: collision with root package name */
    private final m f29173b = new m();

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f29174c = new StringBuilder();

    s(a aVar) {
        this.f29172a = aVar;
    }

    private n b(int i10) {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 6);
        if (f11 >= 32 && f11 < 58) {
            return new n(i10 + 6, (char) (f11 + 33));
        }
        switch (f11) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f11);
        }
        return new n(i10 + 6, c10);
    }

    private n d(int i10) throws f {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 7);
        if (f11 >= 64 && f11 < 90) {
            return new n(i10 + 7, (char) (f11 + 1));
        }
        if (f11 >= 90 && f11 < 116) {
            return new n(i10 + 7, (char) (f11 + 7));
        }
        switch (f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case 241:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case 243:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case 245:
                c10 = ':';
                break;
            case 246:
                c10 = ';';
                break;
            case 247:
                c10 = '<';
                break;
            case 248:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case 252:
                c10 = ' ';
                break;
            default:
                throw f.a();
        }
        return new n(i10 + 8, c10);
    }

    private p e(int i10) throws f {
        int i11 = i10 + 7;
        if (i11 > this.f29172a.g()) {
            int f10 = f(i10, 4);
            if (f10 == 0) {
                return new p(this.f29172a.g(), 10, 10);
            }
            return new p(this.f29172a.g(), f10 - 1, 10);
        }
        int f11 = f(i10, 7) - 8;
        return new p(i11, f11 / 11, f11 % 11);
    }

    static int g(a aVar, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.c(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    private boolean h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f29172a.g()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f29172a.c(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private boolean i(int i10) {
        int i11;
        if (i10 + 1 > this.f29172a.g()) {
            return false;
        }
        int i12 = 0;
        while (i12 < 5 && (i11 = i12 + i10) < this.f29172a.g()) {
            if (i12 == 2) {
                if (!this.f29172a.c(i10 + 2)) {
                    return false;
                }
            } else if (this.f29172a.c(i11)) {
                return false;
            }
            i12++;
        }
        return true;
    }

    private boolean j(int i10) {
        int i11;
        if (i10 + 1 > this.f29172a.g()) {
            return false;
        }
        int i12 = 0;
        while (i12 < 4 && (i11 = i12 + i10) < this.f29172a.g()) {
            if (this.f29172a.c(i11)) {
                return false;
            }
            i12++;
        }
        return true;
    }

    private boolean k(int i10) {
        int f10;
        if (i10 + 5 > this.f29172a.g()) {
            return false;
        }
        int f11 = f(i10, 5);
        if (f11 >= 5 && f11 < 16) {
            return true;
        }
        if (i10 + 6 <= this.f29172a.g() && (f10 = f(i10, 6)) >= 16 && f10 < 63) {
            return true;
        }
        return false;
    }

    private boolean l(int i10) {
        int f10;
        if (i10 + 5 > this.f29172a.g()) {
            return false;
        }
        int f11 = f(i10, 5);
        if (f11 >= 5 && f11 < 16) {
            return true;
        }
        if (i10 + 7 > this.f29172a.g()) {
            return false;
        }
        int f12 = f(i10, 7);
        if (f12 >= 64 && f12 < 116) {
            return true;
        }
        if (i10 + 8 <= this.f29172a.g() && (f10 = f(i10, 8)) >= 232 && f10 < 253) {
            return true;
        }
        return false;
    }

    private boolean m(int i10) {
        if (i10 + 7 <= this.f29172a.g()) {
            int i11 = i10;
            while (true) {
                int i12 = i10 + 3;
                if (i11 >= i12) {
                    return this.f29172a.c(i12);
                }
                if (this.f29172a.c(i11)) {
                    return true;
                }
                i11++;
            }
        } else if (i10 + 4 <= this.f29172a.g()) {
            return true;
        } else {
            return false;
        }
    }

    private l n() {
        while (k(this.f29173b.a())) {
            n b10 = b(this.f29173b.a());
            this.f29173b.h(b10.a());
            if (b10.c()) {
                return new l(new o(this.f29173b.a(), this.f29174c.toString()), true);
            }
            this.f29174c.append(b10.b());
        }
        if (h(this.f29173b.a())) {
            this.f29173b.b(3);
            this.f29173b.g();
        } else if (i(this.f29173b.a())) {
            if (this.f29173b.a() + 5 < this.f29172a.g()) {
                this.f29173b.b(5);
            } else {
                this.f29173b.h(this.f29172a.g());
            }
            this.f29173b.f();
        }
        return new l(false);
    }

    private o o() throws f {
        boolean z10;
        l lVar;
        do {
            int a10 = this.f29173b.a();
            if (this.f29173b.c()) {
                lVar = n();
                z10 = lVar.b();
            } else if (this.f29173b.d()) {
                lVar = p();
                z10 = lVar.b();
            } else {
                lVar = q();
                z10 = lVar.b();
            }
            if (!(a10 != this.f29173b.a()) && !z10) {
                break;
            }
        } while (!z10);
        return lVar.a();
    }

    private l p() throws f {
        while (l(this.f29173b.a())) {
            n d10 = d(this.f29173b.a());
            this.f29173b.h(d10.a());
            if (d10.c()) {
                return new l(new o(this.f29173b.a(), this.f29174c.toString()), true);
            }
            this.f29174c.append(d10.b());
        }
        if (h(this.f29173b.a())) {
            this.f29173b.b(3);
            this.f29173b.g();
        } else if (i(this.f29173b.a())) {
            if (this.f29173b.a() + 5 < this.f29172a.g()) {
                this.f29173b.b(5);
            } else {
                this.f29173b.h(this.f29172a.g());
            }
            this.f29173b.e();
        }
        return new l(false);
    }

    private l q() throws f {
        o oVar;
        while (m(this.f29173b.a())) {
            p e10 = e(this.f29173b.a());
            this.f29173b.h(e10.a());
            if (e10.d()) {
                if (e10.e()) {
                    oVar = new o(this.f29173b.a(), this.f29174c.toString());
                } else {
                    oVar = new o(this.f29173b.a(), this.f29174c.toString(), e10.c());
                }
                return new l(oVar, true);
            }
            this.f29174c.append(e10.b());
            if (e10.e()) {
                return new l(new o(this.f29173b.a(), this.f29174c.toString()), true);
            }
            this.f29174c.append(e10.c());
        }
        if (j(this.f29173b.a())) {
            this.f29173b.e();
            this.f29173b.b(4);
        }
        return new l(false);
    }

    /* access modifiers changed from: package-private */
    public String a(StringBuilder sb2, int i10) throws j, f {
        String str = null;
        while (true) {
            o c10 = c(i10, str);
            String a10 = r.a(c10.b());
            if (a10 != null) {
                sb2.append(a10);
            }
            String valueOf = c10.d() ? String.valueOf(c10.c()) : null;
            if (i10 == c10.a()) {
                return sb2.toString();
            }
            i10 = c10.a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    public o c(int i10, String str) throws f {
        this.f29174c.setLength(0);
        if (str != null) {
            this.f29174c.append(str);
        }
        this.f29173b.h(i10);
        o o10 = o();
        if (o10 == null || !o10.d()) {
            return new o(this.f29173b.a(), this.f29174c.toString());
        }
        return new o(this.f29173b.a(), this.f29174c.toString(), o10.c());
    }

    /* access modifiers changed from: package-private */
    public int f(int i10, int i11) {
        return g(this.f29172a, i10, i11);
    }
}
