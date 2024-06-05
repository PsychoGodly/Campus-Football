package kotlin.jvm.internal;

import le.c;
import le.d;
import le.e;
import le.g;
import le.i;

/* compiled from: ReflectionFactory */
public class b0 {
    public e a(j jVar) {
        return jVar;
    }

    public c b(Class cls) {
        return new f(cls);
    }

    public d c(Class cls, String str) {
        return new r(cls, str);
    }

    public g d(o oVar) {
        return oVar;
    }

    public i e(s sVar) {
        return sVar;
    }

    public String f(i iVar) {
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(n nVar) {
        return f(nVar);
    }
}
