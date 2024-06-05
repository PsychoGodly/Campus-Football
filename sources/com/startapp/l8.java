package com.startapp;

import android.os.Build;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sta */
public class l8 implements Iterator<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f16098a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable[] f16099b;

    /* renamed from: c  reason: collision with root package name */
    public int f16100c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16101d;

    public l8(Throwable th) {
        this.f16098a = th;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f16099b = th.getSuppressed();
        }
    }

    /* renamed from: a */
    public Throwable next() {
        int i10;
        Throwable th = this.f16098a;
        boolean z10 = false;
        this.f16101d = false;
        if (th != null) {
            this.f16098a = th.getCause();
        } else {
            Throwable[] thArr = this.f16099b;
            if (thArr != null && (i10 = this.f16100c) < thArr.length) {
                if (i10 == 0) {
                    z10 = true;
                }
                this.f16101d = z10;
                this.f16100c = i10 + 1;
                th = thArr[i10];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f16099b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r2 = this;
            java.lang.Throwable r0 = r2.f16098a
            if (r0 != 0) goto L_0x0010
            java.lang.Throwable[] r0 = r2.f16099b
            if (r0 == 0) goto L_0x000e
            int r1 = r2.f16100c
            int r0 = r0.length
            if (r1 >= r0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.l8.hasNext():boolean");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
