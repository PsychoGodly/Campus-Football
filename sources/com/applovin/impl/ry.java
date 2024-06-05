package com.applovin.impl;

import android.media.MediaDrm;
import com.applovin.impl.x7;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ry implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k9 f11245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x7.b f11246b;

    public /* synthetic */ ry(k9 k9Var, x7.b bVar) {
        this.f11245a = k9Var;
        this.f11246b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f11245a.a(this.f11246b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
