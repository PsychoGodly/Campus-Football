package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<c, Integer> originToFlutterId;
    private final b reflectionAccessors = new b();
    private final View rootAccessibilityView;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Method f34504a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f34505b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f34506c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f34507d;

        /* renamed from: e  reason: collision with root package name */
        private final Field f34508e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f34509f;

        /* access modifiers changed from: private */
        public Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            Method method = this.f34507d;
            if (method == null && (this.f34508e == null || this.f34509f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i10)});
                } catch (IllegalAccessException e10) {
                    xb.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e10);
                    return null;
                } catch (InvocationTargetException e11) {
                    xb.b.h(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e11);
                    return null;
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f34509f.invoke(this.f34508e.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i10)})).longValue());
                } catch (IllegalAccessException e12) {
                    xb.b.h(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e12);
                    return null;
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e13) {
                    xb.b.h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e13);
                    return null;
                }
            }
        }

        /* access modifiers changed from: private */
        public Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f34505b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e10) {
                    xb.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e10);
                } catch (InvocationTargetException e11) {
                    xb.b.h(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e11);
                }
            }
            return l(accessibilityNodeInfo);
        }

        /* access modifiers changed from: private */
        public Long h(AccessibilityRecord accessibilityRecord) {
            Method method = this.f34506c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e10) {
                xb.b.h(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e10);
                return null;
            } catch (InvocationTargetException e11) {
                xb.b.h(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e11);
                return null;
            }
        }

        /* access modifiers changed from: private */
        public Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f34504a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e10) {
                xb.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e10);
                return null;
            } catch (InvocationTargetException e11) {
                xb.b.h(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e11);
                return null;
            }
        }

        /* access modifiers changed from: private */
        public static int j(long j10) {
            return (int) (j10 >> 32);
        }

        private static boolean k(long j10, int i10) {
            return (j10 & (1 << i10)) != 0;
        }

        private static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            Long l10 = null;
            if (Build.VERSION.SDK_INT < 26) {
                xb.b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            if (k(readLong, 3)) {
                l10 = Long.valueOf(obtain2.readLong());
            }
            obtain2.recycle();
            return l10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.reflect.Field} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private b() {
            /*
                r10 = this;
                java.lang.String r0 = "getSourceNodeId"
                java.lang.String r1 = "AccessibilityBridge"
                r10.<init>()
                r2 = 0
                r3 = 0
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0012 }
                java.lang.reflect.Method r4 = r4.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0012 }
                goto L_0x0018
            L_0x0012:
                java.lang.String r4 = "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
                xb.b.g(r1, r4)
                r4 = r3
            L_0x0018:
                java.lang.Class<android.view.accessibility.AccessibilityRecord> r5 = android.view.accessibility.AccessibilityRecord.class
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
                java.lang.reflect.Method r0 = r5.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x0021 }
                goto L_0x0027
            L_0x0021:
                java.lang.String r0 = "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
                xb.b.g(r1, r0)
                r0 = r3
            L_0x0027:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 26
                r7 = 1
                if (r5 > r6) goto L_0x0058
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r6 = "getParentNodeId"
                java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0039 }
                java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ NoSuchMethodException -> 0x0039 }
                goto L_0x003f
            L_0x0039:
                java.lang.String r5 = "can't invoke getParentNodeId with reflection"
                xb.b.g(r1, r5)
                r5 = r3
            L_0x003f:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r6 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r8 = "getChildId"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x004f }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004f }
                r7[r2] = r9     // Catch:{ NoSuchMethodException -> 0x004f }
                java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch:{ NoSuchMethodException -> 0x004f }
                r2 = r3
                goto L_0x0056
            L_0x004f:
                java.lang.String r2 = "can't invoke getChildId with reflection"
                xb.b.g(r1, r2)
                r1 = r3
                r2 = r1
            L_0x0056:
                r3 = r5
                goto L_0x007f
            L_0x0058:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r6 = "mChildNodeIds"
                java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r5.setAccessible(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.String r6 = "android.util.LongArray"
                java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.String r8 = "get"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r7[r2] = r9     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r2 = r1
                r1 = r3
                goto L_0x0080
            L_0x0078:
                java.lang.String r2 = "can't access childNodeIdsField with reflection"
                xb.b.g(r1, r2)
                r1 = r3
                r2 = r1
            L_0x007f:
                r5 = r2
            L_0x0080:
                r10.f34504a = r4
                r10.f34505b = r3
                r10.f34506c = r0
                r10.f34507d = r1
                r10.f34508e = r5
                r10.f34509f = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.b.<init>():void");
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final View f34510a;

        /* renamed from: b  reason: collision with root package name */
        final int f34511b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f34511b != cVar.f34511b || !this.f34510a.equals(cVar.f34510a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f34510a.hashCode() + 31) * 31) + this.f34511b;
        }

        private c(View view, int i10) {
            this.f34510a = view;
            this.f34511b = i10;
        }
    }

    AccessibilityViewEmbedder(View view, int i10) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i10;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i10;
        for (int i11 = 0; i11 < accessibilityNodeInfo.getChildCount(); i11++) {
            Long d10 = this.reflectionAccessors.f(accessibilityNodeInfo, i11);
            if (d10 != null) {
                int b10 = b.j(d10.longValue());
                c cVar = new c(view, b10);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i10 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i12 = this.nextFlutterId;
                    this.nextFlutterId = i12 + 1;
                    cacheVirtualIdMappings(view, b10, i12);
                    i10 = i12;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i10);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i10, int i11) {
        c cVar = new c(view, i10);
        this.originToFlutterId.put(cVar, Integer.valueOf(i11));
        this.flutterIdToOrigin.put(i11, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i10, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i10);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i10);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (i10 >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (i10 >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (i10 >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (i10 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i10 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long c10 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (c10 != null) {
            Integer num = this.originToFlutterId.get(new c(view, b.j(c10.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f34510a) || cVar.f34510a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f34510a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f34511b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i10, cVar.f34510a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long e10 = this.reflectionAccessors.h(accessibilityRecord);
        if (e10 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(e10.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i10, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long a10 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (a10 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(a10.longValue()), i10);
        return convertToFlutterNode(createAccessibilityNodeInfo, i10, view);
    }

    public boolean onAccessibilityHoverEvent(int i10, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f34510a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
            motionEvent2.getPointerProperties(i11, pointerPropertiesArr[i11]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i11, pointerCoords);
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i11].x -= (float) rect.left;
            pointerCoordsArr[i11].y -= (float) rect.top;
        }
        return cVar.f34510a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null || (accessibilityNodeProvider = cVar.f34510a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f34511b, i11, bundle);
    }

    public View platformViewOfNode(int i10) {
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null) {
            return null;
        }
        return cVar.f34510a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long e10 = this.reflectionAccessors.h(accessibilityEvent);
        if (e10 == null) {
            return false;
        }
        int b10 = b.j(e10.longValue());
        Integer num = this.originToFlutterId.get(new c(view, b10));
        if (num == null) {
            int i10 = this.nextFlutterId;
            this.nextFlutterId = i10 + 1;
            num = Integer.valueOf(i10);
            cacheVirtualIdMappings(view, b10, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i11 = 0; i11 < obtain.getRecordCount(); i11++) {
            AccessibilityRecord record = obtain.getRecord(i11);
            Long e11 = this.reflectionAccessors.h(record);
            if (e11 == null) {
                return false;
            }
            c cVar = new c(view, b.j(e11.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
