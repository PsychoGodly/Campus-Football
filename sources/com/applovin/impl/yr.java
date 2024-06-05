package com.applovin.impl;

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
import com.applovin.impl.z4;
import com.applovin.mediation.MaxReward;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class yr {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f13683a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f13684b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    private static final Map f13685c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f13686d;

    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator f13687c = v80.f12718a;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f13688a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f13689b;

        private b(c cVar, int i10) {
            this.f13688a = cVar;
            this.f13689b = i10;
        }
    }

    private static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final int f13694a;

        /* renamed from: b  reason: collision with root package name */
        public final wr f13695b;

        public d(int i10, wr wrVar) {
            this.f13694a = i10;
            this.f13695b = wrVar;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f13694a, dVar.f13694a);
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
        f13685c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13686d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f13685c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f13686d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static int b(List list, String str, c cVar) {
        List a10 = a(list, str, cVar);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            wr wrVar = ((d) a10.get(i10)).f13695b;
            if (wrVar.g() != -1) {
                return wrVar.g();
            }
        }
        return -1;
    }

    static z4.b c(String str) {
        e eVar = new e();
        a(str, eVar);
        return eVar.b();
    }

    private static int d(String str) {
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
                kc.d("WebvttCueParser", "Invalid anchor value: " + str);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static int e(String str) {
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
                kc.d("WebvttCueParser", "Invalid anchor value: " + str);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static int f(String str) {
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
                kc.d("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int g(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        kc.d("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return RecyclerView.UNDEFINED_DURATION;
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public long f13696a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f13697b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f13698c;

        /* renamed from: d  reason: collision with root package name */
        public int f13699d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f13700e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f13701f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f13702g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f13703h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f13704i = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: j  reason: collision with root package name */
        public float f13705j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f13706k = RecyclerView.UNDEFINED_DURATION;

        private static float a(float f10, int i10) {
            int i11 = (f10 > -3.4028235E38f ? 1 : (f10 == -3.4028235E38f ? 0 : -1));
            if (i11 == 0 || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return i11 != 0 ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            kc.d("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float b(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int c(int i10) {
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

        public z4.b b() {
            float f10 = this.f13703h;
            if (f10 == -3.4028235E38f) {
                f10 = b(this.f13699d);
            }
            int i10 = this.f13704i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = c(this.f13699d);
            }
            z4.b c10 = new z4.b().b(a(this.f13699d)).a(a(this.f13700e, this.f13701f), this.f13701f).a(this.f13702g).b(f10).b(i10).d(Math.min(this.f13705j, a(i10, f10))).c(this.f13706k);
            CharSequence charSequence = this.f13698c;
            if (charSequence != null) {
                c10.a(charSequence);
            }
            return c10;
        }

        private static float a(int i10, float f10) {
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

        public xr a() {
            return new xr(b().a(), this.f13696a, this.f13697b);
        }
    }

    private static void c(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f13704i = e(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f13703h = as.a(str);
    }

    private static boolean b(String str) {
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

    private static void b(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f13702g = d(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f13700e = as.a(str);
            eVar.f13701f = 0;
            return;
        }
        eVar.f13700e = (float) Integer.parseInt(str);
        eVar.f13701f = 1;
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
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
                kc.d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f13690a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13691b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13692c;

        /* renamed from: d  reason: collision with root package name */
        public final Set f13693d;

        private c(String str, int i10, String str2, Set set) {
            this.f13691b = i10;
            this.f13690a = str;
            this.f13692c = str2;
            this.f13693d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            a1.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = MaxReward.DEFAULT_LABEL;
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a10 = yp.a(trim, "\\.");
            String str3 = a10[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < a10.length; i11++) {
                hashSet.add(a10[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c a() {
            return new c(MaxReward.DEFAULT_LABEL, 0, MaxReward.DEFAULT_LABEL, Collections.emptySet());
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int b10 = b(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f13687c);
        int i10 = cVar.f13691b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f13688a.f13690a)) {
                b bVar = (b) arrayList.get(i12);
                int a10 = a(b(list2, str, bVar.f13688a), b10, 1);
                int i13 = bVar.f13688a.f13691b - i11;
                int b11 = bVar.f13689b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, b11);
                spannableStringBuilder.delete(i13, b11);
                spannableStringBuilder.setSpan(new ui(subSequence.toString(), a10), i10, i13, 33);
                i11 += subSequence.length();
                i10 = i13;
            }
        }
    }

    private static void a(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = cVar.f13691b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f13690a;
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
                a(spannableStringBuilder, cVar.f13693d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List a10 = a(list2, str, cVar);
        for (int i11 = 0; i11 < a10.size(); i11++) {
            a(spannableStringBuilder, ((d) a10.get(i11)).f13695b, i10, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, wr wrVar, int i10, int i11) {
        if (wrVar != null) {
            if (wrVar.h() != -1) {
                mk.a(spannableStringBuilder, new StyleSpan(wrVar.h()), i10, i11, 33);
            }
            if (wrVar.k()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
            if (wrVar.l()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (wrVar.j()) {
                mk.a(spannableStringBuilder, new ForegroundColorSpan(wrVar.c()), i10, i11, 33);
            }
            if (wrVar.i()) {
                mk.a(spannableStringBuilder, new BackgroundColorSpan(wrVar.a()), i10, i11, 33);
            }
            if (wrVar.d() != null) {
                mk.a(spannableStringBuilder, new TypefaceSpan(wrVar.d()), i10, i11, 33);
            }
            int f10 = wrVar.f();
            if (f10 == 1) {
                mk.a(spannableStringBuilder, new AbsoluteSizeSpan((int) wrVar.e(), true), i10, i11, 33);
            } else if (f10 == 2) {
                mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e()), i10, i11, 33);
            } else if (f10 == 3) {
                mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e() / 100.0f), i10, i11, 33);
            }
            if (wrVar.b()) {
                spannableStringBuilder.setSpan(new la(), i10, i11, 33);
            }
        }
    }

    private static int a(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int a(int i10, int i11, int i12) {
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

    private static String a(String str) {
        String trim = str.trim();
        a1.a(!trim.isEmpty());
        return yp.b(trim, "[ \\.]")[0];
    }

    public static xr a(yg ygVar, List list) {
        String l10 = ygVar.l();
        if (l10 == null) {
            return null;
        }
        Pattern pattern = f13683a;
        Matcher matcher = pattern.matcher(l10);
        if (matcher.matches()) {
            return a((String) null, matcher, ygVar, list);
        }
        String l11 = ygVar.l();
        if (l11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(l11);
        if (matcher2.matches()) {
            return a(l10.trim(), matcher2, ygVar, list);
        }
        return null;
    }

    private static xr a(String str, Matcher matcher, yg ygVar, List list) {
        e eVar = new e();
        try {
            eVar.f13696a = as.b((String) a1.a((Object) matcher.group(1)));
            eVar.f13697b = as.b((String) a1.a((Object) matcher.group(2)));
            a((String) a1.a((Object) matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String l10 = ygVar.l();
            while (!TextUtils.isEmpty(l10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(l10.trim());
                l10 = ygVar.l();
            }
            eVar.f13698c = a(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            kc.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static z4 a(CharSequence charSequence) {
        e eVar = new e();
        eVar.f13698c = charSequence;
        return eVar.b().a();
    }

    static SpannedString a(String str, String str2, List list) {
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
                    a(str2.substring(i10, indexOf), spannableStringBuilder);
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
                    i11 = a(str2, i11);
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
                        String a10 = a(substring);
                        if (b(a10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    a(str, cVar, (List) arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f13690a.equals(a10)) {
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
            a(str, (c) arrayDeque.pop(), (List) arrayList, spannableStringBuilder, list);
        }
        a(str, c.a(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void a(String str, e eVar) {
        Matcher matcher = f13684b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) a1.a((Object) matcher.group(1));
            String str3 = (String) a1.a((Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f13699d = f(str3);
                } else if ("position".equals(str2)) {
                    c(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f13705j = as.a(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f13706k = g(str3);
                } else {
                    kc.d("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                kc.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static List a(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            wr wrVar = (wr) list.get(i10);
            int a10 = wrVar.a(str, cVar.f13690a, cVar.f13693d, cVar.f13692c);
            if (a10 > 0) {
                arrayList.add(new d(a10, wrVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
