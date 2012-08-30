/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dabloem.jaxrs;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author duncan
 */
@Provider
public class MyResolver implements ContextResolver<MyObject> {

    @Override
    public MyObject getContext(Class<?> type) {
        return new MyObject();
    }
    
}
