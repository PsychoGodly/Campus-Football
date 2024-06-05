package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class w4 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f17485f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static w4 f17486g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17487a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<BroadcastReceiver, ArrayList<IntentFilter>> f17488b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f17489c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f17490d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final Handler f17491e;

    /* compiled from: Sta */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            if (r5 >= r4.f17494b.size()) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            r6 = r4.f17494b.get(r5).f17496b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
            if (r6 == null) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
            r6.onReceive(r10.f17487a, r4.f17493a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                int r0 = r10.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r10)
                goto L_0x0017
            L_0x0009:
                com.startapp.w4 r10 = com.startapp.w4.this
            L_0x000b:
                java.util.Map<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r10.f17488b
                monitor-enter(r0)
                java.util.ArrayList<com.startapp.w4$b> r1 = r10.f17490d     // Catch:{ all -> 0x004d }
                int r1 = r1.size()     // Catch:{ all -> 0x004d }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
            L_0x0017:
                return
            L_0x0018:
                com.startapp.w4$b[] r2 = new com.startapp.w4.b[r1]     // Catch:{ all -> 0x004d }
                java.util.ArrayList<com.startapp.w4$b> r3 = r10.f17490d     // Catch:{ all -> 0x004d }
                r3.toArray(r2)     // Catch:{ all -> 0x004d }
                java.util.ArrayList<com.startapp.w4$b> r3 = r10.f17490d     // Catch:{ all -> 0x004d }
                r3.clear()     // Catch:{ all -> 0x004d }
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                r0 = 0
                r3 = 0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                r5 = 0
            L_0x002c:
                java.util.ArrayList<com.startapp.w4$c> r6 = r4.f17494b
                int r6 = r6.size()
                if (r5 >= r6) goto L_0x004a
                java.util.ArrayList<com.startapp.w4$c> r6 = r4.f17494b
                java.lang.Object r6 = r6.get(r5)
                com.startapp.w4$c r6 = (com.startapp.w4.c) r6
                android.content.BroadcastReceiver r6 = r6.f17496b
                if (r6 == 0) goto L_0x0047
                android.content.Context r7 = r10.f17487a
                android.content.Intent r8 = r4.f17493a
                r6.onReceive(r7, r8)
            L_0x0047:
                int r5 = r5 + 1
                goto L_0x002c
            L_0x004a:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004d:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.w4.a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: Sta */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f17493a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f17494b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f17493a = intent;
            this.f17494b = arrayList;
        }
    }

    /* compiled from: Sta */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f17495a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f17496b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17497c;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f17495a = intentFilter;
            this.f17496b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f17496b);
            sb2.append(" filter=");
            sb2.append(this.f17495a);
            sb2.append("}");
            return sb2.toString();
        }
    }

    static {
        a0.a((Class<?>) w4.class);
    }

    public w4(Context context) {
        this.f17487a = context;
        this.f17491e = new a(context.getMainLooper());
    }

    public static w4 a(Context context) {
        w4 w4Var;
        synchronized (f17485f) {
            if (f17486g == null) {
                Context a10 = h0.a(context);
                if (a10 != null) {
                    context = a10;
                }
                f17486g = new w4(context);
            }
            w4Var = f17486g;
        }
        return w4Var;
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f17488b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f17488b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f17488b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList arrayList2 = this.f17489c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f17489c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f17488b) {
            ArrayList remove = this.f17488b.remove(broadcastReceiver);
            if (remove != null) {
                for (int i10 = 0; i10 < remove.size(); i10++) {
                    IntentFilter intentFilter = (IntentFilter) remove.get(i10);
                    for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                        String action = intentFilter.getAction(i11);
                        ArrayList arrayList = this.f17489c.get(action);
                        if (arrayList != null) {
                            int i12 = 0;
                            while (i12 < arrayList.size()) {
                                if (((c) arrayList.get(i12)).f17496b == broadcastReceiver) {
                                    arrayList.remove(i12);
                                    i12--;
                                }
                                i12++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f17489c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.Map<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r2 = r1.f17488b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x00bd }
            android.content.Context r3 = r1.f17487a     // Catch:{ all -> 0x00bd }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00bd }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00bd }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x00bd }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x00bd }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x00bd }
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.startapp.w4$c>> r3 = r1.f17489c     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x00bd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00bd }
            r15 = r3
            java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x00bd }
            r9 = 0
            if (r15 == 0) goto L_0x00ba
            r3 = 0
            r8 = r3
            r7 = 0
        L_0x0034:
            int r3 = r15.size()     // Catch:{ all -> 0x00bd }
            r6 = 1
            if (r7 >= r3) goto L_0x0089
            java.lang.Object r3 = r15.get(r7)     // Catch:{ all -> 0x00bd }
            r5 = r3
            com.startapp.w4$c r5 = (com.startapp.w4.c) r5     // Catch:{ all -> 0x00bd }
            boolean r3 = r5.f17497c     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0051
            r19 = r7
            r17 = r10
            r18 = r11
            r20 = r12
            r12 = 0
            r11 = r8
            goto L_0x007e
        L_0x0051:
            android.content.IntentFilter r3 = r5.f17495a     // Catch:{ all -> 0x00bd }
            java.lang.String r16 = "LocalBroadcastManager"
            r4 = r10
            r17 = r10
            r10 = r5
            r5 = r11
            r18 = r11
            r11 = 1
            r6 = r13
            r19 = r7
            r7 = r12
            r11 = r8
            r8 = r14
            r20 = r12
            r12 = 0
            r9 = r16
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00bd }
            if (r3 < 0) goto L_0x007e
            if (r11 != 0) goto L_0x0076
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00bd }
            r8.<init>()     // Catch:{ all -> 0x00bd }
            goto L_0x0077
        L_0x0076:
            r8 = r11
        L_0x0077:
            r8.add(r10)     // Catch:{ all -> 0x00bd }
            r3 = 1
            r10.f17497c = r3     // Catch:{ all -> 0x00bd }
            goto L_0x007f
        L_0x007e:
            r8 = r11
        L_0x007f:
            int r7 = r19 + 1
            r10 = r17
            r11 = r18
            r12 = r20
            r9 = 0
            goto L_0x0034
        L_0x0089:
            r11 = r8
            r12 = 0
            if (r11 == 0) goto L_0x00bb
            r9 = 0
        L_0x008e:
            int r3 = r11.size()     // Catch:{ all -> 0x00bd }
            if (r9 >= r3) goto L_0x009f
            java.lang.Object r3 = r11.get(r9)     // Catch:{ all -> 0x00bd }
            com.startapp.w4$c r3 = (com.startapp.w4.c) r3     // Catch:{ all -> 0x00bd }
            r3.f17497c = r12     // Catch:{ all -> 0x00bd }
            int r9 = r9 + 1
            goto L_0x008e
        L_0x009f:
            java.util.ArrayList<com.startapp.w4$b> r3 = r1.f17490d     // Catch:{ all -> 0x00bd }
            com.startapp.w4$b r4 = new com.startapp.w4$b     // Catch:{ all -> 0x00bd }
            r4.<init>(r0, r11)     // Catch:{ all -> 0x00bd }
            r3.add(r4)     // Catch:{ all -> 0x00bd }
            android.os.Handler r0 = r1.f17491e     // Catch:{ all -> 0x00bd }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b7
            android.os.Handler r0 = r1.f17491e     // Catch:{ all -> 0x00bd }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00bd }
        L_0x00b7:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            r0 = 1
            return r0
        L_0x00ba:
            r12 = 0
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            return r12
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w4.a(android.content.Intent):boolean");
    }
}
