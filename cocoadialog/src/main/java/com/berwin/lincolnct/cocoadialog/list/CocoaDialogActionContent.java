package com.berwin.lincolnct.cocoadialog.list;


import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.berwin.lincolnct.cocoadialog.CocoaDialog;
import com.berwin.lincolnct.cocoadialog.CocoaDialogActionStyle;

public class CocoaDialogActionContent implements ICocoDialogActionContent {
    private final String title;
    private final CocoaDialogActionStyle style;
    private final int color;
    //the dialog will dismiss when action clicked normally,if require the dismiss
    private boolean keepShowingWhenActionClicked = false;
    //anything which attach with this item, like the tag in view
    private Object attach;

    /**
     * An action for a {@link CocoaDialog}, appears as a button.
     *
     * @param title The title of the action.
     */
    public CocoaDialogActionContent(String title) {
        this(title, 0xFF007AFF);
    }

    /**
     * An action for a {@link CocoaDialog}, appears as a button.
     *
     * @param title The title of the action.
     * @param style The {@link CocoaDialogActionStyle} of the action, {@link CocoaDialogActionStyle#cancel} always lay at the left or bottom of the actions, {@link CocoaDialogActionStyle#destructive}'s text would be red.
     */
    public CocoaDialogActionContent(String title, @NonNull CocoaDialogActionStyle style) {
        this(title, style, style == CocoaDialogActionStyle.destructive ? Color.RED : 0xFF007AFF);
    }

    /**
     * An action for a {@link CocoaDialog}, appears as a button.
     *
     * @param title The title of the action.
     * @param color The {@link Color} of the action's title.
     */
    public CocoaDialogActionContent(String title, @ColorInt int color) {
        this(title, CocoaDialogActionStyle.normal, color);
    }

    /**
     * An action for a {@link CocoaDialog}, appears as a button.
     *
     * @param title The title of the action.
     * @param color The {@link Color} of the action's title.
     */
    public CocoaDialogActionContent(String title, @NonNull CocoaDialogActionStyle style, @ColorInt int color) {
        this.title = title;
        this.style = style;
        this.color = color;
    }

    public CocoaDialogActionContent setKeepShowingWhenActionClicked(boolean show) {
        this.keepShowingWhenActionClicked = show;
        return this;
    }

    public CocoaDialogActionContent setAttach(Object attach) {
        this.attach = attach;
        return this;
    }

    @Nullable
    public Object getAttach() {
        return attach;
    }

    @Nullable
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public boolean isKeepShowingWhenActionClicked() {
        return keepShowingWhenActionClicked;
    }

    @NonNull
    @Override
    public CocoaDialogActionStyle getStyle() {
        return style;
    }
}

