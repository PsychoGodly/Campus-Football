package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.i3;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.u;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdvertisingIdResolver f17137a;

    public a(AdvertisingIdResolver advertisingIdResolver) {
        this.f17137a = advertisingIdResolver;
    }

    public void run() {
        AdvertisingIdResolver advertisingIdResolver;
        AdvertisingIdResolver advertisingIdResolver2;
        AtomicReference<u> atomicReference;
        Context context;
        u uVar;
        try {
            this.f17137a.f17130d.lock();
            try {
                advertisingIdResolver2 = this.f17137a;
                atomicReference = advertisingIdResolver2.f17132f;
                context = advertisingIdResolver2.f17127a;
                uVar = AdvertisingIdResolver.a(context);
            } catch (AdvertisingIdResolver.InternalException e10) {
                advertisingIdResolver2.b(e10.infoEventFlags);
            } catch (Throwable th) {
                try {
                    if (this.f17137a.a(64)) {
                        i3.a(th);
                    }
                    advertisingIdResolver = this.f17137a;
                } catch (Throwable th2) {
                    this.f17137a.f17134h = 2;
                    this.f17137a.f17131e.signalAll();
                    this.f17137a.f17130d.unlock();
                    throw th2;
                }
            }
            atomicReference.set(uVar);
            advertisingIdResolver = this.f17137a;
            advertisingIdResolver.f17134h = 2;
            this.f17137a.f17131e.signalAll();
            this.f17137a.f17130d.unlock();
            try {
                uVar = AdvertisingIdResolver.b(context);
            } catch (AdvertisingIdResolver.InternalException e11) {
                advertisingIdResolver2.b(e11.infoEventFlags);
                uVar = u.f17340d;
                atomicReference.set(uVar);
                advertisingIdResolver = this.f17137a;
                advertisingIdResolver.f17134h = 2;
                this.f17137a.f17131e.signalAll();
                this.f17137a.f17130d.unlock();
            } catch (Throwable th3) {
                if (advertisingIdResolver2.a(256)) {
                    i3.a(th3);
                }
                uVar = u.f17340d;
                atomicReference.set(uVar);
                advertisingIdResolver = this.f17137a;
                advertisingIdResolver.f17134h = 2;
                this.f17137a.f17131e.signalAll();
                this.f17137a.f17130d.unlock();
            }
            atomicReference.set(uVar);
            advertisingIdResolver = this.f17137a;
            advertisingIdResolver.f17134h = 2;
            this.f17137a.f17131e.signalAll();
            this.f17137a.f17130d.unlock();
        } catch (Throwable th4) {
            this.f17137a.f17134h = 2;
            if (this.f17137a.a(16384)) {
                i3.a(th4);
            }
        }
    }
}
