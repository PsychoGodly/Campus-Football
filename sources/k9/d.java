package k9;

import v8.f;
import v8.j;
import z8.a;

/* compiled from: AI01393xDecoder */
final class d extends h {
    d(a aVar) {
        super(aVar);
    }

    public String d() throws j, f {
        if (c().g() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int f10 = b().f(48, 2);
            sb2.append("(393");
            sb2.append(f10);
            sb2.append(')');
            int f11 = b().f(50, 10);
            if (f11 / 100 == 0) {
                sb2.append('0');
            }
            if (f11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f11);
            sb2.append(b().c(60, (String) null).b());
            return sb2.toString();
        }
        throw j.a();
    }
}
