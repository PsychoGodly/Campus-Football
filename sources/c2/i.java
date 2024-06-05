package c2;

import android.content.Context;
import l2.a;

/* compiled from: CreationContextFactory */
class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5599a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5600b;

    /* renamed from: c  reason: collision with root package name */
    private final a f5601c;

    i(Context context, a aVar, a aVar2) {
        this.f5599a = context;
        this.f5600b = aVar;
        this.f5601c = aVar2;
    }

    /* access modifiers changed from: package-private */
    public h a(String str) {
        return h.a(this.f5599a, this.f5600b, this.f5601c, str);
    }
}
