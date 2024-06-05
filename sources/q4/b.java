package q4;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import n4.o;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private o f21816a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView.ScaleType f21817b;

    public b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f21817b = scaleType;
    }

    public void setMediaContent(o oVar) {
        this.f21816a = oVar;
    }
}
