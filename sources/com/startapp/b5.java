package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class b5 {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicInteger f15643j = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final Context f15644a;

    /* renamed from: b  reason: collision with root package name */
    public final e f15645b;

    /* renamed from: c  reason: collision with root package name */
    public final i2<MotionMetadata> f15646c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f15647d;

    /* renamed from: e  reason: collision with root package name */
    public d5 f15648e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15649f;

    /* renamed from: g  reason: collision with root package name */
    public int f15650g;

    /* renamed from: h  reason: collision with root package name */
    public Sensor f15651h;

    /* renamed from: i  reason: collision with root package name */
    public final SensorEventListener f15652i = new a();

    /* compiled from: Sta */
    public class a implements SensorEventListener {
        public a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                b5 b5Var = b5.this;
                d5 d5Var = b5Var.f15648e;
                if (d5Var != null) {
                    if (!(d5Var.f15734a.offer(sensorEvent))) {
                        b5Var.a(8, (Throwable) null);
                    }
                }
            } catch (OutOfMemoryError unused) {
                b5 b5Var2 = b5.this;
                b5Var2.getClass();
                b5Var2.e();
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    public b5(Context context, e eVar, i2<MotionMetadata> i2Var, Handler handler) {
        this.f15644a = context;
        this.f15645b = eVar;
        this.f15646c = i2Var;
        this.f15647d = handler;
    }

    public final MotionMetadata a() {
        MotionMetadata a10 = this.f15646c.a();
        if (a10 == null || !a10.u()) {
            return null;
        }
        return a10;
    }

    public double b() {
        MotionMetadata a10 = a();
        if (a10 == null) {
            return -1.0d;
        }
        d5 d5Var = this.f15648e;
        if (d5Var != null) {
            return Double.longBitsToDouble(d5Var.f15736c.get());
        }
        return ((double) this.f15645b.getFloat("e9142de3c7cc5952", 0.0f)) * x.a(System.currentTimeMillis(), this.f15645b.getLong("7783513af1730383", 0), a10.b(), a10.a(), a10.c(), k9.a(0.0d, a10.a(), a10.c()));
    }

    public final void c() {
        if (this.f15648e != null) {
            e.a a10 = this.f15645b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f15648e.f15737d.get());
            a10.a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            a10.f17013a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            long j10 = this.f15648e.f15738e.get();
            a10.a("7783513af1730383", Long.valueOf(j10));
            a10.f17013a.putLong("7783513af1730383", j10);
            a10.apply();
            if (a(4)) {
                i3 i3Var = new i3(j3.f15951d);
                i3Var.f15914d = "MP.save";
                i3Var.f15915e = String.format(Locale.ENGLISH, "%.6f", new Object[]{Double.valueOf(b())});
                i3Var.a();
            }
        }
    }

    public final void d() {
        SensorManager sensorManager;
        MotionMetadata a10 = a();
        if (a10 != null && (sensorManager = (SensorManager) this.f15644a.getSystemService("sensor")) != null && Build.VERSION.SDK_INT >= 9 && this.f15651h == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            int min = Math.min(Math.max(10000, (int) (j9.e(a10.r()) * 1000)), 100000);
            if (defaultSensor != null && sensorManager.registerListener(this.f15652i, defaultSensor, min)) {
                this.f15651h = defaultSensor;
                double d10 = (double) this.f15645b.getFloat("e9142de3c7cc5952", 0.0f);
                long j10 = this.f15645b.getLong("7783513af1730383", 0);
                d5 d5Var = this.f15648e;
                if (d5Var != null) {
                    d5Var.interrupt();
                    this.f15648e = null;
                }
                if (this.f15648e == null) {
                    StringBuilder a11 = p0.a("startapp-mp-");
                    a11.append(f15643j.incrementAndGet());
                    d5 d5Var2 = new d5(a11.toString(), this.f15644a, a10, a10.q(), d10, j10);
                    this.f15648e = d5Var2;
                    d5Var2.start();
                }
                if (a(1)) {
                    i3 i3Var = new i3(j3.f15951d);
                    i3Var.f15914d = "MP.start";
                    i3Var.f15915e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
                    i3Var.a();
                }
            }
        }
    }

    public final void e() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f15644a.getSystemService("sensor");
        if (sensorManager != null && (sensor = this.f15651h) != null) {
            sensorManager.unregisterListener(this.f15652i, sensor);
            this.f15651h = null;
            c();
            d5 d5Var = this.f15648e;
            if (d5Var != null) {
                d5Var.interrupt();
                this.f15648e = null;
            }
            if (a(2)) {
                i3 i3Var = new i3(j3.f15951d);
                i3Var.f15914d = "MP.stop";
                i3Var.a();
            }
        }
    }

    public final boolean a(int i10) {
        MotionMetadata a10;
        if (!this.f15649f || (a10 = a()) == null || (i10 & a10.j()) == 0) {
            return false;
        }
        return true;
    }

    public final void a(int i10, Throwable th) {
        if (a(i10)) {
            int i11 = this.f15650g;
            if (!((i11 & i10) != 0)) {
                this.f15650g = i11 | i10;
                if (th != null) {
                    i3.a(th);
                    return;
                }
                i3 i3Var = new i3(j3.f15952e);
                i3Var.f15914d = "MP";
                i3Var.f15915e = String.valueOf(i10);
                i3Var.a();
            }
        }
    }
}
