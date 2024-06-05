package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b4 {

    /* renamed from: e  reason: collision with root package name */
    private static final List f6620e = Arrays.asList(new String[]{"5.0/i", "4.0/ad", "1.0/mediate"});
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f6621a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f6622b;

    /* renamed from: c  reason: collision with root package name */
    private final zf f6623c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public d f6624d;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f6625a;

        /* renamed from: b  reason: collision with root package name */
        private long f6626b;

        public long a() {
            return this.f6625a;
        }

        public long b() {
            return this.f6626b;
        }

        /* access modifiers changed from: private */
        public void a(long j10) {
            this.f6625a = j10;
        }

        /* access modifiers changed from: private */
        public void b(long j10) {
            this.f6626b = j10;
        }
    }

    private class c implements androidx.core.util.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f6627a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f6628b;

        /* renamed from: c  reason: collision with root package name */
        private final String f6629c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f6630d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f6631e;

        /* renamed from: f  reason: collision with root package name */
        private final b f6632f;

        /* renamed from: g  reason: collision with root package name */
        private final e f6633g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f6627a = str;
            this.f6628b = aVar;
            this.f6629c = str2;
            this.f6630d = obj;
            this.f6631e = z10;
            this.f6632f = bVar;
            this.f6633g = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:61:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01d7 A[Catch:{ all -> 0x01f7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x022e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.applovin.impl.zf.d r16) {
            /*
                r15 = this;
                r1 = r15
                long r9 = r16.e()
                r11 = 0
                r2 = 0
                int r12 = r16.c()     // Catch:{ MalformedURLException -> 0x020f, all -> 0x01aa }
                if (r12 <= 0) goto L_0x018f
                r0 = 200(0xc8, float:2.8E-43)
                if (r12 < r0) goto L_0x0186
                r0 = 400(0x190, float:5.6E-43)
                if (r12 >= r0) goto L_0x0186
                com.applovin.impl.b4$b r0 = r1.f6632f     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r0 == 0) goto L_0x001c
                r0.a(r9)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
            L_0x001c:
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r1.f6629c     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r4 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r5 = r12
                r6 = r9
                r2.a(r3, r4, r5, r6)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                byte[] r0 = r16.d()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                android.content.Context r2 = com.applovin.impl.sdk.k.k()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                boolean r2 = com.applovin.impl.zp.f((android.content.Context) r2)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = "UTF-8"
                if (r2 == 0) goto L_0x0077
                boolean r2 = r1.f6631e     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r2 == 0) goto L_0x0043
                com.applovin.impl.qi$a r2 = com.applovin.impl.qi.b((byte[]) r0)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.qi$a r4 = com.applovin.impl.qi.a.V2     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r2 == r4) goto L_0x0077
            L_0x0043:
                java.lang.String r2 = ""
                if (r0 == 0) goto L_0x0055
                java.lang.String r4 = new java.lang.String     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                byte[] r5 = r16.d()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r4.<init>(r5, r6)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                goto L_0x0056
            L_0x0055:
                r4 = r2
            L_0x0056:
                com.applovin.impl.sdk.network.a r5 = r1.f6628b     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                org.json.JSONObject r5 = r5.b()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r5 == 0) goto L_0x0068
                com.applovin.impl.sdk.network.a r2 = r1.f6628b     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                org.json.JSONObject r2 = r2.b()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
            L_0x0068:
                com.applovin.impl.b4 r5 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.k r5 = r5.f6621a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.h r5 = r5.o()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r6 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r5.a(r4, r6, r2)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
            L_0x0077:
                if (r0 == 0) goto L_0x017b
                java.lang.String r8 = new java.lang.String     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                byte[] r2 = r16.d()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r8.<init>(r2, r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4$b r2 = r1.f6632f     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r2 == 0) goto L_0x00ab
                int r3 = r0.length     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                long r3 = (long) r3     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2.b(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.network.a r2 = r1.f6628b     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                boolean r2 = r2.r()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r2 == 0) goto L_0x00ab
                com.applovin.impl.b4 r13 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4$d r14 = new com.applovin.impl.b4$d     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.network.a r2 = r1.f6628b     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r2.f()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                int r2 = r0.length     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                long r4 = (long) r2     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2 = r14
                r6 = r9
                r2.<init>(r3, r4, r6)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4.d unused = r13.f6624d = r14     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
            L_0x00ab:
                boolean r2 = r1.f6631e     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r2 == 0) goto L_0x00eb
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.k r2 = r2.f6621a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r2 = r2.d0()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.k r3 = r3.f6621a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r0 = com.applovin.impl.qi.b(r0, r2, r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                if (r0 != 0) goto L_0x00ea
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r3 = 2
                r2.<init>(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = "request"
                java.lang.String r4 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r4 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r4)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2.put(r3, r4)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = "response"
                r2.put(r3, r8)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.k r3 = r3.f6621a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.EventServiceImpl r3 = r3.C()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r4 = "rdf"
                r3.trackEvent(r4, r2)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
            L_0x00ea:
                r8 = r0
            L_0x00eb:
                com.applovin.impl.b4 r0 = com.applovin.impl.b4.this     // Catch:{ all -> 0x00fc }
                java.lang.Object r2 = r1.f6630d     // Catch:{ all -> 0x00fc }
                java.lang.Object r0 = r0.a((java.lang.String) r8, (java.lang.Object) r2)     // Catch:{ all -> 0x00fc }
                com.applovin.impl.b4$e r2 = r1.f6633g     // Catch:{ all -> 0x00fc }
                java.lang.String r3 = r1.f6627a     // Catch:{ all -> 0x00fc }
                r2.a(r3, r0, r12)     // Catch:{ all -> 0x00fc }
                goto L_0x0241
            L_0x00fc:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = "Unable to parse response from "
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = " because of "
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.Class r3 = r0.getClass()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r3.getName()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = " : "
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r0.getMessage()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.t unused = r3.f6622b     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r4 = "ConnectionManager"
                if (r3 == 0) goto L_0x0146
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.t r3 = r3.f6622b     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r3.a(r4, r2, r0)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
            L_0x0146:
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.k r3 = r3.f6621a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.ba r3 = r3.F()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.aa r5 = com.applovin.impl.aa.f6352n     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r3.c(r5)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = "url"
                java.lang.String r5 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r5 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r5)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.util.HashMap r3 = com.applovin.impl.sdk.utils.CollectionUtils.hashMap(r3, r5)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4 r5 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.k r5 = r5.f6621a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.sdk.o r5 = r5.B()     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r6 = "failedToParseResponse"
                r5.a((java.lang.String) r4, (java.lang.String) r6, (java.lang.Throwable) r0, (java.util.Map) r3)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4$e r0 = r1.f6633g     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r4 = -800(0xfffffffffffffce0, float:NaN)
                r0.a(r3, r4, r2, r11)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                goto L_0x0241
            L_0x017b:
                com.applovin.impl.b4$e r0 = r1.f6633g     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r2 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.Object r3 = r1.f6630d     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r0.a(r2, r3, r12)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                goto L_0x0241
            L_0x0186:
                com.applovin.impl.b4$e r0 = r1.f6633g     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r2 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r0.a(r2, r12, r11, r11)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                goto L_0x0241
            L_0x018f:
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r3 = r1.f6629c     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r4 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r8 = 0
                r5 = r12
                r6 = r9
                r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (long) r6, (java.lang.Throwable) r8)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                com.applovin.impl.b4$e r0 = r1.f6633g     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                java.lang.String r2 = r1.f6627a     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                r0.a(r2, r12, r11, r11)     // Catch:{ MalformedURLException -> 0x01a7, all -> 0x01a4 }
                goto L_0x0241
            L_0x01a4:
                r0 = move-exception
                r2 = r12
                goto L_0x01ab
            L_0x01a7:
                r0 = move-exception
                r5 = r12
                goto L_0x0211
            L_0x01aa:
                r0 = move-exception
            L_0x01ab:
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this
                com.applovin.impl.sdk.k r3 = r3.f6621a
                com.applovin.impl.oj r4 = com.applovin.impl.oj.f10415u
                java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x01c3
                int r2 = r16.b()
            L_0x01c3:
                if (r2 != 0) goto L_0x01cb
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this
                int r2 = r2.a((java.lang.Throwable) r0)
            L_0x01cb:
                r12 = r2
                byte[] r2 = r16.f()     // Catch:{ all -> 0x01f7 }
                java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x01f7 }
                r3.<init>(r2)     // Catch:{ all -> 0x01f7 }
                if (r2 == 0) goto L_0x01f7
                boolean r4 = r1.f6631e     // Catch:{ all -> 0x01f7 }
                if (r4 == 0) goto L_0x01ef
                com.applovin.impl.b4 r3 = com.applovin.impl.b4.this     // Catch:{ all -> 0x01f7 }
                com.applovin.impl.sdk.k r3 = r3.f6621a     // Catch:{ all -> 0x01f7 }
                java.lang.String r3 = r3.d0()     // Catch:{ all -> 0x01f7 }
                com.applovin.impl.b4 r4 = com.applovin.impl.b4.this     // Catch:{ all -> 0x01f7 }
                com.applovin.impl.sdk.k r4 = r4.f6621a     // Catch:{ all -> 0x01f7 }
                java.lang.String r3 = com.applovin.impl.qi.b(r2, r3, r4)     // Catch:{ all -> 0x01f7 }
            L_0x01ef:
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this     // Catch:{ all -> 0x01f7 }
                java.lang.Object r4 = r1.f6630d     // Catch:{ all -> 0x01f7 }
                java.lang.Object r11 = r2.a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x01f7 }
            L_0x01f7:
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this
                java.lang.String r3 = r1.f6629c
                java.lang.String r4 = r1.f6627a
                r5 = r12
                r6 = r9
                r8 = r0
                r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (long) r6, (java.lang.Throwable) r8)
                com.applovin.impl.b4$e r2 = r1.f6633g
                java.lang.String r3 = r1.f6627a
                java.lang.String r0 = r0.getMessage()
                r2.a(r3, r12, r0, r11)
                goto L_0x0241
            L_0x020f:
                r0 = move-exception
                r5 = 0
            L_0x0211:
                java.lang.Object r2 = r1.f6630d
                r12 = -901(0xfffffffffffffc7b, float:NaN)
                if (r2 == 0) goto L_0x022e
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this
                java.lang.String r3 = r1.f6629c
                java.lang.String r4 = r1.f6627a
                r6 = r9
                r8 = r0
                r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (long) r6, (java.lang.Throwable) r8)
                com.applovin.impl.b4$e r2 = r1.f6633g
                java.lang.String r3 = r1.f6627a
                java.lang.String r0 = r0.getMessage()
                r2.a(r3, r12, r0, r11)
                goto L_0x0241
            L_0x022e:
                com.applovin.impl.b4 r2 = com.applovin.impl.b4.this
                java.lang.String r3 = r1.f6629c
                java.lang.String r4 = r1.f6627a
                r6 = r9
                r2.a(r3, r4, r5, r6)
                com.applovin.impl.b4$e r0 = r1.f6633g
                java.lang.String r2 = r1.f6627a
                java.lang.Object r3 = r1.f6630d
                r0.a(r2, r3, r12)
            L_0x0241:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.c.accept(com.applovin.impl.zf$d):void");
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final long f6635a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        private final String f6636b;

        /* renamed from: c  reason: collision with root package name */
        private final long f6637c;

        /* renamed from: d  reason: collision with root package name */
        private final long f6638d;

        public d(String str, long j10, long j11) {
            this.f6636b = str;
            this.f6637c = j10;
            this.f6638d = j11;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f6637c;
        }

        public long c() {
            return this.f6635a;
        }

        public String d() {
            return this.f6636b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String d10 = d();
            String d11 = dVar.d();
            return d10 != null ? d10.equals(d11) : d11 == null;
        }

        public int hashCode() {
            long c10 = c();
            long b10 = b();
            long a10 = a();
            int i10 = ((((((int) (c10 ^ (c10 >>> 32))) + 59) * 59) + ((int) (b10 ^ (b10 >>> 32)))) * 59) + ((int) ((a10 >>> 32) ^ a10));
            String d10 = d();
            return (i10 * 59) + (d10 == null ? 43 : d10.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f6638d;
        }
    }

    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public b4(k kVar) {
        this.f6621a = kVar;
        this.f6622b = kVar.L();
        zf zfVar = new zf(kVar);
        this.f6623c = zfVar;
        zfVar.a();
    }

    /* access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    public d a() {
        return this.f6624d;
    }

    /* access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof fs) {
                return gs.a(str, this.f6621a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (t.a()) {
                t tVar = this.f6622b;
                tVar.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d7, code lost:
        if (r3 != com.applovin.impl.qi.a.f10996d) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0247 A[Catch:{ all -> 0x01f7, all -> 0x029d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.b4.b r25, com.applovin.impl.b4.e r26) {
        /*
            r23 = this;
            r11 = r23
            r12 = r26
            if (r24 == 0) goto L_0x02d4
            java.lang.String r0 = r24.f()
            java.lang.String r13 = r24.h()
            if (r0 == 0) goto L_0x02cc
            if (r13 == 0) goto L_0x02c4
            if (r12 == 0) goto L_0x02bc
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            r14 = 0
            java.lang.String r2 = "ConnectionManager"
            if (r1 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Requested postback submission to non HTTP endpoint "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = "; skipping..."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.applovin.impl.sdk.t.h(r2, r1)
            r2 = -900(0xfffffffffffffc7c, float:NaN)
            r12.a(r0, r2, r1, r14)
            return
        L_0x0042:
            com.applovin.impl.sdk.k r1 = r11.f6621a
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10284d3
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "https://"
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L_0x0076
            com.applovin.impl.sdk.k r3 = r11.f6621a
            r3.L()
            boolean r3 = com.applovin.impl.sdk.t.a()
            if (r3 == 0) goto L_0x0070
            com.applovin.impl.sdk.k r3 = r11.f6621a
            com.applovin.impl.sdk.t r3 = r3.L()
            java.lang.String r4 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r3.k(r2, r4)
        L_0x0070:
            java.lang.String r3 = "http://"
            java.lang.String r0 = r0.replace(r3, r1)
        L_0x0076:
            java.util.HashMap r1 = new java.util.HashMap
            r3 = 2
            r1.<init>(r3)
            boolean r7 = r24.m()
            com.applovin.impl.sdk.k r3 = r11.f6621a
            com.applovin.impl.oj r4 = com.applovin.impl.oj.f10365n5
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00a3
            com.applovin.impl.sdk.k r3 = r11.f6621a
            com.applovin.impl.oj r4 = com.applovin.impl.oj.f10341k5
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.applovin.impl.qi$a r3 = com.applovin.impl.qi.a.a(r3)
            goto L_0x00a7
        L_0x00a3:
            com.applovin.impl.qi$a r3 = r24.e()
        L_0x00a7:
            com.applovin.impl.sdk.k r4 = r11.f6621a
            long r4 = com.applovin.impl.zp.a((com.applovin.impl.sdk.k) r4)
            java.util.Map r6 = r24.i()
            if (r6 == 0) goto L_0x00bd
            java.util.Map r6 = r24.i()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00c3
        L_0x00bd:
            int r6 = r24.c()
            if (r6 <= 0) goto L_0x0123
        L_0x00c3:
            java.util.Map r6 = r24.i()
            com.applovin.impl.sdk.k r8 = r11.f6621a
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10395r3
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r6 == 0) goto L_0x00e6
            int r9 = r24.c()
            if (r9 <= 0) goto L_0x00e6
            int r9 = r24.c()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "current_retry_attempt"
            r6.put(r10, r9)
        L_0x00e6:
            if (r7 == 0) goto L_0x011b
            boolean r8 = r8.booleanValue()
            java.lang.String r6 = com.applovin.impl.zp.a((java.util.Map) r6, (boolean) r8)
            com.applovin.impl.sdk.k r8 = r11.f6621a
            java.lang.String r19 = r8.d0()
            com.applovin.impl.sdk.k r8 = r11.f6621a
            r15 = r6
            r16 = r4
            r18 = r3
            r20 = r8
            java.lang.String r8 = com.applovin.impl.qi.b(r15, r16, r18, r19, r20)
            boolean r9 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r6)
            if (r9 == 0) goto L_0x0114
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x0114
            java.lang.String r9 = "query"
            r1.put(r9, r6)
        L_0x0114:
            java.lang.String r6 = "p"
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(r0, r6, r8)
            goto L_0x0123
        L_0x011b:
            boolean r8 = r8.booleanValue()
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(r0, r6, r8)
        L_0x0123:
            r10 = r0
            long r21 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r10)     // Catch:{ all -> 0x029d }
            java.util.List r6 = f6620e     // Catch:{ all -> 0x029d }
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.StringUtils.endsWith(r0, r6)     // Catch:{ all -> 0x029d }
            boolean r6 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x029d }
            if (r6 == 0) goto L_0x0173
            com.applovin.impl.sdk.t r6 = r11.f6622b     // Catch:{ all -> 0x029d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r8.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r9 = "Sending "
            r8.append(r9)     // Catch:{ all -> 0x029d }
            r8.append(r13)     // Catch:{ all -> 0x029d }
            java.lang.String r9 = " request to id=#"
            r8.append(r9)     // Catch:{ all -> 0x029d }
            int r9 = r10.hashCode()     // Catch:{ all -> 0x029d }
            r8.append(r9)     // Catch:{ all -> 0x029d }
            java.lang.String r9 = " \""
            r8.append(r9)     // Catch:{ all -> 0x029d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0160
            r0 = r10
            goto L_0x0164
        L_0x0160:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r10)     // Catch:{ all -> 0x029d }
        L_0x0164:
            r8.append(r0)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "\"..."
            r8.append(r0)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x029d }
            r6.d(r2, r0)     // Catch:{ all -> 0x029d }
        L_0x0173:
            com.applovin.impl.zf$c$a r0 = new com.applovin.impl.zf$c$a     // Catch:{ all -> 0x029d }
            r0.<init>()     // Catch:{ all -> 0x029d }
            com.applovin.impl.zf$c$a r0 = r0.a((java.lang.String) r10)     // Catch:{ all -> 0x029d }
            com.applovin.impl.zf$c$a r0 = r0.b((java.lang.String) r13)     // Catch:{ all -> 0x029d }
            java.util.Map r6 = r24.g()     // Catch:{ all -> 0x029d }
            com.applovin.impl.zf$c$a r0 = r0.a((java.util.Map) r6)     // Catch:{ all -> 0x029d }
            int r6 = r24.l()     // Catch:{ all -> 0x029d }
            com.applovin.impl.zf$c$a r9 = r0.a((int) r6)     // Catch:{ all -> 0x029d }
            org.json.JSONObject r0 = r24.b()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x024a
            if (r7 == 0) goto L_0x01c2
            org.json.JSONObject r0 = r24.b()     // Catch:{ all -> 0x029d }
            java.lang.String r15 = r0.toString()     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.k r0 = r11.f6621a     // Catch:{ all -> 0x029d }
            java.lang.String r19 = r0.d0()     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.k r0 = r11.f6621a     // Catch:{ all -> 0x029d }
            r16 = r4
            r18 = r3
            r20 = r0
            byte[] r0 = com.applovin.impl.qi.a((java.lang.String) r15, (long) r16, (com.applovin.impl.qi.a) r18, (java.lang.String) r19, (com.applovin.impl.sdk.k) r20)     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x01d0
            java.lang.String r4 = "body"
            org.json.JSONObject r5 = r24.b()     // Catch:{ all -> 0x029d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x029d }
            r1.put(r4, r5)     // Catch:{ all -> 0x029d }
            goto L_0x01d0
        L_0x01c2:
            org.json.JSONObject r0 = r24.b()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x029d }
            java.lang.String r4 = "UTF-8"
            byte[] r0 = r0.getBytes(r4)     // Catch:{ all -> 0x029d }
        L_0x01d0:
            r4 = r0
            java.lang.String r5 = "gzip"
            if (r7 == 0) goto L_0x01d9
            com.applovin.impl.qi$a r0 = com.applovin.impl.qi.a.V2     // Catch:{ all -> 0x029d }
            if (r3 == r0) goto L_0x022c
        L_0x01d9:
            boolean r0 = r24.o()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x022c
            if (r4 == 0) goto L_0x022c
            int r0 = r4.length     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.k r3 = r11.f6621a     // Catch:{ all -> 0x029d }
            com.applovin.impl.oj r6 = com.applovin.impl.oj.G5     // Catch:{ all -> 0x029d }
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r6)     // Catch:{ all -> 0x029d }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x029d }
            int r3 = r3.intValue()     // Catch:{ all -> 0x029d }
            if (r0 <= r3) goto L_0x022c
            byte[] r0 = com.applovin.impl.zp.a((byte[]) r4)     // Catch:{ all -> 0x01f7 }
            goto L_0x022d
        L_0x01f7:
            r0 = move-exception
            r3 = r0
            boolean r0 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0219
            com.applovin.impl.sdk.t r0 = r11.f6622b     // Catch:{ all -> 0x029d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r6.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r8 = "Failed to gzip POST body for request "
            r6.append(r8)     // Catch:{ all -> 0x029d }
            java.lang.String r8 = r11.a((java.lang.String) r10)     // Catch:{ all -> 0x029d }
            r6.append(r8)     // Catch:{ all -> 0x029d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x029d }
            r0.a(r2, r6, r3)     // Catch:{ all -> 0x029d }
        L_0x0219:
            java.lang.String r0 = "url"
            java.lang.String r6 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r10)     // Catch:{ all -> 0x029d }
            java.util.HashMap r0 = com.applovin.impl.sdk.utils.CollectionUtils.hashMap(r0, r6)     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.k r6 = r11.f6621a     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.o r6 = r6.B()     // Catch:{ all -> 0x029d }
            r6.a((java.lang.String) r2, (java.lang.String) r5, (java.lang.Throwable) r3, (java.util.Map) r0)     // Catch:{ all -> 0x029d }
        L_0x022c:
            r0 = r14
        L_0x022d:
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json; charset=utf-8"
            r9.a(r2, r3)     // Catch:{ all -> 0x029d }
            boolean r2 = r24.o()     // Catch:{ all -> 0x029d }
            if (r2 == 0) goto L_0x0245
            if (r0 == 0) goto L_0x0245
            java.lang.String r2 = "Content-Encoding"
            r9.a(r2, r5)     // Catch:{ all -> 0x029d }
            r9.a((byte[]) r0)     // Catch:{ all -> 0x029d }
            goto L_0x024a
        L_0x0245:
            if (r4 == 0) goto L_0x024a
            r9.a((byte[]) r4)     // Catch:{ all -> 0x029d }
        L_0x024a:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x0264
            java.lang.String r0 = "request"
            java.lang.String r2 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r10)     // Catch:{ all -> 0x029d }
            r1.put(r0, r2)     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.k r0 = r11.f6621a     // Catch:{ all -> 0x029d }
            com.applovin.impl.sdk.EventServiceImpl r0 = r0.C()     // Catch:{ all -> 0x029d }
            java.lang.String r2 = "ref"
            r0.trackEvent(r2, r1)     // Catch:{ all -> 0x029d }
        L_0x0264:
            com.applovin.impl.zf r0 = r11.f6623c     // Catch:{ all -> 0x029d }
            com.applovin.impl.b4$c r15 = new com.applovin.impl.b4$c     // Catch:{ all -> 0x029d }
            java.lang.Object r6 = r24.d()     // Catch:{ all -> 0x029d }
            r16 = 0
            r1 = r15
            r2 = r23
            r3 = r10
            r4 = r24
            r5 = r13
            r8 = r25
            r14 = r9
            r9 = r26
            r24 = r10
            r10 = r16
            r1.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x029b }
            com.applovin.impl.zf$c$a r1 = r14.a((androidx.core.util.a) r15)     // Catch:{ all -> 0x029b }
            com.applovin.impl.sdk.k r2 = r11.f6621a     // Catch:{ all -> 0x029b }
            com.applovin.impl.sm r2 = r2.l0()     // Catch:{ all -> 0x029b }
            java.util.concurrent.Executor r2 = r2.c()     // Catch:{ all -> 0x029b }
            com.applovin.impl.zf$c$a r1 = r1.a((java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x029b }
            com.applovin.impl.zf$c r1 = r1.a()     // Catch:{ all -> 0x029b }
            r0.a(r1)     // Catch:{ all -> 0x029b }
            goto L_0x02bb
        L_0x029b:
            r0 = move-exception
            goto L_0x02a0
        L_0x029d:
            r0 = move-exception
            r24 = r10
        L_0x02a0:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1 - r21
            r4 = 0
            r1 = r23
            r2 = r13
            r3 = r24
            r7 = r0
            r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)
            java.lang.String r0 = r0.getMessage()
            r1 = 0
            r2 = r24
            r3 = 0
            r12.a(r2, r1, r0, r3)
        L_0x02bb:
            return
        L_0x02bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No callback specified"
            r0.<init>(r1)
            throw r0
        L_0x02c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No method specified"
            r0.<init>(r1)
            throw r0
        L_0x02cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No endpoint specified"
            r0.<init>(r1)
            throw r0
        L_0x02d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No request specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.a(com.applovin.impl.sdk.network.a, com.applovin.impl.b4$b, com.applovin.impl.b4$e):void");
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (t.a()) {
            t tVar = this.f6622b;
            tVar.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (((float) j10) / 1000.0f) + " s over " + c4.g(this.f6621a) + " to " + a(str2));
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (t.a()) {
            t tVar = this.f6622b;
            tVar.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (((float) j10) / 1000.0f) + " s over " + c4.g(this.f6621a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
