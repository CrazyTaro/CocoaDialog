package com.berwin.cocoadialog;

public enum CocoaDialogStyle {
    actionSheet,
    alert,
    /**
     * the custom view will completely show in the dialog
     */
    custom,
    /**
     * the custom view will only show as the content in the dialog, so user can set title,actions and others which using alert style
     */
    customAlertContent,
    /**
     * the custom view will only show as the content in the dialog, so user can set title,actions and others which using action sheet style
     */
    customActionSheetContent,
}
