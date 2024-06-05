package kotlin.jvm.internal;

import java.io.Serializable;
import le.d;

/* compiled from: AdaptedFunctionReference */
public class a implements i, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    /* access modifiers changed from: protected */
    public final Object receiver;
    private final String signature;

    public a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, d.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.isTopLevel != aVar.isTopLevel || this.arity != aVar.arity || this.flags != aVar.flags || !m.a(this.receiver, aVar.receiver) || !m.a(this.owner, aVar.owner) || !this.name.equals(aVar.name) || !this.signature.equals(aVar.signature)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return this.arity;
    }

    public d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? a0.c(cls) : a0.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        if (cls != null) {
            i10 = cls.hashCode();
        }
        return ((((((((((hashCode + i10) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return a0.f(this);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i11 & 1) == 1;
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
