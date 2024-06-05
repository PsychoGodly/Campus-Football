package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.p0;
import java.util.HashMap;
import tc.a;
import tc.t;

public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static HashMap<String, p0> f33864a = new HashMap<>();

    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (a.a() == null) {
            a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        p0 p0Var = new p0(intent.getExtras());
        if (p0Var.C() != null) {
            f33864a.put(p0Var.y(), p0Var);
            f.b().i(p0Var);
        }
        if (g.d(context)) {
            t.k().l(p0Var);
            return;
        }
        Intent intent2 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        intent2.putExtra("notification", p0Var);
        FlutterFirebaseMessagingBackgroundService.k(context, intent2);
    }
}
