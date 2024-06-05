package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import kotlin.jvm.internal.m;

/* compiled from: AndroidStoreDataSource.kt */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context2) {
        m.e(context2, "context");
        this.context = context2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> fetchStores(java.util.List<java.lang.String> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "additionalStores"
            kotlin.jvm.internal.m.e(r8, r0)
            com.unity3d.ads.core.data.datasource.AndroidKnownStore[] r0 = com.unity3d.ads.core.data.datasource.AndroidKnownStore.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r2) goto L_0x0020
            r5 = r0[r4]
            java.lang.String r5 = r5.getPackageName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0020:
            java.util.List r8 = td.y.C(r1, r8)
            java.util.List r8 = td.y.o(r8)
            android.content.Context r0 = r7.context
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0037:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r8.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005d }
            r6 = 33
            if (r5 < r6) goto L_0x0055
            r5 = 0
            android.content.pm.PackageManager$PackageInfoFlags r5 = android.content.pm.PackageManager.PackageInfoFlags.of(r5)     // Catch:{ NameNotFoundException -> 0x005d }
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x005d }
            goto L_0x0059
        L_0x0055:
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x005d }
        L_0x0059:
            if (r4 == 0) goto L_0x005d
            r4 = 1
            goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            if (r4 == 0) goto L_0x0037
            r1.add(r2)
            goto L_0x0037
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStoreDataSource.fetchStores(java.util.List):java.util.List");
    }
}
