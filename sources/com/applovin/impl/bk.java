package com.applovin.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

public abstract class bk extends yj implements ll {

    /* renamed from: n  reason: collision with root package name */
    private final String f6734n;

    protected bk(String str) {
        super(new ol[2], new pl[2]);
        this.f6734n = str;
        a(1024);
    }

    /* access modifiers changed from: protected */
    public abstract kl a(byte[] bArr, int i10, boolean z10);

    public void a(long j10) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ml a(Throwable th) {
        return new ml("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final ol f() {
        return new ol();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final pl g() {
        return new ck(new mv(this));
    }

    /* access modifiers changed from: protected */
    public final ml a(ol olVar, pl plVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a1.a((Object) olVar.f9906c);
            pl plVar2 = plVar;
            plVar2.a(olVar.f9908f, a(byteBuffer.array(), byteBuffer.limit(), z10), olVar.f10488j);
            plVar.c(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (ml e10) {
            return e10;
        }
    }
}
