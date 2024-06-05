package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.p0;
import io.flutter.embedding.engine.g;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import tc.d;

public class FlutterFirebaseMessagingBackgroundService extends i {

    /* renamed from: k  reason: collision with root package name */
    private static final List<Intent> f33862k = Collections.synchronizedList(new LinkedList());

    /* renamed from: l  reason: collision with root package name */
    private static b f33863l;

    static {
        Class<FlutterFirebaseMessagingBackgroundService> cls = FlutterFirebaseMessagingBackgroundService.class;
    }

    public static void k(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        Bundle bundle = extras;
        Class<FlutterFirebaseMessagingBackgroundService> cls = FlutterFirebaseMessagingBackgroundService.class;
        boolean z10 = true;
        if (((p0) extras.get("notification")).I() != 1) {
            z10 = false;
        }
        i.d(context, cls, 2020, intent, z10);
    }

    static void m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = f33862k;
        synchronized (list) {
            for (Intent d10 : list) {
                f33863l.d(d10, (CountDownLatch) null);
            }
            f33862k.clear();
        }
    }

    public static void n(long j10) {
        b.m(j10);
    }

    public static void o(long j10) {
        b.n(j10);
    }

    public static void p(long j10, g gVar) {
        if (f33863l != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        b bVar = new b();
        f33863l = bVar;
        bVar.p(j10, gVar);
    }

    /* access modifiers changed from: protected */
    public void g(Intent intent) {
        if (!f33863l.h()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = f33862k;
        synchronized (list) {
            if (f33863l.i()) {
                Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new d(intent, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e10);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (f33863l == null) {
            f33863l = new b();
        }
        f33863l.o();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
