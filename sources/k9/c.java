package k9;

import v8.f;
import v8.j;
import z8.a;

/* compiled from: AI01392xDecoder */
final class c extends h {
    c(a aVar) {
        super(aVar);
    }

    public String d() throws j, f {
        if (c().g() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int f10 = b().f(48, 2);
            sb2.append("(392");
            sb2.append(f10);
            sb2.append(')');
            sb2.append(b().c(50, (String) null).b());
            return sb2.toString();
        }
        throw j.a();
    }
}
