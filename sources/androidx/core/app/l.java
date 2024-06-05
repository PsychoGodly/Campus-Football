package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NotificationCompat */
public class l {

    /* compiled from: NotificationCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f2732a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f2733b;

        /* renamed from: c  reason: collision with root package name */
        private final r[] f2734c;

        /* renamed from: d  reason: collision with root package name */
        private final r[] f2735d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2736e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2737f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2738g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f2739h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f2740i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f2741j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f2742k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2743l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.n((Resources) null, MaxReward.DEFAULT_LABEL, i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f2742k;
        }

        public boolean b() {
            return this.f2736e;
        }

        public r[] c() {
            return this.f2735d;
        }

        public Bundle d() {
            return this.f2732a;
        }

        @Deprecated
        public int e() {
            return this.f2740i;
        }

        public IconCompat f() {
            int i10;
            if (this.f2733b == null && (i10 = this.f2740i) != 0) {
                this.f2733b = IconCompat.n((Resources) null, MaxReward.DEFAULT_LABEL, i10);
            }
            return this.f2733b;
        }

        public r[] g() {
            return this.f2734c;
        }

        public int h() {
            return this.f2738g;
        }

        public boolean i() {
            return this.f2737f;
        }

        public CharSequence j() {
            return this.f2741j;
        }

        public boolean k() {
            return this.f2743l;
        }

        public boolean l() {
            return this.f2739h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, (r[]) null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f2737f = true;
            this.f2733b = iconCompat;
            if (iconCompat != null && iconCompat.s() == 2) {
                this.f2740i = iconCompat.p();
            }
            this.f2741j = e.i(charSequence);
            this.f2742k = pendingIntent;
            this.f2732a = bundle == null ? new Bundle() : bundle;
            this.f2734c = rVarArr;
            this.f2735d = rVarArr2;
            this.f2736e = z10;
            this.f2738g = i10;
            this.f2737f = z11;
            this.f2739h = z12;
            this.f2743l = z13;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends h {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f2744e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f2745f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2746g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f2747h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2748i;

        /* compiled from: NotificationCompat */
        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b  reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        private static class C0030b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle c10 = a.c(a.b(kVar.a()), this.f2778b);
                IconCompat iconCompat = this.f2744e;
                Context context = null;
                if (iconCompat != null) {
                    if (i10 >= 31) {
                        c.a(c10, this.f2744e.y(kVar instanceof m ? ((m) kVar).f() : null));
                    } else if (iconCompat.s() == 1) {
                        c10 = a.a(c10, this.f2744e.o());
                    }
                }
                if (this.f2746g) {
                    IconCompat iconCompat2 = this.f2745f;
                    if (iconCompat2 == null) {
                        a.d(c10, (Bitmap) null);
                    } else if (i10 >= 23) {
                        if (kVar instanceof m) {
                            context = ((m) kVar).f();
                        }
                        C0030b.a(c10, this.f2745f.y(context));
                    } else if (iconCompat2.s() == 1) {
                        a.d(c10, this.f2745f.o());
                    } else {
                        a.d(c10, (Bitmap) null);
                    }
                }
                if (this.f2780d) {
                    a.e(c10, this.f2779c);
                }
                if (i10 >= 31) {
                    c.c(c10, this.f2748i);
                    c.b(c10, this.f2747h);
                }
            }
        }

        /* access modifiers changed from: protected */
        public String h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b m(Bitmap bitmap) {
            this.f2745f = bitmap == null ? null : IconCompat.j(bitmap);
            this.f2746g = true;
            return this;
        }

        public b n(Bitmap bitmap) {
            this.f2744e = bitmap == null ? null : IconCompat.j(bitmap);
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f2779c = e.i(charSequence);
            this.f2780d = true;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends h {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f2749e;

        /* compiled from: NotificationCompat */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2749e);
            }
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle a10 = a.a(a.c(a.b(kVar.a()), this.f2778b), this.f2749e);
                if (this.f2780d) {
                    a.d(a10, this.f2779c);
                }
            }
        }

        /* access modifiers changed from: protected */
        public String h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c m(CharSequence charSequence) {
            this.f2749e = e.i(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat */
    public interface f {
        e a(e eVar);
    }

    /* compiled from: NotificationCompat */
    public static class g extends h {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f2776e = new ArrayList<>();

        /* compiled from: NotificationCompat */
        static class a {
            static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle c10 = a.c(a.b(kVar.a()), this.f2778b);
                if (this.f2780d) {
                    a.d(c10, this.f2779c);
                }
                Iterator<CharSequence> it = this.f2776e.iterator();
                while (it.hasNext()) {
                    a.a(c10, it.next());
                }
            }
        }

        /* access modifiers changed from: protected */
        public String h() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public g m(CharSequence charSequence) {
            if (charSequence != null) {
                this.f2776e.add(e.i(charSequence));
            }
            return this;
        }

        public g n(CharSequence charSequence) {
            this.f2778b = e.i(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        protected e f2777a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f2778b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f2779c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2780d = false;

        /* compiled from: NotificationCompat */
        static class a {
            static void a(RemoteViews remoteViews, int i10, int i11, float f10) {
                remoteViews.setTextViewTextSize(i10, i11, f10);
            }

            static void b(RemoteViews remoteViews, int i10, int i11, int i12, int i13, int i14) {
                remoteViews.setViewPadding(i10, i11, i12, i13, i14);
            }
        }

        /* compiled from: NotificationCompat */
        static class b {
            static void a(RemoteViews remoteViews, int i10, boolean z10) {
                remoteViews.setChronometerCountDown(i10, z10);
            }
        }

        private Bitmap e(int i10, int i11, int i12) {
            return f(IconCompat.m(this.f2777a.f2750a, i10), i11, i12);
        }

        private Bitmap f(IconCompat iconCompat, int i10, int i11) {
            Drawable v10 = iconCompat.v(this.f2777a.f2750a);
            int intrinsicWidth = i11 == 0 ? v10.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = v10.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            v10.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                v10.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            v10.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap g(int i10, int i11, int i12, int i13) {
            int i14 = z.c.f24039c;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap e10 = e(i14, i13, i11);
            Canvas canvas = new Canvas(e10);
            Drawable mutate = this.f2777a.f2750a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e10;
        }

        public void a(Bundle bundle) {
            if (this.f2780d) {
                bundle.putCharSequence("android.summaryText", this.f2779c);
            }
            CharSequence charSequence = this.f2778b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h10 = h();
            if (h10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h10);
            }
        }

        public abstract void b(k kVar);

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f5  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0206  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                androidx.core.app.l$e r1 = r0.f2777a
                android.content.Context r1 = r1.f2750a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                androidx.core.app.l$e r2 = r0.f2777a
                android.content.Context r2 = r2.f2750a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                androidx.core.app.l$e r2 = r0.f2777a
                int r2 = r2.g()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x0052
                if (r11 >= r4) goto L_0x0052
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0044
                int r2 = z.d.M
                int r6 = z.c.f24038b
                r8.setInt(r2, r5, r6)
                int r2 = z.d.I
                int r6 = z.c.f24041e
                r8.setInt(r2, r5, r6)
                goto L_0x0052
            L_0x0044:
                int r2 = z.d.M
                int r6 = z.c.f24037a
                r8.setInt(r2, r5, r6)
                int r2 = z.d.I
                int r6 = z.c.f24040d
                r8.setInt(r2, r5, r6)
            L_0x0052:
                androidx.core.app.l$e r2 = r0.f2777a
                android.graphics.Bitmap r5 = r2.f2759j
                r13 = 8
                if (r5 == 0) goto L_0x00b3
                if (r11 < r12) goto L_0x0069
                int r2 = z.d.I
                r8.setViewVisibility(r2, r10)
                androidx.core.app.l$e r5 = r0.f2777a
                android.graphics.Bitmap r5 = r5.f2759j
                r8.setImageViewBitmap(r2, r5)
                goto L_0x006e
            L_0x0069:
                int r2 = z.d.I
                r8.setViewVisibility(r2, r13)
            L_0x006e:
                if (r17 == 0) goto L_0x00f4
                androidx.core.app.l$e r2 = r0.f2777a
                android.app.Notification r2 = r2.T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = z.b.f24033e
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = z.b.f24034f
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x009e
                androidx.core.app.l$e r3 = r0.f2777a
                android.app.Notification r6 = r3.T
                int r6 = r6.icon
                int r3 = r3.e()
                android.graphics.Bitmap r2 = r0.g(r6, r2, r5, r3)
                int r3 = z.d.N
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00ad
            L_0x009e:
                int r2 = z.d.N
                androidx.core.app.l$e r5 = r0.f2777a
                android.app.Notification r5 = r5.T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00ad:
                int r2 = z.d.N
                r8.setViewVisibility(r2, r10)
                goto L_0x00f4
            L_0x00b3:
                if (r17 == 0) goto L_0x00f4
                android.app.Notification r2 = r2.T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f4
                int r2 = z.d.I
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00e7
                int r3 = z.b.f24032d
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = z.b.f24031c
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = z.b.f24035g
                int r5 = r1.getDimensionPixelSize(r5)
                androidx.core.app.l$e r6 = r0.f2777a
                android.app.Notification r7 = r6.T
                int r7 = r7.icon
                int r6 = r6.e()
                android.graphics.Bitmap r3 = r0.g(r7, r3, r5, r6)
                r8.setImageViewBitmap(r2, r3)
                goto L_0x00f4
            L_0x00e7:
                androidx.core.app.l$e r5 = r0.f2777a
                android.app.Notification r5 = r5.T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.d(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00f4:
                androidx.core.app.l$e r2 = r0.f2777a
                java.lang.CharSequence r2 = r2.f2754e
                if (r2 == 0) goto L_0x00ff
                int r3 = z.d.f24053f0
                r8.setTextViewText(r3, r2)
            L_0x00ff:
                androidx.core.app.l$e r2 = r0.f2777a
                java.lang.CharSequence r2 = r2.f2755f
                if (r2 == 0) goto L_0x010c
                int r3 = z.d.f24047c0
                r8.setTextViewText(r3, r2)
                r2 = 1
                goto L_0x010d
            L_0x010c:
                r2 = 0
            L_0x010d:
                if (r11 >= r4) goto L_0x0117
                androidx.core.app.l$e r3 = r0.f2777a
                android.graphics.Bitmap r3 = r3.f2759j
                if (r3 == 0) goto L_0x0117
                r3 = 1
                goto L_0x0118
            L_0x0117:
                r3 = 0
            L_0x0118:
                androidx.core.app.l$e r4 = r0.f2777a
                java.lang.CharSequence r5 = r4.f2760k
                if (r5 == 0) goto L_0x0129
                int r2 = z.d.J
                r8.setTextViewText(r2, r5)
                r8.setViewVisibility(r2, r10)
            L_0x0126:
                r14 = 1
                r15 = 1
                goto L_0x0164
            L_0x0129:
                int r4 = r4.f2761l
                if (r4 <= 0) goto L_0x015d
                int r2 = z.e.f24074a
                int r2 = r1.getInteger(r2)
                androidx.core.app.l$e r3 = r0.f2777a
                int r3 = r3.f2761l
                if (r3 <= r2) goto L_0x0145
                int r2 = z.d.J
                int r3 = z.f.f24075a
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x0157
            L_0x0145:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = z.d.J
                androidx.core.app.l$e r4 = r0.f2777a
                int r4 = r4.f2761l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x0157:
                int r2 = z.d.J
                r8.setViewVisibility(r2, r10)
                goto L_0x0126
            L_0x015d:
                int r4 = z.d.J
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0164:
                androidx.core.app.l$e r2 = r0.f2777a
                java.lang.CharSequence r2 = r2.f2767r
                if (r2 == 0) goto L_0x0186
                if (r11 < r12) goto L_0x0186
                int r3 = z.d.f24047c0
                r8.setTextViewText(r3, r2)
                androidx.core.app.l$e r2 = r0.f2777a
                java.lang.CharSequence r2 = r2.f2755f
                if (r2 == 0) goto L_0x0181
                int r3 = z.d.f24049d0
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = 1
                goto L_0x0187
            L_0x0181:
                int r2 = z.d.f24049d0
                r8.setViewVisibility(r2, r13)
            L_0x0186:
                r2 = 0
            L_0x0187:
                if (r2 == 0) goto L_0x01a3
                if (r11 < r12) goto L_0x01a3
                if (r19 == 0) goto L_0x0199
                int r2 = z.b.f24036h
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = z.d.f24047c0
                androidx.core.app.l.h.a.a(r8, r2, r10, r1)
            L_0x0199:
                int r3 = z.d.K
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                androidx.core.app.l.h.a.b(r2, r3, r4, r5, r6, r7)
            L_0x01a3:
                androidx.core.app.l$e r1 = r0.f2777a
                long r1 = r1.h()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x01f5
                androidx.core.app.l$e r1 = r0.f2777a
                boolean r1 = r1.f2764o
                if (r1 == 0) goto L_0x01e4
                if (r11 < r12) goto L_0x01e4
                int r1 = z.d.H
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.f2777a
                long r2 = r2.h()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                androidx.core.app.l$e r2 = r0.f2777a
                boolean r2 = r2.f2765p
                if (r2 == 0) goto L_0x01f6
                r3 = 24
                if (r11 < r3) goto L_0x01f6
                androidx.core.app.l.h.b.a(r8, r1, r2)
                goto L_0x01f6
            L_0x01e4:
                int r1 = z.d.f24051e0
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.f2777a
                long r2 = r2.h()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01f6
            L_0x01f5:
                r9 = r15
            L_0x01f6:
                int r1 = z.d.O
                if (r9 == 0) goto L_0x01fc
                r2 = 0
                goto L_0x01fe
            L_0x01fc:
                r2 = 8
            L_0x01fe:
                r8.setViewVisibility(r1, r2)
                int r1 = z.d.L
                if (r14 == 0) goto L_0x0206
                goto L_0x0208
            L_0x0206:
                r10 = 8
            L_0x0208:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.h.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Bitmap d(int i10, int i11) {
            return e(i10, i11, 0);
        }

        /* access modifiers changed from: protected */
        public String h() {
            return null;
        }

        public RemoteViews i(k kVar) {
            return null;
        }

        public RemoteViews j(k kVar) {
            return null;
        }

        public RemoteViews k(k kVar) {
            return null;
        }

        public void l(e eVar) {
            if (this.f2777a != eVar) {
                this.f2777a = eVar;
                if (eVar != null) {
                    eVar.I(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return n.c(notification);
        }
        return null;
    }

    public static boolean b(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            if ((notification.flags & 512) != 0) {
                return true;
            }
            return false;
        } else if (i10 >= 19) {
            return notification.extras.getBoolean("android.support.isGroupSummary");
        } else {
            if (i10 >= 16) {
                return n.c(notification).getBoolean("android.support.isGroupSummary");
            }
            return false;
        }
    }

    /* compiled from: NotificationCompat */
    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        d S;
        Notification T;
        boolean U;
        Object V;
        @Deprecated
        public ArrayList<String> W;

        /* renamed from: a  reason: collision with root package name */
        public Context f2750a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2751b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<p> f2752c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f2753d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2754e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f2755f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f2756g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f2757h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f2758i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f2759j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f2760k;

        /* renamed from: l  reason: collision with root package name */
        int f2761l;

        /* renamed from: m  reason: collision with root package name */
        int f2762m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2763n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2764o;

        /* renamed from: p  reason: collision with root package name */
        boolean f2765p;

        /* renamed from: q  reason: collision with root package name */
        h f2766q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f2767r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence f2768s;

        /* renamed from: t  reason: collision with root package name */
        CharSequence[] f2769t;

        /* renamed from: u  reason: collision with root package name */
        int f2770u;

        /* renamed from: v  reason: collision with root package name */
        int f2771v;

        /* renamed from: w  reason: collision with root package name */
        boolean f2772w;

        /* renamed from: x  reason: collision with root package name */
        String f2773x;

        /* renamed from: y  reason: collision with root package name */
        boolean f2774y;

        /* renamed from: z  reason: collision with root package name */
        String f2775z;

        /* compiled from: NotificationCompat */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f2751b = new ArrayList<>();
            this.f2752c = new ArrayList<>();
            this.f2753d = new ArrayList<>();
            this.f2763n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f2750a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f2762m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence i(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap j(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2750a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(z.b.f24030b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(z.b.f24029a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        private void t(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.T;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e A(int i10) {
            this.f2761l = i10;
            return this;
        }

        public e B(boolean z10) {
            t(2, z10);
            return this;
        }

        public e C(boolean z10) {
            t(8, z10);
            return this;
        }

        public e D(int i10) {
            this.f2762m = i10;
            return this;
        }

        public e E(int i10, int i11, boolean z10) {
            this.f2770u = i10;
            this.f2771v = i11;
            this.f2772w = z10;
            return this;
        }

        public e F(boolean z10) {
            this.f2763n = z10;
            return this;
        }

        public e G(int i10) {
            this.T.icon = i10;
            return this;
        }

        public e H(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
                this.T.audioAttributes = a.a(e10);
            }
            return this;
        }

        public e I(h hVar) {
            if (this.f2766q != hVar) {
                this.f2766q = hVar;
                if (hVar != null) {
                    hVar.l(this);
                }
            }
            return this;
        }

        public e J(CharSequence charSequence) {
            this.f2767r = i(charSequence);
            return this;
        }

        public e K(CharSequence charSequence) {
            this.T.tickerText = i(charSequence);
            return this;
        }

        public e L(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public e M(int i10) {
            this.G = i10;
            return this;
        }

        public e N(long j10) {
            this.T.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2751b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f2751b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new m(this).c();
        }

        public e d(f fVar) {
            fVar.a(this);
            return this;
        }

        public int e() {
            return this.F;
        }

        public Bundle f() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public int g() {
            return this.f2762m;
        }

        public long h() {
            if (this.f2763n) {
                return this.T.when;
            }
            return 0;
        }

        public e k(boolean z10) {
            t(16, z10);
            return this;
        }

        public e l(String str) {
            this.L = str;
            return this;
        }

        public e m(int i10) {
            this.F = i10;
            return this;
        }

        public e n(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.f2756g = pendingIntent;
            return this;
        }

        public e p(CharSequence charSequence) {
            this.f2755f = i(charSequence);
            return this;
        }

        public e q(CharSequence charSequence) {
            this.f2754e = i(charSequence);
            return this;
        }

        public e r(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e s(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public e u(String str) {
            this.f2773x = str;
            return this;
        }

        public e v(int i10) {
            this.P = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f2774y = z10;
            return this;
        }

        public e x(Bitmap bitmap) {
            this.f2759j = j(bitmap);
            return this;
        }

        public e y(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e z(boolean z10) {
            this.A = z10;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }
    }
}
