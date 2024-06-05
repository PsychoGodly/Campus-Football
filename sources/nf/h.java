package nf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.b;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: IntentUtils.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f36574a = new h();

    private h() {
    }

    private final Intent a(Context context, File file, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setDataAndType(b.getUriForFile(context, m.m(context.getPackageName(), ".flutter_downloader.provider"), file), str);
        } else {
            intent.setDataAndType(Uri.fromFile(file), str);
        }
        intent.setFlags(268435456);
        intent.addFlags(1);
        return intent;
    }

    private final boolean b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        m.d(queryIntentActivities, "manager.queryIntentActivities(intent, 0)");
        if (queryIntentActivities.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[SYNTHETIC, Splitter:B:24:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045 A[Catch:{ IOException -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004b A[Catch:{ IOException -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005d A[SYNTHETIC, Splitter:B:42:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Intent c(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.m.e(r4, r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "path"
            kotlin.jvm.internal.m.e(r5, r0)     // Catch:{ all -> 0x0066 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0066 }
            r0.<init>(r5)     // Catch:{ all -> 0x0066 }
            android.content.Intent r6 = r3.a(r4, r0, r6)     // Catch:{ all -> 0x0066 }
            boolean r1 = r3.b(r4, r6)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r3)
            return r6
        L_0x001c:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromStream(r1)     // Catch:{ Exception -> 0x002f }
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0043
        L_0x002a:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0066 }
            goto L_0x0043
        L_0x002f:
            r2 = move-exception
            goto L_0x0035
        L_0x0031:
            r4 = move-exception
            goto L_0x005b
        L_0x0033:
            r2 = move-exception
            r1 = r6
        L_0x0035:
            r2.printStackTrace()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0066 }
        L_0x0042:
            r2 = r6
        L_0x0043:
            if (r2 != 0) goto L_0x0049
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromName(r5)     // Catch:{ all -> 0x0066 }
        L_0x0049:
            if (r2 == 0) goto L_0x0057
            android.content.Intent r5 = r3.a(r4, r0, r2)     // Catch:{ all -> 0x0066 }
            boolean r4 = r3.b(r4, r5)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0057
            monitor-exit(r3)
            return r5
        L_0x0057:
            monitor-exit(r3)
            return r6
        L_0x0059:
            r4 = move-exception
            r6 = r1
        L_0x005b:
            if (r6 == 0) goto L_0x0065
            r6.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r4     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.h.c(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }
}
