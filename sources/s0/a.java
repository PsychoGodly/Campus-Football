package s0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: MediaButtonReceiver */
public class a extends BroadcastReceiver {

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* compiled from: MediaButtonReceiver */
    private static class C0230a extends MediaBrowserCompat.c {

        /* renamed from: c  reason: collision with root package name */
        private final Context f22284c;

        /* renamed from: d  reason: collision with root package name */
        private final Intent f22285d;

        /* renamed from: e  reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f22286e;

        /* renamed from: f  reason: collision with root package name */
        private MediaBrowserCompat f22287f;

        C0230a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f22284c = context;
            this.f22285d = intent;
            this.f22286e = pendingResult;
        }

        private void e() {
            this.f22287f.b();
            this.f22286e.finish();
        }

        public void a() {
            new MediaControllerCompat(this.f22284c, this.f22287f.c()).a((KeyEvent) this.f22285d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            e();
        }

        public void b() {
            e();
        }

        public void c() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f22287f = mediaBrowserCompat;
        }
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    private static ComponentName b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public static KeyEvent c(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.b().a(keyEvent);
        return keyEvent;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName b10 = b(context, "android.intent.action.MEDIA_BUTTON");
        if (b10 != null) {
            intent.setComponent(b10);
            androidx.core.content.a.startForegroundService(context, intent);
            return;
        }
        ComponentName b11 = b(context, "android.media.browse.MediaBrowserService");
        if (b11 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0230a aVar = new C0230a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b11, aVar, (Bundle) null);
            aVar.f(mediaBrowserCompat);
            mediaBrowserCompat.a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
