package n2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import e3.j;
import e3.l;
import e3.q;
import f3.f;
import f3.g;
import java.util.ArrayList;
import l4.x;
import m4.b;
import p2.c0;
import p2.t;
import p2.v;
import y3.n;
import y3.o;

/* compiled from: DefaultRenderersFactory */
public class m implements t3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20536a;

    /* renamed from: b  reason: collision with root package name */
    private final j f20537b = new j();

    /* renamed from: c  reason: collision with root package name */
    private int f20538c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f20539d = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20540e;

    /* renamed from: f  reason: collision with root package name */
    private q f20541f = q.f17912a;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20542g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20543h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20544i;

    public m(Context context) {
        this.f20536a = context;
    }

    public p3[] a(Handler handler, x xVar, t tVar, n nVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        h(this.f20536a, this.f20538c, this.f20541f, this.f20540e, handler, xVar, this.f20539d, arrayList);
        v c10 = c(this.f20536a, this.f20542g, this.f20543h, this.f20544i);
        if (c10 != null) {
            b(this.f20536a, this.f20538c, this.f20541f, this.f20540e, c10, handler, tVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        g(this.f20536a, nVar, handler.getLooper(), this.f20538c, arrayList2);
        e(this.f20536a, fVar, handler.getLooper(), this.f20538c, arrayList2);
        d(this.f20536a, this.f20538c, arrayList);
        Handler handler2 = handler;
        f(this.f20536a, handler, this.f20538c, arrayList);
        return (p3[]) arrayList.toArray(new p3[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        throw new java.lang.RuntimeException("Error instantiating MIDI extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:33:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r15, int r16, e3.q r17, boolean r18, p2.v r19, android.os.Handler r20, p2.t r21, java.util.ArrayList<n2.p3> r22) {
        /*
            r14 = this;
            r0 = r16
            r9 = r22
            java.lang.Class<p2.v> r10 = p2.v.class
            java.lang.Class<p2.t> r11 = p2.t.class
            java.lang.String r12 = "DefaultRenderersFactory"
            p2.g0 r13 = new p2.g0
            e3.l$b r3 = r14.i()
            r1 = r13
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.add(r13)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            int r1 = r22.size()
            r2 = 2
            if (r0 != r2) goto L_0x002e
            int r1 = r1 + -1
        L_0x002e:
            r0 = 0
            java.lang.String r3 = "com.google.android.exoplayer2.decoder.midi.MidiRenderer"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            n2.p3 r3 = (n2.p3) r3     // Catch:{ ClassNotFoundException -> 0x0059, Exception -> 0x0050 }
            int r4 = r1 + 1
            r9.add(r1, r3)     // Catch:{ ClassNotFoundException -> 0x004e, Exception -> 0x0050 }
            java.lang.String r1 = "Loaded MidiRenderer."
            k4.r.f(r12, r1)     // Catch:{ ClassNotFoundException -> 0x004e, Exception -> 0x0050 }
            goto L_0x005a
        L_0x004e:
            r1 = r4
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating MIDI extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0059:
            r4 = r1
        L_0x005a:
            r1 = 3
            r3 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r2] = r10     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            r6[r2] = r19     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            n2.p3 r5 = (n2.p3) r5     // Catch:{ ClassNotFoundException -> 0x0094, Exception -> 0x008b }
            int r6 = r4 + 1
            r9.add(r4, r5)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x008b }
            java.lang.String r4 = "Loaded LibopusAudioRenderer."
            k4.r.f(r12, r4)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x008b }
            goto L_0x0095
        L_0x0089:
            r4 = r6
            goto L_0x0094
        L_0x008b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0094:
            r6 = r4
        L_0x0095:
            java.lang.String r4 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r2] = r10     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r3] = r21     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            r5[r2] = r19     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            java.lang.Object r4 = r4.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            n2.p3 r4 = (n2.p3) r4     // Catch:{ ClassNotFoundException -> 0x00cd, Exception -> 0x00c4 }
            int r5 = r6 + 1
            r9.add(r6, r4)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00c4 }
            java.lang.String r4 = "Loaded LibflacAudioRenderer."
            k4.r.f(r12, r4)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00c4 }
            goto L_0x00ce
        L_0x00c2:
            r6 = r5
            goto L_0x00cd
        L_0x00c4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00cd:
            r5 = r6
        L_0x00ce:
            java.lang.String r4 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r6[r2] = r10     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r1[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r1[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r1[r2] = r19     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.Object r0 = r4.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            n2.p3 r0 = (n2.p3) r0     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            r9.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            k4.r.f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x00f9 }
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.m.b(android.content.Context, int, e3.q, boolean, p2.v, android.os.Handler, p2.t, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public v c(Context context, boolean z10, boolean z11, boolean z12) {
        return new c0.f().g(p2.f.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    /* access modifiers changed from: protected */
    public void d(Context context, int i10, ArrayList<p3> arrayList) {
        arrayList.add(new b());
    }

    /* access modifiers changed from: protected */
    public void e(Context context, f fVar, Looper looper, int i10, ArrayList<p3> arrayList) {
        arrayList.add(new g(fVar, looper));
    }

    /* access modifiers changed from: protected */
    public void f(Context context, Handler handler, int i10, ArrayList<p3> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void g(Context context, n nVar, Looper looper, int i10, ArrayList<p3> arrayList) {
        arrayList.add(new o(nVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r16, int r17, e3.q r18, boolean r19, android.os.Handler r20, l4.x r21, long r22, java.util.ArrayList<n2.p3> r24) {
        /*
            r15 = this;
            r0 = r17
            r11 = r24
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<l4.x> r13 = l4.x.class
            l4.h r14 = new l4.h
            e3.l$b r3 = r15.i()
            r10 = 50
            r1 = r14
            r2 = r16
            r4 = r18
            r5 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r11.add(r14)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            int r1 = r24.size()
            r2 = 2
            if (r0 != r2) goto L_0x002f
            int r1 = r1 + -1
        L_0x002f:
            r0 = 50
            r3 = 3
            r4 = 0
            r5 = 4
            r6 = 1
            java.lang.String r7 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r8[r6] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r2] = r13     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Long r9 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r6] = r20     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r2] = r21     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            java.lang.Object r7 = r7.newInstance(r8)     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            n2.p3 r7 = (n2.p3) r7     // Catch:{ ClassNotFoundException -> 0x007d, Exception -> 0x0074 }
            int r8 = r1 + 1
            r11.add(r1, r7)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0074 }
            java.lang.String r1 = "Loaded LibvpxVideoRenderer."
            k4.r.f(r12, r1)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0074 }
            goto L_0x007e
        L_0x0072:
            r1 = r8
            goto L_0x007d
        L_0x0074:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x007d:
            r8 = r1
        L_0x007e:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r4] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r7[r6] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r2] = r13     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r7[r3] = r9     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r6] = r20     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r2] = r21     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r5[r3] = r0     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.Object r0 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            n2.p3 r0 = (n2.p3) r0     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            r11.add(r8, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            k4.r.f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00c2, Exception -> 0x00b9 }
            goto L_0x00c2
        L_0x00b9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.m.h(android.content.Context, int, e3.q, boolean, android.os.Handler, l4.x, long, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public l.b i() {
        return this.f20537b;
    }

    public m j(boolean z10) {
        this.f20544i = z10;
        return this;
    }
}
