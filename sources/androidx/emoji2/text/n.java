package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder */
public final class n extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f3410a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f3411b = new ArrayList();

    /* compiled from: SpannableBuilder */
    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        final Object f3412a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f3413b = new AtomicInteger(0);

        a(Object obj) {
            this.f3412a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof i;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3413b.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3412a).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f3412a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f3413b.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f3413b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f3412a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f3413b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = i10 > i11 ? 0 : i10;
                    if (i12 > i13) {
                        i15 = i16;
                        i14 = 0;
                    } else {
                        i14 = i12;
                        i15 = i16;
                    }
                } else {
                    i15 = i10;
                    i14 = i12;
                }
                ((SpanWatcher) this.f3412a).onSpanChanged(spannable, obj, i15, i11, i14, i13);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f3413b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f3412a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f3412a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        h.g(cls, "watcherClass cannot be null");
        this.f3410a = cls;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f3411b.size(); i10++) {
            this.f3411b.get(i10).a();
        }
    }

    public static n c(Class<?> cls, CharSequence charSequence) {
        return new n(cls, charSequence);
    }

    private void e() {
        for (int i10 = 0; i10 < this.f3411b.size(); i10++) {
            this.f3411b.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i10 = 0; i10 < this.f3411b.size(); i10++) {
            a aVar = this.f3411b.get(i10);
            if (aVar.f3412a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class<?> cls) {
        return this.f3410a == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i10 = 0; i10 < this.f3411b.size(); i10++) {
            this.f3411b.get(i10).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    public int getSpanEnd(Object obj) {
        a f10;
        if (h(obj) && (f10 = f(obj)) != null) {
            obj = f10;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a f10;
        if (h(obj) && (f10 = f(obj)) != null) {
            obj = f10;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a f10;
        if (h(obj) && (f10 = f(obj)) != null) {
            obj = f10;
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (!g(cls)) {
            return super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f3412a;
        }
        return tArr;
    }

    public int nextSpanTransition(int i10, int i11, Class<a> cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f3411b.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f3411b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    public CharSequence subSequence(int i10, int i11) {
        return new n(this.f3410a, this, i10, i11);
    }

    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        b();
        super.replace(i10, i11, charSequence);
        i();
        return this;
    }

    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    n(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        h.g(cls, "watcherClass cannot be null");
        this.f3410a = cls;
    }

    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        b();
        super.replace(i10, i11, charSequence, i12, i13);
        i();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
