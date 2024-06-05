package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.el;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

public class MaxRecyclerAdapter extends RecyclerView.g<RecyclerView.d0> implements MaxAdPlacer.Listener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final MaxAdPlacer f14069a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.g f14070b;

    /* renamed from: c  reason: collision with root package name */
    private final b f14071c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f14072d;

    /* renamed from: e  reason: collision with root package name */
    private el f14073e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdPlacer.Listener f14074f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f14075g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public AdPositionBehavior f14076h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f14078a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f14078a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f14078a;
        }
    }

    class a implements el.a {
        a() {
        }

        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f14069a.updateFillablePositions(i10, Math.min(i11 + MaxRecyclerAdapter.this.f14075g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    private class b extends RecyclerView.i {
        private b() {
        }

        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f14069a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f14069a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f14070b.getItemCount();
            if (MaxRecyclerAdapter.this.f14076h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f14076h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f14069a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f14069a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f14070b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f14076h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f14076h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f14069a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f14069a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f14069a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f14069a.getAdjustedCount(itemCount);
            int i13 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f14069a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i13 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i13 - i11), i13);
        }

        /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.g gVar, Activity activity) {
        b bVar = new b(this, (a) null);
        this.f14071c = bVar;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f14069a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(gVar.hasStableIds());
        this.f14070b = gVar;
        gVar.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f14070b.unregisterAdapterDataObserver(this.f14071c);
        } catch (Exception unused) {
        }
        this.f14069a.destroy();
        el elVar = this.f14073e;
        if (elVar != null) {
            elVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f14069a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f14069a.getAdjustedPosition(i10);
    }

    public int getItemCount() {
        return this.f14069a.getAdjustedCount(this.f14070b.getItemCount());
    }

    public long getItemId(int i10) {
        if (!this.f14070b.hasStableIds()) {
            return -1;
        }
        if (this.f14069a.isFilledPosition(i10)) {
            return this.f14069a.getAdItemId(i10);
        }
        return this.f14070b.getItemId(this.f14069a.getOriginalPosition(i10));
    }

    public int getItemViewType(int i10) {
        if (this.f14069a.isAdPosition(i10)) {
            return -42;
        }
        return this.f14070b.getItemViewType(this.f14069a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f14069a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f14069a.loadAds();
    }

    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f14074f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f14074f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f14074f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f14074f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f14072d = recyclerView;
        el elVar = new el(recyclerView);
        this.f14073e = elVar;
        elVar.a((el.a) new a());
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i10) {
        int i11;
        int i12;
        this.f14073e.a(d0Var.itemView, i10);
        if (this.f14069a.isAdPosition(i10)) {
            AppLovinSdkUtils.Size adSize = this.f14069a.getAdSize(i10, a(i10));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) d0Var).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                if (adSize.getWidth() < 0) {
                    i11 = adSize.getWidth();
                } else {
                    i11 = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                }
                layoutParams.width = i11;
                if (adSize.getHeight() < 0) {
                    i12 = adSize.getHeight();
                } else {
                    i12 = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                }
                layoutParams.height = i12;
                containerView.setLayoutParams(layoutParams);
                this.f14069a.renderAd(i10, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f14070b.onBindViewHolder(d0Var, this.f14069a.getOriginalPosition(i10));
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f14070b.onCreateViewHolder(viewGroup, i10);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        RecyclerView.o layoutManager = this.f14072d.getLayoutManager();
        if (layoutManager == null || !layoutManager.k()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        inflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(inflate);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f14072d = null;
        el elVar = this.f14073e;
        if (elVar != null) {
            elVar.a();
            this.f14073e = null;
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        if (d0Var instanceof MaxAdRecyclerViewHolder) {
            return super.onFailedToRecycleView(d0Var);
        }
        return this.f14070b.onFailedToRecycleView(d0Var);
    }

    public void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        if (d0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(d0Var);
        } else {
            this.f14070b.onViewAttachedToWindow(d0Var);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        if (d0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(d0Var);
        } else {
            this.f14070b.onViewDetachedFromWindow(d0Var);
        }
    }

    public void onViewRecycled(RecyclerView.d0 d0Var) {
        el elVar = this.f14073e;
        if (elVar != null) {
            elVar.b(d0Var.itemView);
        }
        if (d0Var instanceof MaxAdRecyclerViewHolder) {
            if (this.f14069a.isFilledPosition(d0Var.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) d0Var).getContainerView().removeAllViews();
            }
            super.onViewRecycled(d0Var);
            return;
        }
        this.f14070b.onViewRecycled(d0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f14076h = adPositionBehavior;
    }

    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f14070b.unregisterAdapterDataObserver(this.f14071c);
        this.f14070b.setHasStableIds(z10);
        this.f14070b.registerAdapterDataObserver(this.f14071c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f14074f = listener;
    }

    public void setLookAhead(int i10) {
        this.f14075g = i10;
    }

    private int a(int i10) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f14072d.getContext(), this.f14072d.getWidth());
        RecyclerView.o layoutManager = this.f14072d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).q2() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.X2()) * gridLayoutManager.b3().f(i10);
    }
}
