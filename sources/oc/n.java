package oc;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import dc.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lc.c;
import lc.j;
import lc.k;
import y6.f;

/* compiled from: FlutterFirebaseAnalyticsPlugin */
public class n implements FlutterFirebasePlugin, k.c, dc.a {

    /* renamed from: a  reason: collision with root package name */
    private FirebaseAnalytics f36756a;

    /* renamed from: b  reason: collision with root package name */
    private k f36757b;

    /* compiled from: FlutterFirebaseAnalyticsPlugin */
    class a extends HashMap<String, Object> {
        a() {
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((Long) Tasks.await(this.f36756a.b()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            Bundle n10 = n((Map) map.get("parameters"));
            this.f36756a.c((String) obj, n10);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(TaskCompletionSource taskCompletionSource) {
        try {
            this.f36756a.d();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.f36756a.e(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("milliseconds");
            Objects.requireNonNull(obj);
            this.f36756a.h((long) ((Integer) obj).intValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.f36756a.i((String) map.get("userId"));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(MediationMetaData.KEY_NAME);
            Objects.requireNonNull(obj);
            this.f36756a.j((String) obj, (String) map.get("value"));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void H(k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.success(task.getResult());
            return;
        }
        Exception exception = task.getException();
        dVar.error("firebase_analytics", exception != null ? exception.getMessage() : "An unknown error occurred", (Object) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(Map map, TaskCompletionSource taskCompletionSource) {
        FirebaseAnalytics.a aVar;
        FirebaseAnalytics.a aVar2;
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            HashMap hashMap = new HashMap();
            if (bool != null) {
                FirebaseAnalytics.b bVar = FirebaseAnalytics.b.AD_STORAGE;
                if (bool.booleanValue()) {
                    aVar2 = FirebaseAnalytics.a.GRANTED;
                } else {
                    aVar2 = FirebaseAnalytics.a.DENIED;
                }
                hashMap.put(bVar, aVar2);
            }
            if (bool2 != null) {
                FirebaseAnalytics.b bVar2 = FirebaseAnalytics.b.ANALYTICS_STORAGE;
                if (bool2.booleanValue()) {
                    aVar = FirebaseAnalytics.a.GRANTED;
                } else {
                    aVar = FirebaseAnalytics.a.DENIED;
                }
                hashMap.put(bVar2, aVar);
            }
            this.f36756a.f(hashMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.f36756a.g(n(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> K(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> L(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private static Bundle n(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, (long) ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, (String) null);
            } else if (value instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object next2 : (Iterable) value) {
                    if (next2 instanceof Map) {
                        arrayList.add(n((Map) next2));
                    } else {
                        throw new IllegalArgumentException("Unsupported value type: " + next2.getClass().getCanonicalName() + " in list at key " + str);
                    }
                }
                bundle.putParcelableArrayList(str, arrayList);
            } else if (value instanceof Map) {
                bundle.putParcelable(str, n((Map) value));
            } else {
                throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
            }
        }
        return bundle;
    }

    private Task<String> o() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Long> p() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> q(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> r() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> s(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> t(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> u(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> v(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void w(c cVar, Context context) {
        this.f36756a = FirebaseAnalytics.getInstance(context);
        k kVar = new k(cVar, "plugins.flutter.io/firebase_analytics");
        this.f36757b = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void x(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new a());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((String) Tasks.await(this.f36756a.a()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToEngine(a.b bVar) {
        w(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f36757b;
        if (kVar != null) {
            kVar.e((k.c) null);
            this.f36757b = null;
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        Task task;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2090892968:
                if (str.equals("Analytics#getAppInstanceId")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1931910274:
                if (str.equals("Analytics#resetAnalyticsData")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1572470123:
                if (str.equals("Analytics#setConsent")) {
                    c10 = 2;
                    break;
                }
                break;
            case -273201790:
                if (str.equals("Analytics#setAnalyticsCollectionEnabled")) {
                    c10 = 3;
                    break;
                }
                break;
            case -99047480:
                if (str.equals("Analytics#setDefaultEventParameters")) {
                    c10 = 4;
                    break;
                }
                break;
            case -45011405:
                if (str.equals("Analytics#logEvent")) {
                    c10 = 5;
                    break;
                }
                break;
            case 179244440:
                if (str.equals("Analytics#getSessionId")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1083589925:
                if (str.equals("Analytics#setUserProperty")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1751063748:
                if (str.equals("Analytics#setSessionTimeoutDuration")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1992044651:
                if (str.equals("Analytics#setUserId")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                task = o();
                break;
            case 1:
                task = r();
                break;
            case 2:
                task = K((Map) jVar.b());
                break;
            case 3:
                task = s((Map) jVar.b());
                break;
            case 4:
                task = L((Map) jVar.b());
                break;
            case 5:
                task = q((Map) jVar.b());
                break;
            case 6:
                task = p();
                break;
            case 7:
                task = v((Map) jVar.b());
                break;
            case 8:
                task = t((Map) jVar.b());
                break;
            case 9:
                task = u((Map) jVar.b());
                break;
            default:
                dVar.notImplemented();
                return;
        }
        task.addOnCompleteListener(new a(dVar));
    }
}
