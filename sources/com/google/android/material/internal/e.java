package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f25839a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f25840b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f25841c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f25842d = new a();

    /* compiled from: StateListAnimator */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f25841c == animator) {
                eVar.f25841c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f25844a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f25845b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f25844a = iArr;
            this.f25845b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f25841c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25841c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f25845b;
        this.f25841c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f25842d);
        this.f25839a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f25841c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f25841c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f25839a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f25839a.get(i10);
            if (StateSet.stateSetMatches(bVar.f25844a, iArr)) {
                break;
            }
            i10++;
        }
        b bVar2 = this.f25840b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.f25840b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }
}
