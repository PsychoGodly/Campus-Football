package vn.hunghd.flutterdownloader;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.work.b;
import androidx.work.z;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: FlutterDownloaderInitializer.kt */
public final class FlutterDownloaderInitializer extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39178a = new a((h) null);

    /* compiled from: FlutterDownloaderInitializer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    private final int a(Context context) {
        try {
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, "vn.hunghd.flutterdownloader.FlutterDownloaderInitializer"), 128);
            m.d(providerInfo, "context.packageManager.g…T_META_DATA\n            )");
            int i10 = providerInfo.metaData.getInt("vn.hunghd.flutterdownloader.MAX_CONCURRENT_TASKS", 3);
            Log.d("DownloaderInitializer", m.m("MAX_CONCURRENT_TASKS = ", Integer.valueOf(i10)));
            return i10;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("DownloaderInitializer", m.m("Failed to load meta-data, NameNotFound: ", e10.getMessage()));
            return 3;
        } catch (NullPointerException e11) {
            Log.e("DownloaderInitializer", m.m("Failed to load meta-data, NullPointer: ", e11.getMessage()));
            return 3;
        }
    }

    public Void b(Uri uri) {
        m.e(uri, "uri");
        return null;
    }

    public Void c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m.e(uri, "uri");
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m.e(uri, "uri");
        return 0;
    }

    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return (String) b(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        m.e(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            z.h(context, new b.C0091b().b(Executors.newFixedThreadPool(a(context))).a());
            return true;
        }
        throw new IllegalArgumentException("Cannot find context from the provider.".toString());
    }

    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) c(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        m.e(uri, "uri");
        return 0;
    }
}
