package projekt.substratum.util.helpers;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;

import java.util.List;

import projekt.substratum.adapters.tabs.overlays.OverlaysItem;

public class OverlaysCallback extends DiffUtil.Callback {

    private List<OverlaysItem> newOverlays;
    private List<OverlaysItem> oldOverlays;

    public OverlaysCallback(List<OverlaysItem> newOverlays, List<OverlaysItem> oldOverlays) {
        this.newOverlays = newOverlays;
        this.oldOverlays = oldOverlays;
    }

    @Override
    public int getOldListSize() {
        return oldOverlays.size();
    }

    @Override
    public int getNewListSize() {
        return newOverlays.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        try {
            return oldOverlays.get(oldItemPosition).equals(newOverlays.get(newItemPosition));
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        try {
            return oldOverlays.get(oldItemPosition).equals(newOverlays.get(newItemPosition));
        } catch (Exception e) {
            return false;
        }
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}