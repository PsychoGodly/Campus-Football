package g5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.g;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public class d {

    /* renamed from: h  reason: collision with root package name */
    private static int f18114h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f18115i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f18116j = e0.f18126a;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f18117k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    private final g<String, TaskCompletionSource<Bundle>> f18118a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f18119b;

    /* renamed from: c  reason: collision with root package name */
    private final y f18120c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f18121d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f18122e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f18123f;

    /* renamed from: g  reason: collision with root package name */
    private i f18124g;

    public d(Context context) {
        this.f18119b = context;
        this.f18120c = new y(context);
        this.f18122e = new Messenger(new f(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f18121d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task b(Bundle bundle) throws Exception {
        if (j(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    static /* bridge */ /* synthetic */ void d(d dVar, Message message) {
        String str;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        dVar.f18124g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f18123f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                            sb2.append("Unexpected response, no error or registration id ");
                            sb2.append(valueOf);
                            Log.w("Rpc", sb2.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                str = "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                str = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", str);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str2 = split[2];
                            String str3 = split[3];
                            if (str3.startsWith(":")) {
                                str3 = str3.substring(1);
                            }
                            dVar.i(str2, intent2.putExtra("error", str3).getExtras());
                            return;
                        }
                        synchronized (dVar.f18118a) {
                            for (int i10 = 0; i10 < dVar.f18118a.size(); i10++) {
                                dVar.i(dVar.f18118a.j(i10), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f18117k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            dVar.i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task<Bundle> f(Bundle bundle) {
        String g10 = g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f18118a) {
            this.f18118a.put(g10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f18120c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        h(this.f18119b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 5);
        sb2.append("|ID|");
        sb2.append(g10);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f18122e);
        if (!(this.f18123f == null && this.f18124g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f18123f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f18124g.d(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(f18116j, new b0(this, g10, this.f18121d.schedule(new d0(taskCompletionSource), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f18120c.b() == 2) {
            this.f18119b.sendBroadcast(intent);
        } else {
            this.f18119b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(f18116j, new b0(this, g10, this.f18121d.schedule(new d0(taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    private static synchronized String g() {
        String num;
        synchronized (d.class) {
            int i10 = f18114h;
            f18114h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (d.class) {
            if (f18115i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f18115i = zza.zza(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f18115i);
        }
    }

    private final void i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f18118a) {
            TaskCompletionSource remove = this.f18118a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.setResult(bundle);
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task<Bundle> a(Bundle bundle) {
        if (this.f18120c.a() >= 12000000) {
            return x.b(this.f18119b).d(1, bundle).continueWith(f18116j, a0.f18107a);
        }
        if (this.f18120c.b() != 0) {
            return f(bundle).continueWithTask(f18116j, new z(this, bundle));
        }
        return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    public final /* synthetic */ Task c(Bundle bundle, Task task) throws Exception {
        if (task.isSuccessful() && j((Bundle) task.getResult())) {
            return f(bundle).onSuccessTask(f18116j, c0.f18113a);
        }
        return task;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f18118a) {
            this.f18118a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
