package com.berwin.cocoadialog.list;

import android.support.annotation.NonNull;

import com.berwin.cocoadialog.CocoaDialog;
import com.berwin.cocoadialog.CocoaDialogAction;

public final class CocoaDialogActionItemClickListenerImpl implements CocoaDialogAction.OnClickListener {
    int index;
    ICocoDialogActionContent content;
    OnCocoaDialogActionItemClickListener itemClickListener;

    public CocoaDialogActionItemClickListenerImpl(int index, @NonNull ICocoDialogActionContent content, OnCocoaDialogActionItemClickListener itemClickListener) {
        this.index = index;
        this.content = content;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(CocoaDialog dialog) {
        if (itemClickListener != null) {
            itemClickListener.onItemClick(dialog, index, content);
        }
    }
}
