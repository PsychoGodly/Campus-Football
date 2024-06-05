package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class s extends o {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y f26087b;

    s(y yVar) {
        this.f26087b = yVar;
    }

    public final void b() {
        y yVar = this.f26087b;
        if (yVar.f26105m != null) {
            yVar.f26094b.d("Unbind from service.", new Object[0]);
            y yVar2 = this.f26087b;
            yVar2.f26093a.unbindService(yVar2.f26104l);
            this.f26087b.f26099g = false;
            this.f26087b.f26105m = null;
            this.f26087b.f26104l = null;
        }
        this.f26087b.t();
    }
}
