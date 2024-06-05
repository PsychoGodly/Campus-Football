package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AndroidTouchProcessor */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Matrix f33377e = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private final jc.a f33378a;

    /* renamed from: b  reason: collision with root package name */
    private final u f33379b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33380c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, float[]> f33381d = new HashMap();

    public a(jc.a aVar, boolean z10) {
        this.f33378a = aVar;
        this.f33379b = u.a();
        this.f33380c = z10;
    }

    private void a(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer) {
        long j10;
        double d10;
        double d11;
        double d12;
        double d13;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i13 = i10;
        int i14 = i11;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i14 != -1) {
            long d14 = this.f33380c ? this.f33379b.c(motionEvent2).d() : 0;
            int d15 = d(motionEvent.getToolType(i10));
            float[] fArr = {motionEvent.getX(i10), motionEvent.getY(i10)};
            matrix.mapPoints(fArr);
            if (d15 == 1) {
                j10 = (long) (motionEvent.getButtonState() & 31);
                if (j10 == 0 && motionEvent.getSource() == 8194 && i14 == 4) {
                    this.f33381d.put(Integer.valueOf(motionEvent.getPointerId(i10)), fArr);
                }
            } else {
                j10 = d15 == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.f33381d.containsKey(Integer.valueOf(motionEvent.getPointerId(i10)));
            int i15 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(d14);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) c(i14));
                byteBuffer2.putLong(4);
            } else {
                byteBuffer2.putLong((long) i14);
                byteBuffer2.putLong((long) d15);
            }
            byteBuffer2.putLong((long) i15);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i10));
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = this.f33381d.get(Integer.valueOf(motionEvent.getPointerId(i10)));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j10);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i10));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d11 = 1.0d;
                d10 = 0.0d;
            } else {
                d10 = (double) motionRange.getMin();
                d11 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d10);
            byteBuffer2.putDouble(d11);
            if (d15 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i13));
                d12 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            } else {
                d12 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble((double) motionEvent.getSize(i10));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i10));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i10));
            byteBuffer2.putDouble(d12);
            byteBuffer2.putDouble(d12);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i13));
            if (d15 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i13));
            } else {
                byteBuffer2.putDouble(d12);
            }
            byteBuffer2.putLong((long) i12);
            if (i15 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(9)));
            } else {
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            if (containsKey) {
                float[] fArr3 = this.f33381d.get(Integer.valueOf(motionEvent.getPointerId(i10)));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d13 = 0.0d;
            } else {
                d13 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d13);
            byteBuffer2.putDouble(d13);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d13);
            if (containsKey && c(i14) == 9) {
                this.f33381d.remove(Integer.valueOf(motionEvent.getPointerId(i10)));
            }
        }
    }

    private int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return 6;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 7) {
            return 3;
        }
        if (i10 == 3) {
            return 0;
        }
        return i10 == 8 ? 3 : -1;
    }

    private int c(int i10) {
        if (i10 == 4) {
            return 7;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 == 6 || i10 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    private int d(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 != 3) {
            return i10 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean e(MotionEvent motionEvent) {
        boolean z10 = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z11 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z10 || !z11) {
            return false;
        }
        int b10 = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b10, 0, f33377e, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.f33378a.j(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean f(MotionEvent motionEvent) {
        return g(motionEvent, f33377e);
    }

    public boolean g(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b10 = b(motionEvent.getActionMasked());
        boolean z10 = actionMasked == 0 || actionMasked == 5;
        boolean z11 = !z10 && (actionMasked == 1 || actionMasked == 6);
        if (z10) {
            a(motionEvent, motionEvent.getActionIndex(), b10, 0, matrix, allocateDirect);
        } else if (z11) {
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex() && motionEvent.getToolType(i10) == 1) {
                    a(motionEvent, i10, 5, 1, matrix, allocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b10, 0, matrix, allocateDirect);
        } else {
            for (int i11 = 0; i11 < pointerCount; i11++) {
                a(motionEvent, i11, b10, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 280 == 0) {
            this.f33378a.j(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
