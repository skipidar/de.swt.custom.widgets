package de.swt.custom.widgets.jface.dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wb.swt.SWTResourceManager;

public class Style {
	
	public static final int WIDTH_ACTIVE_HISTORY_ITEM_ICON_PX = 10; // px
	
	
	public static final String TITLE_HISTORY_FONT_NAME = "Segoe UI";
	public static final int TITLE_HISTORY_FONT_SIZE = 25;
	public static final Font TITLE_HISTORY_FONT = SWTResourceManager.getFont(TITLE_HISTORY_FONT_NAME, TITLE_HISTORY_FONT_SIZE, SWT.NORMAL);

	public static final int WIDGET_VALIDATED_LABLED_TEXT_ICON_WIDTH = 25;

	public static final int WIDGET_VALIDATED_GROUP_MARGIN_HEIGHT = 5; // additional to the existing text field margin
	
	
	public static final Image WIDGET_VALIDATED_LABLED_TEXT_IMAGE_WARNING = Display.getCurrent().getSystemImage(SWT.ICON_WARNING);
	public static final Image WIDGET_VALIDATED_LABLED_TEXT_IMAGE_INFO = Display.getCurrent().getSystemImage(SWT.ICON_INFORMATION);



	public static final int WIDGET_VALIDATED_LABLED_TEXT_TEXTFIELD_HEIGHT = 22; 		// 32px - windows guideline: http://msdn.microsoft.com/en-us/library/windows/apps/jj839734.aspx
	public static final int WIDGET_VALIDATED_LABLED_TEXT_MARGIN_BOTTOM = 19; 			// 24px - windows guideline: http://msdn.microsoft.com/en-us/library/windows/apps/jj839734.aspx
	public static final int WIDGET_VALIDATED_LABLED_TEXT_MARGIN_BOTTOM_IN_GROUP = 5; 	// px


	
	
}
