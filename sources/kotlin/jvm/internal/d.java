package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import le.b;
import le.j;
import le.k;

/* compiled from: CallableReference */
public abstract class d implements b, Serializable {
    public static final Object NO_RECEIVER = a.f36040a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;

    /* compiled from: CallableReference */
    private static class a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final a f36040a = new a();

        private a() {
        }
    }

    public d() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public le.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? a0.c(cls) : a0.b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public b getReflected() {
        b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new ee.b();
    }

    public j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public k getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected d(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
