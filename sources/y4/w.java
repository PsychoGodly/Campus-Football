package y4;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class w extends LinkedHashMap {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x f24008a;

    w(x xVar) {
        this.f24008a = xVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeEldestEntry(java.util.Map.Entry r6) {
        /*
            r5 = this;
            y4.x r0 = r5.f24008a
            monitor-enter(r0)
            int r1 = r5.size()     // Catch:{ all -> 0x003d }
            y4.x r2 = r5.f24008a     // Catch:{ all -> 0x003d }
            int r3 = r2.f24009a     // Catch:{ all -> 0x003d }
            r4 = 0
            if (r1 > r3) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r4
        L_0x0012:
            java.util.ArrayDeque r1 = r2.f24014f     // Catch:{ all -> 0x003d }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x003d }
            java.lang.Object r3 = r6.getKey()     // Catch:{ all -> 0x003d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x003d }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x003d }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x003d }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x003d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r6)     // Catch:{ all -> 0x003d }
            r1.add(r2)     // Catch:{ all -> 0x003d }
            int r6 = r5.size()     // Catch:{ all -> 0x003d }
            y4.x r1 = r5.f24008a     // Catch:{ all -> 0x003d }
            int r1 = r1.f24009a     // Catch:{ all -> 0x003d }
            if (r6 <= r1) goto L_0x003b
            r4 = 1
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r4
        L_0x003d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.w.removeEldestEntry(java.util.Map$Entry):boolean");
    }
}
