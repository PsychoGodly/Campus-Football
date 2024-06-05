package kc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lc.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlatformChannel */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final lc.k f35838a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public h f35839b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f35840c;

    /* compiled from: PlatformChannel */
    class a implements k.c {
        a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:60|61) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r7.error("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x010a */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x012b A[Catch:{ JSONException -> 0x0259 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0138 A[Catch:{ JSONException -> 0x0259 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(lc.j r6, lc.k.d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                kc.j r1 = kc.j.this
                kc.j$h r1 = r1.f35839b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f36116a
                java.lang.Object r6 = r6.f36117b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                xb.b.f(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0259 }
                switch(r4) {
                    case -1501580720: goto L_0x00c0;
                    case -766342101: goto L_0x00b5;
                    case -720677196: goto L_0x00aa;
                    case -577225884: goto L_0x00a0;
                    case -548468504: goto L_0x0096;
                    case -247230243: goto L_0x008c;
                    case -215273374: goto L_0x0082;
                    case 241845679: goto L_0x0078;
                    case 875995648: goto L_0x006d;
                    case 1128339786: goto L_0x0063;
                    case 1390477857: goto L_0x0057;
                    case 1514180520: goto L_0x004b;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x0259 }
            L_0x0033:
                goto L_0x00ca
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 2
                goto L_0x00ca
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 4
                goto L_0x00ca
            L_0x004b:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 11
                goto L_0x00ca
            L_0x0057:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 8
                goto L_0x00ca
            L_0x0063:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 5
                goto L_0x00ca
            L_0x006d:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 13
                goto L_0x00ca
            L_0x0078:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 7
                goto L_0x00ca
            L_0x0082:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 0
                goto L_0x00ca
            L_0x008c:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 1
                goto L_0x00ca
            L_0x0096:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 3
                goto L_0x00ca
            L_0x00a0:
                java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 6
                goto L_0x00ca
            L_0x00aa:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 12
                goto L_0x00ca
            L_0x00b5:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 10
                goto L_0x00ca
            L_0x00c0:
                java.lang.String r4 = "SystemNavigator.setFrameworkHandlesBack"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0259 }
                if (r1 == 0) goto L_0x00ca
                r2 = 9
            L_0x00ca:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x023d;
                    case 1: goto L_0x0221;
                    case 2: goto L_0x0201;
                    case 3: goto L_0x01e1;
                    case 4: goto L_0x01bf;
                    case 5: goto L_0x019d;
                    case 6: goto L_0x018f;
                    case 7: goto L_0x0181;
                    case 8: goto L_0x015f;
                    case 9: goto L_0x014b;
                    case 10: goto L_0x013d;
                    case 11: goto L_0x0101;
                    case 12: goto L_0x00ed;
                    case 13: goto L_0x00d4;
                    default: goto L_0x00cf;
                }
            L_0x00cf:
                r7.notImplemented()     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x00d4:
                kc.j r6 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r6 = r6.f35839b     // Catch:{ JSONException -> 0x0259 }
                boolean r6 = r6.n()     // Catch:{ JSONException -> 0x0259 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0259 }
                r1.<init>()     // Catch:{ JSONException -> 0x0259 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x0259 }
                r7.success(r1)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x00ed:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0259 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0259 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x0259 }
                r1.g(r6)     // Catch:{ JSONException -> 0x0259 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x0101:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0259 }
                if (r6 == 0) goto L_0x011e
                kc.j$e r6 = kc.j.e.a(r6)     // Catch:{ NoSuchFieldException -> 0x010a }
                goto L_0x011f
            L_0x010a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0259 }
                r2.<init>()     // Catch:{ JSONException -> 0x0259 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x0259 }
                r2.append(r6)     // Catch:{ JSONException -> 0x0259 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
            L_0x011e:
                r6 = r3
            L_0x011f:
                kc.j r2 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r2 = r2.f35839b     // Catch:{ JSONException -> 0x0259 }
                java.lang.CharSequence r6 = r2.l(r6)     // Catch:{ JSONException -> 0x0259 }
                if (r6 == 0) goto L_0x0138
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0259 }
                r2.<init>()     // Catch:{ JSONException -> 0x0259 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x0259 }
                r7.success(r2)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x0138:
                r7.success(r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x013d:
                kc.j r6 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r6 = r6.f35839b     // Catch:{ JSONException -> 0x0259 }
                r6.a()     // Catch:{ JSONException -> 0x0259 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x014b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0259 }
                boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0259 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x0259 }
                r1.e(r6)     // Catch:{ JSONException -> 0x0259 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x015f:
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                kc.j$j r6 = r1.i(r6)     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                r1.d(r6)     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0177, NoSuchFieldException -> 0x0175 }
                goto L_0x0272
            L_0x0175:
                r6 = move-exception
                goto L_0x0178
            L_0x0177:
                r6 = move-exception
            L_0x0178:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x0181:
                kc.j r6 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r6 = r6.f35839b     // Catch:{ JSONException -> 0x0259 }
                r6.k()     // Catch:{ JSONException -> 0x0259 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x018f:
                kc.j r6 = kc.j.this     // Catch:{ JSONException -> 0x0259 }
                kc.j$h r6 = r6.f35839b     // Catch:{ JSONException -> 0x0259 }
                r6.j()     // Catch:{ JSONException -> 0x0259 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x019d:
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                kc.j$k r6 = r1.j(r6)     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                r1.f(r6)     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01b5, NoSuchFieldException -> 0x01b3 }
                goto L_0x0272
            L_0x01b3:
                r6 = move-exception
                goto L_0x01b6
            L_0x01b5:
                r6 = move-exception
            L_0x01b6:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x01bf:
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                java.util.List r6 = r1.k(r6)     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                r1.c(r6)     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01d7, NoSuchFieldException -> 0x01d5 }
                goto L_0x0272
            L_0x01d5:
                r6 = move-exception
                goto L_0x01d8
            L_0x01d7:
                r6 = move-exception
            L_0x01d8:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x01e1:
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x01f7 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01f7 }
                kc.j$c r6 = r1.g(r6)     // Catch:{ JSONException -> 0x01f7 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x01f7 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x01f7 }
                r1.b(r6)     // Catch:{ JSONException -> 0x01f7 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01f7 }
                goto L_0x0272
            L_0x01f7:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x0201:
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                int r6 = r1.h(r6)     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                kc.j r1 = kc.j.this     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                kc.j$h r1 = r1.f35839b     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                r1.m(r6)     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0218, NoSuchFieldException -> 0x0216 }
                goto L_0x0272
            L_0x0216:
                r6 = move-exception
                goto L_0x0219
            L_0x0218:
                r6 = move-exception
            L_0x0219:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x0221:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0234 }
                kc.j$g r6 = kc.j.g.a(r6)     // Catch:{ NoSuchFieldException -> 0x0234 }
                kc.j r1 = kc.j.this     // Catch:{ NoSuchFieldException -> 0x0234 }
                kc.j$h r1 = r1.f35839b     // Catch:{ NoSuchFieldException -> 0x0234 }
                r1.i(r6)     // Catch:{ NoSuchFieldException -> 0x0234 }
                r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x0234 }
                goto L_0x0272
            L_0x0234:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x023d:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0250 }
                kc.j$i r6 = kc.j.i.a(r6)     // Catch:{ NoSuchFieldException -> 0x0250 }
                kc.j r1 = kc.j.this     // Catch:{ NoSuchFieldException -> 0x0250 }
                kc.j$h r1 = r1.f35839b     // Catch:{ NoSuchFieldException -> 0x0250 }
                r1.h(r6)     // Catch:{ NoSuchFieldException -> 0x0250 }
                r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x0250 }
                goto L_0x0272
            L_0x0250:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0259 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0259 }
                goto L_0x0272
            L_0x0259:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.error(r0, r6, r3)
            L_0x0272:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kc.j.a.onMethodCall(lc.j, lc.k$d):void");
        }
    }

    /* compiled from: PlatformChannel */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35842a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f35843b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f35844c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                kc.j$k[] r0 = kc.j.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35844c = r0
                r1 = 1
                kc.j$k r2 = kc.j.k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f35844c     // Catch:{ NoSuchFieldError -> 0x001d }
                kc.j$k r3 = kc.j.k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f35844c     // Catch:{ NoSuchFieldError -> 0x0028 }
                kc.j$k r4 = kc.j.k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f35844c     // Catch:{ NoSuchFieldError -> 0x0033 }
                kc.j$k r5 = kc.j.k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                kc.j$l[] r4 = kc.j.l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f35843b = r4
                kc.j$l r5 = kc.j.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f35843b     // Catch:{ NoSuchFieldError -> 0x004e }
                kc.j$l r5 = kc.j.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                kc.j$f[] r4 = kc.j.f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f35842a = r4
                kc.j$f r5 = kc.j.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f35842a     // Catch:{ NoSuchFieldError -> 0x0069 }
                kc.j$f r4 = kc.j.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f35842a     // Catch:{ NoSuchFieldError -> 0x0073 }
                kc.j$f r1 = kc.j.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f35842a     // Catch:{ NoSuchFieldError -> 0x007d }
                kc.j$f r1 = kc.j.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kc.j.b.<clinit>():void");
        }
    }

    /* compiled from: PlatformChannel */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f35845a;

        /* renamed from: b  reason: collision with root package name */
        public final String f35846b;

        public c(int i10, String str) {
            this.f35845a = i10;
            this.f35846b = str;
        }
    }

    /* compiled from: PlatformChannel */
    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: a  reason: collision with root package name */
        private String f35850a;

        private d(String str) {
            this.f35850a = str;
        }

        static d a(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f35850a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* compiled from: PlatformChannel */
    public enum e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: a  reason: collision with root package name */
        private String f35853a;

        private e(String str) {
            this.f35853a = str;
        }

        static e a(String str) throws NoSuchFieldException {
            for (e eVar : values()) {
                if (eVar.f35853a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* compiled from: PlatformChannel */
    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: a  reason: collision with root package name */
        private String f35859a;

        private f(String str) {
            this.f35859a = str;
        }

        static f a(String str) throws NoSuchFieldException {
            for (f fVar : values()) {
                if (fVar.f35859a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* compiled from: PlatformChannel */
    public enum g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f35866a;

        private g(String str) {
            this.f35866a = str;
        }

        static g a(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                String str2 = gVar.f35866a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* compiled from: PlatformChannel */
    public interface h {
        void a();

        void b(c cVar);

        void c(List<l> list);

        void d(C0408j jVar);

        void e(boolean z10);

        void f(k kVar);

        void g(String str);

        void h(i iVar);

        void i(g gVar);

        void j();

        void k();

        CharSequence l(e eVar);

        void m(int i10);

        boolean n();
    }

    /* compiled from: PlatformChannel */
    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f35870a;

        private i(String str) {
            this.f35870a = str;
        }

        static i a(String str) throws NoSuchFieldException {
            for (i iVar : values()) {
                if (iVar.f35870a.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: kc.j$j  reason: collision with other inner class name */
    /* compiled from: PlatformChannel */
    public static class C0408j {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f35871a;

        /* renamed from: b  reason: collision with root package name */
        public final d f35872b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f35873c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f35874d;

        /* renamed from: e  reason: collision with root package name */
        public final d f35875e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f35876f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f35877g;

        public C0408j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f35871a = num;
            this.f35872b = dVar;
            this.f35873c = bool;
            this.f35874d = num2;
            this.f35875e = dVar2;
            this.f35876f = num3;
            this.f35877g = bool2;
        }
    }

    /* compiled from: PlatformChannel */
    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: a  reason: collision with root package name */
        private String f35883a;

        private k(String str) {
            this.f35883a = str;
        }

        static k a(String str) throws NoSuchFieldException {
            for (k kVar : values()) {
                if (kVar.f35883a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* compiled from: PlatformChannel */
    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: a  reason: collision with root package name */
        private String f35887a;

        private l(String str) {
            this.f35887a = str;
        }

        static l a(String str) throws NoSuchFieldException {
            for (l lVar : values()) {
                if (lVar.f35887a.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public j(zb.a aVar) {
        a aVar2 = new a();
        this.f35840c = aVar2;
        lc.k kVar = new lc.k(aVar, "flutter/platform", lc.g.f36115a);
        this.f35838a = kVar;
        kVar.e(aVar2);
    }

    /* access modifiers changed from: private */
    public c g(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("primaryColor");
        if (i10 != 0) {
            i10 |= -16777216;
        }
        return new c(i10, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(org.json.JSONArray r10) throws org.json.JSONException, java.lang.NoSuchFieldException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            kc.j$f r4 = kc.j.f.a(r4)
            int[] r8 = kc.j.b.f35842a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.j.h(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    public C0408j i(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        d a10 = !jSONObject.isNull("statusBarIconBrightness") ? d.a(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        d a11 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new C0408j(valueOf, a10, valueOf2, valueOf3, a11, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    public k j(String str) throws JSONException, NoSuchFieldException {
        int i10 = b.f35844c[k.a(str).ordinal()];
        if (i10 == 1) {
            return k.LEAN_BACK;
        }
        if (i10 == 2) {
            return k.IMMERSIVE;
        }
        if (i10 == 3) {
            return k.IMMERSIVE_STICKY;
        }
        if (i10 != 4) {
            return k.EDGE_TO_EDGE;
        }
        return k.EDGE_TO_EDGE;
    }

    /* access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = b.f35843b[l.a(jSONArray.getString(i10)).ordinal()];
            if (i11 == 1) {
                arrayList.add(l.TOP_OVERLAYS);
            } else if (i11 == 2) {
                arrayList.add(l.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f35839b = hVar;
    }

    public void m(boolean z10) {
        xb.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f35838a.c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z10)}));
    }
}
