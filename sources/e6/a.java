package e6;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f28734a;

    /* renamed from: b  reason: collision with root package name */
    private final int f28735b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28736c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28737d;

    public a(Dialog dialog, Rect rect) {
        this.f28734a = dialog;
        this.f28735b = rect.left;
        this.f28736c = rect.top;
        this.f28737d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f28735b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f28736c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f28737d;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.f28734a.onTouchEvent(obtain);
    }
}
