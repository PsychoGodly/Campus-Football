package k6;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f29115a;

    /* renamed from: b  reason: collision with root package name */
    private final C0308a f29116b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29117c;

    /* renamed from: k6.a$a  reason: collision with other inner class name */
    /* compiled from: CancelableFontCallback */
    public interface C0308a {
        void a(Typeface typeface);
    }

    public a(C0308a aVar, Typeface typeface) {
        this.f29115a = typeface;
        this.f29116b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.f29117c) {
            this.f29116b.a(typeface);
        }
    }

    public void a(int i10) {
        d(this.f29115a);
    }

    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f29117c = true;
    }
}
