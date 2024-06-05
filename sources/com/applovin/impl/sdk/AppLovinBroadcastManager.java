package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppLovinBroadcastManager {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f11402a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f11403b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ArrayList f11404c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final Handler f11405d = new a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f11406a;

        /* renamed from: b  reason: collision with root package name */
        final Map f11407b;

        /* renamed from: c  reason: collision with root package name */
        final List f11408c;

        b(Intent intent, Map map, List list) {
            this.f11406a = intent;
            this.f11407b = map;
            this.f11408c = list;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f11409a;

        /* renamed from: b  reason: collision with root package name */
        final Receiver f11410b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11411c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11412d;

        c(IntentFilter intentFilter, Receiver receiver) {
            this.f11409a = intentFilter;
            this.f11410b = receiver;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0 >= r2) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r1 = r3[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r4 = r1.f11408c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r4.hasNext() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r5 = (com.applovin.impl.sdk.AppLovinBroadcastManager.c) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r5 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r5.f11412d != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r5.f11410b.onReceive(r1.f11406a, r1.f11407b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
        L_0x0000:
            java.util.Map r0 = f11402a
            monitor-enter(r0)
            java.util.ArrayList r1 = f11404c     // Catch:{ all -> 0x0043 }
            int r2 = r1.size()     // Catch:{ all -> 0x0043 }
            if (r2 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x000d:
            com.applovin.impl.sdk.AppLovinBroadcastManager$b[] r3 = new com.applovin.impl.sdk.AppLovinBroadcastManager.b[r2]     // Catch:{ all -> 0x0043 }
            r1.toArray(r3)     // Catch:{ all -> 0x0043 }
            r1.clear()     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            r0 = 0
        L_0x0017:
            if (r0 >= r2) goto L_0x0000
            r1 = r3[r0]
            if (r1 != 0) goto L_0x001e
            goto L_0x0040
        L_0x001e:
            java.util.List r4 = r1.f11408c
            java.util.Iterator r4 = r4.iterator()
        L_0x0024:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r4.next()
            com.applovin.impl.sdk.AppLovinBroadcastManager$c r5 = (com.applovin.impl.sdk.AppLovinBroadcastManager.c) r5
            if (r5 == 0) goto L_0x0024
            boolean r6 = r5.f11412d
            if (r6 != 0) goto L_0x0024
            com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver r5 = r5.f11410b
            android.content.Intent r6 = r1.f11406a
            java.util.Map r7 = r1.f11407b
            r5.onReceive(r6, r7)
            goto L_0x0024
        L_0x0040:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinBroadcastManager.b():void");
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f11402a;
        synchronized (map) {
            c cVar = new c(intentFilter, receiver);
            ArrayList arrayList = (ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(cVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                Map map2 = f11403b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean sendBroadcast(android.content.Intent r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            java.util.Map r0 = f11402a
            monitor-enter(r0)
            java.util.List r1 = a(r4)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x000c
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r4
        L_0x000c:
            java.util.ArrayList r2 = f11404c     // Catch:{ all -> 0x0024 }
            com.applovin.impl.sdk.AppLovinBroadcastManager$b r3 = new com.applovin.impl.sdk.AppLovinBroadcastManager$b     // Catch:{ all -> 0x0024 }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x0024 }
            r2.add(r3)     // Catch:{ all -> 0x0024 }
            android.os.Handler r4 = f11405d     // Catch:{ all -> 0x0024 }
            r5 = 1
            boolean r1 = r4.hasMessages(r5)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            r4.sendEmptyMessage(r5)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r5
        L_0x0024:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcast(android.content.Intent, java.util.Map):boolean");
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<c> a10 = a(intent);
        if (a10 != null) {
            for (c cVar : a10) {
                if (!cVar.f11412d) {
                    cVar.f11410b.onReceive(intent, map);
                }
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f11402a;
        synchronized (map) {
            List<c> list = (List) map.remove(receiver);
            if (list != null) {
                for (c cVar : list) {
                    cVar.f11412d = true;
                    Iterator<String> actionsIterator = cVar.f11409a.actionsIterator();
                    while (actionsIterator.hasNext()) {
                        String next = actionsIterator.next();
                        List list2 = (List) f11403b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).f11410b == receiver) {
                                    cVar.f11412d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f11403b.remove(next);
                            }
                        }
                    }
                }
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f11402a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<c> list = (List) f11403b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList<c> arrayList = null;
            for (c cVar : list) {
                if (!cVar.f11411c) {
                    if (cVar.f11409a.match(action, (String) null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(cVar);
                        cVar.f11411c = true;
                    }
                }
            }
            if (arrayList == null) {
                return null;
            }
            for (c cVar2 : arrayList) {
                cVar2.f11411c = false;
            }
            return arrayList;
        }
    }
}
