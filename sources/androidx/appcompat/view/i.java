package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper */
public class i implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    final Window.Callback f1076a;

    /* compiled from: WindowCallbackWrapper */
    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i10) {
            return callback.onWindowStartingActionMode(callback2, i10);
        }
    }

    /* compiled from: WindowCallbackWrapper */
    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            callback.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    /* compiled from: WindowCallbackWrapper */
    static class c {
        static void a(Window.Callback callback, boolean z10) {
            callback.onPointerCaptureChanged(z10);
        }
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f1076a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f1076a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1076a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1076a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1076a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1076a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1076a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1076a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f1076a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f1076a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f1076a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f1076a.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.f1076a.onCreatePanelView(i10);
    }

    public void onDetachedFromWindow() {
        this.f1076a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f1076a.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f1076a.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f1076a.onPanelClosed(i10, menu);
    }

    public void onPointerCaptureChanged(boolean z10) {
        c.a(this.f1076a, z10);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f1076a.onPreparePanel(i10, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        b.a(this.f1076a, list, menu, i10);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f1076a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1076a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f1076a.onWindowFocusChanged(z10);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1076a.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f1076a.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return a.b(this.f1076a, callback, i10);
    }
}
