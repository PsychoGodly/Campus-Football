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
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class q6 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final k f10876a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f10877b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f10878c;

    /* renamed from: d  reason: collision with root package name */
    private final a f10879d;

    /* renamed from: f  reason: collision with root package name */
    private float f10880f;

    public interface a {
        void a();

        void b();
    }

    public q6(k kVar, a aVar) {
        this.f10876a = kVar;
        SensorManager sensorManager = (SensorManager) k.k().getSystemService("sensor");
        this.f10877b = sensorManager;
        this.f10878c = sensorManager.getDefaultSensor(1);
        this.f10879d = aVar;
    }

    public void a() {
        if (!Boolean.parseBoolean(this.f10876a.g0().getExtraParameters().get("disable_sensor_data_collection"))) {
            this.f10877b.unregisterListener(this);
            this.f10877b.registerListener(this, this.f10878c, (int) TimeUnit.MILLISECONDS.toMicros(50));
            AppLovinBroadcastManager.unregisterReceiver(this);
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f10877b.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10877b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f10880f;
            float f11 = (f10 * 0.5f) + (max * 0.5f);
            this.f10880f = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f10879d.a();
            } else if (f10 > -0.8f && f11 < -0.8f) {
                this.f10879d.b();
            }
        }
    }
}
