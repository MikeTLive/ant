/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included  with this distribution in
 * the LICENSE.txt file.
 */
package org.apache.myrmidon.components.configurer;

import org.apache.myrmidon.AbstractMyrmidonTest;

/**
 * Adapts an Object to MyRole
 *
 * @author <a href="mailto:adammurdoch@apache.org">Adam Murdoch</a>
 * @version $Revision$ $Date$
 */
public class MyRole1Adaptor
    implements MyRole1
{
    private final Object m_object;

    public MyRole1Adaptor( final Object o )
    {
        m_object = o;
    }

    public boolean equals( Object obj )
    {
        final MyRole1Adaptor adaptor = (MyRole1Adaptor)obj;
        return AbstractMyrmidonTest.equals( m_object, adaptor.m_object );
    }
}
