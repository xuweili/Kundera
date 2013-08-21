/*******************************************************************************
 * * Copyright 2013 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.client.es;

import java.util.Iterator;
import java.util.List;

import com.impetus.kundera.client.Client;
import com.impetus.kundera.metadata.model.EntityMetadata;
import com.impetus.kundera.persistence.EntityReader;
import com.impetus.kundera.persistence.PersistenceDelegator;
import com.impetus.kundera.query.QueryImpl;

/**
 * @author vivek.mishra
 *  Implementation of query interface.
 */

public class ESQuery<E> extends QueryImpl
{

    public ESQuery(String query, PersistenceDelegator persistenceDelegator)
    {
        super(query, persistenceDelegator);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected List<Object> populateEntities(EntityMetadata m, Client client)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected List<Object> recursivelyPopulateEntities(EntityMetadata m, Client client)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected EntityReader getReader()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected int onExecuteUpdate()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void close()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Iterator<E> iterate()
    {
        // TODO Auto-generated method stub
        return null;
    }

}