/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.ui.swt.interfaces;

import org.eclipse.birt.chart.model.Chart;

/**
 * @author Actuate Corporation
 *  
 */
public interface IUIManager
{
    /**
     * Register a collection of Sheets (denoted by their Node Paths) that can be operated on together.
     * 
     * @param sCollection
     *            unique name for the collection
     * @param saNodePaths
     *            array of node paths associated with each sheet entry in the collection
     * @return the result of the registration. Will be false if collection is already defined.
     */
    public boolean registerSheetCollection(String sCollection, String[] saNodePaths);

    /**
     * Get the node names present in the specified collection.
     * 
     * @param sCollection
     *            name of the collection whose contents are to be fetched
     * @return array of node paths present in the registered collection. null if collection is not found
     */
    public String[] getRegisteredCollectionValue(String sCollection);

    /**
     * Add a single instance of all the sheets defined in the specified collection.
     * 
     * @param sCollection
     *            name of collection whose components are to be added
     * @return true if addition of all the nodes succeeds. false if any component was not found or if addition of any
     *         node fails
     */
    public boolean addCollectionInstance(String sCollection);

    /**
     * Remove the last instance of each sheet defined in the specified collection.
     * 
     * @param sCollection
     *            name of collection whose components are to be removed
     * @return true if removal of all nodes was successful. false if any component was not found or any component could
     *         not be removed
     */
    public boolean removeCollectionInstance(String sCollection);

    /**
     * 
     * @param sheet
     * @deprecated
     */
    public void addAxisAttributeSheet(ISheet sheet);

    /**
     * 
     * @param sheet
     * @deprecated
     */
    public void addAxisDataSheet(ISheet sheet);

    /**
     * 
     * @param sheet
     * @deprecated
     */
    public void addSeriesAttributeSheet(ISheet sheet);

    /**
     * 
     * @param sheet
     * @deprecated
     */
    public void addSeriesDataSheet(ISheet sheet);

    /**
     * @deprecated
     */
    public void removeAxisAttributeSheet();

    /**
     * @deprecated
     */
    public void removeAxisDataSheet();

    /**
     * @deprecated
     */
    public void removeSeriesAttributeSheet();

    /**
     * @deprecated
     */
    public void removeSeriesDataSheet();

    public Chart getCurrentModelState();
}