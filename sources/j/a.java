package j;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.p0;
import androidx.collection.h;
import androidx.core.content.res.k;
import j.b;
import j.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat */
public class a extends d implements androidx.core.graphics.drawable.b {

    /* renamed from: u  reason: collision with root package name */
    private static final String f19132u = a.class.getSimpleName();

    /* renamed from: p  reason: collision with root package name */
    private c f19133p;

    /* renamed from: q  reason: collision with root package name */
    private g f19134q;

    /* renamed from: r  reason: collision with root package name */
    private int f19135r;

    /* renamed from: s  reason: collision with root package name */
    private int f19136s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f19137t;

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f19138a;

        b(Animatable animatable) {
            super();
            this.f19138a = animatable;
        }

        public void c() {
            this.f19138a.start();
        }

        public void d() {
            this.f19138a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    static class c extends d.a {
        androidx.collection.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.d<>();
            this.L = new h<>();
        }

        private static long D(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.j(z10, Integer.valueOf(i10));
            return z10;
        }

        /* access modifiers changed from: package-private */
        public int C(int i10, int i11, Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0;
            long j11 = (long) a10;
            this.K.a(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        /* access modifiers changed from: package-private */
        public int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.f(i10, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i10, int i11) {
            return (int) this.K.f(D(i10, i11), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i10, int i11) {
            return (this.K.f(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i10, int i11) {
            return (this.K.f(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f19139a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f19139a = bVar;
        }

        public void c() {
            this.f19139a.start();
        }

        public void d() {
            this.f19139a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f19140a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f19141b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i10, i11});
            if (Build.VERSION.SDK_INT >= 18) {
                k.b.a(ofInt, true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f19141b = z11;
            this.f19140a = ofInt;
        }

        public boolean a() {
            return this.f19141b;
        }

        public void b() {
            this.f19140a.reverse();
        }

        public void c() {
            this.f19140a.start();
        }

        public void d() {
            this.f19140a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f19142a;

        /* renamed from: b  reason: collision with root package name */
        private int f19143b;

        /* renamed from: c  reason: collision with root package name */
        private int f19144c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f19144c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f19143b = numberOfFrames;
            int[] iArr = this.f19142a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f19142a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f19142a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f19144c = i10;
            return i10;
        }

        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * ((float) this.f19144c)) + 0.5f);
            int i11 = this.f19143b;
            int[] iArr = this.f19142a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (((float) i12) / ((float) i11)) + (i12 < i11 ? ((float) i10) / ((float) this.f19144c) : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = k.k(resources, theme, attributeSet, k.e.f19508h);
        int resourceId = k10.getResourceId(k.e.f19509i, 0);
        int resourceId2 = k10.getResourceId(k.e.f19510j, -1);
        Drawable j10 = resourceId2 > 0 ? p0.h().j(context, resourceId2) : null;
        k10.recycle();
        int[] k11 = k(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j10 = androidx.vectordrawable.graphics.drawable.h.c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j10 = k.c.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j10 != null) {
            return this.f19133p.B(k11, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = k.k(resources, theme, attributeSet, k.e.f19511k);
        int resourceId = k10.getResourceId(k.e.f19514n, -1);
        int resourceId2 = k10.getResourceId(k.e.f19513m, -1);
        int resourceId3 = k10.getResourceId(k.e.f19512l, -1);
        Drawable j10 = resourceId3 > 0 ? p0.h().j(context, resourceId3) : null;
        boolean z10 = k10.getBoolean(k.e.f19515o, false);
        k10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j10 = androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j10 = k.c.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f19133p.C(resourceId, resourceId2, j10, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i10) {
        int i11;
        int G;
        g gVar;
        g gVar2 = this.f19134q;
        if (gVar2 == null) {
            i11 = c();
        } else if (i10 == this.f19135r) {
            return true;
        } else {
            if (i10 != this.f19136s || !gVar2.a()) {
                i11 = this.f19135r;
                gVar2.d();
            } else {
                gVar2.b();
                this.f19135r = this.f19136s;
                this.f19136s = i10;
                return true;
            }
        }
        this.f19134q = null;
        this.f19136s = -1;
        this.f19135r = -1;
        c cVar = this.f19133p;
        int E = cVar.E(i11);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.b) {
            gVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.f19134q = gVar;
        this.f19136s = i11;
        this.f19135r = i10;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f19133p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f19162d |= k.c.b(typedArray);
        }
        cVar.x(typedArray.getBoolean(k.e.f19504d, cVar.f19167i));
        cVar.t(typedArray.getBoolean(k.e.f19505e, cVar.f19170l));
        cVar.u(typedArray.getInt(k.e.f19506f, cVar.A));
        cVar.v(typedArray.getInt(k.e.f19507g, cVar.B));
        setDither(typedArray.getBoolean(k.e.f19502b, cVar.f19182x));
    }

    /* access modifiers changed from: package-private */
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f19133p = (c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f19134q;
        if (gVar != null) {
            gVar.d();
            this.f19134q = null;
            g(this.f19135r);
            this.f19135r = -1;
            this.f19136s = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.f19133p, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f19137t && super.mutate() == this) {
            this.f19133p.r();
            this.f19137t = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k10 = k.k(resources, theme, attributeSet, k.e.f19501a);
        setVisible(k10.getBoolean(k.e.f19503c, true), true);
        t(k10);
        i(resources);
        k10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f19133p.F(iArr);
        boolean z10 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f19134q;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super((d.a) null);
        this.f19135r = -1;
        this.f19136s = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
