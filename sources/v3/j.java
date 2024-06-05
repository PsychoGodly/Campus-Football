package v3;

import a3.l;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import j4.j0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.l0;
import k4.n0;
import n2.i;
import n2.y2;
import r2.m;
import s6.b0;
import v3.g;
import v3.h;

/* compiled from: HlsPlaylistParser */
public final class j implements j0.a<i> {
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = c("AUTOSELECT");
    private static final Pattern U = c("DEFAULT");
    private static final Pattern V = c("FORCED");
    private static final Pattern W = c("INDEPENDENT");
    private static final Pattern X = c("GAP");
    private static final Pattern Y = c("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    private static final Pattern f23280a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    private static final Pattern f23281b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f23282c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f23283d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f23284e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f23285f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f23286g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f23287h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f23288i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f23289j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f23290k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f23291l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f23292m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f23293n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f23294o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f23295p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f23296q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f23297r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f23298s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f23299t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f23300u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f23301v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    private static final Pattern f23302w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x  reason: collision with root package name */
    private static final Pattern f23303x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f23304y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f23305z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: a  reason: collision with root package name */
    private final h f23306a;

    /* renamed from: b  reason: collision with root package name */
    private final g f23307b;

    /* compiled from: HlsPlaylistParser */
    public static final class a extends IOException {
    }

    /* compiled from: HlsPlaylistParser */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedReader f23308a;

        /* renamed from: b  reason: collision with root package name */
        private final Queue<String> f23309b;

        /* renamed from: c  reason: collision with root package name */
        private String f23310c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f23309b = queue;
            this.f23308a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.f23310c != null) {
                return true;
            }
            if (!this.f23309b.isEmpty()) {
                this.f23310c = (String) k4.a.e(this.f23309b.poll());
                return true;
            }
            do {
                String readLine = this.f23308a.readLine();
                this.f23310c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f23310c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.f23310c;
                this.f23310c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public j() {
        this(h.f23256n, (g) null);
    }

    private static long A(String str, Pattern pattern) throws y2 {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
    }

    private static String B(String str, Map<String, String> map) {
        Matcher matcher = f23281b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !n0.v0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (C2 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return n0.v0(C(bufferedReader, false, C2));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(" + "NO" + "|" + "YES" + ")");
    }

    private static m d(String str, m.b[] bVarArr) {
        m.b[] bVarArr2 = new m.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b((byte[]) null);
        }
        return new m(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static h.b f(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f23274d)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b g(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f23275e)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b h(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f23273c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) throws y2 {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static m.b k(String str, String str2, Map<String, String> map) throws y2 {
        String u10 = u(str, J, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z10 = z(str, K, map);
            return new m.b(i.f20439d, "video/mp4", Base64.decode(z10.substring(z10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new m.b(i.f20439d, "hls", n0.m0(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(u10)) {
                return null;
            }
            String z11 = z(str, K, map);
            byte[] decode = Base64.decode(z11.substring(z11.indexOf(44)), 0);
            UUID uuid = i.f20440e;
            return new m.b(uuid, "video/mp4", l.a(uuid, decode));
        }
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) throws y2 {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) throws y2 {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r13v60 */
    private static g o(h hVar, g gVar, b bVar, String str) throws IOException {
        boolean z10;
        ArrayList arrayList;
        String str2;
        g.b bVar2;
        ArrayList arrayList2;
        int i10;
        HashMap hashMap;
        String str3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j10;
        ArrayList arrayList5;
        long j11;
        HashMap hashMap2;
        long j12;
        m mVar;
        long j13;
        long j14;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        h hVar2 = hVar;
        g gVar2 = gVar;
        boolean z11 = hVar2.f23279c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        g.f fVar = new g.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str9 = MaxReward.DEFAULT_LABEL;
        ? r13 = 0;
        boolean z12 = z11;
        g.f fVar2 = fVar;
        String str10 = str9;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        int i11 = 0;
        long j23 = -9223372036854775807L;
        boolean z13 = false;
        boolean z14 = false;
        int i12 = 0;
        int i13 = 1;
        long j24 = -9223372036854775807L;
        long j25 = -9223372036854775807L;
        boolean z15 = false;
        m mVar2 = null;
        m mVar3 = null;
        boolean z16 = false;
        String str11 = null;
        long j26 = -1;
        String str12 = null;
        String str13 = null;
        int i14 = 0;
        boolean z17 = false;
        g.d dVar = null;
        ArrayList arrayList10 = arrayList7;
        g.b bVar3 = null;
        while (bVar.a()) {
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList9.add(b10);
            }
            if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z18 = z(b10, f23296q, hashMap3);
                if ("VOD".equals(z18)) {
                    i11 = 1;
                    z10 = r13;
                } else if ("EVENT".equals(z18)) {
                    i11 = 2;
                    z10 = r13;
                } else {
                    z10 = r13;
                }
            } else if (b10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z17 = true;
                z10 = r13;
            } else {
                if (b10.startsWith("#EXT-X-START")) {
                    arrayList = arrayList6;
                    z13 = q(b10, Y, r13);
                    j23 = (long) (j(b10, C) * 1000000.0d);
                } else {
                    arrayList = arrayList6;
                    if (b10.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar2 = y(b10);
                    } else if (b10.startsWith("#EXT-X-PART-INF")) {
                        j25 = (long) (j(b10, f23294o) * 1000000.0d);
                    } else if (b10.startsWith("#EXT-X-MAP")) {
                        String z19 = z(b10, K, hashMap3);
                        String v10 = v(b10, E, hashMap3);
                        if (v10 != null) {
                            String[] R0 = n0.R0(v10, "@");
                            j26 = Long.parseLong(R0[r13]);
                            if (R0.length > 1) {
                                j17 = Long.parseLong(R0[1]);
                            }
                        }
                        int i15 = (j26 > -1 ? 1 : (j26 == -1 ? 0 : -1));
                        if (i15 == 0) {
                            j17 = 0;
                        }
                        String str14 = str11;
                        String str15 = str12;
                        if (str14 == null || str15 != null) {
                            dVar = new g.d(z19, j17, j26, str14, str15);
                            if (i15 != 0) {
                                j17 += j26;
                            }
                            str12 = str15;
                            str11 = str14;
                            arrayList6 = arrayList;
                            j26 = -1;
                            z10 = r13;
                        } else {
                            throw y2.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", (Throwable) null);
                        }
                    } else {
                        String str16 = str11;
                        String str17 = str12;
                        if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                            j24 = 1000000 * ((long) m(b10, f23292m));
                        } else if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j20 = n(b10, f23303x);
                            str12 = str17;
                            str11 = str16;
                            j16 = j20;
                            arrayList6 = arrayList;
                            z10 = false;
                        } else if (b10.startsWith("#EXT-X-VERSION")) {
                            i13 = m(b10, f23295p);
                        } else {
                            if (b10.startsWith("#EXT-X-DEFINE")) {
                                String v11 = v(b10, f23280a0, hashMap3);
                                if (v11 != null) {
                                    String str18 = hVar2.f23265l.get(v11);
                                    if (str18 != null) {
                                        hashMap3.put(v11, str18);
                                    }
                                } else {
                                    hashMap3.put(z(b10, P, hashMap3), z(b10, Z, hashMap3));
                                }
                                i10 = i11;
                                hashMap = hashMap3;
                                arrayList4 = arrayList8;
                                str2 = str9;
                                str3 = str13;
                                j10 = j20;
                                bVar2 = bVar3;
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList;
                            } else if (b10.startsWith("#EXTINF")) {
                                j21 = A(b10, f23304y);
                                str10 = u(b10, f23305z, str9, hashMap3);
                            } else if (b10.startsWith("#EXT-X-SKIP")) {
                                int m10 = m(b10, f23299t);
                                k4.a.f(gVar2 != null && arrayList.isEmpty());
                                int i16 = (int) (j16 - ((g) n0.j(gVar)).f23221k);
                                int i17 = m10 + i16;
                                if (i16 < 0 || i17 > gVar2.f23228r.size()) {
                                    throw new a();
                                }
                                String str19 = str9;
                                str12 = str17;
                                long j27 = j19;
                                while (i16 < i17) {
                                    g.d dVar2 = gVar2.f23228r.get(i16);
                                    int i18 = i17;
                                    String str20 = str19;
                                    if (j16 != gVar2.f23221k) {
                                        dVar2 = dVar2.c(j27, (gVar2.f23220j - i12) + dVar2.f23243d);
                                    }
                                    ArrayList arrayList11 = arrayList;
                                    arrayList11.add(dVar2);
                                    long j28 = j27 + dVar2.f23242c;
                                    long j29 = dVar2.f23249k;
                                    long j30 = j28;
                                    if (j29 != -1) {
                                        j17 = dVar2.f23248j + j29;
                                    }
                                    int i19 = dVar2.f23243d;
                                    g.d dVar3 = dVar2.f23241b;
                                    m mVar4 = dVar2.f23245g;
                                    String str21 = dVar2.f23246h;
                                    String str22 = dVar2.f23247i;
                                    int i20 = i19;
                                    if (str22 == null || !str22.equals(Long.toHexString(j20))) {
                                        str12 = dVar2.f23247i;
                                    }
                                    j20++;
                                    i16++;
                                    h hVar3 = hVar;
                                    dVar = dVar3;
                                    str16 = str21;
                                    arrayList = arrayList11;
                                    i14 = i20;
                                    i17 = i18;
                                    j18 = j30;
                                    str19 = str20;
                                    gVar2 = gVar;
                                    mVar3 = mVar4;
                                    j27 = j18;
                                }
                                hVar2 = hVar;
                                gVar2 = gVar;
                                j19 = j27;
                                str9 = str19;
                                str11 = str16;
                                arrayList6 = arrayList;
                                z10 = false;
                            } else {
                                str2 = str9;
                                ArrayList arrayList12 = arrayList;
                                if (b10.startsWith("#EXT-X-KEY")) {
                                    String z20 = z(b10, H, hashMap3);
                                    String u10 = u(b10, I, "identity", hashMap3);
                                    if ("NONE".equals(z20)) {
                                        treeMap.clear();
                                        str7 = null;
                                        mVar3 = null;
                                        str8 = null;
                                    } else {
                                        String v12 = v(b10, L, hashMap3);
                                        if (!"identity".equals(u10)) {
                                            String str23 = str13;
                                            str13 = str23 == null ? l(z20) : str23;
                                            m.b k10 = k(b10, u10, hashMap3);
                                            if (k10 != null) {
                                                treeMap.put(u10, k10);
                                                str8 = v12;
                                                str7 = null;
                                                mVar3 = null;
                                            }
                                        } else if ("AES-128".equals(z20)) {
                                            str7 = z(b10, K, hashMap3);
                                            str8 = v12;
                                        }
                                        str8 = v12;
                                        str7 = null;
                                    }
                                    gVar2 = gVar;
                                    str11 = str7;
                                    arrayList6 = arrayList12;
                                    str9 = str2;
                                    z10 = false;
                                    hVar2 = hVar;
                                } else {
                                    str3 = str13;
                                    if (b10.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] R02 = n0.R0(z(b10, D, hashMap3), "@");
                                        j26 = Long.parseLong(R02[0]);
                                        if (R02.length > 1) {
                                            j17 = Long.parseLong(R02[1]);
                                        }
                                    } else {
                                        if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i12 = Integer.parseInt(b10.substring(b10.indexOf(58) + 1));
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str4 = str3;
                                            str5 = str17;
                                            str6 = str16;
                                            str9 = str2;
                                            z14 = true;
                                        } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                                            i14++;
                                        } else {
                                            if (b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j15 == 0) {
                                                    j15 = n0.C0(n0.J0(b10.substring(b10.indexOf(58) + 1))) - j19;
                                                } else {
                                                    i10 = i11;
                                                    hashMap = hashMap3;
                                                    arrayList4 = arrayList8;
                                                    arrayList2 = arrayList9;
                                                    arrayList3 = arrayList12;
                                                    j10 = j20;
                                                }
                                            } else if (b10.equals("#EXT-X-GAP")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str4 = str3;
                                                str5 = str17;
                                                str6 = str16;
                                                str9 = str2;
                                                z16 = true;
                                            } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str4 = str3;
                                                str5 = str17;
                                                str6 = str16;
                                                str9 = str2;
                                                z12 = true;
                                            } else if (b10.equals("#EXT-X-ENDLIST")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str4 = str3;
                                                str5 = str17;
                                                str6 = str16;
                                                str9 = str2;
                                                z15 = true;
                                            } else {
                                                if (b10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    i10 = i11;
                                                    arrayList5 = arrayList12;
                                                    arrayList8.add(new g.c(Uri.parse(l0.d(str, z(b10, K, hashMap3))), t(b10, A, -1), s(b10, B, -1)));
                                                } else {
                                                    i10 = i11;
                                                    arrayList5 = arrayList12;
                                                    String str24 = str;
                                                    if (!b10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        j10 = j20;
                                                        if (b10.startsWith("#EXT-X-PART")) {
                                                            String e10 = e(j10, str16, str17);
                                                            String z21 = z(b10, K, hashMap3);
                                                            g.b bVar4 = bVar3;
                                                            ArrayList arrayList13 = arrayList8;
                                                            long j31 = (long) (j(b10, f23293n) * 1000000.0d);
                                                            ArrayList arrayList14 = arrayList9;
                                                            g.b bVar5 = bVar4;
                                                            boolean q10 = q(b10, W, false) | (z12 && arrayList10.isEmpty());
                                                            boolean q11 = q(b10, X, false);
                                                            String v13 = v(b10, E, hashMap3);
                                                            if (v13 != null) {
                                                                String[] R03 = n0.R0(v13, "@");
                                                                j13 = Long.parseLong(R03[0]);
                                                                if (R03.length > 1) {
                                                                    j22 = Long.parseLong(R03[1]);
                                                                }
                                                            } else {
                                                                j13 = -1;
                                                            }
                                                            int i21 = (j13 > -1 ? 1 : (j13 == -1 ? 0 : -1));
                                                            if (i21 == 0) {
                                                                j22 = 0;
                                                            }
                                                            if (mVar3 == null && !treeMap.isEmpty()) {
                                                                m.b[] bVarArr = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                                m mVar5 = new m(str3, bVarArr);
                                                                if (mVar2 == null) {
                                                                    mVar2 = d(str3, bVarArr);
                                                                }
                                                                mVar3 = mVar5;
                                                            }
                                                            arrayList10.add(new g.b(z21, dVar, j31, i14, j18, mVar3, str16, e10, j22, j13, q11, q10, false));
                                                            j18 += j31;
                                                            if (i21 != 0) {
                                                                j22 += j13;
                                                            }
                                                            arrayList8 = arrayList13;
                                                            str11 = str16;
                                                            i11 = i10;
                                                            arrayList9 = arrayList14;
                                                            bVar3 = bVar5;
                                                            arrayList6 = arrayList5;
                                                            z10 = false;
                                                            j20 = j10;
                                                            str13 = str3;
                                                            str12 = str17;
                                                            str9 = str2;
                                                            hVar2 = hVar;
                                                            gVar2 = gVar;
                                                        } else {
                                                            bVar2 = bVar3;
                                                            arrayList4 = arrayList8;
                                                            arrayList2 = arrayList9;
                                                            if (!b10.startsWith("#")) {
                                                                String e11 = e(j10, str16, str17);
                                                                long j32 = j10 + 1;
                                                                String B2 = B(b10, hashMap3);
                                                                g.d dVar4 = (g.d) hashMap4.get(B2);
                                                                int i22 = (j26 > -1 ? 1 : (j26 == -1 ? 0 : -1));
                                                                if (i22 == 0) {
                                                                    j11 = 0;
                                                                } else {
                                                                    if (z17 && dVar == null && dVar4 == null) {
                                                                        dVar4 = new g.d(B2, 0, j17, (String) null, (String) null);
                                                                        hashMap4.put(B2, dVar4);
                                                                    }
                                                                    j11 = j17;
                                                                }
                                                                if (mVar3 != null || treeMap.isEmpty()) {
                                                                    j12 = j32;
                                                                    hashMap2 = hashMap3;
                                                                    mVar = mVar3;
                                                                } else {
                                                                    j12 = j32;
                                                                    hashMap2 = hashMap3;
                                                                    m.b[] bVarArr2 = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                                    mVar = new m(str3, bVarArr2);
                                                                    if (mVar2 == null) {
                                                                        mVar2 = d(str3, bVarArr2);
                                                                    }
                                                                }
                                                                g.d dVar5 = dVar != null ? dVar : dVar4;
                                                                ArrayList arrayList15 = arrayList5;
                                                                arrayList15.add(new g.d(B2, dVar5, str10, j21, i14, j19, mVar, str16, e11, j11, j26, z16, arrayList10));
                                                                j18 = j19 + j21;
                                                                arrayList10 = new ArrayList();
                                                                if (i22 != 0) {
                                                                    j11 += j26;
                                                                }
                                                                j17 = j11;
                                                                hVar2 = hVar;
                                                                gVar2 = gVar;
                                                                arrayList8 = arrayList4;
                                                                mVar3 = mVar;
                                                                str11 = str16;
                                                                j21 = 0;
                                                                j19 = j18;
                                                                hashMap3 = hashMap2;
                                                                i11 = i10;
                                                                bVar3 = bVar2;
                                                                str10 = str2;
                                                                z10 = false;
                                                                z16 = false;
                                                                j26 = -1;
                                                                arrayList6 = arrayList15;
                                                                str12 = str17;
                                                                j20 = j12;
                                                                arrayList9 = arrayList2;
                                                                str13 = str3;
                                                                str9 = str10;
                                                            } else {
                                                                hashMap = hashMap3;
                                                                arrayList3 = arrayList5;
                                                            }
                                                        }
                                                    } else if (bVar3 == null && "PART".equals(z(b10, N, hashMap3))) {
                                                        String z22 = z(b10, K, hashMap3);
                                                        long t10 = t(b10, F, -1);
                                                        long t11 = t(b10, G, -1);
                                                        long j33 = j20;
                                                        String e12 = e(j33, str16, str17);
                                                        if (mVar3 != null || treeMap.isEmpty()) {
                                                            j14 = j33;
                                                        } else {
                                                            j14 = j33;
                                                            m.b[] bVarArr3 = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                            m mVar6 = new m(str3, bVarArr3);
                                                            if (mVar2 == null) {
                                                                mVar2 = d(str3, bVarArr3);
                                                            }
                                                            mVar3 = mVar6;
                                                        }
                                                        int i23 = (t10 > -1 ? 1 : (t10 == -1 ? 0 : -1));
                                                        if (i23 == 0 || t11 != -1) {
                                                            bVar3 = new g.b(z22, dVar, 0, i14, j18, mVar3, str16, e12, i23 != 0 ? t10 : 0, t11, false, false, true);
                                                        }
                                                        hVar2 = hVar;
                                                        gVar2 = gVar;
                                                        str13 = str3;
                                                        str11 = str16;
                                                        j20 = j14;
                                                        i11 = i10;
                                                        arrayList6 = arrayList5;
                                                        str9 = str2;
                                                        z10 = false;
                                                        str12 = str17;
                                                    }
                                                }
                                                hashMap = hashMap3;
                                                arrayList4 = arrayList8;
                                                arrayList2 = arrayList9;
                                                j10 = j20;
                                                arrayList3 = arrayList5;
                                            }
                                            bVar2 = bVar3;
                                        }
                                        arrayList6 = arrayList12;
                                        z10 = false;
                                    }
                                    hVar2 = hVar;
                                    gVar2 = gVar;
                                    str4 = str3;
                                    str5 = str17;
                                    str6 = str16;
                                    str9 = str2;
                                    arrayList6 = arrayList12;
                                    z10 = false;
                                }
                            }
                            arrayList8 = arrayList4;
                            str11 = str16;
                            hashMap3 = hashMap;
                            i11 = i10;
                            bVar3 = bVar2;
                            z10 = false;
                            j20 = j10;
                            arrayList6 = arrayList3;
                            str12 = str17;
                            arrayList9 = arrayList2;
                            hVar2 = hVar;
                            gVar2 = gVar;
                            str13 = str3;
                            str9 = str2;
                        }
                        str12 = str17;
                        str11 = str16;
                        arrayList6 = arrayList;
                        z10 = false;
                    }
                }
                arrayList6 = arrayList;
                z10 = r13;
            }
            r13 = z10;
        }
        int i24 = i11;
        g.b bVar6 = bVar3;
        ArrayList arrayList16 = arrayList8;
        ArrayList arrayList17 = arrayList9;
        ArrayList arrayList18 = arrayList6;
        HashMap hashMap5 = new HashMap();
        for (int i25 = 0; i25 < arrayList16.size(); i25++) {
            g.c cVar = (g.c) arrayList16.get(i25);
            long j34 = cVar.f23236b;
            if (j34 == -1) {
                j34 = (j16 + ((long) arrayList18.size())) - (arrayList10.isEmpty() ? 1 : 0);
            }
            int i26 = cVar.f23237c;
            if (i26 == -1 && j25 != -9223372036854775807L) {
                i26 = (arrayList10.isEmpty() ? ((g.d) b0.d(arrayList18)).f23239n : arrayList10).size() - 1;
            }
            Uri uri = cVar.f23235a;
            hashMap5.put(uri, new g.c(uri, j34, i26));
        }
        if (bVar6 != null) {
            arrayList10.add(bVar6);
        }
        return new g(i24, str, arrayList17, j23, z13, j15, z14, i12, j16, i13, j24, j25, z12, z15, j15 != 0, mVar2, arrayList18, arrayList10, fVar2, hashMap5);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0460, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04a8, code lost:
        r0 = r0 + 1;
        r31 = r6;
        r32 = r9;
        r33 = r14;
        r15 = r20;
        r9 = r21;
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static v3.h p(v3.j.b r36, java.lang.String r37) throws java.io.IOException {
        /*
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
            r13 = 0
        L_0x0036:
            boolean r14 = r36.a()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x021f
            java.lang.String r14 = r36.b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r14.startsWith(r9)
            if (r9 == 0) goto L_0x004d
            r8.add(r14)
        L_0x004d:
            java.lang.String r9 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r9 = r14.startsWith(r9)
            r19 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x006d
            java.util.regex.Pattern r9 = P
            java.lang.String r9 = z(r14, r9, r11)
            java.util.regex.Pattern r10 = Z
            java.lang.String r10 = z(r14, r10, r11)
            r11.put(r9, r10)
            goto L_0x00ce
        L_0x006d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0087
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L_0x0204
        L_0x0087:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x0093
            r3.add(r14)
            goto L_0x00ce
        L_0x0093:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.util.regex.Pattern r9 = I
            java.lang.String r10 = "identity"
            java.lang.String r9 = u(r14, r9, r10, r11)
            r2.m$b r9 = k(r14, r9, r11)
            if (r9 == 0) goto L_0x00ce
            java.util.regex.Pattern r10 = H
            java.lang.String r10 = z(r14, r10, r11)
            java.lang.String r10 = l(r10)
            r2.m r14 = new r2.m
            r15 = 1
            r2.m$b[] r15 = new r2.m.b[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>((java.lang.String) r10, (r2.m.b[]) r15)
            r12.add(r14)
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L_0x0204
        L_0x00e1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            if (r9 == 0) goto L_0x00ef
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
            goto L_0x00f2
        L_0x00ef:
            r20 = r13
            r10 = 0
        L_0x00f2:
            java.util.regex.Pattern r13 = f23287h
            int r13 = m(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = f23282c
            r29 = r7
            r7 = -1
            int r12 = s(r14, r12, r7)
            java.util.regex.Pattern r7 = f23289j
            java.lang.String r7 = v(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = f23290k
            java.lang.String r8 = v(r14, r8, r11)
            if (r8 == 0) goto L_0x0139
            r31 = r6
            java.lang.String r6 = "x"
            java.lang.String[] r6 = k4.n0.R0(r8, r6)
            r8 = 0
            r21 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L_0x0132
            if (r6 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r17 = r8
            goto L_0x0135
        L_0x0132:
            r6 = -1
            r17 = -1
        L_0x0135:
            r8 = r6
            r6 = r17
            goto L_0x013d
        L_0x0139:
            r31 = r6
            r6 = -1
            r8 = -1
        L_0x013d:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = r5
            java.util.regex.Pattern r5 = f23291l
            java.lang.String r5 = v(r14, r5, r11)
            if (r5 == 0) goto L_0x0152
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L_0x0156
        L_0x0152:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0156:
            java.util.regex.Pattern r4 = f23283d
            java.lang.String r4 = v(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = f23284e
            java.lang.String r3 = v(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = f23285f
            java.lang.String r0 = v(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = f23286g
            java.lang.String r0 = v(r14, r0, r11)
            if (r9 == 0) goto L_0x0181
            java.util.regex.Pattern r9 = K
            java.lang.String r9 = z(r14, r9, r11)
            android.net.Uri r9 = k4.l0.e(r1, r9)
            goto L_0x0193
        L_0x0181:
            boolean r9 = r36.a()
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = r36.b()
            java.lang.String r9 = B(r9, r11)
            android.net.Uri r9 = k4.l0.e(r1, r9)
        L_0x0193:
            n2.r1$b r14 = new n2.r1$b
            r14.<init>()
            int r1 = r2.size()
            n2.r1$b r1 = r14.T(r1)
            n2.r1$b r1 = r1.M(r15)
            n2.r1$b r1 = r1.K(r7)
            n2.r1$b r1 = r1.I(r12)
            n2.r1$b r1 = r1.b0(r13)
            n2.r1$b r1 = r1.n0(r6)
            n2.r1$b r1 = r1.S(r8)
            n2.r1$b r1 = r1.R(r5)
            n2.r1$b r1 = r1.e0(r10)
            n2.r1 r23 = r1.G()
            v3.h$b r1 = new v3.h$b
            r21 = r1
            r22 = r9
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r5 = r1.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x01ea
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r9, r5)
        L_0x01ea:
            u3.q$b r6 = new u3.q$b
            r21 = r6
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r6)
            r10 = r19
            r13 = r20
        L_0x0204:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r1 = r37
            goto L_0x0036
        L_0x0217:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            n2.y2 r0 = n2.y2.c(r0, r1)
            throw r0
        L_0x021f:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x023b:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x0294
            java.lang.Object r5 = r2.get(r4)
            v3.h$b r5 = (v3.h.b) r5
            android.net.Uri r6 = r5.f23271a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x0290
            n2.r1 r6 = r5.f23272b
            f3.a r6 = r6.f20652k
            if (r6 != 0) goto L_0x0257
            r6 = 1
            goto L_0x0258
        L_0x0257:
            r6 = 0
        L_0x0258:
            k4.a.f(r6)
            u3.q r6 = new u3.q
            android.net.Uri r7 = r5.f23271a
            java.lang.Object r7 = r1.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = k4.a.e(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r6.<init>(r8, r8, r7)
            f3.a r7 = new f3.a
            r9 = 1
            f3.a$b[] r10 = new f3.a.b[r9]
            r9 = 0
            r10[r9] = r6
            r7.<init>((f3.a.b[]) r10)
            n2.r1 r6 = r5.f23272b
            n2.r1$b r6 = r6.b()
            n2.r1$b r6 = r6.Z(r7)
            n2.r1 r6 = r6.G()
            v3.h$b r5 = r5.a(r6)
            r3.add(r5)
            goto L_0x0291
        L_0x0290:
            r8 = 0
        L_0x0291:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0294:
            r8 = 0
            r1 = r8
            r9 = r1
            r0 = 0
        L_0x0298:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x04b7
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r6 = Q
            java.lang.String r6 = z(r5, r6, r11)
            java.util.regex.Pattern r7 = P
            java.lang.String r7 = z(r5, r7, r11)
            n2.r1$b r10 = new n2.r1$b
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r14 = ":"
            r12.append(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            n2.r1$b r10 = r10.U(r12)
            n2.r1$b r10 = r10.W(r7)
            n2.r1$b r10 = r10.M(r15)
            int r12 = x(r5)
            n2.r1$b r10 = r10.i0(r12)
            int r12 = w(r5, r11)
            n2.r1$b r10 = r10.e0(r12)
            java.util.regex.Pattern r12 = O
            java.lang.String r12 = v(r5, r12, r11)
            n2.r1$b r10 = r10.X(r12)
            java.util.regex.Pattern r12 = K
            java.lang.String r12 = v(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L_0x02fd
            r12 = r8
            goto L_0x0301
        L_0x02fd:
            android.net.Uri r12 = k4.l0.e(r14, r12)
        L_0x0301:
            f3.a r8 = new f3.a
            r34 = r4
            r4 = 1
            f3.a$b[] r14 = new f3.a.b[r4]
            u3.q r4 = new u3.q
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r6, r7, r15)
            r15 = 0
            r14[r15] = r4
            r8.<init>((f3.a.b[]) r14)
            java.util.regex.Pattern r4 = M
            java.lang.String r4 = z(r5, r4, r11)
            r4.hashCode()
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x034d;
                case -333210994: goto L_0x0342;
                case 62628790: goto L_0x0337;
                case 81665115: goto L_0x032c;
                default: goto L_0x032a;
            }
        L_0x032a:
            r4 = -1
            goto L_0x0357
        L_0x032c:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0335
            goto L_0x032a
        L_0x0335:
            r4 = 3
            goto L_0x0357
        L_0x0337:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0340
            goto L_0x032a
        L_0x0340:
            r4 = 2
            goto L_0x0357
        L_0x0342:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x034b
            goto L_0x032a
        L_0x034b:
            r4 = 1
            goto L_0x0357
        L_0x034d:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0356
            goto L_0x032a
        L_0x0356:
            r4 = 0
        L_0x0357:
            switch(r4) {
                case 0: goto L_0x0463;
                case 1: goto L_0x041f;
                case 2: goto L_0x03ac;
                case 3: goto L_0x0366;
                default: goto L_0x035a;
            }
        L_0x035a:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
        L_0x0362:
            r16 = 0
            goto L_0x04a8
        L_0x0366:
            v3.h$b r4 = h(r2, r6)
            if (r4 == 0) goto L_0x0391
            n2.r1 r4 = r4.f23272b
            java.lang.String r5 = r4.f20651j
            java.lang.String r5 = k4.n0.L(r5, r15)
            n2.r1$b r14 = r10.K(r5)
            java.lang.String r5 = k4.v.g(r5)
            n2.r1$b r5 = r14.g0(r5)
            int r14 = r4.f20659r
            n2.r1$b r5 = r5.n0(r14)
            int r14 = r4.f20660s
            n2.r1$b r5 = r5.S(r14)
            float r4 = r4.f20661t
            r5.R(r4)
        L_0x0391:
            if (r12 != 0) goto L_0x0394
            goto L_0x035a
        L_0x0394:
            r10.Z(r8)
            v3.h$a r4 = new v3.h$a
            n2.r1 r5 = r10.G()
            r4.<init>(r12, r5, r6, r7)
            r14 = r33
            r14.add(r4)
            r21 = r9
            r6 = r31
            r9 = r32
            goto L_0x0362
        L_0x03ac:
            r14 = r33
            v3.h$b r4 = f(r2, r6)
            if (r4 == 0) goto L_0x03c7
            n2.r1 r15 = r4.f23272b
            java.lang.String r15 = r15.f20651j
            r21 = r9
            r9 = 1
            java.lang.String r15 = k4.n0.L(r15, r9)
            r10.K(r15)
            java.lang.String r15 = k4.v.g(r15)
            goto L_0x03ca
        L_0x03c7:
            r21 = r9
            r15 = 0
        L_0x03ca:
            java.util.regex.Pattern r9 = f23288i
            java.lang.String r5 = v(r5, r9, r11)
            if (r5 == 0) goto L_0x03fb
            java.lang.String r9 = "/"
            java.lang.String[] r9 = k4.n0.S0(r5, r9)
            r16 = 0
            r9 = r9[r16]
            int r9 = java.lang.Integer.parseInt(r9)
            r10.J(r9)
            java.lang.String r9 = "audio/eac3"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x03fd
            java.lang.String r9 = "/JOC"
            boolean r5 = r5.endsWith(r9)
            if (r5 == 0) goto L_0x03fd
            java.lang.String r5 = "ec+3"
            r10.K(r5)
            java.lang.String r15 = "audio/eac3-joc"
            goto L_0x03fd
        L_0x03fb:
            r16 = 0
        L_0x03fd:
            r10.g0(r15)
            if (r12 == 0) goto L_0x0414
            r10.Z(r8)
            v3.h$a r4 = new v3.h$a
            n2.r1 r5 = r10.G()
            r4.<init>(r12, r5, r6, r7)
            r9 = r32
            r9.add(r4)
            goto L_0x0460
        L_0x0414:
            r9 = r32
            if (r4 == 0) goto L_0x0460
            n2.r1 r4 = r10.G()
            r21 = r4
            goto L_0x0460
        L_0x041f:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = S
            java.lang.String r4 = z(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0440
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x044b
        L_0x0440:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x044b:
            if (r1 != 0) goto L_0x0452
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0452:
            n2.r1$b r5 = r10.g0(r5)
            r5.H(r4)
            n2.r1 r4 = r10.G()
            r1.add(r4)
        L_0x0460:
            r6 = r31
            goto L_0x04a8
        L_0x0463:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            v3.h$b r4 = g(r2, r6)
            if (r4 == 0) goto L_0x0482
            n2.r1 r4 = r4.f23272b
            java.lang.String r4 = r4.f20651j
            r5 = 3
            java.lang.String r4 = k4.n0.L(r4, r5)
            r10.K(r4)
            java.lang.String r4 = k4.v.g(r4)
            goto L_0x0483
        L_0x0482:
            r4 = 0
        L_0x0483:
            if (r4 != 0) goto L_0x0487
            java.lang.String r4 = "text/vtt"
        L_0x0487:
            n2.r1$b r4 = r10.g0(r4)
            r4.Z(r8)
            if (r12 == 0) goto L_0x049f
            v3.h$a r4 = new v3.h$a
            n2.r1 r5 = r10.G()
            r4.<init>(r12, r5, r6, r7)
            r6 = r31
            r6.add(r4)
            goto L_0x04a8
        L_0x049f:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            k4.r.i(r4, r5)
        L_0x04a8:
            int r0 = r0 + 1
            r31 = r6
            r32 = r9
            r33 = r14
            r15 = r20
            r9 = r21
            r8 = 0
            goto L_0x0298
        L_0x04b7:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
            if (r13 == 0) goto L_0x04c7
            java.util.List r0 = java.util.Collections.emptyList()
            r10 = r0
            goto L_0x04c8
        L_0x04c7:
            r10 = r1
        L_0x04c8:
            v3.h r13 = new v3.h
            r0 = r13
            r1 = r37
            r2 = r30
            r4 = r14
            r5 = r9
            r7 = r29
            r8 = r21
            r9 = r10
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.j.p(v3.j$b, java.lang.String):v3.h");
    }

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) k4.a.e(matcher.group(1))) : d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) k4.a.e(matcher.group(1))) : i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) k4.a.e(matcher.group(1))) : j10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String u(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x0016
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = k4.a.e(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = B(r2, r3)
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.j.u(java.lang.String, java.util.regex.Pattern, java.lang.String, java.util.Map):java.lang.String");
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, (String) null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v10 = v(str, R, map);
        int i10 = 0;
        if (TextUtils.isEmpty(v10)) {
            return 0;
        }
        String[] R0 = n0.R0(v10, ",");
        if (n0.s(R0, "public.accessibility.describes-video")) {
            i10 = 512;
        }
        if (n0.s(R0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (n0.s(R0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return n0.s(R0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    private static int x(String str) {
        boolean q10 = q(str, U, false);
        if (q(str, V, false)) {
            q10 |= true;
        }
        return q(str, T, false) ? q10 | true ? 1 : 0 : q10 ? 1 : 0;
    }

    private static g.f y(String str) {
        String str2 = str;
        double r10 = r(str2, f23297r, -9.223372036854776E18d);
        long j10 = -9223372036854775807L;
        long j11 = r10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r10 * 1000000.0d);
        boolean q10 = q(str2, f23298s, false);
        double r11 = r(str2, f23300u, -9.223372036854776E18d);
        long j12 = r11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r11 * 1000000.0d);
        double r12 = r(str2, f23301v, -9.223372036854776E18d);
        if (r12 != -9.223372036854776E18d) {
            j10 = (long) (r12 * 1000000.0d);
        }
        return new g.f(j11, q10, j12, j10, q(str2, f23302w, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) throws y2 {
        String v10 = v(str, pattern, map);
        if (v10 != null) {
            return v10;
        }
        throw y2.c("Couldn't match " + pattern.pattern() + " in " + str, (Throwable) null);
    }

    /* renamed from: i */
    public i a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                h p10 = p(new b(arrayDeque, bufferedReader), uri.toString());
                                n0.n(bufferedReader);
                                return p10;
                            }
                        }
                    } else {
                        n0.n(bufferedReader);
                        throw y2.c("Failed to parse the playlist, could not identify any tags.", (Throwable) null);
                    }
                }
                arrayDeque.add(trim);
                return o(this.f23306a, this.f23307b, new b(arrayDeque, bufferedReader), uri.toString());
            }
            throw y2.c("Input does not start with the #EXTM3U header.", (Throwable) null);
        } finally {
            n0.n(bufferedReader);
        }
    }

    public j(h hVar, g gVar) {
        this.f23306a = hVar;
        this.f23307b = gVar;
    }
}
