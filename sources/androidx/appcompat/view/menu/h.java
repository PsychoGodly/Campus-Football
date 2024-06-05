package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;
import h.g;

/* compiled from: MenuDialogHelper */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: a  reason: collision with root package name */
    private g f1219a;

    /* renamed from: b  reason: collision with root package name */
    private c f1220b;

    /* renamed from: c  reason: collision with root package name */
    e f1221c;

    /* renamed from: d  reason: collision with root package name */
    private m.a f1222d;

    public h(g gVar) {
        this.f1219a = gVar;
    }

    public void a(g gVar, boolean z10) {
        if (z10 || gVar == this.f1219a) {
            c();
        }
        m.a aVar = this.f1222d;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    public boolean b(g gVar) {
        m.a aVar = this.f1222d;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        c cVar = this.f1220b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f1219a;
        c.a aVar = new c.a(gVar.u());
        e eVar = new e(aVar.b(), g.f18276j);
        this.f1221c = eVar;
        eVar.g(this);
        this.f1219a.b(this.f1221c);
        aVar.c(this.f1221c.b(), this);
        View y10 = gVar.y();
        if (y10 != null) {
            aVar.d(y10);
        } else {
            aVar.e(gVar.w()).n(gVar.x());
        }
        aVar.j(this);
        c a10 = aVar.a();
        this.f1220b = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1220b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1220b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1219a.L((i) this.f1221c.b().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1221c.a(this.f1219a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1220b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1220b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1219a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1219a.performShortcut(i10, keyEvent, 0);
    }
}
