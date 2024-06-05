package io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.applovin.mediation.MaxReward;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kc.a;

/* compiled from: AccessibilityBridge */
public class c extends AccessibilityNodeProvider {
    /* access modifiers changed from: private */
    public static final int A = (((((((((((i.HAS_CHECKED_STATE.f34608a | i.IS_CHECKED.f34608a) | i.IS_SELECTED.f34608a) | i.IS_TEXT_FIELD.f34608a) | i.IS_FOCUSED.f34608a) | i.HAS_ENABLED_STATE.f34608a) | i.IS_ENABLED.f34608a) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f34608a) | i.HAS_TOGGLED_STATE.f34608a) | i.IS_TOGGLED.f34608a) | i.IS_FOCUSABLE.f34608a) | i.IS_SLIDER.f34608a);
    private static int B = 267386881;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final int f34514z = (((g.SCROLL_RIGHT.f34578a | g.SCROLL_LEFT.f34578a) | g.SCROLL_UP.f34578a) | g.SCROLL_DOWN.f34578a);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f34515a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final kc.a f34516b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f34517c;

    /* renamed from: d  reason: collision with root package name */
    private final AccessibilityViewEmbedder f34518d;

    /* renamed from: e  reason: collision with root package name */
    private final io.flutter.plugin.platform.k f34519e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f34520f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, l> f34521g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, h> f34522h;

    /* renamed from: i  reason: collision with root package name */
    private l f34523i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f34524j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f34525k;

    /* renamed from: l  reason: collision with root package name */
    private int f34526l;

    /* renamed from: m  reason: collision with root package name */
    private l f34527m;

    /* renamed from: n  reason: collision with root package name */
    private l f34528n;

    /* renamed from: o  reason: collision with root package name */
    private l f34529o;

    /* renamed from: p  reason: collision with root package name */
    private final List<Integer> f34530p;

    /* renamed from: q  reason: collision with root package name */
    private int f34531q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f34532r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public k f34533s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f34534t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f34535u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final a.b f34536v;

    /* renamed from: w  reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f34537w;

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f34538x;

    /* renamed from: y  reason: collision with root package name */
    private final ContentObserver f34539y;

    /* compiled from: AccessibilityBridge */
    class a implements a.b {
        a() {
        }

        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer order : byteBufferArr) {
                order.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.b0(byteBuffer, strArr, byteBufferArr);
        }

        public void b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.a0(byteBuffer, strArr);
        }

        public void c(int i10) {
            c.this.R(i10, 1);
        }

        public void d(String str) {
            c.this.f34515a.announceForAccessibility(str);
        }

        public void e(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityEvent i10 = c.this.H(0, 32);
                i10.getText().add(str);
                c.this.S(i10);
            }
        }

        public void f(int i10) {
            c.this.R(i10, 8);
        }

        public void g(int i10) {
            c.this.R(i10, 2);
        }
    }

    /* compiled from: AccessibilityBridge */
    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        public void onAccessibilityStateChanged(boolean z10) {
            if (!c.this.f34535u) {
                if (z10) {
                    c.this.f34516b.g(c.this.f34536v);
                    c.this.f34516b.e();
                } else {
                    c.this.W(false);
                    c.this.f34516b.g((a.b) null);
                    c.this.f34516b.d();
                }
                if (c.this.f34533s != null) {
                    c.this.f34533s.a(z10, c.this.f34517c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityBridge */
    class C0393c extends ContentObserver {
        C0393c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z10) {
            onChange(z10, (Uri) null);
        }

        public void onChange(boolean z10, Uri uri) {
            String str;
            if (!c.this.f34535u) {
                if (Build.VERSION.SDK_INT < 17) {
                    str = null;
                } else {
                    str = Settings.Global.getString(c.this.f34520f, "transition_animation_scale");
                }
                if (str != null && str.equals("0")) {
                    c.f(c.this, f.DISABLE_ANIMATIONS.f34554a);
                } else {
                    c.e(c.this, ~f.DISABLE_ANIMATIONS.f34554a);
                }
                c.this.T();
            }
        }
    }

    /* compiled from: AccessibilityBridge */
    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f34543a;

        d(AccessibilityManager accessibilityManager) {
            this.f34543a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            if (!c.this.f34535u) {
                if (!z10) {
                    c.this.W(false);
                    c.this.L();
                }
                if (c.this.f34533s != null) {
                    c.this.f34533s.a(this.f34543a.isEnabled(), z10);
                }
            }
        }
    }

    /* compiled from: AccessibilityBridge */
    static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34545a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.c$o[] r0 = io.flutter.view.c.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34545a = r0
                io.flutter.view.c$o r1 = io.flutter.view.c.o.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34545a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.c$o r1 = io.flutter.view.c.o.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.e.<clinit>():void");
        }
    }

    /* compiled from: AccessibilityBridge */
    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: a  reason: collision with root package name */
        final int f34554a;

        private f(int i10) {
            this.f34554a = i10;
        }
    }

    /* compiled from: AccessibilityBridge */
    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f34578a;

        private g(int i10) {
            this.f34578a = i10;
        }
    }

    /* compiled from: AccessibilityBridge */
    private static class h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f34579a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f34580b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f34581c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f34582d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f34583e;

        h() {
        }
    }

    /* compiled from: AccessibilityBridge */
    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        

        /* renamed from: a  reason: collision with root package name */
        final int f34608a;

        private i(int i10) {
            this.f34608a = i10;
        }
    }

    /* compiled from: AccessibilityBridge */
    private static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        String f34609d;

        private j() {
            super((a) null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* compiled from: AccessibilityBridge */
    public interface k {
        void a(boolean z10, boolean z11);
    }

    /* compiled from: AccessibilityBridge */
    private static class l {
        private p A;
        /* access modifiers changed from: private */
        public boolean B = false;
        private int C;
        private int D;
        /* access modifiers changed from: private */
        public int E;
        /* access modifiers changed from: private */
        public int F;
        private float G;
        private float H;
        private float I;
        /* access modifiers changed from: private */
        public String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        /* access modifiers changed from: private */
        public l Q;
        /* access modifiers changed from: private */
        public List<l> R = new ArrayList();
        /* access modifiers changed from: private */
        public List<l> S = new ArrayList();
        /* access modifiers changed from: private */
        public List<h> T;
        /* access modifiers changed from: private */
        public h U;
        /* access modifiers changed from: private */
        public h V;
        /* access modifiers changed from: private */
        public boolean W = true;
        private float[] X;
        /* access modifiers changed from: private */
        public boolean Y = true;
        private float[] Z;

        /* renamed from: a  reason: collision with root package name */
        final c f34610a;

        /* renamed from: a0  reason: collision with root package name */
        private Rect f34611a0;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f34612b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f34613c;

        /* renamed from: d  reason: collision with root package name */
        private int f34614d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f34615e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f34616f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f34617g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f34618h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f34619i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f34620j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f34621k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public float f34622l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public float f34623m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public float f34624n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public String f34625o;

        /* renamed from: p  reason: collision with root package name */
        private List<n> f34626p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public String f34627q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public List<n> f34628r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public String f34629s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public List<n> f34630t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public String f34631u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public List<n> f34632v;

        /* renamed from: w  reason: collision with root package name */
        private String f34633w;

        /* renamed from: x  reason: collision with root package name */
        private List<n> f34634x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public String f34635y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public int f34636z = -1;

        l(c cVar) {
            this.f34610a = cVar;
        }

        /* access modifiers changed from: private */
        public static boolean A0(l lVar, bd.d<l> dVar) {
            return (lVar == null || lVar.j0(dVar) == null) ? false : true;
        }

        private void B0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        public void C0(float[] fArr, Set<l> set, boolean z10) {
            set.add(this);
            if (this.Y) {
                z10 = true;
            }
            if (z10) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                if (this.P == null) {
                    this.P = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.L;
                fArr2[1] = this.M;
                B0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                B0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                B0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                B0(fArr6, this.Z, fArr2);
                if (this.f34611a0 == null) {
                    this.f34611a0 = new Rect();
                }
                this.f34611a0.set(Math.round(z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(y0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(y0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i10 = -1;
            for (l next : this.R) {
                next.f34636z = i10;
                i10 = next.f34612b;
                next.C0(this.Z, set, z10);
            }
        }

        /* access modifiers changed from: private */
        public void D0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            this.B = true;
            this.J = this.f34627q;
            this.K = this.f34625o;
            this.C = this.f34613c;
            this.D = this.f34614d;
            this.E = this.f34617g;
            this.F = this.f34618h;
            this.G = this.f34622l;
            this.H = this.f34623m;
            this.I = this.f34624n;
            this.f34613c = byteBuffer.getInt();
            this.f34614d = byteBuffer.getInt();
            this.f34615e = byteBuffer.getInt();
            this.f34616f = byteBuffer.getInt();
            this.f34617g = byteBuffer.getInt();
            this.f34618h = byteBuffer.getInt();
            this.f34619i = byteBuffer.getInt();
            this.f34620j = byteBuffer.getInt();
            this.f34621k = byteBuffer.getInt();
            this.f34622l = byteBuffer.getFloat();
            this.f34623m = byteBuffer.getFloat();
            this.f34624n = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                str = null;
            } else {
                str = strArr[i10];
            }
            this.f34625o = str;
            this.f34626p = o0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            if (i11 == -1) {
                str2 = null;
            } else {
                str2 = strArr[i11];
            }
            this.f34627q = str2;
            this.f34628r = o0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            if (i12 == -1) {
                str3 = null;
            } else {
                str3 = strArr[i12];
            }
            this.f34629s = str3;
            this.f34630t = o0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            if (i13 == -1) {
                str4 = null;
            } else {
                str4 = strArr[i13];
            }
            this.f34631u = str4;
            this.f34632v = o0(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            if (i14 == -1) {
                str5 = null;
            } else {
                str5 = strArr[i14];
            }
            this.f34633w = str5;
            this.f34634x = o0(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            if (i15 == -1) {
                str6 = null;
            } else {
                str6 = strArr[i15];
            }
            this.f34635y = str6;
            this.A = p.a(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                this.P[i16] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i17 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                l n10 = this.f34610a.z(byteBuffer.getInt());
                n10.Q = this;
                this.R.add(n10);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                l n11 = this.f34610a.z(byteBuffer.getInt());
                n11.Q = this;
                this.S.add(n11);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i20);
            } else {
                list.clear();
            }
            for (int i21 = 0; i21 < i20; i21++) {
                h o10 = this.f34610a.y(byteBuffer.getInt());
                if (o10.f34581c == g.TAP.f34578a) {
                    this.U = o10;
                } else if (o10.f34581c == g.LONG_PRESS.f34578a) {
                    this.V = o10;
                } else {
                    this.T.add(o10);
                }
                this.T.add(o10);
            }
        }

        /* access modifiers changed from: private */
        public void e0(List<l> list) {
            if (v0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l e02 : this.R) {
                e02.e0(list);
            }
        }

        private SpannableString f0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n next : list) {
                    int i10 = e.f34545a[next.f34639c.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.f34637a, next.f34638b, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) next).f34609d)), next.f34637a, next.f34638b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        public boolean g0() {
            String str;
            String str2 = this.f34625o;
            if (str2 == null && this.K == null) {
                return false;
            }
            if (str2 == null || (str = this.K) == null || !str2.equals(str)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public boolean h0() {
            return !Float.isNaN(this.f34622l) && !Float.isNaN(this.G) && this.G != this.f34622l;
        }

        private void i0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (!Matrix.invertM(this.X, 0, this.P, 0)) {
                    Arrays.fill(this.X, 0.0f);
                }
            }
        }

        private l j0(bd.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public Rect k0() {
            return this.f34611a0;
        }

        private CharSequence l0() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.f34633w;
            }
            return f0(this.f34633w, this.f34634x);
        }

        static /* synthetic */ int m(l lVar, int i10) {
            int i11 = lVar.f34618h + i10;
            lVar.f34618h = i11;
            return i11;
        }

        private CharSequence m0() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.f34625o;
            }
            return f0(this.f34625o, this.f34626p);
        }

        static /* synthetic */ int n(l lVar, int i10) {
            int i11 = lVar.f34618h - i10;
            lVar.f34618h = i11;
            return i11;
        }

        /* access modifiers changed from: private */
        public String n0() {
            String str;
            if (v0(i.NAMES_ROUTE) && (str = this.f34625o) != null && !str.isEmpty()) {
                return this.f34625o;
            }
            for (l n02 : this.R) {
                String n03 = n02.n0();
                if (n03 != null && !n03.isEmpty()) {
                    return n03;
                }
            }
            return null;
        }

        private List<n> o0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i14 = e.f34545a[oVar.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m((a) null);
                    mVar.f34637a = i12;
                    mVar.f34638b = i13;
                    mVar.f34639c = oVar;
                    arrayList.add(mVar);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j((a) null);
                    jVar.f34637a = i12;
                    jVar.f34638b = i13;
                    jVar.f34639c = oVar;
                    jVar.f34609d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public CharSequence p0() {
            CharSequence[] charSequenceArr = {m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public CharSequence q0() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.f34627q;
            }
            return f0(this.f34627q, this.f34628r);
        }

        /* access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {q0(), m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public boolean s0(g gVar) {
            return (gVar.f34578a & this.D) != 0;
        }

        /* access modifiers changed from: private */
        public boolean t0(i iVar) {
            return (iVar.f34608a & this.C) != 0;
        }

        /* access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.f34578a & this.f34614d) != 0;
        }

        /* access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.f34608a & this.f34613c) != 0;
        }

        /* access modifiers changed from: private */
        public l w0(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.L || f11 >= this.N || f12 < this.M || f12 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l next : this.S) {
                if (!next.v0(i.IS_HIDDEN)) {
                    next.i0();
                    Matrix.multiplyMV(fArr2, 0, next.X, 0, fArr, 0);
                    l w02 = next.w0(fArr2, z10);
                    if (w02 != null) {
                        return w02;
                    }
                }
            }
            if (z10 && this.f34619i != -1) {
                z11 = true;
            }
            if (x0() || z11) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        public boolean x0() {
            String str;
            String str2;
            String str3;
            if (v0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (!v0(i.IS_FOCUSABLE) && (this.f34614d & (~c.f34514z)) == 0 && (this.f34613c & c.A) == 0 && (((str = this.f34625o) == null || str.isEmpty()) && (((str2 = this.f34627q) == null || str2.isEmpty()) && ((str3 = this.f34633w) == null || str3.isEmpty())))) {
                return false;
            }
            return true;
        }

        private float y0(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float z0(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }
    }

    /* compiled from: AccessibilityBridge */
    private static class m extends n {
        private m() {
            super((a) null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* compiled from: AccessibilityBridge */
    private static class n {

        /* renamed from: a  reason: collision with root package name */
        int f34637a;

        /* renamed from: b  reason: collision with root package name */
        int f34638b;

        /* renamed from: c  reason: collision with root package name */
        o f34639c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* compiled from: AccessibilityBridge */
    private enum o {
        SPELLOUT,
        LOCALE
    }

    /* compiled from: AccessibilityBridge */
    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p a(int i10) {
            if (i10 == 1) {
                return RTL;
            }
            if (i10 != 2) {
                return UNKNOWN;
            }
            return LTR;
        }
    }

    public c(View view, kc.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    private l A() {
        return this.f34521g.get(0);
    }

    private void B(float f10, float f11, boolean z10) {
        l J;
        if (!this.f34521g.isEmpty() && (J = A().w0(new float[]{f10, f11, 0.0f, 1.0f}, z10)) != this.f34529o) {
            if (J != null) {
                R(J.f34612b, 128);
            }
            l lVar = this.f34529o;
            if (lVar != null) {
                R(lVar.f34612b, 256);
            }
            this.f34529o = J;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* access modifiers changed from: private */
    public AccessibilityEvent H(int i10, int i11) {
        AccessibilityEvent G = G(i11);
        G.setPackageName(this.f34515a.getContext().getPackageName());
        G.setSource(this.f34515a, i10);
        return G;
    }

    /* access modifiers changed from: private */
    public void L() {
        l lVar = this.f34529o;
        if (lVar != null) {
            R(lVar.f34612b, 256);
            this.f34529o = null;
        }
    }

    private void M(l lVar) {
        String d02 = lVar.n0();
        if (d02 == null) {
            d02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            V(d02);
            return;
        }
        AccessibilityEvent H = H(lVar.f34612b, 32);
        H.getText().add(d02);
        S(H);
    }

    private boolean N(l lVar, int i10, Bundle bundle, boolean z10) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = lVar.f34617g;
        int k10 = lVar.f34618h;
        P(lVar, i11, z10, z11);
        if (!(i12 == lVar.f34617g && k10 == lVar.f34618h)) {
            String q10 = lVar.f34627q != null ? lVar.f34627q : MaxReward.DEFAULT_LABEL;
            AccessibilityEvent H = H(lVar.f34612b, 8192);
            H.getText().add(q10);
            H.setFromIndex(lVar.f34617g);
            H.setToIndex(lVar.f34618h);
            H.setItemCount(q10.length());
            S(H);
        }
        if (i11 == 1) {
            if (z10) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.u0(gVar)) {
                    this.f34516b.c(i10, gVar, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.u0(gVar2)) {
                return false;
            }
            this.f34516b.c(i10, gVar2, Boolean.valueOf(z11));
            return true;
        } else if (i11 == 2) {
            if (z10) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.u0(gVar3)) {
                    this.f34516b.c(i10, gVar3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.u0(gVar4)) {
                return false;
            }
            this.f34516b.c(i10, gVar4, Boolean.valueOf(z11));
            return true;
        } else if (i11 == 4 || i11 == 8 || i11 == 16) {
            return true;
        } else {
            return false;
        }
    }

    private boolean O(l lVar, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? MaxReward.DEFAULT_LABEL : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f34516b.c(i10, g.SET_TEXT, string);
        String unused = lVar.f34627q = string;
        List unused2 = lVar.f34628r = null;
        return true;
    }

    private void P(l lVar, int i10, boolean z10, boolean z11) {
        if (lVar.f34618h >= 0 && lVar.f34617g >= 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8 || i10 == 16) {
                            if (z10) {
                                int unused = lVar.f34618h = lVar.f34627q.length();
                            } else {
                                int unused2 = lVar.f34618h = 0;
                            }
                        }
                    } else if (z10 && lVar.f34618h < lVar.f34627q.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.f34627q.substring(lVar.f34618h));
                        if (matcher.find()) {
                            l.m(lVar, matcher.start(1));
                        } else {
                            int unused3 = lVar.f34618h = lVar.f34627q.length();
                        }
                    } else if (!z10 && lVar.f34618h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f34627q.substring(0, lVar.f34618h));
                        if (matcher2.find()) {
                            int unused4 = lVar.f34618h = matcher2.start(1);
                        } else {
                            int unused5 = lVar.f34618h = 0;
                        }
                    }
                } else if (z10 && lVar.f34618h < lVar.f34627q.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f34627q.substring(lVar.f34618h));
                    matcher3.find();
                    if (matcher3.find()) {
                        l.m(lVar, matcher3.start(1));
                    } else {
                        int unused6 = lVar.f34618h = lVar.f34627q.length();
                    }
                } else if (!z10 && lVar.f34618h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f34627q.substring(0, lVar.f34618h));
                    if (matcher4.find()) {
                        int unused7 = lVar.f34618h = matcher4.start(1);
                    }
                }
            } else if (z10 && lVar.f34618h < lVar.f34627q.length()) {
                l.m(lVar, 1);
            } else if (!z10 && lVar.f34618h > 0) {
                l.n(lVar, 1);
            }
            if (!z11) {
                int unused8 = lVar.f34617g = lVar.f34618h;
            }
        }
    }

    /* access modifiers changed from: private */
    public void S(AccessibilityEvent accessibilityEvent) {
        if (this.f34517c.isEnabled()) {
            this.f34515a.getParent().requestSendAccessibilityEvent(this.f34515a, accessibilityEvent);
        }
    }

    /* access modifiers changed from: private */
    public void T() {
        this.f34516b.f(this.f34526l);
    }

    private void U(int i10) {
        AccessibilityEvent H = H(i10, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            H.setContentChangeTypes(1);
        }
        S(H);
    }

    private void V(String str) {
        this.f34515a.setAccessibilityPaneTitle(str);
    }

    /* access modifiers changed from: private */
    public void W(boolean z10) {
        if (this.f34534t != z10) {
            this.f34534t = z10;
            if (z10) {
                this.f34526l |= f.ACCESSIBLE_NAVIGATION.f34554a;
            } else {
                this.f34526l &= ~f.ACCESSIBLE_NAVIGATION.f34554a;
            }
            T();
        }
    }

    private void X() {
        View view = this.f34515a;
        if (view != null && view.getResources() != null) {
            int i10 = this.f34515a.getResources().getConfiguration().fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE && i10 >= 300) {
                this.f34526l |= f.BOLD_TEXT.f34554a;
            } else {
                this.f34526l &= f.BOLD_TEXT.f34554a;
            }
            T();
        }
    }

    private boolean Z(l lVar) {
        return lVar.f34620j > 0 && (l.A0(this.f34523i, new a(lVar)) || !l.A0(this.f34523i, b.f34513a));
    }

    private void c0(l lVar) {
        View b10;
        Integer num;
        l unused = lVar.Q = null;
        if (!(lVar.f34619i == -1 || (num = this.f34524j) == null || this.f34518d.platformViewOfNode(num.intValue()) != this.f34519e.b(lVar.f34619i))) {
            R(this.f34524j.intValue(), 65536);
            this.f34524j = null;
        }
        if (!(lVar.f34619i == -1 || (b10 = this.f34519e.b(lVar.f34619i)) == null)) {
            b10.setImportantForAccessibility(4);
        }
        l lVar2 = this.f34523i;
        if (lVar2 == lVar) {
            R(lVar2.f34612b, 65536);
            this.f34523i = null;
        }
        if (this.f34527m == lVar) {
            this.f34527m = null;
        }
        if (this.f34529o == lVar) {
            this.f34529o = null;
        }
    }

    static /* synthetic */ int e(c cVar, int i10) {
        int i11 = i10 & cVar.f34526l;
        cVar.f34526l = i11;
        return i11;
    }

    static /* synthetic */ int f(c cVar, int i10) {
        int i11 = i10 | cVar.f34526l;
        cVar.f34526l = i11;
        return i11;
    }

    private AccessibilityEvent u(int i10, String str, String str2) {
        AccessibilityEvent H = H(i10, 16);
        H.setBeforeText(str);
        H.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 >= str.length() && i11 >= str2.length()) {
            return null;
        }
        H.setFromIndex(i11);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        H.setRemovedCount((length - i11) + 1);
        H.setAddedCount((length2 - i11) + 1);
        return H;
    }

    private boolean v() {
        Activity f10 = bd.h.f(this.f34515a.getContext());
        if (f10 == null || f10.getWindow() == null) {
            return false;
        }
        int i10 = f10.getWindow().getAttributes().layoutInDisplayCutoutMode;
        if (i10 == 2 || i10 == 0) {
            return true;
        }
        return false;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f34515a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    public h y(int i10) {
        h hVar = this.f34522h.get(Integer.valueOf(i10));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        int unused = hVar2.f34580b = i10;
        int unused2 = hVar2.f34579a = B + i10;
        this.f34522h.put(Integer.valueOf(i10), hVar2);
        return hVar2;
    }

    /* access modifiers changed from: private */
    public l z(int i10) {
        l lVar = this.f34521g.get(Integer.valueOf(i10));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        int unused = lVar2.f34612b = i10;
        this.f34521g.put(Integer.valueOf(i10), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f34517c.isEnabled();
    }

    public boolean D() {
        return this.f34517c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent G(int i10) {
        return AccessibilityEvent.obtain(i10);
    }

    public AccessibilityNodeInfo I(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean J(MotionEvent motionEvent) {
        return K(motionEvent, false);
    }

    public boolean K(MotionEvent motionEvent, boolean z10) {
        if (!this.f34517c.isTouchExplorationEnabled() || this.f34521g.isEmpty()) {
            return false;
        }
        l J = A().w0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
        if (J == null || J.f34619i == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                B(motionEvent.getX(), motionEvent.getY(), z10);
            } else if (motionEvent.getAction() == 10) {
                L();
            } else {
                xb.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            return this.f34518d.onAccessibilityHoverEvent(J.f34612b, motionEvent);
        }
    }

    public void Q() {
        this.f34535u = true;
        this.f34519e.d();
        Y((k) null);
        this.f34517c.removeAccessibilityStateChangeListener(this.f34537w);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f34517c.removeTouchExplorationStateChangeListener(this.f34538x);
        }
        this.f34520f.unregisterContentObserver(this.f34539y);
        this.f34516b.g((a.b) null);
    }

    public void R(int i10, int i11) {
        if (this.f34517c.isEnabled()) {
            S(H(i10, i11));
        }
    }

    public void Y(k kVar) {
        this.f34533s = kVar;
    }

    /* access modifiers changed from: package-private */
    public void a0(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        while (byteBuffer.hasRemaining()) {
            h y10 = y(byteBuffer.getInt());
            int unused = y10.f34581c = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str2 = null;
            if (i10 == -1) {
                str = null;
            } else {
                str = strArr[i10];
            }
            String unused2 = y10.f34582d = str;
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str2 = strArr[i11];
            }
            String unused3 = y10.f34583e = str2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.c$l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.c$l r1 = r8.z(r1)
            r1.D0(r9, r10, r11)
            io.flutter.view.c$i r3 = io.flutter.view.c.i.IS_HIDDEN
            boolean r3 = r1.v0(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.c$i r3 = io.flutter.view.c.i.IS_FOCUSED
            boolean r3 = r1.v0(r3)
            if (r3 == 0) goto L_0x002a
            r8.f34527m = r1
        L_0x002a:
            boolean r3 = r1.B
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.f34619i
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f34519e
            int r4 = r1.f34619i
            boolean r3 = r3.c(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f34519e
            int r1 = r1.f34619i
            android.view.View r1 = r3.b(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.c$l r10 = r8.A()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00b7
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00b1
            r5 = 28
            if (r4 < r5) goto L_0x007d
            boolean r4 = r8.v()
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r8.f34515a
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00b1
            java.lang.Integer r5 = r8.f34532r
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009e
            boolean unused = r10.Y = r1
            boolean unused = r10.W = r1
        L_0x009e:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.f34532r = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00b1:
            r10.C0(r3, r9, r2)
            r10.e0(r11)
        L_0x00b7:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r10.next()
            io.flutter.view.c$l r5 = (io.flutter.view.c.l) r5
            java.util.List<java.lang.Integer> r6 = r8.f34530p
            int r7 = r5.f34612b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00bd
            r4 = r5
            goto L_0x00bd
        L_0x00db:
            if (r4 != 0) goto L_0x00ef
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00ef
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.c$l r4 = (io.flutter.view.c.l) r4
        L_0x00ef:
            if (r4 == 0) goto L_0x010e
            int r10 = r4.f34612b
            int r5 = r8.f34531q
            if (r10 != r5) goto L_0x0105
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.f34530p
            int r5 = r5.size()
            if (r10 == r5) goto L_0x010e
        L_0x0105:
            int r10 = r4.f34612b
            r8.f34531q = r10
            r8.M(r4)
        L_0x010e:
            java.util.List<java.lang.Integer> r10 = r8.f34530p
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x0117:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            io.flutter.view.c$l r11 = (io.flutter.view.c.l) r11
            java.util.List<java.lang.Integer> r4 = r8.f34530p
            int r11 = r11.f34612b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x0117
        L_0x0131:
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r10 = r8.f34521g
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.c$l r11 = (io.flutter.view.c.l) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x013b
            r8.c0(r11)
            r10.remove()
            goto L_0x013b
        L_0x015a:
            r8.U(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0340
            java.lang.Object r10 = r9.next()
            io.flutter.view.c$l r10 = (io.flutter.view.c.l) r10
            boolean r11 = r10.h0()
            if (r11 == 0) goto L_0x0232
            int r11 = r10.f34612b
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r0)
            float r0 = r10.f34622l
            float r4 = r10.f34623m
            float r5 = r10.f34623m
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x019f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x019c
            r0 = 1200142336(0x4788b800, float:70000.0)
        L_0x019c:
            r4 = 1203982336(0x47c35000, float:100000.0)
        L_0x019f:
            float r5 = r10.f34624n
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01b6
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b4
            r0 = -947341312(0xffffffffc788b800, float:-70000.0)
        L_0x01b4:
            float r0 = r0 + r7
            goto L_0x01c0
        L_0x01b6:
            float r5 = r10.f34624n
            float r4 = r4 - r5
            float r5 = r10.f34624n
            float r0 = r0 - r5
        L_0x01c0:
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_UP
            boolean r5 = r10.s0(r5)
            if (r5 != 0) goto L_0x01ea
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_DOWN
            boolean r5 = r10.s0(r5)
            if (r5 == 0) goto L_0x01d1
            goto L_0x01ea
        L_0x01d1:
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_LEFT
            boolean r5 = r10.s0(r5)
            if (r5 != 0) goto L_0x01e1
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_RIGHT
            boolean r5 = r10.s0(r5)
            if (r5 == 0) goto L_0x01f2
        L_0x01e1:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01f2
        L_0x01ea:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01f2:
            int r0 = r10.f34620j
            if (r0 <= 0) goto L_0x022f
            int r0 = r10.f34620j
            r11.setItemCount(r0)
            int r0 = r10.f34621k
            r11.setFromIndex(r0)
            java.util.List r0 = r10.S
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x020f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0226
            java.lang.Object r5 = r0.next()
            io.flutter.view.c$l r5 = (io.flutter.view.c.l) r5
            io.flutter.view.c$i r6 = io.flutter.view.c.i.IS_HIDDEN
            boolean r5 = r5.v0(r6)
            if (r5 != 0) goto L_0x020f
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0226:
            int r0 = r10.f34621k
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x022f:
            r8.S(r11)
        L_0x0232:
            io.flutter.view.c$i r11 = io.flutter.view.c.i.IS_LIVE_REGION
            boolean r11 = r10.v0(r11)
            if (r11 == 0) goto L_0x0247
            boolean r11 = r10.g0()
            if (r11 == 0) goto L_0x0247
            int r11 = r10.f34612b
            r8.U(r11)
        L_0x0247:
            io.flutter.view.c$l r11 = r8.f34523i
            if (r11 == 0) goto L_0x027a
            int r11 = r11.f34612b
            int r0 = r10.f34612b
            if (r11 != r0) goto L_0x027a
            io.flutter.view.c$i r11 = io.flutter.view.c.i.IS_SELECTED
            boolean r0 = r10.t0(r11)
            if (r0 != 0) goto L_0x027a
            boolean r11 = r10.v0(r11)
            if (r11 == 0) goto L_0x027a
            int r11 = r10.f34612b
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.f34625o
            r0.add(r4)
            r8.S(r11)
        L_0x027a:
            io.flutter.view.c$l r11 = r8.f34527m
            if (r11 == 0) goto L_0x02aa
            int r11 = r11.f34612b
            int r0 = r10.f34612b
            if (r11 != r0) goto L_0x02aa
            io.flutter.view.c$l r11 = r8.f34528n
            if (r11 == 0) goto L_0x0298
            int r11 = r11.f34612b
            io.flutter.view.c$l r0 = r8.f34527m
            int r0 = r0.f34612b
            if (r11 == r0) goto L_0x02aa
        L_0x0298:
            io.flutter.view.c$l r11 = r8.f34527m
            r8.f34528n = r11
            int r11 = r10.f34612b
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r0)
            r8.S(r11)
            goto L_0x02b0
        L_0x02aa:
            io.flutter.view.c$l r11 = r8.f34527m
            if (r11 != 0) goto L_0x02b0
            r8.f34528n = r3
        L_0x02b0:
            io.flutter.view.c$l r11 = r8.f34527m
            if (r11 == 0) goto L_0x0161
            int r11 = r11.f34612b
            int r0 = r10.f34612b
            if (r11 != r0) goto L_0x0161
            io.flutter.view.c$i r11 = io.flutter.view.c.i.IS_TEXT_FIELD
            boolean r0 = r10.t0(r11)
            if (r0 == 0) goto L_0x0161
            boolean r11 = r10.v0(r11)
            if (r11 == 0) goto L_0x0161
            io.flutter.view.c$l r11 = r8.f34523i
            if (r11 == 0) goto L_0x02dc
            int r11 = r11.f34612b
            io.flutter.view.c$l r0 = r8.f34527m
            int r0 = r0.f34612b
            if (r11 != r0) goto L_0x0161
        L_0x02dc:
            java.lang.String r11 = r10.J
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02e9
            java.lang.String r11 = r10.J
            goto L_0x02ea
        L_0x02e9:
            r11 = r0
        L_0x02ea:
            java.lang.String r4 = r10.f34627q
            if (r4 == 0) goto L_0x02f4
            java.lang.String r0 = r10.f34627q
        L_0x02f4:
            int r4 = r10.f34612b
            android.view.accessibility.AccessibilityEvent r11 = r8.u(r4, r11, r0)
            if (r11 == 0) goto L_0x0301
            r8.S(r11)
        L_0x0301:
            int r11 = r10.E
            int r4 = r10.f34617g
            if (r11 != r4) goto L_0x0315
            int r11 = r10.F
            int r4 = r10.f34618h
            if (r11 == r4) goto L_0x0161
        L_0x0315:
            int r11 = r10.f34612b
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.f34617g
            r11.setFromIndex(r4)
            int r10 = r10.f34618h
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.S(r11)
            goto L_0x0161
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.b0(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        int i11;
        l lVar;
        int i12 = i10;
        boolean z10 = true;
        W(true);
        if (i12 >= 65536) {
            return this.f34518d.createAccessibilityNodeInfo(i12);
        }
        if (i12 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f34515a);
            this.f34515a.onInitializeAccessibilityNodeInfo(obtain);
            if (this.f34521g.containsKey(0)) {
                obtain.addChild(this.f34515a, 0);
            }
            return obtain;
        }
        l lVar2 = this.f34521g.get(Integer.valueOf(i10));
        if (lVar2 == null) {
            return null;
        }
        if (lVar2.f34619i == -1 || !this.f34519e.c(lVar2.f34619i)) {
            AccessibilityNodeInfo I = I(this.f34515a, i12);
            int i13 = Build.VERSION.SDK_INT;
            String str = MaxReward.DEFAULT_LABEL;
            if (i13 >= 18) {
                I.setViewIdResourceName(str);
            }
            I.setPackageName(this.f34515a.getContext().getPackageName());
            I.setClassName("android.view.View");
            I.setSource(this.f34515a, i12);
            I.setFocusable(lVar2.x0());
            l lVar3 = this.f34527m;
            if (lVar3 != null) {
                I.setFocused(lVar3.f34612b == i12);
            }
            l lVar4 = this.f34523i;
            if (lVar4 != null) {
                I.setAccessibilityFocused(lVar4.f34612b == i12);
            }
            i iVar = i.IS_TEXT_FIELD;
            if (lVar2.v0(iVar)) {
                I.setPassword(lVar2.v0(i.IS_OBSCURED));
                i iVar2 = i.IS_READ_ONLY;
                if (!lVar2.v0(iVar2)) {
                    I.setClassName("android.widget.EditText");
                }
                if (i13 >= 18) {
                    I.setEditable(!lVar2.v0(iVar2));
                    if (!(lVar2.f34617g == -1 || lVar2.f34618h == -1)) {
                        I.setTextSelection(lVar2.f34617g, lVar2.f34618h);
                    }
                    if (i13 > 18 && (lVar = this.f34523i) != null && lVar.f34612b == i12) {
                        I.setLiveRegion(1);
                    }
                }
                if (lVar2.u0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    I.addAction(256);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (lVar2.u0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    I.addAction(512);
                    i11 |= 1;
                }
                if (lVar2.u0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    I.addAction(256);
                    i11 |= 2;
                }
                if (lVar2.u0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    I.addAction(512);
                    i11 |= 2;
                }
                I.setMovementGranularities(i11);
                if (i13 >= 21 && lVar2.f34615e >= 0) {
                    int length = lVar2.f34627q == null ? 0 : lVar2.f34627q.length();
                    int unused = lVar2.f34616f;
                    int unused2 = lVar2.f34615e;
                    I.setMaxTextLength((length - lVar2.f34616f) + lVar2.f34615e);
                }
            }
            if (i13 > 18) {
                if (lVar2.u0(g.SET_SELECTION)) {
                    I.addAction(131072);
                }
                if (lVar2.u0(g.COPY)) {
                    I.addAction(16384);
                }
                if (lVar2.u0(g.CUT)) {
                    I.addAction(65536);
                }
                if (lVar2.u0(g.PASTE)) {
                    I.addAction(32768);
                }
            }
            if (i13 >= 21 && lVar2.u0(g.SET_TEXT)) {
                I.addAction(2097152);
            }
            if (lVar2.v0(i.IS_BUTTON) || lVar2.v0(i.IS_LINK)) {
                I.setClassName("android.widget.Button");
            }
            if (lVar2.v0(i.IS_IMAGE)) {
                I.setClassName("android.widget.ImageView");
            }
            if (i13 > 18 && lVar2.u0(g.DISMISS)) {
                I.setDismissable(true);
                I.addAction(1048576);
            }
            if (lVar2.Q != null) {
                I.setParent(this.f34515a, lVar2.Q.f34612b);
            } else {
                I.setParent(this.f34515a);
            }
            if (lVar2.f34636z != -1 && i13 >= 22) {
                I.setTraversalAfter(this.f34515a, lVar2.f34636z);
            }
            Rect f10 = lVar2.k0();
            if (lVar2.Q != null) {
                Rect f11 = lVar2.Q.k0();
                Rect rect = new Rect(f10);
                rect.offset(-f11.left, -f11.top);
                I.setBoundsInParent(rect);
            } else {
                I.setBoundsInParent(f10);
            }
            I.setBoundsInScreen(x(f10));
            I.setVisibleToUser(true);
            I.setEnabled(!lVar2.v0(i.HAS_ENABLED_STATE) || lVar2.v0(i.IS_ENABLED));
            if (lVar2.u0(g.TAP)) {
                if (i13 < 21 || lVar2.U == null) {
                    I.addAction(16);
                    I.setClickable(true);
                } else {
                    I.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar2.U.f34583e));
                    I.setClickable(true);
                }
            }
            if (lVar2.u0(g.LONG_PRESS)) {
                if (i13 < 21 || lVar2.V == null) {
                    I.addAction(32);
                    I.setLongClickable(true);
                } else {
                    I.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar2.V.f34583e));
                    I.setLongClickable(true);
                }
            }
            g gVar = g.SCROLL_LEFT;
            if (lVar2.u0(gVar) || lVar2.u0(g.SCROLL_UP) || lVar2.u0(g.SCROLL_RIGHT) || lVar2.u0(g.SCROLL_DOWN)) {
                I.setScrollable(true);
                if (lVar2.v0(i.HAS_IMPLICIT_SCROLLING)) {
                    if (lVar2.u0(gVar) || lVar2.u0(g.SCROLL_RIGHT)) {
                        if (i13 <= 19 || !Z(lVar2)) {
                            I.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            I.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar2.f34620j, false));
                        }
                        if (lVar2.u0(gVar) || lVar2.u0(g.SCROLL_UP)) {
                            I.addAction(4096);
                        }
                        if (lVar2.u0(g.SCROLL_RIGHT) || lVar2.u0(g.SCROLL_DOWN)) {
                            I.addAction(8192);
                        }
                    } else if (i13 <= 18 || !Z(lVar2)) {
                        I.setClassName("android.widget.ScrollView");
                    } else {
                        I.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar2.f34620j, 0, false));
                    }
                }
                I.addAction(4096);
                I.addAction(8192);
            }
            g gVar2 = g.INCREASE;
            if (lVar2.u0(gVar2) || lVar2.u0(g.DECREASE)) {
                I.setClassName("android.widget.SeekBar");
                if (lVar2.u0(gVar2)) {
                    I.addAction(4096);
                }
                if (lVar2.u0(g.DECREASE)) {
                    I.addAction(8192);
                }
            }
            if (lVar2.v0(i.IS_LIVE_REGION) && i13 > 18) {
                I.setLiveRegion(1);
            }
            if (lVar2.v0(iVar)) {
                I.setText(lVar2.q0());
                if (i13 >= 28) {
                    I.setHintText(lVar2.p0());
                }
            } else if (!lVar2.v0(i.SCOPES_ROUTE)) {
                CharSequence A2 = lVar2.r0();
                String str2 = A2;
                if (i13 < 28) {
                    str2 = A2;
                    if (lVar2.f34635y != null) {
                        if (A2 != null) {
                            str = A2;
                        }
                        str2 = str + "\n" + lVar2.f34635y;
                    }
                }
                if (str2 != null) {
                    I.setContentDescription(str2);
                }
            }
            if (i13 >= 28 && lVar2.f34635y != null) {
                I.setTooltipText(lVar2.f34635y);
            }
            boolean h10 = lVar2.v0(i.HAS_CHECKED_STATE);
            boolean h11 = lVar2.v0(i.HAS_TOGGLED_STATE);
            if (!h10 && !h11) {
                z10 = false;
            }
            I.setCheckable(z10);
            if (h10) {
                I.setChecked(lVar2.v0(i.IS_CHECKED));
                if (lVar2.v0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                    I.setClassName("android.widget.RadioButton");
                } else {
                    I.setClassName("android.widget.CheckBox");
                }
            } else if (h11) {
                I.setChecked(lVar2.v0(i.IS_TOGGLED));
                I.setClassName("android.widget.Switch");
            }
            I.setSelected(lVar2.v0(i.IS_SELECTED));
            if (i13 >= 28) {
                I.setHeading(lVar2.v0(i.IS_HEADER));
            }
            l lVar5 = this.f34523i;
            if (lVar5 == null || lVar5.f34612b != i12) {
                I.addAction(64);
            } else {
                I.addAction(128);
            }
            if (i13 >= 21 && lVar2.T != null) {
                for (h hVar : lVar2.T) {
                    I.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f34579a, hVar.f34582d));
                }
            }
            for (l lVar6 : lVar2.R) {
                if (!lVar6.v0(i.IS_HIDDEN)) {
                    if (lVar6.f34619i != -1) {
                        View b10 = this.f34519e.b(lVar6.f34619i);
                        if (!this.f34519e.c(lVar6.f34619i)) {
                            I.addChild(b10);
                        }
                    }
                    I.addChild(this.f34515a, lVar6.f34612b);
                }
            }
            return I;
        }
        View b11 = this.f34519e.b(lVar2.f34619i);
        if (b11 == null) {
            return null;
        }
        return this.f34518d.getRootNode(b11, lVar2.f34612b, lVar2.k0());
    }

    public AccessibilityNodeInfo findFocus(int i10) {
        if (i10 == 1) {
            l lVar = this.f34527m;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f34612b);
            }
            Integer num = this.f34525k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i10 != 2) {
            return null;
        }
        l lVar2 = this.f34523i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f34612b);
        }
        Integer num2 = this.f34524j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        if (i10 >= 65536) {
            boolean performAction = this.f34518d.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.f34524j = null;
            }
            return performAction;
        }
        l lVar = this.f34521g.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.f34516b.b(i10, g.TAP);
                return true;
            case 32:
                this.f34516b.b(i10, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f34523i == null) {
                    this.f34515a.invalidate();
                }
                this.f34523i = lVar;
                this.f34516b.b(i10, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                R(i10, 32768);
                if (lVar.u0(g.INCREASE) || lVar.u0(g.DECREASE)) {
                    R(i10, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f34523i;
                if (lVar2 != null && lVar2.f34612b == i10) {
                    this.f34523i = null;
                }
                Integer num = this.f34524j;
                if (num != null && num.intValue() == i10) {
                    this.f34524j = null;
                }
                this.f34516b.b(i10, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                R(i10, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return N(lVar, i10, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return N(lVar, i10, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (lVar.u0(gVar)) {
                    this.f34516b.b(i10, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (lVar.u0(gVar2)) {
                        this.f34516b.b(i10, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!lVar.u0(gVar3)) {
                            return false;
                        }
                        String unused = lVar.f34627q = lVar.f34629s;
                        List unused2 = lVar.f34628r = lVar.f34630t;
                        R(i10, 4);
                        this.f34516b.b(i10, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (lVar.u0(gVar4)) {
                    this.f34516b.b(i10, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (lVar.u0(gVar5)) {
                        this.f34516b.b(i10, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!lVar.u0(gVar6)) {
                            return false;
                        }
                        String unused3 = lVar.f34627q = lVar.f34631u;
                        List unused4 = lVar.f34628r = lVar.f34632v;
                        R(i10, 4);
                        this.f34516b.b(i10, gVar6);
                    }
                }
                return true;
            case 16384:
                this.f34516b.b(i10, g.COPY);
                return true;
            case 32768:
                this.f34516b.b(i10, g.PASTE);
                return true;
            case 65536:
                this.f34516b.b(i10, g.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f34618h));
                    hashMap.put("extent", Integer.valueOf(lVar.f34618h));
                }
                this.f34516b.c(i10, g.SET_SELECTION, hashMap);
                l lVar3 = this.f34521g.get(Integer.valueOf(i10));
                int unused5 = lVar3.f34617g = ((Integer) hashMap.get("base")).intValue();
                int unused6 = lVar3.f34618h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f34516b.b(i10, g.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return O(lVar, i10, bundle);
            case 16908342:
                this.f34516b.b(i10, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f34522h.get(Integer.valueOf(i11 - B));
                if (hVar == null) {
                    return false;
                }
                this.f34516b.c(i10, g.CUSTOM_ACTION, Integer.valueOf(hVar.f34580b));
                return true;
        }
    }

    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f34518d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f34518d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f34525k = recordFlutterId;
            this.f34527m = null;
            return true;
        } else if (eventType == 128) {
            this.f34529o = null;
            return true;
        } else if (eventType == 32768) {
            this.f34524j = recordFlutterId;
            this.f34523i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f34525k = null;
            this.f34524j = null;
            return true;
        }
    }

    public c(View view, kc.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.k kVar) {
        this.f34521g = new HashMap();
        this.f34522h = new HashMap();
        this.f34526l = 0;
        this.f34530p = new ArrayList();
        this.f34531q = 0;
        this.f34532r = 0;
        this.f34534t = false;
        this.f34535u = false;
        this.f34536v = new a();
        b bVar = new b();
        this.f34537w = bVar;
        C0393c cVar = new C0393c(new Handler());
        this.f34539y = cVar;
        this.f34515a = view;
        this.f34516b = aVar;
        this.f34517c = accessibilityManager;
        this.f34520f = contentResolver;
        this.f34518d = accessibilityViewEmbedder;
        this.f34519e = kVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            d dVar = new d(accessibilityManager);
            this.f34538x = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.f34538x = null;
        }
        if (i10 >= 17) {
            cVar.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        }
        if (i10 >= 31) {
            X();
        }
        kVar.a(this);
    }
}
