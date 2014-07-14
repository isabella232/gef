/*******************************************************************************
* Copyright (c) 2011 Stephan Schwiebert. All rights reserved. This program and
* the accompanying materials are made available under the terms of the Eclipse
* Public License v1.0 which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* <p/>
* Contributors: Stephan Schwiebert - initial API and implementation
*******************************************************************************/
package org.eclipse.gef4.cloudio.layout;

import org.eclipse.gef4.cloudio.Word;
import org.eclipse.gef4.cloudio.util.CloudMatrix;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

/**
 * 
 * @author sschwieb
 *
 */
public interface ILayouter {
	
	/**
	 * Places the given word within the defined rectangle, starting
	 * at the initial position. 
	 * @param initial
	 * @param word
	 * @param cloudArea
	 * @param cloudMatrix
	 * @return whether the given word could be placed or not
	 */
	public boolean layout(Point initial, final Word word, final Rectangle cloudArea, CloudMatrix cloudMatrix);
	
	/**
	 * Calculates the initial offset of the given word, within the bounds
	 * of the specified rectangle. The layout algorithm will try to find
	 * a matching position around the initial offset.
	 * @param word
	 * @param cloudArea
	 * @return the initial offset for the given word
	 */
	public Point getInitialOffset(Word word, Rectangle cloudArea);
	
	/**
	 * Set Layouter-specific options. See {@link DefaultLayouter}
	 * as an example.
	 * @param optionName
	 * @param object
	 */
	public void setOption(String optionName, Object object);
}
