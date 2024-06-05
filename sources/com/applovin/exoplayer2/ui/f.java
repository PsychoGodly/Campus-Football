package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.impl.a1;
import com.applovin.impl.cb;
import com.applovin.impl.la;
import com.applovin.impl.ui;
import com.applovin.impl.yp;
import com.applovin.impl.zn;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f6217a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6218a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f6219b;

        private b(String str, Map map) {
            this.f6218a = str;
            this.f6219b = map;
        }
    }

    private static final class c {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final Comparator f6220e = p.f6268a;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final Comparator f6221f = o.f6267a;

        /* renamed from: a  reason: collision with root package name */
        public final int f6222a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6223b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6224c;

        /* renamed from: d  reason: collision with root package name */
        public final String f6225d;

        private c(int i10, int i11, String str, String str2) {
            this.f6222a = i10;
            this.f6223b = i11;
            this.f6224c = str;
            this.f6225d = str2;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f6223b, cVar.f6223b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f6224c.compareTo(cVar2.f6224c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar.f6225d.compareTo(cVar2.f6225d);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f6222a, cVar.f6222a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f6224c.compareTo(cVar.f6224c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar2.f6225d.compareTo(cVar.f6225d);
        }
    }

    private static final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f6226a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final List f6227b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b(MaxReward.DEFAULT_LABEL, cb.h());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(a(charSequence), cb.h());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet<>();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer intValue : hashSet) {
            int intValue2 = intValue.intValue();
            hashMap.put(c.a("bg_" + intValue2), yp.a("background-color:%s;", c.a(intValue2)));
        }
        SparseArray a10 = a(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < a10.size()) {
            int keyAt = a10.keyAt(i10);
            sb2.append(a(spanned.subSequence(i11, keyAt)));
            d dVar = (d) a10.get(keyAt);
            Collections.sort(dVar.f6227b, c.f6221f);
            for (c cVar : dVar.f6227b) {
                sb2.append(cVar.f6225d);
            }
            Collections.sort(dVar.f6226a, c.f6220e);
            for (c cVar2 : dVar.f6226a) {
                sb2.append(cVar2.f6224c);
            }
            i10++;
            i11 = keyAt;
        }
        sb2.append(a(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), hashMap);
    }

    private static String a(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static SparseArray a(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a10 = a(obj, f10);
            String a11 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a10 != null) {
                a1.a((Object) a11);
                c cVar = new c(spanStart, spanEnd, a10, a11);
                a(sparseArray, spanStart).f6226a.add(cVar);
                a(sparseArray, spanEnd).f6227b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f10) {
        float f11;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return yp.a("<span style='color:%s;'>", c.a(((ForegroundColorSpan) obj).getForegroundColor()));
        } else if (obj instanceof BackgroundColorSpan) {
            return yp.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        } else if (obj instanceof la) {
            return "<span style='text-combine-upright:all;'>";
        } else {
            if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                if (absoluteSizeSpan.getDip()) {
                    f11 = (float) absoluteSizeSpan.getSize();
                } else {
                    f11 = ((float) absoluteSizeSpan.getSize()) / f10;
                }
                return yp.a("<span style='font-size:%.2fpx;'>", Float.valueOf(f11));
            } else if (obj instanceof RelativeSizeSpan) {
                return yp.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
            } else if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family == null) {
                    return null;
                }
                return yp.a("<span style='font-family:\"%s\";'>", family);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof ui) {
                int i10 = ((ui) obj).f12592b;
                if (i10 == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i10 == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i10 != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof zn)) {
                    return null;
                }
                zn znVar = (zn) obj;
                return yp.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(znVar.f13954a, znVar.f13955b), a(znVar.f13956c));
            }
        }
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof la) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof zn)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style != 3) {
                    return null;
                }
                return "</i></b>";
            } else if (obj instanceof ui) {
                return "<rt>" + a((CharSequence) ((ui) obj).f12591a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    private static String a(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }

    private static d a(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String a(CharSequence charSequence) {
        return f6217a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
