package y4;

import com.google.android.gms.internal.ads.zzdpd;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f23902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzdpd f23903b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayDeque f23904c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayDeque f23905d;

    public /* synthetic */ b(x xVar, zzdpd zzdpd, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.f23902a = xVar;
        this.f23903b = zzdpd;
        this.f23904c = arrayDeque;
        this.f23905d = arrayDeque2;
    }

    public final void run() {
        this.f23902a.e(this.f23903b, this.f23904c, this.f23905d);
    }
}
