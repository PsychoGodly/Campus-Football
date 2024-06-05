package androidx.media.app;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.media.i;
import androidx.media.j;
import androidx.media.k;

/* compiled from: NotificationCompat */
public class c extends l.h {

    /* renamed from: e  reason: collision with root package name */
    int[] f4016e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f4017f;

    /* renamed from: g  reason: collision with root package name */
    boolean f4018g;

    /* renamed from: h  reason: collision with root package name */
    PendingIntent f4019h;

    private RemoteViews o(l.a aVar) {
        boolean z10 = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f2777a.f2750a.getPackageName(), k.notification_media_action);
        int i10 = i.action0;
        remoteViews.setImageViewResource(i10, aVar.e());
        if (!z10) {
            remoteViews.setOnClickPendingIntent(i10, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            a.a(remoteViews, i10, aVar.j());
        }
        return remoteViews;
    }

    public void b(androidx.core.app.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(kVar.a(), b.b(b.a(), this.f4016e, this.f4017f));
        } else if (this.f4018g) {
            kVar.a().setOngoing(true);
        }
    }

    public RemoteViews i(androidx.core.app.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return m();
    }

    public RemoteViews j(androidx.core.app.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return n();
    }

    /* access modifiers changed from: package-private */
    public RemoteViews m() {
        int min = Math.min(this.f2777a.f2751b.size(), 5);
        RemoteViews c10 = c(false, p(min), false);
        c10.removeAllViews(i.media_actions);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                c10.addView(i.media_actions, o(this.f2777a.f2751b.get(i10)));
            }
        }
        if (this.f4018g) {
            int i11 = i.cancel_action;
            c10.setViewVisibility(i11, 0);
            c10.setInt(i11, "setAlpha", this.f2777a.f2750a.getResources().getInteger(j.f4134a));
            c10.setOnClickPendingIntent(i11, this.f4019h);
        } else {
            c10.setViewVisibility(i.cancel_action, 8);
        }
        return c10;
    }

    /* access modifiers changed from: package-private */
    public RemoteViews n() {
        int i10;
        RemoteViews c10 = c(false, q(), true);
        int size = this.f2777a.f2751b.size();
        int[] iArr = this.f4016e;
        if (iArr == null) {
            i10 = 0;
        } else {
            i10 = Math.min(iArr.length, 3);
        }
        c10.removeAllViews(i.media_actions);
        if (i10 > 0) {
            int i11 = 0;
            while (i11 < i10) {
                if (i11 < size) {
                    c10.addView(i.media_actions, o(this.f2777a.f2751b.get(this.f4016e[i11])));
                    i11++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i11), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f4018g) {
            c10.setViewVisibility(i.end_padder, 8);
            int i12 = i.cancel_action;
            c10.setViewVisibility(i12, 0);
            c10.setOnClickPendingIntent(i12, this.f4019h);
            c10.setInt(i12, "setAlpha", this.f2777a.f2750a.getResources().getInteger(j.f4134a));
        } else {
            c10.setViewVisibility(i.end_padder, 0);
            c10.setViewVisibility(i.cancel_action, 8);
        }
        return c10;
    }

    /* access modifiers changed from: package-private */
    public int p(int i10) {
        if (i10 <= 3) {
            return k.notification_template_big_media_narrow;
        }
        return k.notification_template_big_media;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return k.notification_template_media;
    }

    public c r(PendingIntent pendingIntent) {
        this.f4019h = pendingIntent;
        return this;
    }

    public c s(MediaSessionCompat.Token token) {
        this.f4017f = token;
        return this;
    }

    public c t(int... iArr) {
        this.f4016e = iArr;
        return this;
    }

    public c u(boolean z10) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f4018g = z10;
        }
        return this;
    }
}
