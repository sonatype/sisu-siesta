/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.sisu.siesta.common.exceptions;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import org.sonatype.sisu.siesta.common.HttpStatusCode;

/**
 * Thrown when an object is not found.
 *
 * @since 1.0
 */
@HttpStatusCode( 404 )
public class ObjectNotFoundException
    extends RuntimeException
{

    public ObjectNotFoundException()
    {
        super();
    }

    public ObjectNotFoundException( final String message )
    {
        super( message );
    }

    public ObjectNotFoundException( final String message, final Throwable cause )
    {
        super( message, cause );
    }

    public ObjectNotFoundException( final Throwable cause )
    {
        super( cause );
    }

}