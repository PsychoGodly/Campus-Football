package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: Sta */
public class p7 {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, b> f16253a = null;

    /* renamed from: b  reason: collision with root package name */
    public o7 f16254b = new o7();

    /* renamed from: c  reason: collision with root package name */
    public SensorManager f16255c;

    /* renamed from: d  reason: collision with root package name */
    public g6 f16256d;

    /* renamed from: e  reason: collision with root package name */
    public int f16257e;

    /* renamed from: f  reason: collision with root package name */
    public SensorEventListener f16258f = new a();

    /* compiled from: Sta */
    public class a implements SensorEventListener {
        public a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int size;
            JSONArray jSONArray;
            o7 o7Var = p7.this.f16254b;
            synchronized (o7Var) {
                int type = sensorEvent.sensor.getType();
                SensorEvent sensorEvent2 = o7Var.f16227a.get(Integer.valueOf(type));
                if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                    o7Var.f16227a.put(Integer.valueOf(type), sensorEvent);
                }
                size = o7Var.f16227a.size();
            }
            p7 p7Var = p7.this;
            if (size == p7Var.f16257e) {
                p7Var.f16255c.unregisterListener(p7Var.f16258f);
                p7 p7Var2 = p7.this;
                g6 g6Var = p7Var2.f16256d;
                if (g6Var != null) {
                    try {
                        jSONArray = p7Var2.f16254b.a();
                    } catch (Exception unused) {
                        jSONArray = null;
                    }
                    g6Var.a(jSONArray);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f16260a;

        /* renamed from: b  reason: collision with root package name */
        public int f16261b;

        public b(p7 p7Var, int i10, int i11) {
            this.f16260a = i10;
            this.f16261b = i11;
        }
    }

    public p7(Context context, g6 g6Var) {
        this.f16255c = (SensorManager) context.getSystemService("sensor");
        this.f16256d = g6Var;
        this.f16257e = 0;
        a();
    }

    public final void a() {
        this.f16253a = new HashMap<>();
        SensorsConfig I = MetaData.f17070k.I();
        a(13, I.a());
        a(9, I.b());
        a(5, I.d());
        a(10, I.e());
        a(2, I.f());
        a(6, I.g());
        a(12, I.i());
        a(11, I.j());
        a(16, I.c());
    }

    public void b() {
        Sensor defaultSensor;
        for (Integer intValue : this.f16253a.keySet()) {
            int intValue2 = intValue.intValue();
            b bVar = this.f16253a.get(Integer.valueOf(intValue2));
            if (Build.VERSION.SDK_INT >= bVar.f16260a && (defaultSensor = this.f16255c.getDefaultSensor(intValue2)) != null) {
                this.f16255c.registerListener(this.f16258f, defaultSensor, bVar.f16261b);
                this.f16257e++;
            }
        }
    }

    public final void a(int i10, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f16253a.put(Integer.valueOf(i10), new b(this, baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
