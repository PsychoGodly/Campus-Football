package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements androidx.core.view.o {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new c();
    k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<d0> mPendingAccessibilityImportanceChange;
    private y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.p mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final c0 mViewFlinger;
    private final p.b mViewInfoProcessCallback;
    final p mViewInfoStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    public static class a0 {

        /* renamed from: a  reason: collision with root package name */
        int f4370a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f4371b;

        /* renamed from: c  reason: collision with root package name */
        int f4372c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f4373d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f4374e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f4375f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f4376g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f4377h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f4378i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f4379j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f4380k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f4381l = false;

        /* renamed from: m  reason: collision with root package name */
        int f4382m;

        /* renamed from: n  reason: collision with root package name */
        long f4383n;

        /* renamed from: o  reason: collision with root package name */
        int f4384o;

        /* renamed from: p  reason: collision with root package name */
        int f4385p;

        /* renamed from: q  reason: collision with root package name */
        int f4386q;

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if ((this.f4374e & i10) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f4374e));
            }
        }

        public int b() {
            return this.f4377h ? this.f4372c - this.f4373d : this.f4375f;
        }

        public int c() {
            return this.f4370a;
        }

        public boolean d() {
            return this.f4370a != -1;
        }

        public boolean e() {
            return this.f4377h;
        }

        /* access modifiers changed from: package-private */
        public void f(g gVar) {
            this.f4374e = 1;
            this.f4375f = gVar.getItemCount();
            this.f4377h = false;
            this.f4378i = false;
            this.f4379j = false;
        }

        public boolean g() {
            return this.f4381l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4370a + ", mData=" + this.f4371b + ", mItemCount=" + this.f4375f + ", mIsMeasuring=" + this.f4379j + ", mPreviousLayoutItemCount=" + this.f4372c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4373d + ", mStructureChanged=" + this.f4376g + ", mInPreLayout=" + this.f4377h + ", mRunSimpleAnimations=" + this.f4380k + ", mRunPredictiveAnimations=" + this.f4381l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static abstract class b0 {
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f4388a;

        /* renamed from: b  reason: collision with root package name */
        private int f4389b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f4390c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f4391d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4392f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f4393g = false;

        c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f4391d = interpolator;
            this.f4390c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int i14;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i12 * i12) + (i13 * i13)));
            int sqrt2 = (int) Math.sqrt((double) ((i10 * i10) + (i11 * i11)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i15 = width / 2;
            float f10 = (float) width;
            float f11 = (float) i15;
            float b10 = f11 + (b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f10)) * f11);
            if (sqrt > 0) {
                i14 = Math.round(Math.abs(b10 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i14 = (int) (((((float) abs) / f10) + 1.0f) * 300.0f);
            }
            return Math.min(i14, 2000);
        }

        private float b(float f10) {
            return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.a0.f0(RecyclerView.this, this);
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f4389b = 0;
            this.f4388a = 0;
            Interpolator interpolator = this.f4391d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f4391d = interpolator2;
                this.f4390c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4390c.fling(0, 0, i10, i11, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER);
            e();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.f4392f) {
                this.f4393g = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11, 0, 0);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f4391d != interpolator) {
                this.f4391d = interpolator;
                this.f4390c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4389b = 0;
            this.f4388a = 0;
            RecyclerView.this.setScrollState(2);
            this.f4390c.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4390c.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f4390c.abortAnimation();
        }

        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                g();
                return;
            }
            this.f4393g = false;
            this.f4392f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f4390c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f4388a;
                int i13 = currY - this.f4389b;
                this.f4388a = currX;
                this.f4389b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i12, i13, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i12 -= i10;
                    i13 -= i11;
                    z zVar = recyclerView4.mLayout.f4415g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b10 = RecyclerView.this.mState.b();
                        if (b10 == 0) {
                            zVar.r();
                        } else if (zVar.f() >= b10) {
                            zVar.p(b10 - 1);
                            zVar.j(i10, i11);
                        } else {
                            zVar.j(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i10, i11, i12, i13, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.dispatchOnScrolled(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                z zVar2 = RecyclerView.this.mLayout.f4415g;
                if ((zVar2 != null && zVar2.g()) || !z10) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i16, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.f4415g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f4392f = false;
            if (this.f4393g) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    class d implements p.b {
        d() {
        }

        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m1(d0Var.itemView, recyclerView.mRecycler);
        }

        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.mRecycler.J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    public static abstract class d0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        v mScrapContainer = null;
        d0 mShadowedHolder = null;
        d0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public d0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.a0.O(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.a0.O(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f4435c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.a0.z(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(v vVar, boolean z10) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    class e implements b.C0074b {
        e() {
        }

        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.dispatchChildAttached(view);
        }

        public void b(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        public int c() {
            return RecyclerView.this.getChildCount();
        }

        public void d() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.dispatchChildDetached(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public d0 f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        public void g(int i10) {
            d0 childViewHolderInt;
            View a10 = a(i10);
            if (!(a10 == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(a10)) == null)) {
                if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.addFlags(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        public void h(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    class f implements a.C0073a {
        f() {
        }

        public void a(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForMove(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        public void d(a.b bVar) {
            i(bVar);
        }

        public d0 e(int i10) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        public void f(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void g(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForInsert(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void h(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f4373d += i11;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i10 = bVar.f4516a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.R0(recyclerView, bVar.f4517b, bVar.f4519d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.U0(recyclerView2, bVar.f4517b, bVar.f4519d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.W0(recyclerView3, bVar.f4517b, bVar.f4519d, bVar.f4518c);
            } else if (i10 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.T0(recyclerView4, bVar.f4517b, bVar.f4519d, 1);
            }
        }
    }

    public static abstract class g<VH extends d0> {
        private boolean mHasStableIds = false;
        private final h mObservable = new h();

        public final void bindViewHolder(VH vh, int i10) {
            vh.mPosition = i10;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i10);
            }
            vh.setFlags(1, 519);
            androidx.core.os.o.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f4435c = true;
            }
            androidx.core.os.o.b();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.o.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.o.b();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).onChanged();
            }
        }

        public void c(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, (Object) null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }
    }

    public static abstract class i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }
    }

    public interface j {
        int a(int i10, int i11);
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private b f4398a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f4399b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f4400c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f4401d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f4402e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f4403f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f4404a;

            /* renamed from: b  reason: collision with root package name */
            public int f4405b;

            /* renamed from: c  reason: collision with root package name */
            public int f4406c;

            /* renamed from: d  reason: collision with root package name */
            public int f4407d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i10) {
                View view = d0Var.itemView;
                this.f4404a = view.getLeft();
                this.f4405b = view.getTop();
                this.f4406c = view.getRight();
                this.f4407d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i10 = d0Var.mFlags & 14;
            if (d0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int oldPosition = d0Var.getOldPosition();
            int adapterPosition = d0Var.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i10 : i10 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.f4398a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f4399b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4399b.get(i10).a();
            }
            this.f4399b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f4400c;
        }

        public long m() {
            return this.f4403f;
        }

        public long n() {
            return this.f4402e;
        }

        public long o() {
            return this.f4401d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            return q().a(d0Var);
        }

        public c t(a0 a0Var, d0 d0Var, int i10, List<Object> list) {
            return q().a(d0Var);
        }

        public abstract void u();

        /* access modifiers changed from: package-private */
        public void v(b bVar) {
            this.f4398a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        public void a(d0 d0Var) {
            d0Var.setIsRecyclable(true);
            if (d0Var.mShadowedHolder != null && d0Var.mShadowingHolder == null) {
                d0Var.mShadowedHolder = null;
            }
            d0Var.mShadowingHolder = null;
            if (!d0Var.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(d0Var.itemView) && d0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(d0Var.itemView, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        b f4409a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f4410b;

        /* renamed from: c  reason: collision with root package name */
        private final o.b f4411c;

        /* renamed from: d  reason: collision with root package name */
        private final o.b f4412d;

        /* renamed from: e  reason: collision with root package name */
        o f4413e;

        /* renamed from: f  reason: collision with root package name */
        o f4414f;

        /* renamed from: g  reason: collision with root package name */
        z f4415g;

        /* renamed from: h  reason: collision with root package name */
        boolean f4416h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f4417i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f4418j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f4419k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4420l = true;

        /* renamed from: m  reason: collision with root package name */
        int f4421m;

        /* renamed from: n  reason: collision with root package name */
        boolean f4422n;

        /* renamed from: o  reason: collision with root package name */
        private int f4423o;

        /* renamed from: p  reason: collision with root package name */
        private int f4424p;

        /* renamed from: q  reason: collision with root package name */
        private int f4425q;

        /* renamed from: r  reason: collision with root package name */
        private int f4426r;

        class a implements o.b {
            a() {
            }

            public View a(int i10) {
                return o.this.I(i10);
            }

            public int b(View view) {
                return o.this.Q(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return o.this.e0();
            }

            public int d() {
                return o.this.o0() - o.this.f0();
            }

            public int e(View view) {
                return o.this.T(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements o.b {
            b() {
            }

            public View a(int i10) {
                return o.this.I(i10);
            }

            public int b(View view) {
                return o.this.U(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return o.this.g0();
            }

            public int d() {
                return o.this.W() - o.this.d0();
            }

            public int e(View view) {
                return o.this.O(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f4429a;

            /* renamed from: b  reason: collision with root package name */
            public int f4430b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f4431c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f4432d;
        }

        public o() {
            a aVar = new a();
            this.f4411c = aVar;
            b bVar = new b();
            this.f4412d = bVar;
            this.f4413e = new o(aVar);
            this.f4414f = new o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.K(int, int, int, int, boolean):int");
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - e02;
            int min = Math.min(0, i10);
            int i11 = top - g02;
            int min2 = Math.min(0, i11);
            int i12 = width - o02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - W);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void f(View view, int i10, boolean z10) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z10 || childViewHolderInt.isRemoved()) {
                this.f4410b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f4410b.mViewInfoStore.p(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f4409a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4410b) {
                int m10 = this.f4409a.m(view);
                if (i10 == -1) {
                    i10 = this.f4409a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4410b.indexOfChild(view) + this.f4410b.exceptionLabel());
                } else if (m10 != i10) {
                    this.f4410b.mLayout.B0(m10, i10);
                }
            } else {
                this.f4409a.a(view, i10, false);
                pVar.f4435c = true;
                z zVar = this.f4415g;
                if (zVar != null && zVar.h()) {
                    this.f4415g.k(view);
                }
            }
            if (pVar.f4436d) {
                childViewHolderInt.itemView.invalidate();
                pVar.f4436d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.c.f23557f, i10, i11);
            dVar.f4429a = obtainStyledAttributes.getInt(x0.c.f23558g, 1);
            dVar.f4430b = obtainStyledAttributes.getInt(x0.c.f23568q, 1);
            dVar.f4431c = obtainStyledAttributes.getBoolean(x0.c.f23567p, false);
            dVar.f4432d = obtainStyledAttributes.getBoolean(x0.c.f23569r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private boolean t0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W = W() - d0();
            Rect rect = this.f4410b.mTempRect;
            P(focusedChild, rect);
            if (rect.left - i10 >= o02 || rect.right - i10 <= e02 || rect.top - i11 >= W || rect.bottom - i11 <= g02) {
                return false;
            }
            return true;
        }

        private void v1(v vVar, int i10, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f4410b.mAdapter.hasStableIds()) {
                    x(i10);
                    vVar.D(view);
                    this.f4410b.mViewInfoStore.k(childViewHolderInt);
                    return;
                }
                q1(i10);
                vVar.C(childViewHolderInt);
            }
        }

        private static boolean w0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void y(int i10, View view) {
            this.f4409a.d(i10);
        }

        /* access modifiers changed from: package-private */
        public void A(RecyclerView recyclerView, v vVar) {
            this.f4417i = false;
            I0(recyclerView, vVar);
        }

        public void A0(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f4410b.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int K = K(o0(), p0(), e0() + f0() + pVar.leftMargin + pVar.rightMargin + i12, pVar.width, k());
            int K2 = K(W(), X(), g0() + d0() + pVar.topMargin + pVar.bottomMargin + i13, pVar.height, l());
            if (F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        /* access modifiers changed from: package-private */
        public void A1(int i10, int i11) {
            this.f4425q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f4423o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f4425q = 0;
            }
            this.f4426r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4424p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f4426r = 0;
            }
        }

        public View B(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f4409a.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public void B0(int i10, int i11) {
            View I = I(i10);
            if (I != null) {
                x(i10);
                h(I, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f4410b.toString());
        }

        public void B1(int i10, int i11) {
            this.f4410b.setMeasuredDimension(i10, i11);
        }

        public View C(int i10) {
            int J = J();
            for (int i11 = 0; i11 < J; i11++) {
                View I = I(i11);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(I);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f4410b.mState.e() || !childViewHolderInt.isRemoved())) {
                    return I;
                }
            }
            return null;
        }

        public void C0(int i10) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void C1(Rect rect, int i10, int i11) {
            B1(n(i10, rect.width() + e0() + f0(), c0()), n(i11, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i10) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void D1(int i10, int i11) {
            int J = J();
            if (J == 0) {
                this.f4410b.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = RecyclerView.UNDEFINED_DURATION;
            int i13 = RecyclerView.UNDEFINED_DURATION;
            int i14 = a.e.API_PRIORITY_OTHER;
            int i15 = a.e.API_PRIORITY_OTHER;
            for (int i16 = 0; i16 < J; i16++) {
                View I = I(i16);
                Rect rect = this.f4410b.mTempRect;
                P(I, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f4410b.mTempRect.set(i14, i15, i12, i13);
            C1(this.f4410b.mTempRect, i10, i11);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        /* access modifiers changed from: package-private */
        public void E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4410b = null;
                this.f4409a = null;
                this.f4425q = 0;
                this.f4426r = 0;
            } else {
                this.f4410b = recyclerView;
                this.f4409a = recyclerView.mChildHelper;
                this.f4425q = recyclerView.getWidth();
                this.f4426r = recyclerView.getHeight();
            }
            this.f4423o = 1073741824;
            this.f4424p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean F1(View view, int i10, int i11, p pVar) {
            return view.isLayoutRequested() || !this.f4419k || !w0(view.getWidth(), i10, pVar.width) || !w0(view.getHeight(), i11, pVar.height);
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).f4434b.bottom;
        }

        @Deprecated
        public void H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean H1(View view, int i10, int i11, p pVar) {
            return !this.f4419k || !w0(view.getMeasuredWidth(), i10, pVar.width) || !w0(view.getMeasuredHeight(), i11, pVar.height);
        }

        public View I(int i10) {
            b bVar = this.f4409a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, v vVar) {
            H0(recyclerView);
        }

        public void I1(RecyclerView recyclerView, a0 a0Var, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int J() {
            b bVar = this.f4409a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public View J0(View view, int i10, v vVar, a0 a0Var) {
            return null;
        }

        public void J1(z zVar) {
            z zVar2 = this.f4415g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.h())) {
                this.f4415g.r();
            }
            this.f4415g = zVar;
            zVar.q(this.f4410b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4410b;
            L0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        public void K1() {
            z zVar = this.f4415g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void L0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4410b.canScrollVertically(-1) && !this.f4410b.canScrollHorizontally(-1) && !this.f4410b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                g gVar = this.f4410b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.getItemCount());
                }
            }
        }

        public boolean L1() {
            return false;
        }

        public boolean M() {
            RecyclerView recyclerView = this.f4410b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* access modifiers changed from: package-private */
        public void M0(androidx.core.view.accessibility.c cVar) {
            RecyclerView recyclerView = this.f4410b;
            N0(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public int N(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView == null || recyclerView.mAdapter == null || !k()) {
                return 1;
            }
            return this.f4410b.mAdapter.getItemCount();
        }

        public void N0(v vVar, a0 a0Var, androidx.core.view.accessibility.c cVar) {
            if (this.f4410b.canScrollVertically(-1) || this.f4410b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.o0(true);
            }
            if (this.f4410b.canScrollVertically(1) || this.f4410b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.o0(true);
            }
            cVar.Z(c.C0045c.a(k0(vVar, a0Var), N(vVar, a0Var), v0(vVar, a0Var), l0(vVar, a0Var)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        /* access modifiers changed from: package-private */
        public void O0(View view, androidx.core.view.accessibility.c cVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f4409a.n(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f4410b;
                P0(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        public void P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void P0(v vVar, a0 a0Var, View view, androidx.core.view.accessibility.c cVar) {
            cVar.a0(c.d.a(l() ? h0(view) : 0, 1, k() ? h0(view) : 0, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i10) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f4434b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f4434b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4409a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W() {
            return this.f4426r;
        }

        public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            V0(recyclerView, i10, i11);
        }

        public int X() {
            return this.f4424p;
        }

        public void X0(v vVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Y() {
            RecyclerView recyclerView = this.f4410b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void Y0(a0 a0Var) {
        }

        public int Z() {
            return androidx.core.view.a0.B(this.f4410b);
        }

        public void Z0(v vVar, a0 a0Var, int i10, int i11) {
            this.f4410b.defaultOnMeasure(i10, i11);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).f4434b.left;
        }

        @Deprecated
        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.isComputingLayout();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return androidx.core.view.a0.C(this.f4410b);
        }

        public boolean b1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i10) {
            f(view, i10, true);
        }

        public int c0() {
            return androidx.core.view.a0.D(this.f4410b);
        }

        public void c1(Parcelable parcelable) {
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable d1() {
            return null;
        }

        public void e(View view, int i10) {
            f(view, i10, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i10) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void f1(z zVar) {
            if (this.f4415g == zVar) {
                this.f4415g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean g1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4410b;
            return h1(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        public void h(View view, int i10) {
            i(view, i10, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean h1(androidx.recyclerview.widget.RecyclerView.v r8, androidx.recyclerview.widget.RecyclerView.a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f4410b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.W()
                int r11 = r7.g0()
                int r8 = r8 - r11
                int r11 = r7.d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f4410b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.o0()
                int r11 = r7.e0()
                int r10 = r10 - r11
                int r11 = r7.f0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.W()
                int r10 = r7.g0()
                int r8 = r8 - r10
                int r10 = r7.d0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f4410b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.o0()
                int r11 = r7.e0()
                int r10 = r10 - r11
                int r11 = r7.f0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f4410b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.h1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        public void i(View view, int i10, p pVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f4410b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f4410b.mViewInfoStore.p(childViewHolderInt);
            }
            this.f4409a.c(view, i10, pVar, childViewHolderInt.isRemoved());
        }

        /* access modifiers changed from: package-private */
        public boolean i1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4410b;
            return j1(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).f4434b.right;
        }

        public boolean j1(v vVar, a0 a0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public boolean k() {
            return false;
        }

        public int k0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView == null || recyclerView.mAdapter == null || !l()) {
                return 1;
            }
            return this.f4410b.mAdapter.getItemCount();
        }

        public void k1(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                if (!RecyclerView.getChildViewHolderInt(I(J)).shouldIgnore()) {
                    n1(J, vVar);
                }
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(v vVar, a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void l1(v vVar) {
            int j10 = vVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = vVar.n(i10);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n10);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f4410b.removeDetachedView(n10, false);
                    }
                    l lVar = this.f4410b.mItemAnimator;
                    if (lVar != null) {
                        lVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    vVar.y(n10);
                }
            }
            vVar.e();
            if (j10 > 0) {
                this.f4410b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).f4434b.top;
        }

        public void m1(View view, v vVar) {
            p1(view);
            vVar.B(view);
        }

        public void n0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f4434b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f4410b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f4410b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i10, v vVar) {
            View I = I(i10);
            q1(i10);
            vVar.B(I);
        }

        public void o(int i10, int i11, a0 a0Var, c cVar) {
        }

        public int o0() {
            return this.f4425q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i10, c cVar) {
        }

        public int p0() {
            return this.f4423o;
        }

        public void p1(View view) {
            this.f4409a.p(view);
        }

        public int q(a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q0() {
            int J = J();
            for (int i10 = 0; i10 < J; i10++) {
                ViewGroup.LayoutParams layoutParams = I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i10) {
            if (I(i10) != null) {
                this.f4409a.q(i10);
            }
        }

        public int r(a0 a0Var) {
            return 0;
        }

        public boolean r0() {
            return this.f4417i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return s1(recyclerView, view, rect, z10, false);
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public boolean s0() {
            return this.f4418j;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] L = L(view, rect);
            int i10 = L[0];
            int i11 = L[1];
            if ((z11 && !t0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.smoothScrollBy(i10, i11);
            }
            return true;
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public void t1() {
            RecyclerView recyclerView = this.f4410b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public final boolean u0() {
            return this.f4420l;
        }

        public void u1() {
            this.f4416h = true;
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public boolean v0(v vVar, a0 a0Var) {
            return false;
        }

        public void w(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                v1(vVar, J, I(J));
            }
        }

        public int w1(int i10, v vVar, a0 a0Var) {
            return 0;
        }

        public void x(int i10) {
            y(i10, I(i10));
        }

        public boolean x0() {
            z zVar = this.f4415g;
            return zVar != null && zVar.h();
        }

        public void x1(int i10) {
        }

        public boolean y0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f4413e.b(view, 24579) && this.f4414f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public int y1(int i10, v vVar, a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void z(RecyclerView recyclerView) {
            this.f4417i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f4434b;
            view.layout(i10 + rect.left + pVar.leftMargin, i11 + rect.top + pVar.topMargin, (i12 - rect.right) - pVar.rightMargin, (i13 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class u {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f4437a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f4438b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<d0> f4439a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f4440b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f4441c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f4442d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = this.f4437a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4437a.put(i10, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f4438b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f4437a.size(); i10++) {
                this.f4437a.valueAt(i10).f4439a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f4438b--;
        }

        /* access modifiers changed from: package-private */
        public void d(int i10, long j10) {
            a g10 = g(i10);
            g10.f4442d = j(g10.f4442d, j10);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, long j10) {
            a g10 = g(i10);
            g10.f4441c = j(g10.f4441c, j10);
        }

        public d0 f(int i10) {
            a aVar = this.f4437a.get(i10);
            if (aVar == null || aVar.f4439a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f4439a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void h(g gVar, g gVar2, boolean z10) {
            if (gVar != null) {
                c();
            }
            if (!z10 && this.f4438b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            ArrayList<d0> arrayList = g(itemViewType).f4439a;
            if (this.f4437a.get(itemViewType).f4440b > arrayList.size()) {
                d0Var.resetInternal();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f4442d;
            return j12 == 0 || j10 + j12 < j11;
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f4441c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class v {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d0> f4443a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<d0> f4444b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<d0> f4445c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<d0> f4446d;

        /* renamed from: e  reason: collision with root package name */
        private int f4447e;

        /* renamed from: f  reason: collision with root package name */
        int f4448f;

        /* renamed from: g  reason: collision with root package name */
        u f4449g;

        public v() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f4443a = arrayList;
            this.f4446d = Collections.unmodifiableList(arrayList);
            this.f4447e = 2;
            this.f4448f = 2;
        }

        private boolean H(d0 d0Var, int i10, int i11, long j10) {
            d0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = d0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != RecyclerView.FOREVER_NS && !this.f4449g.k(itemViewType, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(d0Var, i10);
            this.f4449g.d(d0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.mState.e()) {
                return true;
            }
            d0Var.mPreLayoutPosition = i11;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.itemView;
                if (androidx.core.view.a0.z(view) == 0) {
                    androidx.core.view.a0.x0(view, 1);
                }
                k kVar = RecyclerView.this.mAccessibilityDelegate;
                if (kVar != null) {
                    androidx.core.view.a n10 = kVar.n();
                    if (n10 instanceof k.a) {
                        ((k.a) n10).o(view);
                    }
                    androidx.core.view.a0.n0(view, n10);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i10) {
            a(this.f4445c.get(i10), true);
            this.f4445c.remove(i10);
        }

        public void B(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.j(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        public void C(d0 d0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (d0Var.isScrap() || d0Var.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(d0Var.isScrap());
                sb2.append(" isAttached:");
                if (d0Var.itemView.getParent() != null) {
                    z11 = true;
                }
                sb2.append(z11);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (d0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = d0Var.doesTransientStatePreventRecycling();
                g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(d0Var)) || d0Var.isRecyclable()) {
                    if (this.f4448f <= 0 || d0Var.hasAnyOfTheFlags(526)) {
                        z10 = false;
                    } else {
                        int size = this.f4445c.size();
                        if (size >= this.f4448f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(d0Var.mPosition)) {
                            int i10 = size - 1;
                            while (i10 >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.d(this.f4445c.get(i10).mPosition)) {
                                    break;
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                        this.f4445c.add(size, d0Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(d0Var, true);
                        z11 = z10;
                        RecyclerView.this.mViewInfoStore.q(d0Var);
                        if (!z11 && !z12 && doesTransientStatePreventRecycling) {
                            d0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    z11 = z10;
                }
                z12 = false;
                RecyclerView.this.mViewInfoStore.q(d0Var);
                if (!z11) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f4444b == null) {
                    this.f4444b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f4444b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f4443a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        public void E(u uVar) {
            u uVar2 = this.f4449g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f4449g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f4449g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(b0 b0Var) {
        }

        public void G(int i10) {
            this.f4447e = i10;
            K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r1 == 0) goto L_0x00ac
                r6.r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f4449g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f4449g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x0166
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.f4380k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x0179
                r9.mPreLayoutPosition = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = 0
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01cd:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            L_0x01cf:
                r1.f4433a = r9
                if (r10 == 0) goto L_0x01d6
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d7
            L_0x01d6:
                r7 = 0
            L_0x01d7:
                r1.f4436d = r7
                return r9
            L_0x01da:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        public void J(d0 d0Var) {
            if (d0Var.mInChangeScrap) {
                this.f4444b.remove(d0Var);
            } else {
                this.f4443a.remove(d0Var);
            }
            d0Var.mScrapContainer = null;
            d0Var.mInChangeScrap = false;
            d0Var.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        public void K() {
            o oVar = RecyclerView.this.mLayout;
            this.f4448f = this.f4447e + (oVar != null ? oVar.f4421m : 0);
            for (int size = this.f4445c.size() - 1; size >= 0 && this.f4445c.size() > this.f4448f; size--) {
                A(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean L(d0 d0Var) {
            if (d0Var.isRemoved()) {
                return RecyclerView.this.mState.e();
            }
            int i10 = d0Var.mPosition;
            if (i10 < 0 || i10 >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.e() && RecyclerView.this.mAdapter.getItemViewType(d0Var.mPosition) != d0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.hasStableIds() || d0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(d0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f4445c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f4445c.get(size);
                if (d0Var != null && (i12 = d0Var.mPosition) >= i10 && i12 < i13) {
                    d0Var.addFlags(2);
                    A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.itemView;
            k kVar = RecyclerView.this.mAccessibilityDelegate;
            if (kVar != null) {
                androidx.core.view.a n10 = kVar.n();
                androidx.core.view.a0.n0(view, n10 instanceof k.a ? ((k.a) n10).n(view) : null);
            }
            if (z10) {
                g(d0Var);
            }
            d0Var.mOwnerRecyclerView = null;
            i().i(d0Var);
        }

        public void c() {
            this.f4443a.clear();
            z();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f4445c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4445c.get(i10).clearOldPosition();
            }
            int size2 = this.f4443a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f4443a.get(i11).clearOldPosition();
            }
            ArrayList<d0> arrayList = this.f4444b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f4444b.get(i12).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f4443a.clear();
            ArrayList<d0> arrayList = this.f4444b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 < 0 || i10 >= RecyclerView.this.mState.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.e()) {
                return i10;
            } else {
                return RecyclerView.this.mAdapterHelper.m(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(d0 d0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.onViewRecycled(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public d0 h(int i10) {
            int size;
            int m10;
            ArrayList<d0> arrayList = this.f4444b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    d0 d0Var = this.f4444b.get(i12);
                    if (d0Var.wasReturnedFromScrap() || d0Var.getLayoutPosition() != i10) {
                        i12++;
                    } else {
                        d0Var.addFlags(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m10 = RecyclerView.this.mAdapterHelper.m(i10)) > 0 && m10 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m10);
                    while (i11 < size) {
                        d0 d0Var2 = this.f4444b.get(i11);
                        if (d0Var2.wasReturnedFromScrap() || d0Var2.getItemId() != itemId) {
                            i11++;
                        } else {
                            d0Var2.addFlags(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public u i() {
            if (this.f4449g == null) {
                this.f4449g = new u();
            }
            return this.f4449g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f4443a.size();
        }

        public List<d0> k() {
            return this.f4446d;
        }

        /* access modifiers changed from: package-private */
        public d0 l(long j10, int i10, boolean z10) {
            for (int size = this.f4443a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f4443a.get(size);
                if (d0Var.getItemId() == j10 && !d0Var.wasReturnedFromScrap()) {
                    if (i10 == d0Var.getItemViewType()) {
                        d0Var.addFlags(32);
                        if (d0Var.isRemoved() && !RecyclerView.this.mState.e()) {
                            d0Var.setFlags(2, 14);
                        }
                        return d0Var;
                    } else if (!z10) {
                        this.f4443a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.itemView, false);
                        y(d0Var.itemView);
                    }
                }
            }
            int size2 = this.f4445c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f4445c.get(size2);
                if (d0Var2.getItemId() == j10 && !d0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == d0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f4445c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public d0 m(int i10, boolean z10) {
            View e10;
            int size = this.f4443a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                d0 d0Var = this.f4443a.get(i12);
                if (d0Var.wasReturnedFromScrap() || d0Var.getLayoutPosition() != i10 || d0Var.isInvalid() || (!RecyclerView.this.mState.f4377h && d0Var.isRemoved())) {
                    i12++;
                } else {
                    d0Var.addFlags(32);
                    return d0Var;
                }
            }
            if (z10 || (e10 = RecyclerView.this.mChildHelper.e(i10)) == null) {
                int size2 = this.f4445c.size();
                while (i11 < size2) {
                    d0 d0Var2 = this.f4445c.get(i11);
                    if (d0Var2.isInvalid() || d0Var2.getLayoutPosition() != i10 || d0Var2.isAttachedToTransitionOverlay()) {
                        i11++;
                    } else {
                        if (!z10) {
                            this.f4445c.remove(i11);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e10);
            RecyclerView.this.mChildHelper.s(e10);
            int m10 = RecyclerView.this.mChildHelper.m(e10);
            if (m10 != -1) {
                RecyclerView.this.mChildHelper.d(m10);
                D(e10);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        public View n(int i10) {
            return this.f4443a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i10, boolean z10) {
            return I(i10, z10, RecyclerView.FOREVER_NS).itemView;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f4445c.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) this.f4445c.get(i10).itemView.getLayoutParams();
                if (pVar != null) {
                    pVar.f4435c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f4445c.size();
            for (int i10 = 0; i10 < size; i10++) {
                d0 d0Var = this.f4445c.get(i10);
                if (d0Var != null) {
                    d0Var.addFlags(6);
                    d0Var.addChangePayload((Object) null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.hasStableIds()) {
                z();
            }
        }

        /* access modifiers changed from: package-private */
        public void u(int i10, int i11) {
            int size = this.f4445c.size();
            for (int i12 = 0; i12 < size; i12++) {
                d0 d0Var = this.f4445c.get(i12);
                if (d0Var != null && d0Var.mPosition >= i10) {
                    d0Var.offsetPosition(i11, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f4445c.size();
            for (int i16 = 0; i16 < size; i16++) {
                d0 d0Var = this.f4445c.get(i16);
                if (d0Var != null && (i15 = d0Var.mPosition) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        d0Var.offsetPosition(i11 - i10, false);
                    } else {
                        d0Var.offsetPosition(i14, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f4445c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f4445c.get(size);
                if (d0Var != null) {
                    int i13 = d0Var.mPosition;
                    if (i13 >= i12) {
                        d0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        d0Var.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(g gVar, g gVar2, boolean z10) {
            c();
            i().h(gVar, gVar2, z10);
        }

        /* access modifiers changed from: package-private */
        public void y(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            C(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        public void z() {
            for (int size = this.f4445c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f4445c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    private class x extends i {
        x() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    androidx.core.view.a0.f0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f4376g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.r(i10, i11, obj)) {
                a();
            }
        }

        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.s(i10, i11)) {
                a();
            }
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.t(i10, i11, i12)) {
                a();
            }
        }

        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.u(i10, i11)) {
                a();
            }
        }
    }

    public static abstract class z {

        /* renamed from: a  reason: collision with root package name */
        private int f4453a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f4454b;

        /* renamed from: c  reason: collision with root package name */
        private o f4455c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4456d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4457e;

        /* renamed from: f  reason: collision with root package name */
        private View f4458f;

        /* renamed from: g  reason: collision with root package name */
        private final a f4459g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f4460h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f4461a;

            /* renamed from: b  reason: collision with root package name */
            private int f4462b;

            /* renamed from: c  reason: collision with root package name */
            private int f4463c;

            /* renamed from: d  reason: collision with root package name */
            private int f4464d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f4465e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f4466f;

            /* renamed from: g  reason: collision with root package name */
            private int f4467g;

            public a(int i10, int i11) {
                this(i10, i11, RecyclerView.UNDEFINED_DURATION, (Interpolator) null);
            }

            private void e() {
                if (this.f4465e != null && this.f4463c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4463c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.f4464d >= 0;
            }

            public void b(int i10) {
                this.f4464d = i10;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i10 = this.f4464d;
                if (i10 >= 0) {
                    this.f4464d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f4466f = false;
                } else if (this.f4466f) {
                    e();
                    recyclerView.mViewFlinger.f(this.f4461a, this.f4462b, this.f4463c, this.f4465e);
                    int i11 = this.f4467g + 1;
                    this.f4467g = i11;
                    if (i11 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4466f = false;
                } else {
                    this.f4467g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4461a = i10;
                this.f4462b = i11;
                this.f4463c = i12;
                this.f4465e = interpolator;
                this.f4466f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4464d = -1;
                this.f4466f = false;
                this.f4467g = 0;
                this.f4461a = i10;
                this.f4462b = i11;
                this.f4463c = i12;
                this.f4465e = interpolator;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            o e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f4454b.mLayout.C(i10);
        }

        public int c() {
            return this.f4454b.mLayout.J();
        }

        public int d(View view) {
            return this.f4454b.getChildLayoutPosition(view);
        }

        public o e() {
            return this.f4455c;
        }

        public int f() {
            return this.f4453a;
        }

        public boolean g() {
            return this.f4456d;
        }

        public boolean h() {
            return this.f4457e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f4454b;
            if (this.f4453a == -1 || recyclerView == null) {
                r();
            }
            if (this.f4456d && this.f4458f == null && this.f4455c != null && (a10 = a(this.f4453a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            this.f4456d = false;
            View view = this.f4458f;
            if (view != null) {
                if (d(view) == this.f4453a) {
                    o(this.f4458f, recyclerView.mState, this.f4459g);
                    this.f4459g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f4458f = null;
                }
            }
            if (this.f4457e) {
                l(i10, i11, recyclerView.mState, this.f4459g);
                boolean a11 = this.f4459g.a();
                this.f4459g.c(recyclerView);
                if (a11 && this.f4457e) {
                    this.f4456d = true;
                    recyclerView.mViewFlinger.e();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f4458f = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i10, int i11, a0 a0Var, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i10) {
            this.f4453a = i10;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.g();
            if (this.f4460h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4454b = recyclerView;
            this.f4455c = oVar;
            int i10 = this.f4453a;
            if (i10 != -1) {
                recyclerView.mState.f4370a = i10;
                this.f4457e = true;
                this.f4456d = true;
                this.f4458f = b(f());
                m();
                this.f4454b.mViewFlinger.e();
                this.f4460h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f4457e) {
                this.f4457e = false;
                n();
                this.f4454b.mState.f4370a = -1;
                this.f4458f = null;
                this.f4453a = -1;
                this.f4456d = false;
                this.f4455c.f1(this);
                this.f4455c = null;
                this.f4454b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            FORCE_INVALIDATE_DISPLAY_LIST = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            POST_UPDATES_ON_ANIMATION = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            ALLOW_THREAD_GAP_WORK = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            IGNORE_DETACHED_FOCUSED_CHILD = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (d0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z10, boolean z11) {
        d0Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z11) {
                addAnimatingView(d0Var2);
            }
            d0Var.mShadowedHolder = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.J(d0Var);
            d0Var2.setIsRecyclable(false);
            d0Var2.mShadowingHolder = d0Var;
        }
        if (this.mItemAnimator.b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e16);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            androidx.core.view.accessibility.b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z10 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4379j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        if (!a0Var.f4380k || !this.mItemsChanged) {
            z10 = false;
        }
        a0Var.f4378i = z10;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.f4377h = a0Var.f4381l;
        a0Var.f4375f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4380k) {
            int g10 = this.mChildHelper.g();
            for (int i10 = 0; i10 < g10; i10++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.t(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f4378i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4381l) {
            saveOldPositions();
            a0 a0Var2 = this.mState;
            boolean z11 = a0Var2.f4376g;
            a0Var2.f4376g = false;
            this.mLayout.X0(this.mRecycler, a0Var2);
            this.mState.f4376g = z11;
            for (int i11 = 0; i11 < this.mChildHelper.g(); i11++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i11));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e10 = l.e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e10 |= 4096;
                    }
                    l.c t10 = this.mItemAnimator.t(this.mState, childViewHolderInt2, e10, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t10);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, t10);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f4374e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f4375f = this.mAdapter.getItemCount();
        a0 a0Var = this.mState;
        a0Var.f4373d = 0;
        a0Var.f4377h = false;
        this.mLayout.X0(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f4376g = false;
        this.mPendingSavedState = null;
        a0Var2.f4380k = a0Var2.f4380k && this.mItemAnimator != null;
        a0Var2.f4374e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.f4374e = 1;
        if (a0Var.f4380k) {
            for (int g10 = this.mChildHelper.g() - 1; g10 >= 0; g10--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g10));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c s10 = this.mItemAnimator.s(this.mState, childViewHolderInt);
                    d0 g11 = this.mViewInfoStore.g(changedHolderKey);
                    if (g11 == null || g11.shouldIgnore()) {
                        this.mViewInfoStore.d(childViewHolderInt, s10);
                    } else {
                        boolean h10 = this.mViewInfoStore.h(g11);
                        boolean h11 = this.mViewInfoStore.h(childViewHolderInt);
                        if (!h10 || g11 != childViewHolderInt) {
                            l.c n10 = this.mViewInfoStore.n(g11);
                            this.mViewInfoStore.d(childViewHolderInt, s10);
                            l.c m10 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n10 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g11);
                            } else {
                                animateChange(g11, childViewHolderInt, n10, m10, h10, h11);
                            }
                        } else {
                            this.mViewInfoStore.d(childViewHolderInt, s10);
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.l1(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.f4372c = a0Var2.f4375f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f4380k = false;
        a0Var2.f4381l = false;
        this.mLayout.f4416h = false;
        ArrayList<d0> arrayList = this.mRecycler.f4444b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.f4422n) {
            oVar.f4421m = 0;
            oVar.f4422n = false;
            this.mRecycler.K();
        }
        this.mLayout.Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i10 = 0;
        while (i10 < size) {
            s sVar = this.mOnItemTouchListeners.get(i10);
            if (!sVar.b(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g10 = this.mChildHelper.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = UNDEFINED_DURATION;
        for (int i12 = 0; i12 < g10; i12++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        a0 a0Var = this.mState;
        int i10 = a0Var.f4382m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = a0Var.b();
        int i11 = i10;
        while (i11 < b10) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            } else {
                i11++;
            }
        }
        int min = Math.min(b10, i10);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f4433a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f4434b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private androidx.core.view.p getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.p(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j10, d0 d0Var, d0 d0Var2) {
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j10) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (androidx.core.view.a0.A(this) == 0) {
            androidx.core.view.a0.y0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        int i12 = this.mLayout.Z() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i10 + exceptionLabel());
                            } else if (c10 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i11 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c10 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i11 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c10 > 0 || (c10 == 0 && i11 * i12 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c10 < 0 || (c10 == 0 && i11 * i12 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.L1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z11 = false;
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f4380k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.f4416h) && (!z10 || this.mAdapter.hasStableIds());
        a0 a0Var = this.mState;
        if (a0Var.f4380k && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        a0Var.f4381l = z11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.c(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.c(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.c(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.c(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.a0.e0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                d0 findViewHolderForItemId = (this.mState.f4383n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f4383n);
                if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                    view = findViewHolderForItemId.itemView;
                } else if (this.mChildHelper.g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i10 = this.mState.f4384o;
                    if (!(((long) i10) == -1 || (findViewById = view.findViewById(i10)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            androidx.core.view.a0.e0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f4435c) {
                Rect rect = pVar.f4434b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.s1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.f4383n = -1;
        a0Var.f4382m = -1;
        a0Var.f4384o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i10;
        d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f4383n = this.mAdapter.hasStableIds() ? d0Var.getItemId() : -1;
        a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i10 = -1;
        } else if (d0Var.isRemoved()) {
            i10 = d0Var.mOldPosition;
        } else {
            i10 = d0Var.getAdapterPosition();
        }
        a0Var.f4382m = i10;
        this.mState.f4384o = getDeepestFocusedViewWithId(d0Var.itemView);
    }

    private void setAdapterInternal(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.E0(gVar3, this.mAdapter);
        }
        this.mRecycler.x(gVar3, this.mAdapter, z10);
        this.mState.f4376g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.g();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.K1();
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            androidx.core.view.a0.e0(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.F0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(n nVar, int i10) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i10, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(MaxReward.DEFAULT_LABEL + exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.g(d0Var, d0Var.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.m((p) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.k()) {
            return this.mLayout.q(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.k()) {
            return this.mLayout.r(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.k()) {
            return this.mLayout.s(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.t(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            androidx.core.view.a0.e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.o.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.o.b();
        } else if (this.mAdapterHelper.p()) {
            if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                androidx.core.os.o.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                androidx.core.os.o.b();
            } else if (this.mAdapterHelper.p()) {
                androidx.core.os.o.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                androidx.core.os.o.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(o.n(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.a0.D(this)), o.n(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.a0.C(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            a0 a0Var = this.mState;
            a0Var.f4379j = false;
            if (a0Var.f4374e == 1) {
                dispatchLayoutStep1();
                this.mLayout.z1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && this.mLayout.o0() == getWidth() && this.mLayout.W() == getHeight()) {
                this.mLayout.z1(this);
            } else {
                this.mLayout.z1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i10) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.e1(i10);
        }
        onScrollStateChanged(i10);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.itemView.getParent() == this && !d0Var.shouldIgnore() && (i10 = d0Var.mPendingAccessibilityState) != -1) {
                androidx.core.view.a0.x0(d0Var.itemView, i10);
                d0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) {
            z12 = z10;
        }
        if (z12) {
            androidx.core.view.a0.e0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 3);
            this.mBottomGlow = a10;
            if (this.mClipToPadding) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 0);
            this.mLeftGlow = a10;
            if (this.mClipToPadding) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 2);
            this.mRightGlow = a10;
            if (this.mClipToPadding) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 1);
            this.mTopGlow = a10;
            if (this.mClipToPadding) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f4390c;
            a0Var.f4385p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f4386q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f4385p = 0;
        a0Var.f4386q = 0;
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int g10 = this.mChildHelper.g() - 1; g10 >= 0; g10--) {
            View f12 = this.mChildHelper.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= ((float) f12.getLeft()) + translationX && f10 <= ((float) f12.getRight()) + translationX && f11 >= ((float) f12.getTop()) + translationY && f11 <= ((float) f12.getBottom()) + translationY) {
                return f12;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i10) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j10 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j10; i11++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i10) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j10) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.hasStableIds()) {
            int j11 = this.mChildHelper.j();
            for (int i10 = 0; i10 < j11; i10++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    public boolean fling(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean k10 = oVar.k();
            boolean l10 = this.mLayout.l();
            if (!k10 || Math.abs(i10) < this.mMinFlingVelocity) {
                i10 = 0;
            }
            if (!l10 || Math.abs(i11) < this.mMinFlingVelocity) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = (float) i10;
            float f11 = (float) i11;
            if (!dispatchNestedPreFling(f10, f11)) {
                boolean z10 = k10 || l10;
                dispatchNestedFling(f10, f11, z10);
                r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.a(i10, i11)) {
                    return true;
                }
                if (z10) {
                    if (l10) {
                        k10 |= true;
                    }
                    startNestedScroll(k10 ? 1 : 0, 1);
                    int i12 = this.mMaxFlingVelocity;
                    int max = Math.max(-i12, Math.min(i10, i12));
                    int i13 = this.mMaxFlingVelocity;
                    this.mViewFlinger.c(max, Math.max(-i13, Math.min(i11, i13)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View Q0 = this.mLayout.Q0(view, i10);
        if (Q0 != null) {
            return Q0;
        }
        boolean z11 = true;
        boolean z12 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z12 || !(i10 == 2 || i10 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i10);
            if (findNextFocus != null || !z12) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.J0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.l()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = instance.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.k()) {
                int i12 = (this.mLayout.Z() == 1) ^ (i10 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i12) != null) {
                    z11 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
                z10 = z11;
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.J0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i10);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(d0 d0Var) {
        if (d0Var.hasAnyOfTheFlags(524) || !d0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(d0Var.mPosition);
    }

    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.G();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.hasStableIds() ? d0Var.getItemId() : (long) d0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return jVar.a(i10, i11);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f4435c) {
            return pVar.f4434b;
        }
        if (this.mState.e() && (pVar.b() || pVar.d())) {
            return pVar.f4434b;
        }
        Rect rect = pVar.f4434b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).e(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f4435c = false;
        return rect;
    }

    public n getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(x0.b.fastscroll_default_thickness), resources.getDimensionPixelSize(x0.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(x0.b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            o oVar = this.mLayout;
            if (oVar != null) {
                oVar.g("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.p();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.x1(i10);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((p) this.mChildHelper.i(i10).getLayoutParams()).f4435c = true;
        }
        this.mRecycler.s();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void offsetChildrenHorizontal(int i10) {
        int g10 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.mChildHelper.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int g10 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.mChildHelper.f(i11).offsetTopAndBottom(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int j10 = this.mChildHelper.j();
        for (int i12 = 0; i12 < j10; i12++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f4376g = true;
            }
        }
        this.mRecycler.u(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.mChildHelper.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i16));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f4376g = true;
            }
        }
        this.mRecycler.v(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.mChildHelper.j();
        for (int i13 = 0; i13 < j10; i13++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f4376g = true;
                } else if (i14 >= i10) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f4376g = true;
                }
            }
        }
        this.mRecycler.w(i10, i11, z10);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z10 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z10 = false;
        }
        this.mFirstLayoutComplete = z10;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<e> threadLocal = e.f4607f;
            e eVar = threadLocal.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new e();
                Display u10 = androidx.core.view.a0.u(this);
                float f10 = 60.0f;
                if (!isInEditMode() && u10 != null) {
                    float refreshRate = u10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                e eVar2 = this.mGapWorker;
                eVar2.f4611c = (long) (1.0E9f / f10);
                threadLocal.set(eVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (ALLOW_THREAD_GAP_WORK && (eVar = this.mGapWorker) != null) {
            eVar.j(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).g(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.mLayout.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.k()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        scrollByInternal((int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f11 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.l()) {
                        f11 = -axisValue;
                    } else if (this.mLayout.k()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        scrollByInternal((int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f11 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f11 = 0.0f;
            }
            f10 = 0.0f;
            scrollByInternal((int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f11 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean k10 = oVar.k();
        boolean l10 = this.mLayout.l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l10) {
                k10 |= true;
            }
            startNestedScroll(k10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i10 = x11 - this.mInitialTouchX;
                int i11 = y11 - this.mInitialTouchY;
                if (!k10 || Math.abs(i10) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (l10 && Math.abs(i11) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.o.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.o.b();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.Z0(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            if (!z10 && this.mAdapter != null) {
                if (this.mState.f4374e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.A1(i10, i11);
                this.mState.f4379j = true;
                dispatchLayoutStep2();
                this.mLayout.D1(i10, i11);
                if (this.mLayout.G1()) {
                    this.mLayout.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f4379j = true;
                    dispatchLayoutStep2();
                    this.mLayout.D1(i10, i11);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.Z0(this.mRecycler, this.mState, i10, i11);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.f4381l) {
                    a0Var.f4377h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.f4377h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f4381l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f4375f = gVar.getItemCount();
            } else {
                this.mState.f4375f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.Z0(this.mRecycler, this.mState, i10, i11);
            stopInterceptRequestLayout(false);
            this.mState.f4377h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.c());
        o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.f4452c) != null) {
            oVar.c1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.d(yVar2);
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                yVar.f4452c = oVar.d1();
            } else {
                yVar.f4452c = null;
            }
        }
        return yVar;
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01df
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.k()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.l()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d4
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d4
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d4
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d4
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d4
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            androidx.recyclerview.widget.e r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d4
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01d4
        L_0x016d:
            r1.f(r6, r15, r0)
            goto L_0x01d4
        L_0x0171:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.resetScroll()
            r8 = 1
            goto L_0x01d4
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01d1
            r10 = r10 | 2
        L_0x01d1:
            r6.startNestedScroll(r10, r8)
        L_0x01d4:
            if (r8 != 0) goto L_0x01db
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01db:
            r12.recycle()
            return r9
        L_0x01df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            androidx.core.view.a0.f0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        d0Var.setFlags(0, 8192);
        if (this.mState.f4378i && d0Var.isUpdated() && !d0Var.isRemoved() && !d0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.k1(this.mRecycler);
            this.mLayout.l1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r10 = this.mChildHelper.r(view);
        if (r10) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r10);
        return r10;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 < 0 || i10 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i10));
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        d0 d0Var;
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.mChildHelper.f(i10);
            d0 childViewHolder = getChildViewHolder(f10);
            if (!(childViewHolder == null || (d0Var = childViewHolder.mShadowingHolder) == null)) {
                View view = d0Var.itemView;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.b1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.r1(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    public void scrollBy(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean k10 = oVar.k();
            boolean l10 = this.mLayout.l();
            if (k10 || l10) {
                if (!k10) {
                    i10 = 0;
                }
                if (!l10) {
                    i11 = 0;
                }
                scrollByInternal(i10, i11, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        int i17 = i11;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i16, i17, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            i15 = i19;
            i14 = i18;
            i13 = i16 - i18;
            i12 = i17 - i19;
        } else {
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i15, i13, i12, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i20 = i13 - iArr4[0];
        int i21 = i12 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i22 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !androidx.core.view.n.a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i20, motionEvent.getY(), (float) i21);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (!(i14 == 0 && i15 == 0)) {
            dispatchOnScrolled(i14, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z10 && i14 == 0 && i15 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i10, int i11, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.o.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int w12 = i10 != 0 ? this.mLayout.w1(i10, this.mRecycler, this.mState) : 0;
        int y12 = i11 != 0 ? this.mLayout.y1(i11, this.mRecycler, this.mState) : 0;
        androidx.core.os.o.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = w12;
            iArr[1] = y12;
        }
    }

    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.x1(i10);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(k kVar) {
        this.mAccessibilityDelegate = kVar;
        androidx.core.view.a0.n0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i10) {
        if (isComputingLayout()) {
            d0Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        androidx.core.view.a0.x0(d0Var.itemView, i10);
        return true;
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.h.f(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.k();
            this.mItemAnimator.v((l.b) null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.k();
                }
                this.mLayout.k1(this.mRecycler);
                this.mLayout.l1(this.mRecycler);
                this.mRecycler.c();
                if (this.mIsAttached) {
                    this.mLayout.A(this, this.mRecycler);
                }
                this.mLayout.E1((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.c();
            }
            this.mChildHelper.o();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f4410b == null) {
                    oVar.E1(this);
                    if (this.mIsAttached) {
                        this.mLayout.z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f4410b.exceptionLabel());
                }
            }
            this.mRecycler.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(u uVar) {
        this.mRecycler.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.mScrollState) {
            this.mScrollState = i10;
            if (i10 != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.F(b0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        if (a10 != 0) {
            i10 = a10;
        }
        this.mEatenAccessibilityChangeFlags |= i10;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i10) {
        if (!this.mLayoutSuppressed) {
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.I1(this, this.mState, i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.mChildHelper.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.mChildHelper.i(i14);
            d0 childViewHolderInt = getChildViewHolderInt(i15);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i10 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) i15.getLayoutParams()).f4435c = true;
            }
        }
        this.mRecycler.M(i10, i11);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x0.a.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    /* access modifiers changed from: package-private */
    public d0 findViewHolderForPosition(int i10, boolean z10) {
        int j10 = this.mChildHelper.j();
        d0 d0Var = null;
        for (int i11 = 0; i11 < j10; i11++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z10) {
                    if (childViewHolderInt.mPosition != i10) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i10) {
                    continue;
                }
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new p();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z10 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = androidx.core.view.c0.b(viewConfiguration, context2);
        this.mScaledVerticalScrollFactor = androidx.core.view.c0.d(viewConfiguration, context2);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (androidx.core.view.a0.z(this) == 0) {
            androidx.core.view.a0.x0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k(this));
        int[] iArr = x0.c.f23557f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        }
        String string = obtainStyledAttributes.getString(x0.c.f23566o);
        if (obtainStyledAttributes.getInt(x0.c.f23560i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(x0.c.f23559h, true);
        boolean z11 = obtainStyledAttributes.getBoolean(x0.c.f23561j, false);
        this.mEnableFastScroller = z11;
        if (z11) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(x0.c.f23564m), obtainStyledAttributes.getDrawable(x0.c.f23565n), (StateListDrawable) obtainStyledAttributes.getDrawable(x0.c.f23562k), obtainStyledAttributes.getDrawable(x0.c.f23563l));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        if (i12 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i11, 0);
            if (i12 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
            }
            z10 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z10);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f4433a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f4434b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f4435c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f4436d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.f4433a.getLayoutPosition();
        }

        public boolean b() {
            return this.f4433a.isUpdated();
        }

        public boolean c() {
            return this.f4433a.isRemoved();
        }

        public boolean d() {
            return this.f4433a.isInvalid();
        }

        public p(int i10, int i11) {
            super(i10, i11);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }
    }

    public static class y extends e0.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f4452c;

        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            /* renamed from: a */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            /* renamed from: c */
            public y[] newArray(int i10) {
                return new y[i10];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4452c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void d(y yVar) {
            this.f4452c = yVar.f4452c;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f4452c, 0);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i13 = 0;
            if (!oVar.k()) {
                i10 = 0;
            }
            if (!this.mLayout.l()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i12 == Integer.MIN_VALUE || i12 > 0) {
                    if (z10) {
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        if (i11 != 0) {
                            i13 |= 2;
                        }
                        startNestedScroll(i13, 1);
                    }
                    this.mViewFlinger.f(i10, i11, i12, interpolator);
                    return;
                }
                scrollBy(i10, i11);
            }
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }
}
