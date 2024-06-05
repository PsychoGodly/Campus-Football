package com.google.android.gms.ads.internal.util;

import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f14827a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static List f14828b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f14829c = new Object();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static java.util.List a(java.lang.String r14) {
        /*
            java.lang.Object r0 = f14829c
            monitor-enter(r0)
            java.util.Map r1 = f14827a     // Catch:{ all -> 0x014f }
            boolean r2 = r1.containsKey(r14)     // Catch:{ all -> 0x014f }
            if (r2 == 0) goto L_0x0013
            java.lang.Object r14 = r1.get(r14)     // Catch:{ all -> 0x014f }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x014f }
            monitor-exit(r0)     // Catch:{ all -> 0x014f }
            return r14
        L_0x0013:
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.util.List r1 = f14828b     // Catch:{ all -> 0x0128 }
            r2 = 21
            r3 = 0
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x004c
        L_0x001d:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0128 }
            if (r1 < r2) goto L_0x0031
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch:{ all -> 0x0128 }
            r1.<init>(r3)     // Catch:{ all -> 0x0128 }
            android.media.MediaCodecInfo[] r1 = r1.getCodecInfos()     // Catch:{ all -> 0x0128 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0128 }
            f14828b = r1     // Catch:{ all -> 0x0128 }
            goto L_0x004b
        L_0x0031:
            int r1 = android.media.MediaCodecList.getCodecCount()     // Catch:{ all -> 0x0128 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0128 }
            r4.<init>(r1)     // Catch:{ all -> 0x0128 }
            f14828b = r4     // Catch:{ all -> 0x0128 }
            r4 = 0
        L_0x003d:
            if (r4 >= r1) goto L_0x004b
            android.media.MediaCodecInfo r5 = android.media.MediaCodecList.getCodecInfoAt(r4)     // Catch:{ all -> 0x0128 }
            java.util.List r6 = f14828b     // Catch:{ all -> 0x0128 }
            r6.add(r5)     // Catch:{ all -> 0x0128 }
            int r4 = r4 + 1
            goto L_0x003d
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
        L_0x004c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r1.<init>()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.util.List r4 = f14828b     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
        L_0x0057:
            boolean r5 = r4.hasNext()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            if (r5 == 0) goto L_0x0121
            java.lang.Object r5 = r4.next()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            android.media.MediaCodecInfo r5 = (android.media.MediaCodecInfo) r5     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            boolean r6 = r5.isEncoder()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            if (r6 != 0) goto L_0x0057
            java.lang.String[] r6 = r5.getSupportedTypes()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            boolean r6 = r6.contains(r14)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            if (r6 == 0) goto L_0x0057
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.<init>()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r7 = "codecName"
            java.lang.String r8 = r5.getName()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r7, r8)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.getCapabilitiesForType(r14)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r7.<init>()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            android.media.MediaCodecInfo$CodecProfileLevel[] r8 = r5.profileLevels     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            int r9 = r8.length     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r10 = 0
        L_0x0092:
            if (r10 >= r9) goto L_0x00b0
            r11 = r8[r10]     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r12 = 2
            java.lang.Integer[] r12 = new java.lang.Integer[r12]     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            int r13 = r11.profile     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r12[r3] = r13     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            int r11 = r11.level     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r13 = 1
            r12[r13] = r11     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r7.add(r12)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            int r10 = r10 + 1
            goto L_0x0092
        L_0x00b0:
            java.lang.String r8 = "profileLevels"
            r6.put(r8, r7)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            if (r7 < r2) goto L_0x010b
            android.media.MediaCodecInfo$VideoCapabilities r8 = r5.getVideoCapabilities()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r9 = "bitRatesBps"
            android.util.Range r10 = r8.getBitrateRange()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer[] r10 = b(r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r9 = "widthAlignment"
            int r10 = r8.getWidthAlignment()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r9 = "heightAlignment"
            int r10 = r8.getHeightAlignment()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r9 = "frameRates"
            android.util.Range r10 = r8.getSupportedFrameRates()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer[] r10 = b(r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r9 = "widths"
            android.util.Range r10 = r8.getSupportedWidths()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer[] r10 = b(r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.String r9 = "heights"
            android.util.Range r8 = r8.getSupportedHeights()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer[] r8 = b(r8)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r9, r8)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
        L_0x010b:
            r8 = 23
            if (r7 < r8) goto L_0x011c
            java.lang.String r7 = "instancesLimit"
            int r5 = r5.getMaxSupportedInstances()     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r6.put(r7, r5)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
        L_0x011c:
            r1.add(r6)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            goto L_0x0057
        L_0x0121:
            java.util.Map r2 = f14827a     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            r2.put(r14, r1)     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
            monitor-exit(r0)     // Catch:{ all -> 0x014f }
            return r1
        L_0x0128:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            throw r1     // Catch:{ RuntimeException -> 0x012d, LinkageError -> 0x012b }
        L_0x012b:
            r1 = move-exception
            goto L_0x012e
        L_0x012d:
            r1 = move-exception
        L_0x012e:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x014f }
            r2.<init>()     // Catch:{ all -> 0x014f }
            java.lang.String r3 = "error"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x014f }
            r2.put(r3, r1)     // Catch:{ all -> 0x014f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x014f }
            r1.<init>()     // Catch:{ all -> 0x014f }
            r1.add(r2)     // Catch:{ all -> 0x014f }
            java.util.Map r2 = f14827a     // Catch:{ all -> 0x014f }
            r2.put(r14, r1)     // Catch:{ all -> 0x014f }
            monitor-exit(r0)     // Catch:{ all -> 0x014f }
            return r1
        L_0x014f:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014f }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.k1.a(java.lang.String):java.util.List");
    }

    private static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
