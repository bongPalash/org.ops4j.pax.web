/* Copyright 2007 Alin Dreghiciu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.service.internal;

import java.util.Map;
import javax.servlet.Servlet;
import org.osgi.service.http.HttpContext;
import org.ops4j.pax.web.service.HttpServiceConfiguration;
import org.ops4j.pax.web.service.internal.model.EventListenerModel;
import org.ops4j.pax.web.service.internal.model.FilterModel;

public interface ServerController
{

    void start();

    void stop();

    void configure( HttpServiceConfiguration configuration );

    HttpServiceConfiguration getConfiguration();

    void addListener( ServerListener listener );

    void removeContext( HttpContext httpContext );

    String addServlet( String alias, Servlet servlet, Map<String, String> initParams, HttpContext httpContext );

    void removeServlet( String name, HttpContext httpContext );

    boolean isStarted();

    void addEventListener( EventListenerModel eventListenerModel );

    void removeEventListener( EventListenerModel eventListenerModel );

    void addFilter( FilterModel filterModel );

    void removeFilter( FilterModel filterModel );

}
