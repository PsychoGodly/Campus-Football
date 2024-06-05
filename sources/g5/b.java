package g5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f18108a;

    public b() {
        zze.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n5.b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f18108a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    private final int e(Context context, Intent intent) {
        Task<Void> task;
        if (intent.getExtras() == null) {
            return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            task = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            task = x.b(context).c(2, bundle);
        }
        int b10 = b(context, new a(intent));
        try {
            Tasks.await(task, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return b10;
    }

    private final int f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
    }

    /* access modifiers changed from: protected */
    public Executor a() {
        return this.f18108a;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Context context, a aVar);

    /* access modifiers changed from: protected */
    public void c(Context context, Bundle bundle) {
    }

    public final /* synthetic */ void d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        int i10;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i10 = f(context, intent2);
            } else {
                i10 = e(context, intent);
            }
            if (z10) {
                pendingResult.setResultCode(i10);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a().execute(new j(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
