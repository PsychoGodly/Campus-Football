package ga;

import android.os.Environment;
import dc.a;
import kotlin.jvm.internal.m;
import lc.j;
import lc.k;

/* compiled from: AndroidPathProviderPlugin.kt */
public final class a implements dc.a, k.c {

    /* renamed from: a  reason: collision with root package name */
    private k f28937a;

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "flutterPluginBinding");
        k kVar = new k(bVar.b(), "android_path_provider");
        this.f28937a = kVar;
        kVar.e(this);
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "binding");
        k kVar = this.f28937a;
        if (kVar == null) {
            m.t("channel");
            kVar = null;
        }
        kVar.e((k.c) null);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        if (m.a(jVar.f36116a, "getAlarmsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getDCIMPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getDocumentsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getDownloadsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getMoviesPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getMusicPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getNotificationsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getPicturesPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getPodcastsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS).getAbsolutePath());
        } else if (m.a(jVar.f36116a, "getRingtonesPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        } else {
            dVar.notImplemented();
        }
    }
}
