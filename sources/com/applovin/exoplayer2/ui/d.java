package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.a1;
import com.applovin.impl.d8;
import com.applovin.impl.go;
import com.applovin.impl.kh;
import com.applovin.impl.mh;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.p6;
import com.applovin.impl.pi;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r2;
import com.applovin.impl.r4;
import com.applovin.impl.s5;
import com.applovin.impl.uo;
import com.applovin.impl.uz;
import com.applovin.impl.vz;
import com.applovin.impl.we;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.sdk.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class d extends FrameLayout {
    private final String A;
    private final Drawable B;
    private final Drawable C;
    private final float D;
    private final float E;
    private final String F;
    private final String G;
    /* access modifiers changed from: private */
    public nh H;
    /* access modifiers changed from: private */
    public r4 I;
    private boolean J;
    private boolean K;
    private boolean L;
    /* access modifiers changed from: private */
    public boolean M;
    private int N = UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;
    private int O = 200;
    /* access modifiers changed from: private */
    public int P = 0;
    private boolean Q = true;
    private boolean R = true;
    private boolean S = true;
    private boolean T = true;
    private boolean U = false;
    private long V = -9223372036854775807L;
    private long[] W;

    /* renamed from: a  reason: collision with root package name */
    private final c f6157a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean[] f6158a0;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f6159b;

    /* renamed from: b0  reason: collision with root package name */
    private long[] f6160b0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final View f6161c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean[] f6162c0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final View f6163d;

    /* renamed from: d0  reason: collision with root package name */
    private long f6164d0;

    /* renamed from: e0  reason: collision with root package name */
    private long f6165e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final View f6166f;

    /* renamed from: f0  reason: collision with root package name */
    private long f6167f0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final View f6168g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final View f6169h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final View f6170i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f6171j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f6172k;

    /* renamed from: l  reason: collision with root package name */
    private final View f6173l;

    /* renamed from: m  reason: collision with root package name */
    private final TextView f6174m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final TextView f6175n;

    /* renamed from: o  reason: collision with root package name */
    private final i f6176o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final StringBuilder f6177p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Formatter f6178q;

    /* renamed from: r  reason: collision with root package name */
    private final go.b f6179r;

    /* renamed from: s  reason: collision with root package name */
    private final go.d f6180s;

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f6181t;

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f6182u;

    /* renamed from: v  reason: collision with root package name */
    private final Drawable f6183v;

    /* renamed from: w  reason: collision with root package name */
    private final Drawable f6184w;

    /* renamed from: x  reason: collision with root package name */
    private final Drawable f6185x;

    /* renamed from: y  reason: collision with root package name */
    private final String f6186y;

    /* renamed from: z  reason: collision with root package name */
    private final String f6187z;

    private static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.d$d  reason: collision with other inner class name */
    public interface C0112d {
    }

    public interface e {
        void d(int i10);
    }

    static {
        d8.a("goog.exo.ui");
    }

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11 = R.layout.applovin_exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i10, 0);
            try {
                this.N = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                i11 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, i11);
                this.P = a(obtainStyledAttributes, this.P);
                this.Q = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6159b = new CopyOnWriteArrayList();
        this.f6179r = new go.b();
        this.f6180s = new go.d();
        StringBuilder sb2 = new StringBuilder();
        this.f6177p = sb2;
        this.f6178q = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f6158a0 = new boolean[0];
        this.f6160b0 = new long[0];
        this.f6162c0 = new boolean[0];
        c cVar = new c();
        this.f6157a = cVar;
        this.I = new s5();
        this.f6181t = new n(this);
        this.f6182u = new m(this);
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        int i12 = R.id.al_exo_progress;
        i iVar = (i) findViewById(i12);
        View findViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (iVar != null) {
            this.f6176o = iVar;
        } else if (findViewById != null) {
            b bVar = new b(context, (AttributeSet) null, 0, attributeSet2);
            bVar.setId(i12);
            bVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bVar, indexOfChild);
            this.f6176o = bVar;
        } else {
            this.f6176o = null;
        }
        this.f6174m = (TextView) findViewById(R.id.al_exo_duration);
        this.f6175n = (TextView) findViewById(R.id.al_exo_position);
        i iVar2 = this.f6176o;
        if (iVar2 != null) {
            iVar2.a(cVar);
        }
        View findViewById2 = findViewById(R.id.al_exo_play);
        this.f6166f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(R.id.al_exo_pause);
        this.f6168g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(R.id.al_exo_prev);
        this.f6161c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(R.id.al_exo_next);
        this.f6163d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(R.id.al_exo_rew);
        this.f6170i = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(R.id.al_exo_ffwd);
        this.f6169h = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.f6171j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.f6172k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View findViewById8 = findViewById(R.id.al_exo_vr);
        this.f6173l = findViewById8;
        setShowVrButton(false);
        a(false, false, findViewById8);
        Resources resources = context.getResources();
        this.D = ((float) resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.E = ((float) resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.f6183v = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.f6184w = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.f6185x = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.C = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.f6186y = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.f6187z = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.A = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.G = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    private static boolean a(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f6182u);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public nh getPlayer() {
        return this.H;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.f6173l;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j10 = this.V;
        if (j10 != -9223372036854775807L) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.f6182u, uptimeMillis);
            }
        } else if (c()) {
            b();
        }
        h();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.f6181t);
        removeCallbacks(this.f6182u);
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        if (this.I != r4Var) {
            this.I = r4Var;
            i();
        }
    }

    public void setPlayer(nh nhVar) {
        boolean z10 = true;
        a1.b(Looper.myLooper() == Looper.getMainLooper());
        if (!(nhVar == null || nhVar.p() == Looper.getMainLooper())) {
            z10 = false;
        }
        a1.a(z10);
        nh nhVar2 = this.H;
        if (nhVar2 != nhVar) {
            if (nhVar2 != null) {
                nhVar2.a((nh.e) this.f6157a);
            }
            this.H = nhVar;
            if (nhVar != null) {
                nhVar.b((nh.e) this.f6157a);
            }
            h();
        }
    }

    public void setProgressUpdateListener(C0112d dVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.P = i10;
        nh nhVar = this.H;
        if (nhVar != null) {
            int m10 = nhVar.m();
            if (i10 == 0 && m10 != 0) {
                this.I.a(this.H, 0);
            } else if (i10 == 1 && m10 == 2) {
                this.I.a(this.H, 1);
            } else if (i10 == 2 && m10 == 1) {
                this.I.a(this.H, 2);
            }
        }
        l();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        i();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        n();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        i();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        i();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        i();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        m();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f6173l;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.O = yp.a(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f6173l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.f6173l);
        }
    }

    /* access modifiers changed from: private */
    public void b(nh nhVar) {
        int o10 = nhVar.o();
        if (o10 == 1) {
            this.I.b(nhVar);
        } else if (o10 == 4) {
            a(nhVar, nhVar.t(), -9223372036854775807L);
        }
        this.I.b(nhVar, true);
    }

    private void c(nh nhVar) {
        int o10 = nhVar.o();
        if (o10 == 1 || o10 == 4 || !nhVar.l()) {
            b(nhVar);
        } else {
            a(nhVar);
        }
    }

    private void d() {
        View view;
        View view2;
        boolean f10 = f();
        if (!f10 && (view2 = this.f6166f) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (f10 && (view = this.f6168g) != null) {
            view.sendAccessibilityEvent(8);
        }
    }

    private void e() {
        View view;
        View view2;
        boolean f10 = f();
        if (!f10 && (view2 = this.f6166f) != null) {
            view2.requestFocus();
        } else if (f10 && (view = this.f6168g) != null) {
            view.requestFocus();
        }
    }

    private boolean f() {
        nh nhVar = this.H;
        if (nhVar == null || nhVar.o() == 4 || this.H.o() == 1 || !this.H.l()) {
            return false;
        }
        return true;
    }

    private void h() {
        j();
        i();
        l();
        m();
        n();
    }

    /* access modifiers changed from: private */
    public void i() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (c() && this.J) {
            nh nhVar = this.H;
            boolean z14 = false;
            if (nhVar != null) {
                boolean b10 = nhVar.b(4);
                boolean b11 = nhVar.b(6);
                z10 = nhVar.b(10) && this.I.b();
                if (nhVar.b(11) && this.I.a()) {
                    z14 = true;
                }
                boolean z15 = b10;
                z12 = nhVar.b(8);
                z13 = z14;
                z14 = b11;
                z11 = z15;
            } else {
                z13 = false;
                z12 = false;
                z11 = false;
                z10 = false;
            }
            a(this.S, z14, this.f6161c);
            a(this.Q, z10, this.f6170i);
            a(this.R, z13, this.f6169h);
            a(this.T, z12, this.f6163d);
            i iVar = this.f6176o;
            if (iVar != null) {
                iVar.setEnabled(z11);
            }
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        boolean z10;
        boolean z11;
        if (c() && this.J) {
            boolean f10 = f();
            View view = this.f6166f;
            int i10 = 8;
            boolean z12 = true;
            if (view != null) {
                z11 = f10 && view.isFocused();
                if (yp.f13662a < 21) {
                    z10 = z11;
                } else {
                    z10 = f10 && b.a(this.f6166f);
                }
                this.f6166f.setVisibility(f10 ? 8 : 0);
            } else {
                z11 = false;
                z10 = false;
            }
            View view2 = this.f6168g;
            if (view2 != null) {
                z11 |= !f10 && view2.isFocused();
                if (yp.f13662a < 21) {
                    z12 = z11;
                } else if (f10 || !b.a(this.f6168g)) {
                    z12 = false;
                }
                z10 |= z12;
                View view3 = this.f6168g;
                if (f10) {
                    i10 = 0;
                }
                view3.setVisibility(i10);
            }
            if (z11) {
                e();
            }
            if (z10) {
                d();
            }
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        long j10;
        int i10;
        if (c() && this.J) {
            nh nhVar = this.H;
            long j11 = 0;
            if (nhVar != null) {
                j11 = this.f6164d0 + nhVar.g();
                j10 = this.f6164d0 + nhVar.s();
            } else {
                j10 = 0;
            }
            boolean z10 = j11 != this.f6165e0;
            this.f6165e0 = j11;
            this.f6167f0 = j10;
            TextView textView = this.f6175n;
            if (textView != null && !this.M && z10) {
                textView.setText(yp.a(this.f6177p, this.f6178q, j11));
            }
            i iVar = this.f6176o;
            if (iVar != null) {
                iVar.setPosition(j11);
                this.f6176o.setBufferedPosition(j10);
            }
            removeCallbacks(this.f6181t);
            if (nhVar == null) {
                i10 = 1;
            } else {
                i10 = nhVar.o();
            }
            long j12 = 1000;
            if (nhVar != null && nhVar.isPlaying()) {
                i iVar2 = this.f6176o;
                long min = Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000, 1000 - (j11 % 1000));
                float f10 = nhVar.a().f9804a;
                if (f10 > 0.0f) {
                    j12 = (long) (((float) min) / f10);
                }
                postDelayed(this.f6181t, yp.b(j12, (long) this.O, 1000));
            } else if (i10 != 4 && i10 != 1) {
                postDelayed(this.f6181t, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.f6171j) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            nh nhVar = this.H;
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.f6171j.setImageDrawable(this.f6183v);
                this.f6171j.setContentDescription(this.f6186y);
                return;
            }
            a(true, true, (View) imageView);
            int m10 = nhVar.m();
            if (m10 == 0) {
                this.f6171j.setImageDrawable(this.f6183v);
                this.f6171j.setContentDescription(this.f6186y);
            } else if (m10 == 1) {
                this.f6171j.setImageDrawable(this.f6184w);
                this.f6171j.setContentDescription(this.f6187z);
            } else if (m10 == 2) {
                this.f6171j.setImageDrawable(this.f6185x);
                this.f6171j.setContentDescription(this.A);
            }
            this.f6171j.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        ImageView imageView;
        String str;
        if (c() && this.J && (imageView = this.f6172k) != null) {
            nh nhVar = this.H;
            if (!this.U) {
                a(false, false, (View) imageView);
            } else if (nhVar == null) {
                a(true, false, (View) imageView);
                this.f6172k.setImageDrawable(this.C);
                this.f6172k.setContentDescription(this.G);
            } else {
                a(true, true, (View) imageView);
                this.f6172k.setImageDrawable(nhVar.r() ? this.B : this.C);
                ImageView imageView2 = this.f6172k;
                if (nhVar.r()) {
                    str = this.F;
                } else {
                    str = this.G;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        int i10;
        go.d dVar;
        nh nhVar = this.H;
        if (nhVar != null) {
            boolean z10 = true;
            this.L = this.K && a(nhVar.n(), this.f6180s);
            long j10 = 0;
            this.f6164d0 = 0;
            go n10 = nhVar.n();
            if (!n10.c()) {
                int t10 = nhVar.t();
                boolean z11 = this.L;
                int i11 = z11 ? 0 : t10;
                int b10 = z11 ? n10.b() - 1 : t10;
                long j11 = 0;
                i10 = 0;
                while (true) {
                    if (i11 > b10) {
                        break;
                    }
                    if (i11 == t10) {
                        this.f6164d0 = r2.b(j11);
                    }
                    n10.a(i11, this.f6180s);
                    go.d dVar2 = this.f6180s;
                    if (dVar2.f8080o == -9223372036854775807L) {
                        a1.b(this.L ^ z10);
                        break;
                    }
                    int i12 = dVar2.f8081p;
                    while (true) {
                        dVar = this.f6180s;
                        if (i12 > dVar.f8082q) {
                            break;
                        }
                        n10.a(i12, this.f6179r);
                        int a10 = this.f6179r.a();
                        for (int f10 = this.f6179r.f(); f10 < a10; f10++) {
                            long b11 = this.f6179r.b(f10);
                            if (b11 == Long.MIN_VALUE) {
                                long j12 = this.f6179r.f8055d;
                                if (j12 == -9223372036854775807L) {
                                } else {
                                    b11 = j12;
                                }
                            }
                            long e10 = b11 + this.f6179r.e();
                            if (e10 >= 0) {
                                long[] jArr = this.W;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.W = Arrays.copyOf(jArr, length);
                                    this.f6158a0 = Arrays.copyOf(this.f6158a0, length);
                                }
                                this.W[i10] = r2.b(j11 + e10);
                                this.f6158a0[i10] = this.f6179r.e(f10);
                                i10++;
                            }
                        }
                        i12++;
                    }
                    j11 += dVar.f8080o;
                    i11++;
                    z10 = true;
                }
                j10 = j11;
            } else {
                i10 = 0;
            }
            long b12 = r2.b(j10);
            TextView textView = this.f6174m;
            if (textView != null) {
                textView.setText(yp.a(this.f6177p, this.f6178q, b12));
            }
            i iVar = this.f6176o;
            if (iVar != null) {
                iVar.setDuration(b12);
                int length2 = this.f6160b0.length;
                int i13 = i10 + length2;
                long[] jArr2 = this.W;
                if (i13 > jArr2.length) {
                    this.W = Arrays.copyOf(jArr2, i13);
                    this.f6158a0 = Arrays.copyOf(this.f6158a0, i13);
                }
                System.arraycopy(this.f6160b0, 0, this.W, i10, length2);
                System.arraycopy(this.f6162c0, 0, this.f6158a0, i10, length2);
                this.f6176o.a(this.W, this.f6158a0, i13);
            }
            k();
        }
    }

    public void g() {
        if (!c()) {
            setVisibility(0);
            Iterator it = this.f6159b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            h();
            e();
            d();
        }
        b();
    }

    private static boolean a(go goVar, go.d dVar) {
        if (goVar.b() > 100) {
            return false;
        }
        int b10 = goVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (goVar.a(i10, dVar).f8080o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void a(nh nhVar) {
        this.I.b(nhVar, false);
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    private boolean a(nh nhVar, int i10, long j10) {
        return this.I.a(nhVar, i10, j10);
    }

    public void b(e eVar) {
        this.f6159b.remove(eVar);
    }

    /* access modifiers changed from: private */
    public void a(nh nhVar, long j10) {
        int i10;
        go n10 = nhVar.n();
        if (this.L && !n10.c()) {
            int b10 = n10.b();
            i10 = 0;
            while (true) {
                long d10 = n10.a(i10, this.f6180s).d();
                if (j10 < d10) {
                    break;
                } else if (i10 == b10 - 1) {
                    j10 = d10;
                    break;
                } else {
                    j10 -= d10;
                    i10++;
                }
            }
        } else {
            i10 = nhVar.t();
        }
        a(nhVar, i10, j10);
        k();
    }

    private void b() {
        removeCallbacks(this.f6182u);
        if (this.N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j10 = (long) this.N;
            this.V = uptimeMillis + j10;
            if (this.J) {
                postDelayed(this.f6182u, j10);
                return;
            }
            return;
        }
        this.V = -9223372036854775807L;
    }

    private final class c implements nh.e, i.a, View.OnClickListener {
        private c() {
        }

        public /* synthetic */ void a() {
            vz.a(this);
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

        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i10) {
            vz.i(this, fVar, fVar2, i10);
        }

        public void a(nh nhVar, nh.d dVar) {
            if (dVar.a(4, 5)) {
                d.this.j();
            }
            if (dVar.a(4, 5, 7)) {
                d.this.k();
            }
            if (dVar.a(8)) {
                d.this.l();
            }
            if (dVar.a(9)) {
                d.this.m();
            }
            if (dVar.a(8, 9, 11, 0, 13)) {
                d.this.i();
            }
            if (dVar.a(11, 0)) {
                d.this.n();
            }
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

        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            vz.n(this, qoVar, uoVar);
        }

        public /* synthetic */ void a(we weVar) {
            vz.o(this, weVar);
        }

        public /* synthetic */ void a(yq yqVar) {
            vz.p(this, yqVar);
        }

        public /* synthetic */ void a(List list) {
            vz.q(this, list);
        }

        public /* synthetic */ void a(boolean z10) {
            vz.r(this, z10);
        }

        public /* synthetic */ void a(boolean z10, int i10) {
            vz.s(this, z10, i10);
        }

        public /* synthetic */ void b() {
            uz.l(this);
        }

        public /* synthetic */ void b(int i10) {
            vz.t(this, i10);
        }

        public /* synthetic */ void b(int i10, boolean z10) {
            vz.u(this, i10, z10);
        }

        public void b(i iVar, long j10) {
            if (d.this.f6175n != null) {
                d.this.f6175n.setText(yp.a(d.this.f6177p, d.this.f6178q, j10));
            }
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
            nh c10 = d.this.H;
            if (c10 != null) {
                if (d.this.f6163d == view) {
                    d.this.I.a(c10);
                } else if (d.this.f6161c == view) {
                    d.this.I.e(c10);
                } else if (d.this.f6169h == view) {
                    if (c10.o() != 4) {
                        d.this.I.d(c10);
                    }
                } else if (d.this.f6170i == view) {
                    d.this.I.c(c10);
                } else if (d.this.f6166f == view) {
                    d.this.b(c10);
                } else if (d.this.f6168g == view) {
                    d.this.a(c10);
                } else if (d.this.f6171j == view) {
                    d.this.I.a(c10, pi.a(c10.m(), d.this.P));
                } else if (d.this.f6172k == view) {
                    d.this.I.a(c10, !c10.r());
                }
            }
        }

        public void a(i iVar, long j10) {
            boolean unused = d.this.M = true;
            if (d.this.f6175n != null) {
                d.this.f6175n.setText(yp.a(d.this.f6177p, d.this.f6178q, j10));
            }
        }

        public void a(i iVar, long j10, boolean z10) {
            boolean unused = d.this.M = false;
            if (!z10 && d.this.H != null) {
                d dVar = d.this;
                dVar.a(dVar.H, j10);
            }
        }
    }

    public void a(e eVar) {
        a1.a((Object) eVar);
        this.f6159b.add(eVar);
    }

    public void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.f6159b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            removeCallbacks(this.f6181t);
            removeCallbacks(this.f6182u);
            this.V = -9223372036854775807L;
        }
    }

    private void a(boolean z10, boolean z11, View view) {
        if (view != null) {
            view.setEnabled(z11);
            view.setAlpha(z11 ? this.D : this.E);
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        nh nhVar = this.H;
        if (nhVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (nhVar.o() == 4) {
                return true;
            }
            this.I.d(nhVar);
            return true;
        } else if (keyCode == 89) {
            this.I.c(nhVar);
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                c(nhVar);
                return true;
            } else if (keyCode == 87) {
                this.I.a(nhVar);
                return true;
            } else if (keyCode == 88) {
                this.I.e(nhVar);
                return true;
            } else if (keyCode == 126) {
                b(nhVar);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                a(nhVar);
                return true;
            }
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i10);
    }
}
