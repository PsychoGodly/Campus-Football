package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.q5;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

public class i6 implements oi {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8431a;

    /* renamed from: b  reason: collision with root package name */
    private int f8432b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f8433c = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8434d;

    /* renamed from: e  reason: collision with root package name */
    private hd f8435e = hd.f8298a;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8436f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8437g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8438h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8439i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8440j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8441k;

    public i6(Context context) {
        this.f8431a = context;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r15, int r16, com.applovin.impl.hd r17, boolean r18, com.applovin.impl.q1 r19, android.os.Handler r20, com.applovin.impl.p1 r21, java.util.ArrayList r22) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r9 = r22
            java.lang.String r10 = "DefaultRenderersFactory"
            java.lang.Class<com.applovin.impl.q1> r11 = com.applovin.impl.q1.class
            java.lang.Class<com.applovin.impl.p1> r12 = com.applovin.impl.p1.class
            com.applovin.impl.dd r13 = new com.applovin.impl.dd
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r2 = r1.f8436f
            r13.a((boolean) r2)
            boolean r2 = r1.f8437g
            r13.b((boolean) r2)
            boolean r2 = r1.f8438h
            r13.c((boolean) r2)
            r9.add(r13)
            if (r0 != 0) goto L_0x0031
            return
        L_0x0031:
            int r2 = r22.size()
            r3 = 2
            if (r0 != r3) goto L_0x003a
            int r2 = r2 + -1
        L_0x003a:
            r0 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r5] = r12     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r5] = r21     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r3] = r19     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            com.applovin.impl.li r6 = (com.applovin.impl.li) r6     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            int r7 = r2 + 1
            r9.add(r2, r6)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x006c }
            java.lang.String r2 = "Loaded LibopusAudioRenderer."
            com.applovin.impl.kc.c(r10, r2)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x006c }
            goto L_0x0076
        L_0x006a:
            r2 = r7
            goto L_0x0075
        L_0x006c:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating Opus extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0075:
            r7 = r2
        L_0x0076:
            java.lang.String r2 = "com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r5] = r12     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r5] = r21     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r3] = r19     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            com.applovin.impl.li r2 = (com.applovin.impl.li) r2     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            int r6 = r7 + 1
            r9.add(r7, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x00a5 }
            java.lang.String r2 = "Loaded LibflacAudioRenderer."
            com.applovin.impl.kc.c(r10, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x00a5 }
            goto L_0x00af
        L_0x00a3:
            r7 = r6
            goto L_0x00ae
        L_0x00a5:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FLAC extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00ae:
            r6 = r7
        L_0x00af:
            java.lang.String r2 = "com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r7[r5] = r12     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r7[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r5] = r21     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r3] = r19     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            com.applovin.impl.li r0 = (com.applovin.impl.li) r0     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r9.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            com.applovin.impl.kc.c(r10, r0)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FFmpeg extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i6.a(android.content.Context, int, com.applovin.impl.hd, boolean, com.applovin.impl.q1, android.os.Handler, com.applovin.impl.p1, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public void a(Context context, Handler handler, int i10, ArrayList arrayList) {
    }

    /* access modifiers changed from: protected */
    public void a(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new u2());
    }

    /* access modifiers changed from: protected */
    public void a(Context context, af afVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new bf(afVar, looper));
    }

    /* access modifiers changed from: protected */
    public void a(Context context, bo boVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new co(boVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0088, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        throw new java.lang.RuntimeException("Error instantiating AV1 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r16, int r17, com.applovin.impl.hd r18, boolean r19, android.os.Handler r20, com.applovin.impl.xq r21, long r22, java.util.ArrayList r24) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            r11 = r24
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<com.applovin.impl.xq> r13 = com.applovin.impl.xq.class
            com.applovin.impl.kd r14 = new com.applovin.impl.kd
            r10 = 50
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            boolean r2 = r1.f8436f
            r14.a((boolean) r2)
            boolean r2 = r1.f8437g
            r14.b((boolean) r2)
            boolean r2 = r1.f8438h
            r14.c((boolean) r2)
            r11.add(r14)
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            int r2 = r24.size()
            r3 = 2
            if (r0 != r3) goto L_0x003b
            int r2 = r2 + -1
        L_0x003b:
            r0 = 50
            r4 = 3
            r5 = 0
            r6 = 4
            r7 = 1
            java.lang.String r8 = "com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r9[r7] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Long r10 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r7] = r20     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Object r8 = r8.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            com.applovin.impl.li r8 = (com.applovin.impl.li) r8     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            int r9 = r2 + 1
            r11.add(r2, r8)     // Catch:{ ClassNotFoundException -> 0x007e, Exception -> 0x0080 }
            java.lang.String r2 = "Loaded LibvpxVideoRenderer."
            com.applovin.impl.kc.c(r12, r2)     // Catch:{ ClassNotFoundException -> 0x007e, Exception -> 0x0080 }
            goto L_0x008a
        L_0x007e:
            r2 = r9
            goto L_0x0089
        L_0x0080:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating VP9 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0089:
            r9 = r2
        L_0x008a:
            java.lang.String r2 = "com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r5] = r10     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r8[r7] = r10     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r4] = r10     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Long r10 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r5] = r10     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r7] = r20     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r3] = r21     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            r8[r4] = r10     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            java.lang.Object r2 = r2.newInstance(r8)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            com.applovin.impl.li r2 = (com.applovin.impl.li) r2     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00c9 }
            int r8 = r9 + 1
            r11.add(r9, r2)     // Catch:{ ClassNotFoundException -> 0x00c7, Exception -> 0x00c9 }
            java.lang.String r2 = "Loaded Libgav1VideoRenderer."
            com.applovin.impl.kc.c(r12, r2)     // Catch:{ ClassNotFoundException -> 0x00c7, Exception -> 0x00c9 }
            goto L_0x00d3
        L_0x00c7:
            r9 = r8
            goto L_0x00d2
        L_0x00c9:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating AV1 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00d2:
            r8 = r9
        L_0x00d3:
            java.lang.String r2 = "com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r9[r7] = r10     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r9[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Long r9 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r6[r5] = r9     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r6[r7] = r20     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r6[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r6[r4] = r0     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.Object r0 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            com.applovin.impl.li r0 = (com.applovin.impl.li) r0     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            r11.add(r8, r0)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            java.lang.String r0 = "Loaded FfmpegVideoRenderer."
            com.applovin.impl.kc.c(r12, r0)     // Catch:{ ClassNotFoundException -> 0x0117, Exception -> 0x010e }
            goto L_0x0117
        L_0x010e:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FFmpeg extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i6.a(android.content.Context, int, com.applovin.impl.hd, boolean, android.os.Handler, com.applovin.impl.xq, long, java.util.ArrayList):void");
    }

    public li[] a(Handler handler, xq xqVar, p1 p1Var, bo boVar, af afVar) {
        ArrayList arrayList = new ArrayList();
        a(this.f8431a, this.f8432b, this.f8435e, this.f8434d, handler, xqVar, this.f8433c, arrayList);
        q1 a10 = a(this.f8431a, this.f8439i, this.f8440j, this.f8441k);
        if (a10 != null) {
            a(this.f8431a, this.f8432b, this.f8435e, this.f8434d, a10, handler, p1Var, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        a(this.f8431a, boVar, handler.getLooper(), this.f8432b, arrayList2);
        a(this.f8431a, afVar, handler.getLooper(), this.f8432b, arrayList2);
        a(this.f8431a, this.f8432b, arrayList);
        Handler handler2 = handler;
        a(this.f8431a, handler, this.f8432b, arrayList);
        return (li[]) arrayList.toArray(new li[0]);
    }

    /* access modifiers changed from: protected */
    public q1 a(Context context, boolean z10, boolean z11, boolean z12) {
        return new q5(m1.a(context), new q5.d(new o1[0]), z10, z11, z12 ? 1 : 0);
    }
}
