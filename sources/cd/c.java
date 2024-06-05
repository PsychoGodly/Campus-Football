package cd;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Objects;
import kotlin.jvm.internal.m;
import lc.j;
import lc.k;

/* compiled from: MethodCallHandlerImpl.kt */
public final class c implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private Context f31972a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Toast f31973b;

    /* compiled from: MethodCallHandlerImpl.kt */
    public static final class a extends Toast.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f31974a;

        a(c cVar) {
            this.f31974a = cVar;
        }

        public void onToastHidden() {
            c.super.onToastHidden();
            this.f31974a.f31973b = null;
        }
    }

    public c(Context context) {
        m.e(context, "context");
        this.f31972a = context;
    }

    /* access modifiers changed from: private */
    public static final void c(c cVar) {
        m.e(cVar, "this$0");
        Toast toast = cVar.f31973b;
        if (toast != null) {
            toast.show();
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        int i10;
        Toast toast;
        Drawable drawable;
        m.e(jVar, "call");
        m.e(dVar, "result");
        String str = jVar.f36116a;
        View view = null;
        if (m.a(str, "showToast")) {
            String valueOf = String.valueOf(jVar.a("msg"));
            String valueOf2 = String.valueOf(jVar.a("length"));
            String valueOf3 = String.valueOf(jVar.a("gravity"));
            Number number = (Number) jVar.a("bgcolor");
            Number number2 = (Number) jVar.a("textcolor");
            Number number3 = (Number) jVar.a("fontSize");
            if (m.a(valueOf3, "top")) {
                i10 = 48;
            } else {
                i10 = m.a(valueOf3, "center") ? 17 : 80;
            }
            boolean a10 = m.a(valueOf2, "long");
            if (number != null) {
                Object systemService = this.f31972a.getSystemService("layout_inflater");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(f.toast_custom, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(e.f31975a);
                textView.setText(valueOf);
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = this.f31972a.getDrawable(d.corner);
                    m.b(drawable);
                } else {
                    drawable = androidx.core.content.a.getDrawable(this.f31972a, d.corner);
                }
                m.b(drawable);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView.setBackground(drawable);
                if (number3 != null) {
                    textView.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f31972a);
                this.f31973b = toast2;
                toast2.setDuration(a10);
                Toast toast3 = this.f31973b;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            } else {
                try {
                    Toast makeText = Toast.makeText(this.f31972a, valueOf, a10 ? 1 : 0);
                    this.f31973b = makeText;
                    if (makeText != null) {
                        view = makeText.getView();
                    }
                    m.b(view);
                    View findViewById = view.findViewById(16908299);
                    m.d(findViewById, "mToast?.view!!.findViewById(android.R.id.message,)");
                    TextView textView2 = (TextView) findViewById;
                    if (number3 != null) {
                        textView2.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView2.setTextColor(number2.intValue());
                    }
                } catch (Exception unused) {
                }
            }
            if (i10 == 17) {
                Toast toast4 = this.f31973b;
                if (toast4 != null) {
                    toast4.setGravity(i10, 0, 0);
                }
            } else if (i10 != 48) {
                try {
                    Toast toast5 = this.f31973b;
                    if (toast5 != null) {
                        toast5.setGravity(i10, 0, 100);
                    }
                } catch (Exception unused2) {
                }
            } else {
                Toast toast6 = this.f31973b;
                if (toast6 != null) {
                    toast6.setGravity(i10, 0, 100);
                }
            }
            Context context = this.f31972a;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new b(this));
            } else {
                Toast toast7 = this.f31973b;
                if (toast7 != null) {
                    toast7.show();
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (toast = this.f31973b) != null) {
                toast.addCallback(new a(this));
            }
            dVar.success(Boolean.TRUE);
        } else if (m.a(str, "cancel")) {
            Toast toast8 = this.f31973b;
            if (toast8 != null) {
                if (toast8 != null) {
                    toast8.cancel();
                }
                this.f31973b = null;
            }
            dVar.success(Boolean.TRUE);
        } else {
            dVar.notImplemented();
        }
    }
}
