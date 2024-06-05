package g5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import o5.c;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18160a;

    /* renamed from: b  reason: collision with root package name */
    private int f18161b;

    /* renamed from: c  reason: collision with root package name */
    private int f18162c = 0;

    public y(Context context) {
        this.f18160a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f18161b == 0) {
            try {
                packageInfo = c.a(this.f18160a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f18161b = packageInfo.versionCode;
            }
        }
        return this.f18161b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f18162c     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f18160a     // Catch:{ all -> 0x007f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x007f }
            android.content.Context r1 = r5.f18160a     // Catch:{ all -> 0x007f }
            o5.b r1 = o5.c.a(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r1 = r1.b(r2, r3)     // Catch:{ all -> 0x007f }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0028
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r3
        L_0x0028:
            boolean r1 = m5.m.i()     // Catch:{ all -> 0x007f }
            r2 = 1
            if (r1 != 0) goto L_0x004c
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x004c
            int r1 = r1.size()     // Catch:{ all -> 0x007f }
            if (r1 > 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            r5.f18162c = r2     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r2
        L_0x004c:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x007f }
            r1 = 2
            if (r0 == 0) goto L_0x006a
            int r0 = r0.size()     // Catch:{ all -> 0x007f }
            if (r0 > 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            r5.f18162c = r1     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r1
        L_0x006a:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x007f }
            boolean r0 = m5.m.i()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007b
            r5.f18162c = r1     // Catch:{ all -> 0x007f }
            r2 = 2
            goto L_0x007d
        L_0x007b:
            r5.f18162c = r2     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r5)
            return r2
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.b():int");
    }
}
