package t4;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcei;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f22703a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f22704b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f22705c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f22706d;

    public n(zzcei zzcei) throws l {
        this.f22704b = zzcei.getLayoutParams();
        ViewParent parent = zzcei.getParent();
        this.f22706d = zzcei.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new l("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f22705c = viewGroup;
        this.f22703a = viewGroup.indexOfChild(zzcei.zzF());
        viewGroup.removeView(zzcei.zzF());
        zzcei.zzan(true);
    }
}
