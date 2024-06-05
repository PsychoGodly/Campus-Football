package pe;

import ue.l0;

/* compiled from: JobSupport.kt */
public final class l2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f37352a = new l0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f37353b = new l0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f37354c = new l0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f37355d = new l0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final l0 f37356e = new l0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final l1 f37357f = new l1(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final l1 f37358g = new l1(true);

    public static final Object g(Object obj) {
        return obj instanceof x1 ? new y1((x1) obj) : obj;
    }

    public static final Object h(Object obj) {
        x1 x1Var;
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        return (y1Var == null || (x1Var = y1Var.f37415a) == null) ? obj : x1Var;
    }
}
