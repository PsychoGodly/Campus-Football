package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable */
class p implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3415a = false;

    /* renamed from: b  reason: collision with root package name */
    private Spannable f3416b;

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.c;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable */
    static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof androidx.core.text.c);
        }
    }

    p(Spannable spannable) {
        this.f3416b = spannable;
    }

    private void a() {
        Spannable spannable = this.f3416b;
        if (!this.f3415a && c().a(spannable)) {
            this.f3416b = new SpannableString(spannable);
        }
        this.f3415a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* access modifiers changed from: package-private */
    public Spannable b() {
        return this.f3416b;
    }

    public char charAt(int i10) {
        return this.f3416b.charAt(i10);
    }

    public IntStream chars() {
        return a.a(this.f3416b);
    }

    public IntStream codePoints() {
        return a.b(this.f3416b);
    }

    public int getSpanEnd(Object obj) {
        return this.f3416b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f3416b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f3416b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return this.f3416b.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f3416b.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3416b.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f3416b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f3416b.setSpan(obj, i10, i11, i12);
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f3416b.subSequence(i10, i11);
    }

    public String toString() {
        return this.f3416b.toString();
    }

    p(CharSequence charSequence) {
        this.f3416b = new SpannableString(charSequence);
    }
}
