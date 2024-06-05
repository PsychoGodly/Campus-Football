package kotlin.jvm.internal;

import le.b;
import le.e;

/* compiled from: FunctionReference */
public class j extends d implements i, e {
    private final int arity;
    private final int flags;

    public j(int i10) {
        this(i10, d.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return a0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (!getName().equals(jVar.getName()) || !getSignature().equals(jVar.getSignature()) || this.flags != jVar.flags || this.arity != jVar.arity || !m.a(getBoundReceiver(), jVar.getBoundReceiver()) || !m.a(getOwner(), jVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public j(int i10, Object obj) {
        this(i10, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public e getReflected() {
        return (e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
