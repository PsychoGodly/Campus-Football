package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.p0;
import dc.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lc.c;
import lc.k;
import lc.n;
import tc.g;
import tc.h;
import tc.i;
import tc.j;
import tc.l;
import tc.m;
import tc.p;
import tc.q;
import tc.r;
import tc.s;
import tc.t;
import tc.u;
import y6.f;

/* compiled from: FlutterFirebaseMessagingPlugin */
public class e implements FlutterFirebasePlugin, k.c, n, dc.a, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Boolean> f33875a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private k f33876b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f33877c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<p0> f33878d = t.k();

    /* renamed from: f  reason: collision with root package name */
    private x<p0> f33879f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<String> f33880g = u.k();

    /* renamed from: h  reason: collision with root package name */
    private x<String> f33881h;

    /* renamed from: i  reason: collision with root package name */
    private p0 f33882i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, Object> f33883j;

    /* renamed from: k  reason: collision with root package name */
    h f33884k;

    /* compiled from: FlutterFirebaseMessagingPlugin */
    class a extends HashMap<String, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33885a;

        a(String str) {
            this.f33885a = str;
            put("token", str);
        }
    }

    /* compiled from: FlutterFirebaseMessagingPlugin */
    class b extends HashMap<String, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FirebaseMessaging f33887a;

        b(FirebaseMessaging firebaseMessaging) {
            this.f33887a = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.y()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(TaskCompletionSource taskCompletionSource) {
        Map map;
        try {
            p0 p0Var = this.f33882i;
            if (p0Var != null) {
                Map<String, Object> f10 = g.f(p0Var);
                Map<String, Object> map2 = this.f33883j;
                if (map2 != null) {
                    f10.put("notification", map2);
                }
                taskCompletionSource.setResult(f10);
                this.f33882i = null;
                this.f33883j = null;
                return;
            }
            Activity activity = this.f33877c;
            if (activity == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("google.message_id");
                    if (string == null) {
                        string = intent.getExtras().getString("message_id");
                    }
                    if (string != null) {
                        if (this.f33875a.get(string) == null) {
                            p0 p0Var2 = FlutterFirebaseMessagingReceiver.f33864a.get(string);
                            if (p0Var2 == null) {
                                Map<String, Object> a10 = f.b().a(string);
                                if (a10 != null) {
                                    p0Var2 = g.b(a10);
                                    if (a10.get("notification") != null) {
                                        map = (Map) a10.get("notification");
                                        f.b().g(string);
                                    }
                                }
                                map = null;
                                f.b().g(string);
                            } else {
                                map = null;
                            }
                            if (p0Var2 == null) {
                                taskCompletionSource.setResult(null);
                                return;
                            }
                            this.f33875a.put(string, Boolean.TRUE);
                            Map<String, Object> f11 = g.f(p0Var2);
                            if (p0Var2.C() == null && map != null) {
                                f11.put("notification", map);
                            }
                            taskCompletionSource.setResult(f11);
                            return;
                        }
                    }
                    taskCompletionSource.setResult(null);
                    return;
                }
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(TaskCompletionSource taskCompletionSource) {
        boolean z10;
        try {
            HashMap hashMap = new HashMap();
            if (Build.VERSION.SDK_INT >= 33) {
                z10 = s().booleanValue();
            } else {
                z10 = o.e(this.f33877c).a();
            }
            hashMap.put("authorizationStatus", Integer.valueOf(z10 ? 1 : 0));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void D(f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            if (fVar.q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.r().y()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new a((String) Tasks.await(FirebaseMessaging.r().u())));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(p0 p0Var) {
        this.f33876b.c("Messaging#onMessage", g.f(p0Var));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(String str) {
        this.f33876b.c("Messaging#onTokenRefresh", str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.success(task.getResult());
            return;
        }
        Exception exception = task.getException();
        dVar.error("firebase_messaging", exception != null ? exception.getMessage() : null, u(exception));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void I(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        taskCompletionSource.setResult(map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        try {
            if (!s().booleanValue()) {
                this.f33884k.a(this.f33877c, new d(hashMap, taskCompletionSource), new c(taskCompletionSource));
                return;
            }
            hashMap.put("authorizationStatus", 1);
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            g.a(map).L(g.b(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a10.M(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new b(a10));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a10.N(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void O(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(a10.R((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void P(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(a10.U((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Integer>> Q() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new tc.o(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> R(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> S(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> T(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> U(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new tc.f(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> V(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Boolean s() {
        return Boolean.valueOf(tc.a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private Task<Void> t() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> u(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    private Task<Map<String, Object>> v() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Integer>> w() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new p(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> x() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new r(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void y(c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/firebase_messaging");
        this.f33876b = kVar;
        kVar.e(this);
        this.f33884k = new h();
        this.f33879f = new tc.e(this);
        this.f33881h = new tc.k(this);
        this.f33878d.e(this.f33879f);
        this.f33880g.e(this.f33881h);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.r().o());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public boolean d(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> a10;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        p0 p0Var = FlutterFirebaseMessagingReceiver.f33864a.get(string);
        Map<String, Object> map2 = null;
        if (p0Var == null && (a10 = f.b().a(string)) != null) {
            p0Var = g.b(a10);
            map2 = g.c(a10);
        }
        if (p0Var == null) {
            return false;
        }
        this.f33882i = p0Var;
        this.f33883j = map2;
        FlutterFirebaseMessagingReceiver.f33864a.remove(string);
        Map<String, Object> f10 = g.f(p0Var);
        if (p0Var.C() == null && (map = this.f33883j) != null) {
            f10.put("notification", map);
        }
        this.f33876b.c("Messaging#onMessageOpenedApp", f10);
        this.f33877c.setIntent(intent);
        return true;
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new tc.n(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(fVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToActivity(ec.c cVar) {
        cVar.f(this);
        cVar.a(this.f33884k);
        Activity activity = cVar.getActivity();
        this.f33877c = activity;
        if (activity.getIntent() != null && this.f33877c.getIntent().getExtras() != null && (this.f33877c.getIntent().getFlags() & 1048576) != 1048576) {
            d(this.f33877c.getIntent());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        y(bVar.b());
    }

    public void onDetachedFromActivity() {
        this.f33877c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f33877c = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f33880g.i(this.f33881h);
        this.f33878d.i(this.f33879f);
    }

    public void onMethodCall(lc.j jVar, k.d dVar) {
        Task task;
        long j10;
        long j11;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c10 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c10 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c10 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                task = v();
                break;
            case 1:
                task = S((Map) jVar.b());
                break;
            case 2:
                task = t();
                break;
            case 3:
                task = V((Map) jVar.b());
                break;
            case 4:
                task = U((Map) jVar.b());
                break;
            case 5:
                task = T((Map) jVar.b());
                break;
            case 6:
                Map map = (Map) jVar.f36117b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else if (obj instanceof Integer) {
                    j10 = Long.valueOf((long) ((Integer) obj).intValue()).longValue();
                } else {
                    throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                }
                if (obj2 instanceof Long) {
                    j11 = ((Long) obj2).longValue();
                } else if (obj2 instanceof Integer) {
                    j11 = Long.valueOf((long) ((Integer) obj2).intValue()).longValue();
                } else {
                    throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                }
                Activity activity = this.f33877c;
                io.flutter.embedding.engine.g a10 = activity != null ? io.flutter.embedding.engine.g.a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.n(j10);
                FlutterFirebaseMessagingBackgroundService.o(j11);
                FlutterFirebaseMessagingBackgroundService.p(j10, a10);
                task = Tasks.forResult(null);
                break;
            case 7:
                task = R((Map) jVar.b());
                break;
            case 8:
                if (Build.VERSION.SDK_INT < 33) {
                    task = w();
                    break;
                } else {
                    task = Q();
                    break;
                }
            case 9:
                task = w();
                break;
            case 10:
                task = x();
                break;
            default:
                dVar.notImplemented();
                return;
        }
        task.addOnCompleteListener(new l(this, dVar));
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        cVar.f(this);
        this.f33877c = cVar.getActivity();
    }
}
