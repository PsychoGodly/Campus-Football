package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import j0.a;

/* compiled from: EmojiMetadata */
public class g {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<a> f3367d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f3368a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3369b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f3370c = 0;

    g(m mVar, int i10) {
        this.f3369b = mVar;
        this.f3368a = i10;
    }

    private a g() {
        ThreadLocal<a> threadLocal = f3367d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f3369b.d().j(aVar, this.f3368a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f3369b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f3369b.c(), this.f3368a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f3370c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z10) {
        this.f3370c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
