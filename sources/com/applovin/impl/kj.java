package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class kj implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final int f9022a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9023b;

    /* renamed from: c  reason: collision with root package name */
    private final SensorManager f9024c;

    /* renamed from: d  reason: collision with root package name */
    private final Sensor f9025d;

    /* renamed from: f  reason: collision with root package name */
    private final Sensor f9026f;

    /* renamed from: g  reason: collision with root package name */
    private final k f9027g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f9028h;

    /* renamed from: i  reason: collision with root package name */
    private float f9029i;

    public kj(k kVar) {
        this.f9027g = kVar;
        SensorManager sensorManager = (SensorManager) k.k().getSystemService("sensor");
        this.f9024c = sensorManager;
        this.f9025d = sensorManager.getDefaultSensor(9);
        this.f9026f = sensorManager.getDefaultSensor(4);
        this.f9022a = ((Integer) kVar.a(oj.f10380p4)).intValue();
        this.f9023b = ((Float) kVar.a(oj.f10372o4)).floatValue();
    }

    public float a() {
        float[] fArr = this.f9028h;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos((double) (fArr[2] / 9.81f)));
    }

    public float b() {
        return this.f9029i;
    }

    public void c() {
        if (!Boolean.parseBoolean(this.f9027g.g0().getExtraParameters().get("disable_sensor_data_collection"))) {
            this.f9024c.unregisterListener(this);
            if (((Boolean) this.f9027g.h0().a(oj.f10348l4)).booleanValue()) {
                a(this.f9025d);
            }
            if (((Boolean) this.f9027g.h0().a(oj.f10356m4)).booleanValue()) {
                a(this.f9026f);
            }
            AppLovinBroadcastManager.unregisterReceiver(this);
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f9024c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f9028h = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f9029i * this.f9023b;
            this.f9029i = f10;
            this.f9029i = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }

    private void a(Sensor sensor) {
        try {
            this.f9024c.registerListener(this, sensor, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f9022a));
        } catch (Throwable th) {
            this.f9027g.L();
            if (t.a()) {
                this.f9027g.L().a("SensorDataManager", "Unable to register sensor listener", th);
            }
        }
    }
}
