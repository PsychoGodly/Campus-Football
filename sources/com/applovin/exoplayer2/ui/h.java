package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.a1;
import com.applovin.impl.vb;
import com.applovin.impl.z4;

abstract class h {
    public static float a(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = (float) i12;
        } else if (i10 == 1) {
            f11 = (float) i11;
        } else if (i10 != 2) {
            return -3.4028235E38f;
        } else {
            return f10;
        }
        return f10 * f11;
    }

    public static void a(z4.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.a((CharSequence) SpannableString.valueOf(bVar.e()));
            }
            a((Spannable) a1.a((Object) bVar.e()), r.f6270a);
        }
        b(bVar);
    }

    public static void b(z4.b bVar) {
        bVar.b(-3.4028235E38f, RecyclerView.UNDEFINED_DURATION);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.a((CharSequence) SpannableString.valueOf(bVar.e()));
            }
            a((Spannable) a1.a((Object) bVar.e()), q.f6269a);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Object obj) {
        return !(obj instanceof vb);
    }

    private static void a(Spannable spannable, Predicate predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
