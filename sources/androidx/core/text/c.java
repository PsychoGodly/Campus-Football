package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat */
public class c implements Spannable {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f3054d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f3055a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3056b;

    /* renamed from: c  reason: collision with root package name */
    private final PrecomputedText f3057c;

    public a a() {
        return this.f3056b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f3055a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i10) {
        return this.f3055a.charAt(i10);
    }

    public int getSpanEnd(Object obj) {
        return this.f3055a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f3055a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f3055a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f3057c.getSpans(i10, i11, cls);
        }
        return this.f3055a.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f3055a.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3055a.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3057c.removeSpan(obj);
        } else {
            this.f3055a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3057c.setSpan(obj, i10, i11, i12);
        } else {
            this.f3055a.setSpan(obj, i10, i11, i12);
        }
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f3055a.subSequence(i10, i11);
    }

    public String toString() {
        return this.f3055a.toString();
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f3058a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f3059b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3060c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3061d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f3062e;

        /* renamed from: androidx.core.text.c$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0042a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f3063a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f3064b;

            /* renamed from: c  reason: collision with root package name */
            private int f3065c;

            /* renamed from: d  reason: collision with root package name */
            private int f3066d;

            public C0042a(TextPaint textPaint) {
                this.f3063a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f3065c = 1;
                    this.f3066d = 1;
                } else {
                    this.f3066d = 0;
                    this.f3065c = 0;
                }
                if (i10 >= 18) {
                    this.f3064b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f3064b = null;
                }
            }

            public a a() {
                return new a(this.f3063a, this.f3064b, this.f3065c, this.f3066d);
            }

            public C0042a b(int i10) {
                this.f3065c = i10;
                return this;
            }

            public C0042a c(int i10) {
                this.f3066d = i10;
                return this;
            }

            public C0042a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3064b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3062e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3062e = null;
            }
            this.f3058a = textPaint;
            this.f3059b = textDirectionHeuristic;
            this.f3060c = i10;
            this.f3061d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f3060c != aVar.b() || this.f3061d != aVar.c())) || this.f3058a.getTextSize() != aVar.e().getTextSize() || this.f3058a.getTextScaleX() != aVar.e().getTextScaleX() || this.f3058a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i10 >= 21 && (this.f3058a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f3058a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f3058a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f3058a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i10 >= 17 && !this.f3058a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f3058a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3058a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f3060c;
        }

        public int c() {
            return this.f3061d;
        }

        public TextDirectionHeuristic d() {
            return this.f3059b;
        }

        public TextPaint e() {
            return this.f3058a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f3059b == aVar.d();
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return androidx.core.util.c.b(Float.valueOf(this.f3058a.getTextSize()), Float.valueOf(this.f3058a.getTextScaleX()), Float.valueOf(this.f3058a.getTextSkewX()), Float.valueOf(this.f3058a.getLetterSpacing()), Integer.valueOf(this.f3058a.getFlags()), this.f3058a.getTextLocales(), this.f3058a.getTypeface(), Boolean.valueOf(this.f3058a.isElegantTextHeight()), this.f3059b, Integer.valueOf(this.f3060c), Integer.valueOf(this.f3061d));
            } else if (i10 >= 21) {
                return androidx.core.util.c.b(Float.valueOf(this.f3058a.getTextSize()), Float.valueOf(this.f3058a.getTextScaleX()), Float.valueOf(this.f3058a.getTextSkewX()), Float.valueOf(this.f3058a.getLetterSpacing()), Integer.valueOf(this.f3058a.getFlags()), this.f3058a.getTextLocale(), this.f3058a.getTypeface(), Boolean.valueOf(this.f3058a.isElegantTextHeight()), this.f3059b, Integer.valueOf(this.f3060c), Integer.valueOf(this.f3061d));
            } else if (i10 >= 18) {
                return androidx.core.util.c.b(Float.valueOf(this.f3058a.getTextSize()), Float.valueOf(this.f3058a.getTextScaleX()), Float.valueOf(this.f3058a.getTextSkewX()), Integer.valueOf(this.f3058a.getFlags()), this.f3058a.getTextLocale(), this.f3058a.getTypeface(), this.f3059b, Integer.valueOf(this.f3060c), Integer.valueOf(this.f3061d));
            } else if (i10 >= 17) {
                return androidx.core.util.c.b(Float.valueOf(this.f3058a.getTextSize()), Float.valueOf(this.f3058a.getTextScaleX()), Float.valueOf(this.f3058a.getTextSkewX()), Integer.valueOf(this.f3058a.getFlags()), this.f3058a.getTextLocale(), this.f3058a.getTypeface(), this.f3059b, Integer.valueOf(this.f3060c), Integer.valueOf(this.f3061d));
            } else {
                return androidx.core.util.c.b(Float.valueOf(this.f3058a.getTextSize()), Float.valueOf(this.f3058a.getTextScaleX()), Float.valueOf(this.f3058a.getTextSkewX()), Integer.valueOf(this.f3058a.getFlags()), this.f3058a.getTypeface(), this.f3059b, Integer.valueOf(this.f3060c), Integer.valueOf(this.f3061d));
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f3058a.getTextSize());
            sb2.append(", textScaleX=" + this.f3058a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3058a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                sb2.append(", letterSpacing=" + this.f3058a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f3058a.isElegantTextHeight());
            }
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f3058a.getTextLocales());
            } else if (i10 >= 17) {
                sb2.append(", textLocale=" + this.f3058a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f3058a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f3058a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f3059b);
            sb2.append(", breakStrategy=" + this.f3060c);
            sb2.append(", hyphenationFrequency=" + this.f3061d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f3058a = params.getTextPaint();
            this.f3059b = params.getTextDirection();
            this.f3060c = params.getBreakStrategy();
            this.f3061d = params.getHyphenationFrequency();
            this.f3062e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
