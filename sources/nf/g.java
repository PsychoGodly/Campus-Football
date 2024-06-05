package nf;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.o;
import androidx.work.a0;
import androidx.work.c;
import androidx.work.e;
import androidx.work.q;
import androidx.work.r;
import androidx.work.z;
import com.applovin.sdk.AppLovinEventParameters;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import dc.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import lc.j;
import lc.k;
import sd.w;
import vn.hunghd.flutterdownloader.DownloadWorker;

/* compiled from: FlutterDownloaderPlugin.kt */
public final class g implements k.c, dc.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f36565j = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private k f36566a;

    /* renamed from: b  reason: collision with root package name */
    private j f36567b;

    /* renamed from: c  reason: collision with root package name */
    private Context f36568c;

    /* renamed from: d  reason: collision with root package name */
    private long f36569d;

    /* renamed from: f  reason: collision with root package name */
    private int f36570f;

    /* renamed from: g  reason: collision with root package name */
    private int f36571g;

    /* renamed from: h  reason: collision with root package name */
    private int f36572h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f36573i = new Object();

    /* compiled from: FlutterDownloaderPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    private final a0 a(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, boolean z15) {
        r.a aVar = (r.a) ((r.a) ((r.a) new r.a(DownloadWorker.class).f(new c.a().c(z13).b(z15 ? q.CONNECTED : q.UNMETERED).a())).a("flutter_download_task")).e(androidx.work.a.EXPONENTIAL, 10, TimeUnit.SECONDS);
        e.a f10 = new e.a().h("url", str).h("saved_file", str2).h("file_name", str3).h("headers", str4).e("show_notification", z10).e("open_file_from_notification", z11).e("is_resume", z12).g("callback_handle", this.f36569d).f("step", this.f36570f);
        boolean z16 = false;
        e.a e10 = f10.e("debug", this.f36571g == 1);
        if (this.f36572h == 1) {
            z16 = true;
        }
        a0 b10 = ((r.a) aVar.h(e10.e("ignoreSsl", z16).e("save_in_public_storage", z14).f("timeout", i10).a())).b();
        m.d(b10, "Builder(DownloadWorker::…   )\n            .build()");
        return b10;
    }

    private final void b(j jVar, k.d dVar) {
        z.g(o()).b(UUID.fromString((String) n(jVar, "task_id")));
        dVar.success((Object) null);
    }

    private final void c(k.d dVar) {
        z.g(o()).a("flutter_download_task");
        dVar.success((Object) null);
    }

    private final void d(File file) {
        String[] strArr = {"_id"};
        String absolutePath = file.getAbsolutePath();
        m.d(absolutePath, "file.absolutePath");
        String[] strArr2 = {absolutePath};
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        m.d(uri, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = o().getContentResolver();
        m.d(contentResolver, "requireContext().contentResolver");
        Cursor query = contentResolver.query(uri, strArr, "_data = ?", strArr2, (String) null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(uri, strArr, "_data = ?", strArr2, (String) null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                m.d(withAppendedId, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
                contentResolver.delete(withAppendedId, (String) null, (String[]) null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            m.d(withAppendedId2, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
            contentResolver.delete(withAppendedId2, (String) null, (String[]) null);
        }
        if (query != null) {
            query.close();
        }
    }

    private final void e(j jVar, k.d dVar) {
        j jVar2 = jVar;
        String str = (String) n(jVar2, "url");
        String str2 = (String) n(jVar2, "saved_dir");
        String str3 = (String) jVar2.a("file_name");
        String str4 = (String) n(jVar2, "headers");
        int intValue = ((Number) n(jVar2, "timeout")).intValue();
        boolean booleanValue = ((Boolean) n(jVar2, "show_notification")).booleanValue();
        boolean booleanValue2 = ((Boolean) n(jVar2, "open_file_from_notification")).booleanValue();
        boolean booleanValue3 = ((Boolean) n(jVar2, "requires_storage_not_low")).booleanValue();
        boolean booleanValue4 = ((Boolean) n(jVar2, "save_in_public_storage")).booleanValue();
        boolean booleanValue5 = ((Boolean) n(jVar2, "allow_cellular")).booleanValue();
        a0 a10 = a(str, str2, str3, str4, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5);
        z.g(o()).c(a10);
        String uuid = a10.a().toString();
        m.d(uuid, "request.id.toString()");
        dVar.success(uuid);
        a aVar = a.ENQUEUED;
        r(uuid, aVar, 0);
        j jVar3 = this.f36567b;
        m.b(jVar3);
        jVar3.b(uuid, str, aVar, 0, str3, str2, str4, booleanValue, booleanValue2, booleanValue4, booleanValue5);
    }

    private final void f(j jVar, k.d dVar) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Object obj = jVar.f36117b;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        this.f36571g = Integer.parseInt(String.valueOf(list.get(1)));
        this.f36572h = Integer.parseInt(String.valueOf(list.get(2)));
        Context context = this.f36568c;
        SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) == null)) {
            putLong.apply();
        }
        dVar.success((Object) null);
    }

    private final void g(k.d dVar) {
        j jVar = this.f36567b;
        m.b(jVar);
        List<c> c10 = jVar.c();
        ArrayList arrayList = new ArrayList();
        for (c next : c10) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", next.m());
            hashMap.put("status", Integer.valueOf(next.l().ordinal()));
            hashMap.put("progress", Integer.valueOf(next.g()));
            hashMap.put("url", next.o());
            hashMap.put("file_name", next.b());
            hashMap.put("saved_dir", next.j());
            hashMap.put("time_created", Long.valueOf(next.n()));
            hashMap.put("allow_cellular", Boolean.valueOf(next.a()));
            arrayList.add(hashMap);
        }
        dVar.success(arrayList);
    }

    private final void h(j jVar, k.d dVar) {
        j jVar2 = this.f36567b;
        m.b(jVar2);
        List<c> e10 = jVar2.e((String) n(jVar, AppLovinEventParameters.SEARCH_QUERY));
        ArrayList arrayList = new ArrayList();
        for (c next : e10) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", next.m());
            hashMap.put("status", Integer.valueOf(next.l().ordinal()));
            hashMap.put("progress", Integer.valueOf(next.g()));
            hashMap.put("url", next.o());
            hashMap.put("file_name", next.b());
            hashMap.put("saved_dir", next.j());
            hashMap.put("time_created", Long.valueOf(next.n()));
            hashMap.put("allow_cellular", Boolean.valueOf(next.a()));
            arrayList.add(hashMap);
        }
        dVar.success(arrayList);
    }

    private final void i(Context context, lc.c cVar) {
        synchronized (this.f36573i) {
            if (this.f36566a == null) {
                this.f36568c = context;
                k kVar = new k(cVar, "vn.hunghd/downloader");
                this.f36566a = kVar;
                kVar.e(this);
                this.f36567b = new j(k.f36577a.a(this.f36568c));
                w wVar = w.f38141a;
            }
        }
    }

    private final void j(j jVar, k.d dVar) {
        String str = (String) n(jVar, "task_id");
        j jVar2 = this.f36567b;
        m.b(jVar2);
        c d10 = jVar2.d(str);
        if (d10 == null) {
            dVar.error("invalid_task_id", m.m("not found task with id ", str), (Object) null);
        } else if (d10.l() != a.COMPLETE) {
            dVar.error("invalid_status", "only completed tasks can be opened", (Object) null);
        } else {
            String o10 = d10.o();
            String j10 = d10.j();
            String b10 = d10.b();
            if (b10 == null) {
                b10 = o10.substring(p.K(o10, UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 0, false, 6, (Object) null) + 1, o10.length());
                m.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Intent c10 = h.f36574a.c(o(), j10 + File.separator + b10, d10.d());
            if (c10 != null) {
                o().startActivity(c10);
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.success(Boolean.FALSE);
        }
    }

    private final void k(j jVar, k.d dVar) {
        String str = (String) n(jVar, "task_id");
        j jVar2 = this.f36567b;
        m.b(jVar2);
        jVar2.j(str, true);
        z.g(o()).b(UUID.fromString(str));
        dVar.success((Object) null);
    }

    private final void l(j jVar, k.d dVar) {
        Object obj = jVar.f36117b;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        this.f36569d = Long.parseLong(String.valueOf(list.get(0)));
        this.f36570f = Integer.parseInt(String.valueOf(list.get(1)));
        dVar.success((Object) null);
    }

    private final void m(j jVar, k.d dVar) {
        String str = (String) n(jVar, "task_id");
        boolean booleanValue = ((Boolean) n(jVar, "should_delete_content")).booleanValue();
        j jVar2 = this.f36567b;
        m.b(jVar2);
        c d10 = jVar2.d(str);
        if (d10 != null) {
            if (d10.l() == a.ENQUEUED || d10.l() == a.RUNNING) {
                z.g(o()).b(UUID.fromString(str));
            }
            if (booleanValue) {
                String b10 = d10.b();
                if (b10 == null) {
                    b10 = d10.o().substring(p.K(d10.o(), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 0, false, 6, (Object) null) + 1, d10.o().length());
                    m.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                File file = new File(d10.j() + File.separator + b10);
                if (file.exists()) {
                    try {
                        d(file);
                    } catch (SecurityException unused) {
                        Log.d("FlutterDownloader", "Failed to delete file in media store, will fall back to normal delete()");
                    }
                    file.delete();
                }
            }
            j jVar3 = this.f36567b;
            m.b(jVar3);
            jVar3.a(str);
            o.e(o()).b(d10.f());
            dVar.success((Object) null);
            return;
        }
        dVar.error("invalid_task_id", "not found task corresponding to given task id", (Object) null);
    }

    private final <T> T n(j jVar, String str) {
        T a10 = jVar.a(str);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException(("Required key '" + str + "' was null").toString());
    }

    private final Context o() {
        Context context = this.f36568c;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void p(j jVar, k.d dVar) {
        j jVar2 = jVar;
        k.d dVar2 = dVar;
        String str = (String) n(jVar2, "task_id");
        j jVar3 = this.f36567b;
        m.b(jVar3);
        c d10 = jVar3.d(str);
        boolean booleanValue = ((Boolean) n(jVar2, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) n(jVar2, "timeout")).intValue();
        if (d10 == null) {
            dVar2.error("invalid_task_id", "not found task corresponding to given task id", (Object) null);
        } else if (d10.l() == a.PAUSED) {
            String b10 = d10.b();
            if (b10 == null) {
                b10 = d10.o().substring(p.K(d10.o(), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 0, false, 6, (Object) null) + 1, d10.o().length());
                m.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (new File(d10.j() + File.separator + b10).exists()) {
                a0 a10 = a(d10.o(), d10.j(), d10.b(), d10.c(), d10.k(), d10.e(), true, booleanValue, d10.i(), intValue, d10.a());
                String uuid = a10.a().toString();
                m.d(uuid, "request.id.toString()");
                dVar2.success(uuid);
                a aVar = a.RUNNING;
                r(uuid, aVar, d10.g());
                j jVar4 = this.f36567b;
                m.b(jVar4);
                jVar4.h(str, uuid, aVar, d10.g(), false);
                z.g(o()).c(a10);
                return;
            }
            j jVar5 = this.f36567b;
            m.b(jVar5);
            jVar5.j(str, false);
            dVar2.error("invalid_data", "not found partial downloaded data, this task cannot be resumed", (Object) null);
        } else {
            dVar2.error("invalid_status", "only paused task can be resumed", (Object) null);
        }
    }

    private final void q(j jVar, k.d dVar) {
        j jVar2 = jVar;
        k.d dVar2 = dVar;
        String str = (String) n(jVar2, "task_id");
        j jVar3 = this.f36567b;
        m.b(jVar3);
        c d10 = jVar3.d(str);
        boolean booleanValue = ((Boolean) n(jVar2, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) n(jVar2, "timeout")).intValue();
        if (d10 == null) {
            dVar2.error("invalid_task_id", "not found task corresponding to given task id", (Object) null);
        } else if (d10.l() == a.FAILED || d10.l() == a.CANCELED) {
            a0 a10 = a(d10.o(), d10.j(), d10.b(), d10.c(), d10.k(), d10.e(), false, booleanValue, d10.i(), intValue, d10.a());
            String uuid = a10.a().toString();
            m.d(uuid, "request.id.toString()");
            dVar2.success(uuid);
            a aVar = a.ENQUEUED;
            r(uuid, aVar, d10.g());
            j jVar4 = this.f36567b;
            m.b(jVar4);
            jVar4.h(str, uuid, aVar, d10.g(), false);
            z.g(o()).c(a10);
        } else {
            dVar2.error("invalid_status", "only failed and canceled task can be retried", (Object) null);
        }
    }

    private final void r(String str, a aVar, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(aVar.ordinal()));
        hashMap.put("progress", Integer.valueOf(i10));
        k kVar = this.f36566a;
        if (kVar != null) {
            kVar.c("updateProgress", hashMap);
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "binding");
        Context a10 = bVar.a();
        lc.c b10 = bVar.b();
        m.d(b10, "binding.binaryMessenger");
        i(a10, b10);
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "binding");
        this.f36568c = null;
        k kVar = this.f36566a;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
        this.f36566a = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        String str = jVar.f36116a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1594257912:
                    if (str.equals("enqueue")) {
                        e(jVar, dVar);
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        b(jVar, dVar);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals("remove")) {
                        m(jVar, dVar);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        p(jVar, dVar);
                        return;
                    }
                    break;
                case -403218424:
                    if (str.equals("registerCallback")) {
                        l(jVar, dVar);
                        return;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        j(jVar, dVar);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        k(jVar, dVar);
                        return;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        q(jVar, dVar);
                        return;
                    }
                    break;
                case 230377166:
                    if (str.equals("loadTasksWithRawQuery")) {
                        h(jVar, dVar);
                        return;
                    }
                    break;
                case 476547271:
                    if (str.equals("cancelAll")) {
                        c(dVar);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals(MobileAdsBridgeBase.initializeMethodName)) {
                        f(jVar, dVar);
                        return;
                    }
                    break;
                case 1378870856:
                    if (str.equals("loadTasks")) {
                        g(dVar);
                        return;
                    }
                    break;
            }
        }
        dVar.notImplemented();
    }
}
