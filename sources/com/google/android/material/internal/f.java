package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import k6.d;

/* compiled from: TextDrawableHelper */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f25846a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final k6.f f25847b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f25848c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f25849d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f25850e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    private d f25851f;

    /* compiled from: TextDrawableHelper */
    class a extends k6.f {
        a() {
        }

        public void a(int i10) {
            boolean unused = f.this.f25849d = true;
            b bVar = (b) f.this.f25850e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z10) {
            if (!z10) {
                boolean unused = f.this.f25849d = true;
                b bVar = (b) f.this.f25850e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f25846a.measureText(charSequence, 0, charSequence.length());
    }

    public d d() {
        return this.f25851f;
    }

    public TextPaint e() {
        return this.f25846a;
    }

    public float f(String str) {
        if (!this.f25849d) {
            return this.f25848c;
        }
        float c10 = c(str);
        this.f25848c = c10;
        this.f25849d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f25850e = new WeakReference<>(bVar);
    }

    public void h(d dVar, Context context) {
        if (this.f25851f != dVar) {
            this.f25851f = dVar;
            if (dVar != null) {
                dVar.j(context, this.f25846a, this.f25847b);
                b bVar = (b) this.f25850e.get();
                if (bVar != null) {
                    this.f25846a.drawableState = bVar.getState();
                }
                dVar.i(context, this.f25846a, this.f25847b);
                this.f25849d = true;
            }
            b bVar2 = (b) this.f25850e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f25849d = z10;
    }

    public void j(Context context) {
        this.f25851f.i(context, this.f25846a, this.f25847b);
    }
}
