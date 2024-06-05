package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat */
public class b extends g implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    private C0085b f4872b;

    /* renamed from: c  reason: collision with root package name */
    private Context f4873c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f4874d;

    /* renamed from: f  reason: collision with root package name */
    private Animator.AnimatorListener f4875f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<Object> f4876g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable.Callback f4877h;

    /* compiled from: AnimatedVectorDrawableCompat */
    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0085b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4879a;

        /* renamed from: b  reason: collision with root package name */
        h f4880b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f4881c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f4882d;

        /* renamed from: e  reason: collision with root package name */
        androidx.collection.a<Animator, String> f4883e;

        public C0085b(Context context, C0085b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4879a = bVar.f4879a;
                h hVar = bVar.f4880b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f4880b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f4880b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f4880b.mutate();
                    this.f4880b = hVar2;
                    hVar2.setCallback(callback);
                    this.f4880b.setBounds(bVar.f4880b.getBounds());
                    this.f4880b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f4882d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4882d = new ArrayList<>(size);
                    this.f4883e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f4882d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f4883e.get(animator);
                        clone.setTarget(this.f4880b.d(str));
                        this.f4882d.add(clone);
                        this.f4883e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f4881c == null) {
                this.f4881c = new AnimatorSet();
            }
            this.f4881c.playTogether(this.f4882d);
        }

        public int getChangingConfigurations() {
            return this.f4879a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    b() {
        this((Context) null, (C0085b) null, (Resources) null);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f4872b.f4880b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0085b bVar = this.f4872b;
        if (bVar.f4882d == null) {
            bVar.f4882d = new ArrayList<>();
            this.f4872b.f4883e = new androidx.collection.a<>();
        }
        this.f4872b.f4882d.add(animator);
        this.f4872b.f4883e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                c(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4874d == null) {
                    this.f4874d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4874d);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4872b.f4880b.draw(canvas);
        if (this.f4872b.f4881c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4872b.f4880b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4872b.f4879a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f4872b.f4880b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4889a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4889a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4872b.f4880b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4872b.f4880b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4872b.f4880b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k10 = k.k(resources, theme, attributeSet, a.f4864e);
                    int resourceId = k10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b10 = h.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.f4877h);
                        h hVar = this.f4872b.f4880b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f4872b.f4880b = b10;
                    }
                    k10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f4865f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4873c;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4872b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f4872b.f4880b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4872b.f4881c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4872b.f4880b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4872b.f4880b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f4872b.f4880b.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4872b.f4880b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f4872b.f4880b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f4872b.f4880b.setAutoMirrored(z10);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            this.f4872b.f4880b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f4872b.f4880b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f4872b.f4880b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f4872b.f4880b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public void start() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4872b.f4881c.isStarted()) {
            this.f4872b.f4881c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4872b.f4881c.end();
        }
    }

    private b(Context context) {
        this(context, (C0085b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4889a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4872b.f4880b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4884a;

        public c(Drawable.ConstantState constantState) {
            this.f4884a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4884a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4884a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f4884a.newDrawable();
            bVar.f4889a = newDrawable;
            newDrawable.setCallback(bVar.f4877h);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f4884a.newDrawable(resources);
            bVar.f4889a = newDrawable;
            newDrawable.setCallback(bVar.f4877h);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f4884a.newDrawable(resources, theme);
            bVar.f4889a = newDrawable;
            newDrawable.setCallback(bVar.f4877h);
            return bVar;
        }
    }

    private b(Context context, C0085b bVar, Resources resources) {
        this.f4874d = null;
        this.f4875f = null;
        this.f4876g = null;
        a aVar = new a();
        this.f4877h = aVar;
        this.f4873c = context;
        if (bVar != null) {
            this.f4872b = bVar;
        } else {
            this.f4872b = new C0085b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
