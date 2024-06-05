package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.view.a0;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.t;

/* compiled from: SwipeRefreshLayout */
public class c extends ViewGroup implements r, q, o, s {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    static final int CIRCLE_DIAMETER = 40;
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {16842766};
    private static final String LOG_TAG = c.class.getSimpleName();
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private i mChildScrollUpCallback;
    private int mCircleDiameter;
    a mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private boolean mEnableLegacyRequestDisallowInterceptTouch;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    j mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final p mNestedScrollingChildHelper;
    private final t mNestedScrollingParentHelper;
    private final int[] mNestedScrollingV2ConsumedCompat;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    b mProgress;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    /* compiled from: SwipeRefreshLayout */
    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (cVar.mRefreshing) {
                cVar.mProgress.setAlpha(c.MAX_ALPHA);
                c.this.mProgress.start();
                c cVar2 = c.this;
                if (cVar2.mNotify && (jVar = cVar2.mListener) != null) {
                    jVar.onRefresh();
                }
                c cVar3 = c.this;
                cVar3.mCurrentTargetOffsetTop = cVar3.mCircleView.getTop();
                return;
            }
            cVar.reset();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(f10);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$c  reason: collision with other inner class name */
    /* compiled from: SwipeRefreshLayout */
    class C0084c extends Animation {
        C0084c() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4853b;

        d(int i10, int i11) {
            this.f4852a = i10;
            this.f4853b = i11;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            b bVar = c.this.mProgress;
            int i10 = this.f4852a;
            bVar.setAlpha((int) (((float) i10) + (((float) (this.f4853b - i10)) * f10)));
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (!cVar.mScale) {
                cVar.startScaleDownAnimation((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            c cVar = c.this;
            if (!cVar.mUsingCustomStart) {
                i10 = cVar.mSpinnerOffsetEnd - Math.abs(cVar.mOriginalOffsetTop);
            } else {
                i10 = cVar.mSpinnerOffsetEnd;
            }
            c cVar2 = c.this;
            int i11 = cVar2.mFrom;
            c.this.setTargetOffsetTopAndBottom((i11 + ((int) (((float) (i10 - i11)) * f10))) - cVar2.mCircleView.getTop());
            c.this.mProgress.e(1.0f - f10);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c.this.moveToStart(f10);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            float f11 = cVar.mStartingScale;
            cVar.setAnimationProgress(f11 + ((-f11) * f10));
            c.this.moveToStart(f10);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    public interface i {
        boolean canChildScrollUp(c cVar, View view);
    }

    /* compiled from: SwipeRefreshLayout */
    public interface j {
        void onRefresh();
    }

    public c(Context context) {
        this(context, (AttributeSet) null);
    }

    private void animateOffsetToCorrectPosition(int i10, Animation.AnimationListener animationListener) {
        this.mFrom = i10;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.b(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i10, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i10, animationListener);
            return;
        }
        this.mFrom = i10;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.b(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private void createProgressView() {
        this.mCircleView = new a(getContext());
        b bVar = new b(getContext());
        this.mProgress = bVar;
        bVar.l(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private void finishSpinner(float f10) {
        if (f10 > this.mTotalDragDistance) {
            setRefreshing(true, true);
            return;
        }
        this.mRefreshing = false;
        this.mProgress.j(0.0f, 0.0f);
        e eVar = null;
        if (!this.mScale) {
            eVar = new e();
        }
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, eVar);
        this.mProgress.d(false);
    }

    private boolean isAnimationRunning(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void moveSpinner(float f10) {
        this.mProgress.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.mTotalDragDistance));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.mTotalDragDistance;
        int i10 = this.mCustomSlingshotDistance;
        if (i10 <= 0) {
            if (this.mUsingCustomStart) {
                i10 = this.mSpinnerOffsetEnd - this.mOriginalOffsetTop;
            } else {
                i10 = this.mSpinnerOffsetEnd;
            }
        }
        float f11 = (float) i10;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.mOriginalOffsetTop + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f10 / this.mTotalDragDistance));
        }
        if (f10 < this.mTotalDragDistance) {
            if (this.mProgress.getAlpha() > 76 && !isAnimationRunning(this.mAlphaStartAnimation)) {
                startProgressAlphaStartAnimation();
            }
        } else if (this.mProgress.getAlpha() < MAX_ALPHA && !isAnimationRunning(this.mAlphaMaxAnimation)) {
            startProgressAlphaMaxAnimation();
        }
        this.mProgress.j(0.0f, Math.min(MAX_PROGRESS_ANGLE, max * MAX_PROGRESS_ANGLE));
        this.mProgress.e(Math.min(1.0f, max));
        this.mProgress.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * DRAG_RATE);
        setTargetOffsetTopAndBottom(i11 - this.mCurrentTargetOffsetTop);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.mCircleView.getBackground().setAlpha(i10);
        this.mProgress.setAlpha(i10);
    }

    private Animation startAlphaAnimation(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300);
        this.mCircleView.b((Animation.AnimationListener) null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(dVar);
        return dVar;
    }

    private void startDragging(float f10) {
        float f11 = this.mInitialDownY;
        int i10 = this.mTouchSlop;
        if (f10 - f11 > ((float) i10) && !this.mIsBeingDragged) {
            this.mInitialMotionY = f11 + ((float) i10);
            this.mIsBeingDragged = true;
            this.mProgress.setAlpha(76);
        }
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), MAX_ALPHA);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    private void startScaleDownReturnToStartAnimation(int i10, Animation.AnimationListener animationListener) {
        this.mFrom = i10;
        this.mStartingScale = this.mCircleView.getScaleX();
        h hVar = new h();
        this.mScaleDownToStartAnimation = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.mCircleView.b(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(MAX_ALPHA);
        b bVar = new b();
        this.mScaleAnimation = bVar;
        bVar.setDuration((long) this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.b(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public boolean canChildScrollUp() {
        i iVar = this.mChildScrollUpCallback;
        if (iVar != null) {
            return iVar.canChildScrollUp(this, this.mTarget);
        }
        View view = this.mTarget;
        if (view instanceof ListView) {
            return androidx.core.widget.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.mNestedScrollingChildHelper.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.mNestedScrollingChildHelper.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return i12 == 0 && dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.mNestedScrollingChildHelper.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.mCircleViewIndex;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public boolean hasNestedScrollingParent(int i10) {
        return i10 == 0 && hasNestedScrollingParent();
    }

    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.m();
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    /* access modifiers changed from: package-private */
    public void moveToStart(float f10) {
        int i10 = this.mFrom;
        setTargetOffsetTopAndBottom((i10 + ((int) (((float) (this.mOriginalOffsetTop - i10)) * f10))) - this.mCircleView.getTop());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.mActivePointerId;
                    if (i10 == -1) {
                        Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    startDragging(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(findPointerIndex2);
        }
        return this.mIsBeingDragged;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            View view = this.mTarget;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.mCircleView.getMeasuredWidth();
                int measuredHeight2 = this.mCircleView.getMeasuredHeight();
                int i14 = measuredWidth / 2;
                int i15 = measuredWidth2 / 2;
                int i16 = this.mCurrentTargetOffsetTop;
                this.mCircleView.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
            this.mCircleViewIndex = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.mCircleView) {
                    this.mCircleViewIndex = i12;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 == 0) {
            int i15 = iArr[1];
            dispatchNestedScroll(i10, i11, i12, i13, this.mParentOffsetInWindow, i14, iArr);
            int i16 = i13 - (iArr[1] - i15);
            int i17 = i16 == 0 ? i13 + this.mParentOffsetInWindow[1] : i16;
            if (i17 < 0 && !canChildScrollUp()) {
                float abs = this.mTotalUnconsumed + ((float) Math.abs(i17));
                this.mTotalUnconsumed = abs;
                moveSpinner(abs);
                iArr[1] = iArr[1] + i16;
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f4859a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.mRefreshing);
    }

    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex < 0) {
                Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.mIsBeingDragged) {
                float y10 = (motionEvent.getY(findPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
                this.mIsBeingDragged = false;
                finishSpinner(y10);
            }
            this.mActivePointerId = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex2 < 0) {
                Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y11 = motionEvent.getY(findPointerIndex2);
            startDragging(y11);
            if (this.mIsBeingDragged) {
                float f10 = (y11 - this.mInitialMotionY) * DRAG_RATE;
                if (f10 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                moveSpinner(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view;
        if ((Build.VERSION.SDK_INT >= 21 || !(this.mTarget instanceof AbsListView)) && ((view = this.mTarget) == null || a0.S(view))) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else if (!this.mEnableLegacyRequestDisallowInterceptTouch && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(MAX_ALPHA);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f10) {
        this.mCircleView.setScaleX(f10);
        this.mCircleView.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        ensureTarget();
        this.mProgress.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.mTotalDragDistance = (float) i10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            reset();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.mEnableLegacyRequestDisallowInterceptTouch = z10;
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.mNestedScrollingChildHelper.n(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.mChildScrollUpCallback = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.mListener = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.mCircleView.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    public void setProgressViewEndTarget(boolean z10, int i10) {
        this.mSpinnerOffsetEnd = i10;
        this.mScale = z10;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z10, int i10, int i11) {
        this.mScale = z10;
        this.mOriginalOffsetTop = i10;
        this.mSpinnerOffsetEnd = i11;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (!z10 || this.mRefreshing == z10) {
            setRefreshing(z10, false);
            return;
        }
        this.mRefreshing = z10;
        if (!this.mUsingCustomStart) {
            i10 = this.mSpinnerOffsetEnd + this.mOriginalOffsetTop;
        } else {
            i10 = this.mSpinnerOffsetEnd;
        }
        setTargetOffsetTopAndBottom(i10 - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        startScaleUpAnimation(this.mRefreshListener);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable((Drawable) null);
            this.mProgress.l(i10);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.mCustomSlingshotDistance = i10;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i10) {
        this.mCircleView.bringToFront();
        a0.Y(this.mCircleView, i10);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public boolean startNestedScroll(int i10, int i11) {
        return i11 == 0 && startNestedScroll(i10);
    }

    /* access modifiers changed from: package-private */
    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        C0084c cVar = new C0084c();
        this.mScaleDownAnimation = cVar;
        cVar.setDuration(150);
        this.mCircleView.b(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    public void stopNestedScroll(int i10) {
        if (i10 == 0) {
            stopNestedScroll();
        }
    }

    /* compiled from: SwipeRefreshLayout */
    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final boolean f4859a;

        /* compiled from: SwipeRefreshLayout */
        class a implements Parcelable.Creator<k> {
            a() {
            }

            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f4859a = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f4859a ? (byte) 1 : 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f4859a = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new a();
        this.mAnimateToCorrectPosition = new f();
        this.mAnimateToStartPosition = new g();
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i10;
        this.mTotalDragDistance = (float) i10;
        this.mNestedScrollingParentHelper = new t(this);
        this.mNestedScrollingChildHelper = new p(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i11;
        this.mOriginalOffsetTop = i11;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return i14 == 0 && this.mNestedScrollingChildHelper.g(i10, i11, i12, i13, iArr, i14);
    }

    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.k();
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.mTotalUnconsumed;
            if (f10 > 0.0f) {
                float f11 = (float) i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f10 - f11;
                    iArr[1] = i11;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i11 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.mNestedScrollingParentHelper.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return isEnabled() && !this.mReturningToStart && !this.mRefreshing && (i10 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.d(view);
        this.mNestedScrollInProgress = false;
        float f10 = this.mTotalUnconsumed;
        if (f10 > 0.0f) {
            finishSpinner(f10);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean startNestedScroll(int i10) {
        return this.mNestedScrollingChildHelper.p(i10);
    }

    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.r();
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.mNestedScrollingChildHelper.f(i10, i11, i12, i13, iArr);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, i14, this.mNestedScrollingV2ConsumedCompat);
    }

    private void setRefreshing(boolean z10, boolean z11) {
        if (this.mRefreshing != z10) {
            this.mNotify = z11;
            ensureTarget();
            this.mRefreshing = z10;
            if (z10) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.mNestedScrollingV2ConsumedCompat);
    }
}
