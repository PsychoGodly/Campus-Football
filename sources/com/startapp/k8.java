package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Sta */
public class k8 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16050a;

    /* renamed from: b  reason: collision with root package name */
    public final v2 f16051b;

    /* renamed from: c  reason: collision with root package name */
    public final e f16052c;

    /* renamed from: d  reason: collision with root package name */
    public final u1 f16053d;

    /* renamed from: e  reason: collision with root package name */
    public final i2<TelephonyMetadata> f16054e;

    /* renamed from: f  reason: collision with root package name */
    public c f16055f;

    /* renamed from: g  reason: collision with root package name */
    public final double f16056g = Math.random();

    /* renamed from: h  reason: collision with root package name */
    public volatile String f16057h = "e106";

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            k8 k8Var = k8.this;
            k8Var.getClass();
            try {
                if (k8Var.a() != null) {
                    c a10 = k8Var.a((Class<?>) SignalStrength.class);
                    if (a10 != null) {
                        a10.a();
                    }
                }
            } catch (Throwable th) {
                if (k8Var.a(8)) {
                    i3.a(th);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public final TelephonyCallback f16059d = new a();

        /* compiled from: Sta */
        public class a extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {
            public a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                b.this.a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                k8.this.a(signalStrength);
                b.this.a(SignalStrength.class, signalStrength);
            }
        }

        public b(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        public void a() {
            this.f16062a.registerTelephonyCallback(k8.this.f16051b, this.f16059d);
        }

        public void b() {
            this.f16062a.unregisterTelephonyCallback(this.f16059d);
        }
    }

    /* compiled from: Sta */
    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final TelephonyManager f16062a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f16063b;

        public c(TelephonyManager telephonyManager, Class<?> cls) {
            this.f16062a = telephonyManager;
            this.f16063b = cls;
        }

        public abstract void a();

        public <T> void a(Class<T> cls, T t10) {
            k8 k8Var = k8.this;
            k8Var.getClass();
            try {
                TelephonyMetadata a10 = k8Var.a();
                if (a10 != null) {
                    if (t10 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String simpleName = cls.getSimpleName();
                        if (a10.a(simpleName).c()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timestamp", currentTimeMillis);
                            jSONObject.put("type", simpleName);
                            jSONObject.put(JsonStorageKeyNames.DATA_KEY, t10.toString());
                            String b10 = j9.b(jSONObject.toString());
                            e.a a11 = k8Var.f16052c.edit();
                            a11.a(simpleName, b10);
                            a11.f17013a.putString(simpleName, b10);
                            a11.apply();
                        }
                    }
                }
            } catch (Throwable th) {
                if (k8Var.a(2)) {
                    i3.a(th);
                }
            }
            if (cls.equals(this.f16063b)) {
                try {
                    b();
                } catch (Throwable th2) {
                    if (k8.this.a(16)) {
                        i3.a(th2);
                    }
                }
            }
        }

        public abstract void b();
    }

    /* compiled from: Sta */
    public class d extends c {

        /* renamed from: d  reason: collision with root package name */
        public final PhoneStateListener f16065d = new a();

        /* compiled from: Sta */
        public class a extends PhoneStateListener {
            public a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                d.this.a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                k8.this.a(signalStrength);
                d.this.a(SignalStrength.class, signalStrength);
            }
        }

        public d(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        public void a() {
            this.f16062a.listen(this.f16065d, 257);
        }

        public void b() {
            this.f16062a.listen(this.f16065d, 0);
        }
    }

    public k8(Context context, v2 v2Var, e eVar, u1 u1Var, i2<TelephonyMetadata> i2Var) {
        this.f16050a = context;
        this.f16051b = v2Var;
        this.f16052c = eVar;
        this.f16053d = u1Var;
        this.f16054e = i2Var;
    }

    public final c a(Class<?> cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f16050a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return new d(telephonyManager, cls);
        }
        return new b(telephonyManager, cls);
    }

    public void b() {
        this.f16051b.execute(new a());
    }

    public final TelephonyMetadata a() {
        TelephonyMetadata a10;
        if (!this.f16053d.c() || (a10 = this.f16054e.a()) == null || !a10.c()) {
            return null;
        }
        return a10;
    }

    public boolean a(int i10) {
        TelephonyMetadata a10 = a();
        if (a10 == null || this.f16056g >= a10.b() || (a10.a() & i10) != i10) {
            return false;
        }
        return true;
    }

    public void a(SignalStrength signalStrength) {
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f16057h = String.valueOf(signalStrength.getLevel());
                } else {
                    this.f16057h = String.valueOf(SignalStrength.class.getMethod("getLevel", new Class[0]).invoke(signalStrength, new Object[0]));
                }
            } catch (NoSuchMethodException unused) {
                this.f16057h = "e104";
            } catch (Throwable unused2) {
                this.f16057h = "e105";
            }
        }
    }

    public Map<String, String> a(j3 j3Var) {
        List<String> a10;
        TelephonyMetadata a11 = a();
        if (a11 == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = null;
        for (Map.Entry next : this.f16052c.getAll().entrySet()) {
            Object value = next.getValue();
            if (value instanceof String) {
                String str = (String) next.getKey();
                TelephonyDataConfig a12 = a11.a(str);
                if (a12.c() && (a10 = a12.a()) != null && a10.contains(j3Var.f15965a)) {
                    String b10 = a12.b();
                    if (b10 != null) {
                        str = b10;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }
}
