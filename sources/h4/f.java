package h4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.a0;
import k4.n0;
import k4.r;
import y3.b;

/* compiled from: WebvttCueParser */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f18770a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f18771b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Integer> f18772c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f18773d;

    /* compiled from: WebvttCueParser */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<b> f18774c = g.f32971a;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f18775a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f18776b;

        private b(c cVar, int i10) {
            this.f18775a = cVar;
            this.f18776b = i10;
        }
    }

    /* compiled from: WebvttCueParser */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f18777a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18778b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18779c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f18780d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f18778b = i10;
            this.f18777a = str;
            this.f18779c = str2;
            this.f18780d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            k4.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = MaxReward.DEFAULT_LABEL;
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] R0 = n0.R0(trim, "\\.");
            String str3 = R0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < R0.length; i11++) {
                hashSet.add(R0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c(MaxReward.DEFAULT_LABEL, 0, MaxReward.DEFAULT_LABEL, Collections.emptySet());
        }
    }

    /* compiled from: WebvttCueParser */
    private static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final int f18781a;

        /* renamed from: b  reason: collision with root package name */
        public final d f18782b;

        public d(int i10, d dVar) {
            this.f18781a = i10;
            this.f18782b = dVar;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f18781a, dVar.f18781a);
        }
    }

    /* compiled from: WebvttCueParser */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public long f18783a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f18784b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f18785c;

        /* renamed from: d  reason: collision with root package name */
        public int f18786d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f18787e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f18788f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f18789g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f18790h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f18791i = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: j  reason: collision with root package name */
        public float f18792j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f18793k = RecyclerView.UNDEFINED_DURATION;

        private static float b(float f10, int i10) {
            int i11 = (f10 > -3.4028235E38f ? 1 : (f10 == -3.4028235E38f ? 0 : -1));
            if (i11 == 0 || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return i11 != 0 ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            r.i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public e a() {
            return new e(g().a(), this.f18783a, this.f18784b);
        }

        public b.C0250b g() {
            float f10 = this.f18790h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f18786d);
            }
            int i10 = this.f18791i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f18786d);
            }
            b.C0250b r10 = new b.C0250b().p(c(this.f18786d)).h(b(this.f18787e, this.f18788f), this.f18788f).i(this.f18789g).k(f10).l(i10).n(Math.min(this.f18792j, d(i10, f10))).r(this.f18793k);
            CharSequence charSequence = this.f18785c;
            if (charSequence != null) {
                r10.o(charSequence);
            }
            return r10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18772c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18773d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String next : set) {
            Map<String, Integer> map = f18772c;
            if (map.containsKey(next)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(next).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f18773d;
                if (map2.containsKey(next)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(next).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                r.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<d> list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f18774c);
        int i11 = cVar.f18778b;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("rt".equals(((b) arrayList.get(i13)).f18775a.f18777a)) {
                b bVar = (b) arrayList.get(i13);
                int g10 = g(i(list2, str, bVar.f18775a), i10, 1);
                int i14 = bVar.f18775a.f18778b - i12;
                int d10 = bVar.f18776b - i12;
                CharSequence subSequence = spannableStringBuilder.subSequence(i14, d10);
                spannableStringBuilder.delete(i14, d10);
                spannableStringBuilder.setSpan(new c4.b(subSequence.toString(), g10), i11, i14, 33);
                i12 += subSequence.length();
                i11 = i14;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<d> list2) {
        int i10 = cVar.f18778b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f18777a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals(MaxReward.DEFAULT_LABEL)) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f18780d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> h10 = h(list2, str, cVar);
        for (int i11 = 0; i11 < h10.size(); i11++) {
            e(spannableStringBuilder, h10.get(i11).f18782b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, d dVar, int i10, int i11) {
        if (dVar != null) {
            if (dVar.i() != -1) {
                c4.c.a(spannableStringBuilder, new StyleSpan(dVar.i()), i10, i11, 33);
            }
            if (dVar.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
            if (dVar.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (dVar.k()) {
                c4.c.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i10, i11, 33);
            }
            if (dVar.j()) {
                c4.c.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i10, i11, 33);
            }
            if (dVar.d() != null) {
                c4.c.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
            }
            int f10 = dVar.f();
            if (f10 == 1) {
                c4.c.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i10, i11, 33);
            } else if (f10 == 2) {
                c4.c.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i10, i11, 33);
            } else if (f10 == 3) {
                c4.c.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i10, i11, 33);
            }
            if (dVar.b()) {
                spannableStringBuilder.setSpan(new c4.a(), i10, i11, 33);
            }
        }
    }

    private static int f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int h10 = dVar.h(str, cVar.f18777a, cVar.f18780d, cVar.f18779c);
            if (h10 > 0) {
                arrayList.add(new d(h10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<d> list, String str, c cVar) {
        List<d> h10 = h(list, str, cVar);
        for (int i10 = 0; i10 < h10.size(); i10++) {
            d dVar = h10.get(i10).f18782b;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        k4.a.a(!trim.isEmpty());
        return n0.S0(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    static y3.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f18785c = charSequence;
        return eVar.g().a();
    }

    private static e m(String str, Matcher matcher, a0 a0Var, List<d> list) {
        e eVar = new e();
        try {
            eVar.f18783a = i.d((String) k4.a.e(matcher.group(1)));
            eVar.f18784b = i.d((String) k4.a.e(matcher.group(2)));
            p((String) k4.a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String r10 = a0Var.r();
            while (!TextUtils.isEmpty(r10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(r10.trim());
                r10 = a0Var.r();
            }
            eVar.f18785c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            r.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static e n(a0 a0Var, List<d> list) {
        String r10 = a0Var.r();
        if (r10 == null) {
            return null;
        }
        Pattern pattern = f18770a;
        Matcher matcher = pattern.matcher(r10);
        if (matcher.matches()) {
            return m((String) null, matcher, a0Var, list);
        }
        String r11 = a0Var.r();
        if (r11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(r11);
        if (matcher2.matches()) {
            return m(r10.trim(), matcher2, a0Var, list);
        }
        return null;
    }

    static b.C0250b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f18771b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) k4.a.e(matcher.group(1));
            String str3 = (String) k4.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f18786d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f18792j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f18793k = w(str3);
                } else {
                    r.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                r.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString q(String str, String str2, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    int i12 = 1;
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = f(str2, i11);
                    int i13 = i11 - 2;
                    boolean z11 = str2.charAt(i13) == '/';
                    if (z10) {
                        i12 = 2;
                    }
                    int i14 = i10 + i12;
                    if (!z11) {
                        i13 = i11 - 1;
                    }
                    String substring = str2.substring(i14, i13);
                    if (!substring.trim().isEmpty()) {
                        String j10 = j(substring);
                        if (k(j10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f18777a.equals(j10)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                r.i("WebvttCueParser", "Invalid anchor value: " + str);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f18789g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f18787e = i.c(str);
            eVar.f18788f = 0;
            return;
        }
        eVar.f18787e = (float) Integer.parseInt(str);
        eVar.f18788f = 1;
    }

    private static int t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                r.i("WebvttCueParser", "Invalid anchor value: " + str);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f18791i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f18790h = i.c(str);
    }

    private static int v(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                r.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        r.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return RecyclerView.UNDEFINED_DURATION;
    }
}
