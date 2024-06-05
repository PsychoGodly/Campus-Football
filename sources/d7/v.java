package d7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import i5.e;
import r0.a;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    private static v f28629c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28630a = false;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f28631b;

    private v() {
    }

    private static h a(Intent intent) {
        q.k(intent);
        return d2.I(((zzagt) e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzagt.CREATOR)).zzc(true));
    }

    public static v b() {
        if (f28629c == null) {
            f28629c = new v();
        }
        return f28629c;
    }

    private final void c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f28631b = broadcastReceiver;
        a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    static void d(Context context) {
        v vVar = f28629c;
        vVar.f28630a = false;
        if (vVar.f28631b != null) {
            a.b(context).e(f28629c.f28631b);
        }
        f28629c.f28631b = null;
    }

    static /* synthetic */ void e(v vVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        d(context);
    }

    public final boolean h(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.f28630a) {
            return false;
        }
        c(activity, new e0(this, activity, taskCompletionSource));
        this.f28630a = true;
        return true;
    }

    public final boolean i(Activity activity, TaskCompletionSource<i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return j(activity, taskCompletionSource, firebaseAuth, (a0) null);
    }

    public final boolean j(Activity activity, TaskCompletionSource<i> taskCompletionSource, FirebaseAuth firebaseAuth, a0 a0Var) {
        if (this.f28630a) {
            return false;
        }
        c(activity, new f0(this, activity, taskCompletionSource, firebaseAuth, a0Var));
        this.f28630a = true;
        return true;
    }
}
