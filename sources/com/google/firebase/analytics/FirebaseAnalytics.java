package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r5.a0;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public final class FirebaseAnalytics {

    /* renamed from: c  reason: collision with root package name */
    private static volatile FirebaseAnalytics f26126c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzdf f26127a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f26128b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
    public enum a {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    private FirebaseAnalytics(zzdf zzdf) {
        q.k(zzdf);
        this.f26127a = zzdf;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f26126c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f26126c == null) {
                    f26126c = new FirebaseAnalytics(zzdf.zza(context));
                }
            }
        }
        return f26126c;
    }

    @Keep
    public static a0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdf zza = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new c(zza);
    }

    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f26128b == null) {
                this.f26128b = new b(this, 0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f26128b;
        }
        return executorService;
    }

    public final Task<String> a() {
        try {
            return Tasks.call(l(), new a(this));
        } catch (RuntimeException e10) {
            this.f26127a.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e10);
        }
    }

    public final Task<Long> b() {
        try {
            return Tasks.call(l(), new d(this));
        } catch (RuntimeException e10) {
            this.f26127a.zza(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e10);
        }
    }

    public final void c(String str, Bundle bundle) {
        this.f26127a.zza(str, bundle);
    }

    public final void d() {
        this.f26127a.zzj();
    }

    public final void e(boolean z10) {
        this.f26127a.zza(Boolean.valueOf(z10));
    }

    public final void f(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f26127a.zzc(bundle);
    }

    public final void g(Bundle bundle) {
        this.f26127a.zzd(bundle);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.p().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public final void h(long j10) {
        this.f26127a.zza(j10);
    }

    public final void i(String str) {
        this.f26127a.zzd(str);
    }

    public final void j(String str, String str2) {
        this.f26127a.zzb(str, str2);
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f26127a.zza(activity, str, str2);
    }
}
