package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
class m implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2781a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f2782b;

    /* renamed from: c  reason: collision with root package name */
    private final l.e f2783c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f2784d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f2785e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f2786f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f2787g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f2788h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f2789i;

    /* compiled from: NotificationCompatBuilder */
    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder */
    static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    m(l.e eVar) {
        int i10;
        Object obj;
        List<String> list;
        List<String> e10;
        this.f2783c = eVar;
        Context context = eVar.f2750a;
        this.f2781a = context;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f2782b = h.a(context, eVar.L);
        } else {
            this.f2782b = new Notification.Builder(eVar.f2750a);
        }
        Notification notification = eVar.T;
        this.f2782b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2758i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2754e).setContentText(eVar.f2755f).setContentInfo(eVar.f2760k).setContentIntent(eVar.f2756g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2757h, (notification.flags & 128) != 0).setLargeIcon(eVar.f2759j).setNumber(eVar.f2761l).setProgress(eVar.f2770u, eVar.f2771v, eVar.f2772w);
        if (i11 < 21) {
            this.f2782b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i11 >= 16) {
            a.b(a.d(a.c(this.f2782b, eVar.f2767r), eVar.f2764o), eVar.f2762m);
            Iterator<l.a> it = eVar.f2751b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = eVar.E;
            if (bundle != null) {
                this.f2787g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.A) {
                    this.f2787g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f2773x;
                if (str != null) {
                    this.f2787g.putString("android.support.groupKey", str);
                    if (eVar.f2774y) {
                        this.f2787g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2787g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f2775z;
                if (str2 != null) {
                    this.f2787g.putString("android.support.sortKey", str2);
                }
            }
            this.f2784d = eVar.I;
            this.f2785e = eVar.J;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            b.a(this.f2782b, eVar.f2763n);
        }
        if (i12 >= 19 && i12 < 21 && (e10 = e(g(eVar.f2752c), eVar.W)) != null && !e10.isEmpty()) {
            this.f2787g.putStringArray("android.people", (String[]) e10.toArray(new String[e10.size()]));
        }
        if (i12 >= 20) {
            d.i(this.f2782b, eVar.A);
            d.g(this.f2782b, eVar.f2773x);
            d.j(this.f2782b, eVar.f2775z);
            d.h(this.f2782b, eVar.f2774y);
            this.f2788h = eVar.P;
        }
        if (i12 >= 21) {
            e.b(this.f2782b, eVar.D);
            e.c(this.f2782b, eVar.F);
            e.f(this.f2782b, eVar.G);
            e.d(this.f2782b, eVar.H);
            e.e(this.f2782b, notification.sound, notification.audioAttributes);
            if (i12 < 28) {
                list = e(g(eVar.f2752c), eVar.W);
            } else {
                list = eVar.W;
            }
            if (list != null && !list.isEmpty()) {
                for (String a10 : list) {
                    e.a(this.f2782b, a10);
                }
            }
            this.f2789i = eVar.K;
            if (eVar.f2753d.size() > 0) {
                Bundle bundle2 = eVar.f().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i13 = 0; i13 < eVar.f2753d.size(); i13++) {
                    bundle4.putBundle(Integer.toString(i13), n.b(eVar.f2753d.get(i13)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.f().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2787g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (obj = eVar.V) != null) {
            f.b(this.f2782b, obj);
        }
        if (i14 >= 24) {
            c.a(this.f2782b, eVar.E);
            g.e(this.f2782b, eVar.f2769t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                g.c(this.f2782b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                g.b(this.f2782b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                g.d(this.f2782b, remoteViews3);
            }
        }
        if (i14 >= 26) {
            h.b(this.f2782b, eVar.M);
            h.e(this.f2782b, eVar.f2768s);
            h.f(this.f2782b, eVar.N);
            h.g(this.f2782b, eVar.O);
            h.d(this.f2782b, eVar.P);
            if (eVar.C) {
                h.c(this.f2782b, eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.f2782b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i14 >= 28) {
            Iterator<p> it2 = eVar.f2752c.iterator();
            while (it2.hasNext()) {
                i.a(this.f2782b, it2.next().h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            j.a(this.f2782b, eVar.R);
            j.b(this.f2782b, l.d.a(eVar.S));
        }
        if (i15 >= 31 && (i10 = eVar.Q) != 0) {
            k.b(this.f2782b, i10);
        }
        if (eVar.U) {
            if (this.f2783c.f2774y) {
                this.f2788h = 2;
            } else {
                this.f2788h = 1;
            }
            this.f2782b.setVibrate((long[]) null);
            this.f2782b.setSound((Uri) null);
            int i16 = notification.defaults & -2;
            notification.defaults = i16;
            int i17 = i16 & -3;
            notification.defaults = i17;
            this.f2782b.setDefaults(i17);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f2783c.f2773x)) {
                    d.g(this.f2782b, "silent");
                }
                h.d(this.f2782b, this.f2788h);
            }
        }
    }

    private void b(l.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            IconCompat f10 = aVar.f();
            if (i10 >= 23) {
                builder = f.a(f10 != null ? f10.x() : null, aVar.j(), aVar.a());
            } else {
                builder = d.e(f10 != null ? f10.p() : 0, aVar.j(), aVar.a());
            }
            if (aVar.g() != null) {
                for (RemoteInput c10 : r.b(aVar.g())) {
                    d.c(builder, c10);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                g.a(builder, aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.h());
            if (i11 >= 28) {
                i.b(builder, aVar.h());
            }
            if (i11 >= 29) {
                j.c(builder, aVar.l());
            }
            if (i11 >= 31) {
                k.a(builder, aVar.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            d.b(builder, bundle);
            d.a(this.f2782b, d.d(builder));
        } else if (i10 >= 16) {
            this.f2786f.add(n.f(this.f2782b, aVar));
        }
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p g10 : list) {
            arrayList.add(g10.g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & -2;
        notification.defaults = i10;
        notification.defaults = i10 & -3;
    }

    public Notification.Builder a() {
        return this.f2782b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews k10;
        RemoteViews i10;
        l.h hVar = this.f2783c.f2766q;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews j10 = hVar != null ? hVar.j(this) : null;
        Notification d10 = d();
        if (j10 != null) {
            d10.contentView = j10;
        } else {
            RemoteViews remoteViews = this.f2783c.I;
            if (remoteViews != null) {
                d10.contentView = remoteViews;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (!(i11 < 16 || hVar == null || (i10 = hVar.i(this)) == null)) {
            d10.bigContentView = i10;
        }
        if (!(i11 < 21 || hVar == null || (k10 = this.f2783c.f2766q.k(this)) == null)) {
            d10.headsUpContentView = k10;
        }
        if (!(i11 < 16 || hVar == null || (a10 = l.a(d10)) == null)) {
            hVar.a(a10);
        }
        return d10;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.a(this.f2782b);
        }
        if (i10 >= 24) {
            Notification a10 = a.a(this.f2782b);
            if (this.f2788h != 0) {
                if (!(d.f(a10) == null || (a10.flags & 512) == 0 || this.f2788h != 2)) {
                    h(a10);
                }
                if (d.f(a10) != null && (a10.flags & 512) == 0 && this.f2788h == 1) {
                    h(a10);
                }
            }
            return a10;
        } else if (i10 >= 21) {
            c.a(this.f2782b, this.f2787g);
            Notification a11 = a.a(this.f2782b);
            RemoteViews remoteViews = this.f2784d;
            if (remoteViews != null) {
                a11.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2785e;
            if (remoteViews2 != null) {
                a11.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2789i;
            if (remoteViews3 != null) {
                a11.headsUpContentView = remoteViews3;
            }
            if (this.f2788h != 0) {
                if (!(d.f(a11) == null || (a11.flags & 512) == 0 || this.f2788h != 2)) {
                    h(a11);
                }
                if (d.f(a11) != null && (a11.flags & 512) == 0 && this.f2788h == 1) {
                    h(a11);
                }
            }
            return a11;
        } else if (i10 >= 20) {
            c.a(this.f2782b, this.f2787g);
            Notification a12 = a.a(this.f2782b);
            RemoteViews remoteViews4 = this.f2784d;
            if (remoteViews4 != null) {
                a12.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2785e;
            if (remoteViews5 != null) {
                a12.bigContentView = remoteViews5;
            }
            if (this.f2788h != 0) {
                if (!(d.f(a12) == null || (a12.flags & 512) == 0 || this.f2788h != 2)) {
                    h(a12);
                }
                if (d.f(a12) != null && (a12.flags & 512) == 0 && this.f2788h == 1) {
                    h(a12);
                }
            }
            return a12;
        } else if (i10 >= 19) {
            SparseArray<Bundle> a13 = n.a(this.f2786f);
            if (a13 != null) {
                this.f2787g.putSparseParcelableArray("android.support.actionExtras", a13);
            }
            c.a(this.f2782b, this.f2787g);
            Notification a14 = a.a(this.f2782b);
            RemoteViews remoteViews6 = this.f2784d;
            if (remoteViews6 != null) {
                a14.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2785e;
            if (remoteViews7 != null) {
                a14.bigContentView = remoteViews7;
            }
            return a14;
        } else if (i10 < 16) {
            return this.f2782b.getNotification();
        } else {
            Notification a15 = a.a(this.f2782b);
            Bundle a16 = l.a(a15);
            Bundle bundle = new Bundle(this.f2787g);
            for (String str : this.f2787g.keySet()) {
                if (a16.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a16.putAll(bundle);
            SparseArray<Bundle> a17 = n.a(this.f2786f);
            if (a17 != null) {
                l.a(a15).putSparseParcelableArray("android.support.actionExtras", a17);
            }
            RemoteViews remoteViews8 = this.f2784d;
            if (remoteViews8 != null) {
                a15.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2785e;
            if (remoteViews9 != null) {
                a15.bigContentView = remoteViews9;
            }
            return a15;
        }
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f2781a;
    }
}
