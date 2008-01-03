/**
 * Mogwai ERDesigner. Copyright (C) 2002 The Mogwai Project.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package de.erdesignerng.exception;

/**
 * @author $Author: mirkosertic $
 * @version $Date: 2008-01-03 13:10:26 $
 */
public class ElementAlreadyExistsException extends ModelException {

	private static final long serialVersionUID = 3016742498176605316L;

	private String elementName;

	public ElementAlreadyExistsException(String aElementName) {
		elementName = aElementName;
	}

	public String getElementName() {
		return elementName;
	}

}