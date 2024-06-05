package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.w5;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r5.a0;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    private static volatile AppMeasurement f24320b;

    /* renamed from: a  reason: collision with root package name */
    private final a f24321a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            q.k(bundle);
            this.mAppId = (String) r5.q.a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) r5.q.a(bundle, "origin", cls2, null);
            this.mName = (String) r5.q.a(bundle, MediationMetaData.KEY_NAME, cls2, null);
            this.mValue = r5.q.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) r5.q.a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) r5.q.a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) r5.q.a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) r5.q.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) r5.q.a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) r5.q.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) r5.q.a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) r5.q.a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) r5.q.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) r5.q.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) r5.q.a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) r5.q.a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    private static abstract class a implements a0 {
        private a() {
        }
    }

    private AppMeasurement(w5 w5Var) {
        this.f24321a = new a(w5Var);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f24320b == null) {
            synchronized (AppMeasurement.class) {
                if (f24320b == null) {
                    a0 b10 = b(context, (Bundle) null);
                    if (b10 != null) {
                        f24320b = new AppMeasurement(b10);
                    } else {
                        f24320b = new AppMeasurement(w5.a(context, new zzdd(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null, (String) null), (Long) null));
                    }
                }
            }
        }
        return f24320b;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static r5.a0 b(android.content.Context r7, android.os.Bundle r8) {
        /*
            r8 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r1 = "getScionFrontendApiImplementation"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r6 = 1
            r3[r6] = r4     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{  }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
            r1[r5] = r7     // Catch:{  }
            r1[r6] = r8     // Catch:{  }
            java.lang.Object r7 = r0.invoke(r8, r1)     // Catch:{  }
            r5.a0 r7 = (r5.a0) r7     // Catch:{  }
            return r7
        L_0x0023:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):r5.a0");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f24321a.zzb(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f24321a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f24321a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f24321a.zza();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f24321a.zzf();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i10;
        List<Bundle> b10 = this.f24321a.b(str, str2);
        if (b10 == null) {
            i10 = 0;
        } else {
            i10 = b10.size();
        }
        ArrayList arrayList = new ArrayList(i10);
        for (Bundle conditionalUserProperty : b10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f24321a.zzg();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f24321a.zzh();
    }

    @Keep
    public String getGmpAppId() {
        return this.f24321a.zzi();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f24321a.zza(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f24321a.c(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f24321a.d(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        q.k(conditionalUserProperty);
        a aVar = this.f24321a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(MediationMetaData.KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            r5.q.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.zza(bundle);
    }

    private AppMeasurement(a0 a0Var) {
        this.f24321a = new c(a0Var);
    }
}
