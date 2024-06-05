package io.flutter.plugins.webviewflutter;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DisplayListenerProxy */
class f {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<DisplayManager.DisplayListener> f34238a;

    /* compiled from: DisplayListenerProxy */
    class a implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f34239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DisplayManager f34240b;

        a(ArrayList arrayList, DisplayManager displayManager) {
            this.f34239a = arrayList;
            this.f34240b = displayManager;
        }

        public void onDisplayAdded(int i10) {
            Iterator it = this.f34239a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i10);
            }
        }

        public void onDisplayChanged(int i10) {
            if (this.f34240b.getDisplay(i10) != null) {
                Iterator it = this.f34239a.iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i10);
                }
            }
        }

        public void onDisplayRemoved(int i10) {
            Iterator it = this.f34239a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i10);
            }
        }
    }

    f() {
    }

    private static ArrayList<DisplayManager.DisplayListener> c(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            Field field = null;
            ArrayList<DisplayManager.DisplayListener> arrayList = new ArrayList<>();
            Iterator it = ((ArrayList) declaredField2.get(obj)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e10);
            return new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(DisplayManager displayManager) {
        ArrayList<DisplayManager.DisplayListener> c10 = c(displayManager);
        c10.removeAll(this.f34238a);
        if (!c10.isEmpty()) {
            Iterator<DisplayManager.DisplayListener> it = c10.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener(it.next());
                displayManager.registerDisplayListener(new a(c10, displayManager), (Handler) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(DisplayManager displayManager) {
        this.f34238a = c(displayManager);
    }
}
