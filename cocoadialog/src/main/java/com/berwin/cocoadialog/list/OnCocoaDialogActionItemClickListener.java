package com.berwin.cocoadialog.list;

import android.support.annotation.NonNull;

import com.berwin.cocoadialog.CocoaDialog;

public interface OnCocoaDialogActionItemClickListener {
    void onItemClick(@NonNull CocoaDialog dialog, int index, @NonNull ICocoDialogActionContent content);
}
