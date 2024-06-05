package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f14823a;

    public /* synthetic */ k(AtomicInteger atomicInteger) {
        this.f14823a = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f14823a.set(i10);
    }
}
