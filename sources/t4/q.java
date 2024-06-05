package t4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b0;
import com.google.android.gms.ads.internal.util.b2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class q extends b0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f22709a;

    /* synthetic */ q(r rVar, p pVar) {
        this.f22709a = rVar;
    }

    public final void zza() {
        BitmapDrawable bitmapDrawable;
        Bitmap a10 = t.w().a(Integer.valueOf(this.f22709a.f22712b.f14711p.f14688g));
        if (a10 != null) {
            t.r();
            r rVar = this.f22709a;
            Activity activity = rVar.f22711a;
            j jVar = rVar.f22712b.f14711p;
            boolean z10 = jVar.f14686d;
            float f10 = jVar.f14687f;
            if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a10);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a10, a10.getWidth(), a10.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f10);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a10);
                }
            }
            b2.f14773i.post(new o(this, bitmapDrawable));
        }
    }
}
