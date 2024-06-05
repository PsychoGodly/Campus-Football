package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f14837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f14838b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14839c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14840d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f14841f;

    public /* synthetic */ m(t tVar, AtomicInteger atomicInteger, int i10, int i11, int i12) {
        this.f14837a = tVar;
        this.f14838b = atomicInteger;
        this.f14839c = i10;
        this.f14840d = i11;
        this.f14841f = i12;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f14837a.h(this.f14838b, this.f14839c, this.f14840d, this.f14841f, dialogInterface, i10);
    }
}
