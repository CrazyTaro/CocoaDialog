package com.berwin.lincolnct.cocoadialog.list;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.berwin.lincolnct.cocoadialog.CocoaDialogActionStyle;

/**
 * Provide dialog action's content for render the button action in action sheet style.
 */
public interface ICocoDialogActionContent {
    /**
     * Get the action title to show as text
     */
    @Nullable
    String getTitle();

    /**
     * Get the color of action text
     */
    @ColorInt
    int getColor();

    /**
     * Get this action style to render, normally cancel style will render independently
     */
    @NonNull
    CocoaDialogActionStyle getStyle();

    /**
     * Get if the dialog should be closed when action clicked
     */
    boolean isKeepShowingWhenActionClicked();
}
