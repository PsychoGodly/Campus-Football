package g5;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f18137a;

    public /* synthetic */ m(r rVar) {
        this.f18137a = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r3 = r0.f18148g.f18156a;
        r4 = r0.f18144b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f18153c;
        r5.arg1 = r1.f18151a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle(com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, r1.f18154d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.f18145c.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            g5.r r0 = r8.f18137a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f18143a     // Catch:{ all -> 0x00aa }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x000a:
            java.util.Queue<g5.u<?>> r1 = r0.f18146d     // Catch:{ all -> 0x00aa }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0017
            r0.f()     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x0017:
            java.util.Queue<g5.u<?>> r1 = r0.f18146d     // Catch:{ all -> 0x00aa }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00aa }
            g5.u r1 = (g5.u) r1     // Catch:{ all -> 0x00aa }
            android.util.SparseArray<g5.u<?>> r3 = r0.f18147f     // Catch:{ all -> 0x00aa }
            int r4 = r1.f18151a     // Catch:{ all -> 0x00aa }
            r3.put(r4, r1)     // Catch:{ all -> 0x00aa }
            g5.x r3 = r0.f18148g     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f18157b     // Catch:{ all -> 0x00aa }
            g5.p r4 = new g5.p     // Catch:{ all -> 0x00aa }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00aa }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00aa }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = r5.toString()
            android.util.Log.d(r3, r4)
        L_0x0062:
            g5.x r3 = r0.f18148g
            android.content.Context r3 = r3.f18156a
            android.os.Messenger r4 = r0.f18144b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f18153c
            r5.what = r6
            int r6 = r1.f18151a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f18154d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            g5.s r1 = r0.f18145c     // Catch:{ RemoteException -> 0x00a0 }
            r1.a(r5)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x0002
        L_0x00a0:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.m.run():void");
    }
}
