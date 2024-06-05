package y5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f31306a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f31307b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f31308c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f31309d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f31310e = 1;

    public i(long j10, long j11) {
        this.f31306a = j10;
        this.f31307b = j11;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f31309d = valueAnimator.getRepeatCount();
        iVar.f31310e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f31292b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f31293c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f31294d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f31306a;
    }

    public long d() {
        return this.f31307b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f31308c;
        return timeInterpolator != null ? timeInterpolator : a.f31292b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f31309d;
    }

    public int h() {
        return this.f31310e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f31306a = j10;
        this.f31307b = j11;
        this.f31308c = timeInterpolator;
    }
}
