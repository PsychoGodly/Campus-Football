package kotlin.jvm.internal;

import le.b;
import le.h;

/* compiled from: PropertyReference */
public abstract class u extends d implements h {
    private final boolean syntheticJavaProperty;

    public u() {
        this.syntheticJavaProperty = false;
    }

    public b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (!getOwner().equals(uVar.getOwner()) || !getName().equals(uVar.getName()) || !getSignature().equals(uVar.getSignature()) || !m.a(getBoundReceiver(), uVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* access modifiers changed from: protected */
    public h getReflected() {
        if (!this.syntheticJavaProperty) {
            return (h) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public u(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z10 = false;
        this.syntheticJavaProperty = (i10 & 2) == 2 ? true : z10;
    }
}
