package com.startapp;

import android.content.Context;
import android.hardware.SensorEvent;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
public class d5 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final BlockingDeque<SensorEvent> f15734a;

    /* renamed from: b  reason: collision with root package name */
    public final v8 f15735b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicLong f15736c = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f15737d = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: e  reason: collision with root package name */
    public final AtomicLong f15738e = new AtomicLong(0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d5(String str, Context context, MotionMetadata motionMetadata, int i10, double d10, long j10) {
        super(str);
        v8 v8Var = new v8(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f15735b = v8Var;
        v8Var.a(d10, j10);
        this.f15734a = new LinkedBlockingDeque(i10);
    }

    public void run() {
        while (true) {
            try {
                SensorEvent take = this.f15734a.take();
                if (take != null) {
                    v8 v8Var = this.f15735b;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = take.timestamp;
                    float[] fArr = take.values;
                    v8Var.a(currentTimeMillis, j10, (double) fArr[0], (double) fArr[1], (double) fArr[2]);
                    this.f15736c.set(Double.doubleToRawLongBits(this.f15735b.f17425k.f17526i));
                    this.f15737d.set(Double.doubleToRawLongBits(this.f15735b.f17425k.f17524g));
                    this.f15738e.set(this.f15735b.f17425k.f17525h);
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                i3.a(th);
                return;
            }
        }
    }
}
