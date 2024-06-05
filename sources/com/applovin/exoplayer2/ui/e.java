package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.a1;
import com.applovin.impl.ab;
import com.applovin.impl.df;
import com.applovin.impl.go;
import com.applovin.impl.kh;
import com.applovin.impl.mh;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.p6;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r4;
import com.applovin.impl.r7;
import com.applovin.impl.t;
import com.applovin.impl.to;
import com.applovin.impl.uo;
import com.applovin.impl.uz;
import com.applovin.impl.vz;
import com.applovin.impl.we;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.impl.z4;
import com.applovin.sdk.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class e extends FrameLayout {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final a f6189a;

    /* renamed from: b  reason: collision with root package name */
    private final AspectRatioFrameLayout f6190b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final View f6191c;

    /* renamed from: d  reason: collision with root package name */
    private final View f6192d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6193f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f6194g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SubtitleView f6195h;

    /* renamed from: i  reason: collision with root package name */
    private final View f6196i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f6197j;

    /* renamed from: k  reason: collision with root package name */
    private final d f6198k;

    /* renamed from: l  reason: collision with root package name */
    private final FrameLayout f6199l;

    /* renamed from: m  reason: collision with root package name */
    private final FrameLayout f6200m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public nh f6201n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6202o;

    /* renamed from: p  reason: collision with root package name */
    private d.e f6203p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6204q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f6205r;

    /* renamed from: s  reason: collision with root package name */
    private int f6206s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6207t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f6208u;

    /* renamed from: v  reason: collision with root package name */
    private int f6209v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6210w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f6211x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6212y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public int f6213z;

    public e(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean a(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean a(qd qdVar) {
        byte[] bArr = qdVar.f10922l;
        if (bArr == null) {
            return false;
        }
        return a((Drawable) new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean m() {
        if (!this.f6204q) {
            return false;
        }
        a1.b((Object) this.f6194g);
        return true;
    }

    private boolean n() {
        if (!this.f6202o) {
            return false;
        }
        a1.b((Object) this.f6198k);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nh nhVar = this.f6201n;
        if (nhVar != null && nhVar.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a10 = a(keyEvent.getKeyCode());
        if (a10 && n() && !this.f6198k.c()) {
            a(true);
        } else if (a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
        } else if (!a10 || !n()) {
            return false;
        } else {
            a(true);
            return false;
        }
        return true;
    }

    public List<t> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f6200m;
        if (frameLayout != null) {
            arrayList.add(new t(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        d dVar = this.f6198k;
        if (dVar != null) {
            arrayList.add(new t(dVar, 0));
        }
        return ab.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) a1.a((Object) this.f6199l, (Object) "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f6210w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f6212y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f6209v;
    }

    public Drawable getDefaultArtwork() {
        return this.f6205r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f6200m;
    }

    public nh getPlayer() {
        return this.f6201n;
    }

    public int getResizeMode() {
        a1.b((Object) this.f6190b);
        return this.f6190b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f6195h;
    }

    public boolean getUseArtwork() {
        return this.f6204q;
    }

    public boolean getUseController() {
        return this.f6202o;
    }

    public View getVideoSurfaceView() {
        return this.f6192d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n() || this.f6201n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        } else if (action != 1 || !this.A) {
            return false;
        } else {
            this.A = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.f6201n == null) {
            return false;
        }
        a(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        a1.b((Object) this.f6190b);
        this.f6190b.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        a1.b((Object) this.f6198k);
        this.f6198k.setControlDispatcher(r4Var);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f6210w = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f6211x = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6212y = z10;
        j();
    }

    public void setControllerShowTimeoutMs(int i10) {
        a1.b((Object) this.f6198k);
        this.f6209v = i10;
        if (this.f6198k.c()) {
            f();
        }
    }

    public void setControllerVisibilityListener(d.e eVar) {
        a1.b((Object) this.f6198k);
        d.e eVar2 = this.f6203p;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                this.f6198k.b(eVar2);
            }
            this.f6203p = eVar;
            if (eVar != null) {
                this.f6198k.a(eVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        a1.b(this.f6197j != null);
        this.f6208u = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f6205r != drawable) {
            this.f6205r = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(r7 r7Var) {
        if (r7Var != null) {
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f6207t != z10) {
            this.f6207t = z10;
            c(false);
        }
    }

    public void setPlayer(nh nhVar) {
        a1.b(Looper.myLooper() == Looper.getMainLooper());
        a1.a(nhVar == null || nhVar.p() == Looper.getMainLooper());
        nh nhVar2 = this.f6201n;
        if (nhVar2 != nhVar) {
            if (nhVar2 != null) {
                nhVar2.a((nh.e) this.f6189a);
                if (nhVar2.b(26)) {
                    View view = this.f6192d;
                    if (view instanceof TextureView) {
                        nhVar2.b((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        nhVar2.b((SurfaceView) view);
                    }
                }
            }
            SubtitleView subtitleView = this.f6195h;
            if (subtitleView != null) {
                subtitleView.setCues((List<z4>) null);
            }
            this.f6201n = nhVar;
            if (n()) {
                this.f6198k.setPlayer(nhVar);
            }
            i();
            l();
            c(true);
            if (nhVar != null) {
                if (nhVar.b(26)) {
                    View view2 = this.f6192d;
                    if (view2 instanceof TextureView) {
                        nhVar.a((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        nhVar.a((SurfaceView) view2);
                    }
                    h();
                }
                if (this.f6195h != null && nhVar.b(27)) {
                    this.f6195h.setCues(nhVar.x());
                }
                nhVar.b((nh.e) this.f6189a);
                a(false);
                return;
            }
            c();
        }
    }

    public void setRepeatToggleModes(int i10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        a1.b((Object) this.f6190b);
        this.f6190b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f6206s != i10) {
            this.f6206s = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        a1.b((Object) this.f6198k);
        this.f6198k.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f6191c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        a1.b(!z10 || this.f6194g != null);
        if (this.f6204q != z10) {
            this.f6204q = z10;
            c(false);
        }
    }

    public void setUseController(boolean z10) {
        a1.b(!z10 || this.f6198k != null);
        if (this.f6202o != z10) {
            this.f6202o = z10;
            if (n()) {
                this.f6198k.setPlayer(this.f6201n);
            } else {
                d dVar = this.f6198k;
                if (dVar != null) {
                    dVar.a();
                    this.f6198k.setPlayer((nh) null);
                }
            }
            j();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f6192d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    private final class a implements nh.e, View.OnLayoutChangeListener, View.OnClickListener, d.e {

        /* renamed from: a  reason: collision with root package name */
        private final go.b f6214a = new go.b();

        /* renamed from: b  reason: collision with root package name */
        private Object f6215b;

        public a() {
        }

        public /* synthetic */ void a(float f10) {
            vz.b(this, f10);
        }

        public /* synthetic */ void a(int i10) {
            vz.c(this, i10);
        }

        public /* synthetic */ void a(int i10, int i11) {
            vz.d(this, i10, i11);
        }

        public /* synthetic */ void a(go goVar, int i10) {
            vz.e(this, goVar, i10);
        }

        public /* synthetic */ void a(kh khVar) {
            vz.f(this, khVar);
        }

        public /* synthetic */ void a(mh mhVar) {
            vz.g(this, mhVar);
        }

        public /* synthetic */ void a(nh.b bVar) {
            vz.h(this, bVar);
        }

        public void a(nh.f fVar, nh.f fVar2, int i10) {
            if (e.this.d() && e.this.f6211x) {
                e.this.c();
            }
        }

        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            vz.j(this, nhVar, dVar);
        }

        public /* synthetic */ void a(od odVar, int i10) {
            vz.k(this, odVar, i10);
        }

        public /* synthetic */ void a(p6 p6Var) {
            vz.l(this, p6Var);
        }

        public /* synthetic */ void a(qd qdVar) {
            vz.m(this, qdVar);
        }

        public /* synthetic */ void a(we weVar) {
            vz.o(this, weVar);
        }

        public /* synthetic */ void a(boolean z10) {
            vz.r(this, z10);
        }

        public /* synthetic */ void b() {
            uz.l(this);
        }

        public void b(int i10) {
            e.this.i();
            e.this.l();
            e.this.k();
        }

        public /* synthetic */ void b(int i10, boolean z10) {
            vz.u(this, i10, z10);
        }

        public /* synthetic */ void b(kh khVar) {
            vz.v(this, khVar);
        }

        public /* synthetic */ void b(boolean z10) {
            vz.w(this, z10);
        }

        public /* synthetic */ void b(boolean z10, int i10) {
            uz.o(this, z10, i10);
        }

        public /* synthetic */ void c(int i10) {
            vz.x(this, i10);
        }

        public /* synthetic */ void c(boolean z10) {
            vz.y(this, z10);
        }

        public void d(int i10) {
            e.this.j();
        }

        public /* synthetic */ void d(boolean z10) {
            vz.z(this, z10);
        }

        public /* synthetic */ void e(int i10) {
            uz.s(this, i10);
        }

        public /* synthetic */ void e(boolean z10) {
            uz.t(this, z10);
        }

        public void onClick(View view) {
            boolean unused = e.this.g();
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            e.b((TextureView) view, e.this.f6213z);
        }

        public void a(qo qoVar, uo uoVar) {
            nh nhVar = (nh) a1.a((Object) e.this.f6201n);
            go n10 = nhVar.n();
            if (n10.c()) {
                this.f6215b = null;
            } else if (!nhVar.k().a()) {
                this.f6215b = n10.a(nhVar.v(), this.f6214a, true).f8053b;
            } else {
                Object obj = this.f6215b;
                if (obj != null) {
                    int a10 = n10.a(obj);
                    if (a10 == -1 || nhVar.t() != n10.a(a10, this.f6214a).f8054c) {
                        this.f6215b = null;
                    } else {
                        return;
                    }
                }
            }
            e.this.c(false);
        }

        public void a(yq yqVar) {
            e.this.h();
        }

        public void a(List list) {
            if (e.this.f6195h != null) {
                e.this.f6195h.setCues(list);
            }
        }

        public void a() {
            if (e.this.f6191c != null) {
                e.this.f6191c.setVisibility(4);
            }
        }

        public void a(boolean z10, int i10) {
            e.this.i();
            e.this.k();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(boolean z10) {
        if (n()) {
            this.f6198k.setShowTimeoutMs(z10 ? 0 : this.f6209v);
            this.f6198k.g();
        }
    }

    /* access modifiers changed from: private */
    public boolean d() {
        nh nhVar = this.f6201n;
        return nhVar != null && nhVar.d() && this.f6201n.l();
    }

    private boolean e() {
        nh nhVar = this.f6201n;
        if (nhVar == null) {
            return true;
        }
        int o10 = nhVar.o();
        if (!this.f6210w || (o10 != 1 && o10 != 4 && this.f6201n.l())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean g() {
        if (!n() || this.f6201n == null) {
            return false;
        }
        if (!this.f6198k.c()) {
            a(true);
        } else if (this.f6212y) {
            this.f6198k.a();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void h() {
        nh nhVar = this.f6201n;
        yq z10 = nhVar != null ? nhVar.z() : yq.f13677f;
        int i10 = z10.f13679a;
        int i11 = z10.f13680b;
        int i12 = z10.f13681c;
        float f10 = 0.0f;
        float f11 = (i11 == 0 || i10 == 0) ? 0.0f : (((float) i10) * z10.f13682d) / ((float) i11);
        View view = this.f6192d;
        if (view instanceof TextureView) {
            if (f11 > 0.0f && (i12 == 90 || i12 == 270)) {
                f11 = 1.0f / f11;
            }
            if (this.f6213z != 0) {
                view.removeOnLayoutChangeListener(this.f6189a);
            }
            this.f6213z = i12;
            if (i12 != 0) {
                this.f6192d.addOnLayoutChangeListener(this.f6189a);
            }
            b((TextureView) this.f6192d, this.f6213z);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6190b;
        if (!this.f6193f) {
            f10 = f11;
        }
        a(aspectRatioFrameLayout, f10);
    }

    /* access modifiers changed from: private */
    public void i() {
        int i10;
        if (this.f6196i != null) {
            nh nhVar = this.f6201n;
            boolean z10 = true;
            int i11 = 0;
            if (nhVar == null || nhVar.o() != 2 || ((i10 = this.f6206s) != 2 && (i10 != 1 || !this.f6201n.l()))) {
                z10 = false;
            }
            View view = this.f6196i;
            if (!z10) {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        d dVar = this.f6198k;
        String str = null;
        if (dVar == null || !this.f6202o) {
            setContentDescription((CharSequence) null);
        } else if (dVar.getVisibility() == 0) {
            if (this.f6212y) {
                str = getResources().getString(R.string.al_exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(R.string.al_exo_controls_show));
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        if (!d() || !this.f6211x) {
            a(false);
        } else {
            c();
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        TextView textView = this.f6197j;
        if (textView != null) {
            CharSequence charSequence = this.f6208u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f6197j.setVisibility(0);
                return;
            }
            nh nhVar = this.f6201n;
            if (nhVar != null) {
                nhVar.c();
            }
            this.f6197j.setVisibility(8);
        }
    }

    public void c() {
        d dVar = this.f6198k;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void f() {
        b(e());
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        a aVar = new a();
        this.f6189a = aVar;
        if (isInEditMode()) {
            this.f6190b = null;
            this.f6191c = null;
            this.f6192d = null;
            this.f6193f = false;
            this.f6194g = null;
            this.f6195h = null;
            this.f6196i = null;
            this.f6197j = null;
            this.f6198k = null;
            this.f6199l = null;
            this.f6200m = null;
            ImageView imageView = new ImageView(context2);
            if (yp.f13662a >= 23) {
                b(getResources(), imageView);
            } else {
                a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = R.layout.applovin_exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerView, i10, 0);
            try {
                int i18 = R.styleable.AppLovinPlayerView_al_shutter_background_color;
                boolean hasValue = obtainStyledAttributes.hasValue(i18);
                int color = obtainStyledAttributes.getColor(i18, 0);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i17);
                boolean z18 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i19 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i20 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i21 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                boolean z20 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                int i22 = resourceId;
                boolean z21 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                i15 = obtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                int i23 = i20;
                this.f6207t = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f6207t);
                boolean z22 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z13 = z20;
                z15 = z21;
                i16 = i23;
                z10 = z19;
                i12 = resourceId2;
                z11 = z18;
                z12 = hasValue;
                i13 = color;
                i14 = i19;
                boolean z23 = z22;
                i17 = i22;
                i11 = i21;
                z14 = z23;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;
            z15 = true;
            i16 = 0;
            z14 = true;
            i15 = 0;
            z13 = true;
            i14 = 1;
            i13 = 0;
            z12 = false;
            z11 = true;
            i12 = 0;
            z10 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.f6190b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i16);
        }
        View findViewById = findViewById(R.id.al_exo_shutter);
        this.f6191c = findViewById;
        if (findViewById != null && z12) {
            findViewById.setBackgroundColor(i13);
        }
        if (aspectRatioFrameLayout == null || i14 == 0) {
            this.f6192d = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                this.f6192d = new TextureView(context2);
            } else if (i14 == 3) {
                try {
                    this.f6192d = (View) Class.forName("com.applovin.impl.ok").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                    z17 = true;
                    this.f6192d.setLayoutParams(layoutParams);
                    this.f6192d.setOnClickListener(aVar);
                    this.f6192d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f6192d, 0);
                    z16 = z17;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i14 != 4) {
                this.f6192d = new SurfaceView(context2);
            } else {
                try {
                    this.f6192d = (View) Class.forName("com.applovin.impl.sq").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z17 = false;
            this.f6192d.setLayoutParams(layoutParams);
            this.f6192d.setOnClickListener(aVar);
            this.f6192d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f6192d, 0);
            z16 = z17;
        }
        this.f6193f = z16;
        this.f6199l = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.f6200m = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f6194g = imageView2;
        this.f6204q = z11 && imageView2 != null;
        if (i12 != 0) {
            this.f6205r = androidx.core.content.a.getDrawable(getContext(), i12);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f6195h = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        View findViewById2 = findViewById(R.id.al_exo_buffering);
        this.f6196i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f6206s = i15;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.f6197j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i24 = R.id.al_exo_controller;
        d dVar = (d) findViewById(i24);
        View findViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (dVar != null) {
            this.f6198k = dVar;
        } else if (findViewById3 != null) {
            d dVar2 = new d(context2, (AttributeSet) null, 0, attributeSet2);
            this.f6198k = dVar2;
            dVar2.setId(i24);
            dVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(dVar2, indexOfChild);
        } else {
            this.f6198k = null;
        }
        d dVar3 = this.f6198k;
        this.f6209v = dVar3 != null ? i11 : 0;
        this.f6212y = z13;
        this.f6210w = z15;
        this.f6211x = z14;
        this.f6202o = z10 && dVar3 != null;
        c();
        j();
        d dVar4 = this.f6198k;
        if (dVar4 != null) {
            dVar4.a((d.e) aVar);
        }
    }

    /* access modifiers changed from: private */
    public void c(boolean z10) {
        nh nhVar = this.f6201n;
        if (nhVar != null && !nhVar.k().a()) {
            if (z10 && !this.f6207t) {
                a();
            }
            uo A2 = nhVar.A();
            for (int i10 = 0; i10 < A2.f12625a; i10++) {
                to a10 = A2.a(i10);
                if (a10 != null) {
                    for (int i11 = 0; i11 < a10.b(); i11++) {
                        if (df.e(a10.a(i11).f7153m) == 2) {
                            b();
                            return;
                        }
                    }
                    continue;
                }
            }
            a();
            if (!m() || (!a(nhVar.C()) && !a(this.f6205r))) {
                b();
            }
        } else if (!this.f6207t) {
            b();
            a();
        }
    }

    private void b() {
        ImageView imageView = this.f6194g;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f6194g.setVisibility(4);
        }
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, (Resources.Theme) null));
    }

    public boolean a(KeyEvent keyEvent) {
        return n() && this.f6198k.a(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    private void a(boolean z10) {
        if ((!d() || !this.f6211x) && n()) {
            boolean z11 = this.f6198k.c() && this.f6198k.getShowTimeoutMs() <= 0;
            boolean e10 = e();
            if (z10 || z11 || e10) {
                b(e10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i10 == 0)) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate((float) i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.f6190b, ((float) intrinsicWidth) / ((float) intrinsicHeight));
                this.f6194g.setImageDrawable(drawable);
                this.f6194g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void a() {
        View view = this.f6191c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }
}
