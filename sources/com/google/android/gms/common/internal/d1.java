package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import h5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class d1 extends q0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f15370g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f15371h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f15371h = cVar;
        this.f15370g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(b bVar) {
        if (this.f15371h.zzx != null) {
            this.f15371h.zzx.onConnectionFailed(bVar);
        }
        this.f15371h.onConnectionFailed(bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        try {
            IBinder iBinder = this.f15370g;
            q.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f15371h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f15371h.getServiceDescriptor();
                Log.w("GmsClient", "service descriptor mismatch: " + serviceDescriptor + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = this.f15371h.createServiceInterface(this.f15370g);
            if (createServiceInterface == null || (!c.zzn(this.f15371h, 2, 4, createServiceInterface) && !c.zzn(this.f15371h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f15371h.zzB = null;
            Bundle connectionHint = this.f15371h.getConnectionHint();
            c cVar = this.f15371h;
            if (cVar.zzw == null) {
                return true;
            }
            cVar.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
