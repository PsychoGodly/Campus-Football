package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog */
public class c extends k {

    /* renamed from: g  reason: collision with root package name */
    final AlertController f835g = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f836a;

        /* renamed from: b  reason: collision with root package name */
        private final int f837b;

        public a(Context context) {
            this(context, c.i(context, 0));
        }

        public c a() {
            c cVar = new c(this.f836a.f795a, this.f837b);
            this.f836a.a(cVar.f835g);
            cVar.setCancelable(this.f836a.f812r);
            if (this.f836a.f812r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f836a.f813s);
            cVar.setOnDismissListener(this.f836a.f814t);
            DialogInterface.OnKeyListener onKeyListener = this.f836a.f815u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f836a.f795a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f836a;
            fVar.f817w = listAdapter;
            fVar.f818x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f836a.f801g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f836a.f798d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f836a.f802h = charSequence;
            return this;
        }

        public a g(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f836a;
            fVar.f806l = fVar.f795a.getText(i10);
            this.f836a.f808n = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f836a;
            fVar.f806l = charSequence;
            fVar.f808n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnCancelListener onCancelListener) {
            this.f836a.f813s = onCancelListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f836a.f815u = onKeyListener;
            return this;
        }

        public a k(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f836a;
            fVar.f803i = fVar.f795a.getText(i10);
            this.f836a.f805k = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f836a;
            fVar.f803i = charSequence;
            fVar.f805k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f836a;
            fVar.f817w = listAdapter;
            fVar.f818x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a n(CharSequence charSequence) {
            this.f836a.f800f = charSequence;
            return this;
        }

        public a(Context context, int i10) {
            this.f836a = new AlertController.f(new ContextThemeWrapper(context, c.i(context, i10)));
            this.f837b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, i(context, i10));
    }

    static int i(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f18179o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView h() {
        return this.f835g.d();
    }

    public void j(View view) {
        this.f835g.s(view);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f835g.e();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f835g.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f835g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f835g.q(charSequence);
    }
}
