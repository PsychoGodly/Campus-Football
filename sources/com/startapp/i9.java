package com.startapp;

import android.content.Context;
import android.content.Intent;

/* compiled from: Sta */
public class i9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent[] f15928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f15929b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f15930c;

    public i9(Intent[] intentArr, Context context, String str) {
        this.f15928a = intentArr;
        this.f15929b = context;
        this.f15930c = str;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r3 = this;
            android.content.Intent[] r0 = r3.f15928a
            android.content.Context r1 = r3.f15929b
            java.lang.String r2 = r3.f15930c
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0015
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0016
        L_0x0011:
            r1 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r1)
        L_0x0015:
            r1 = 0
        L_0x0016:
            r2 = 0
            r0[r2] = r1
            android.content.Intent[] r0 = r3.f15928a
            monitor-enter(r0)
            android.content.Intent[] r1 = r3.f15928a     // Catch:{ all -> 0x0023 }
            r1.notifyAll()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.i9.run():void");
    }
}
