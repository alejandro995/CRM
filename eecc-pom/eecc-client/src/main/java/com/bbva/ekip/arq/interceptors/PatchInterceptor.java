package com.bbva.ekip.arq.interceptors;

import org.apache.cxf.interceptor.AbstractInDatabindingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

/**
 * Created by jquijano82 on 29/08/16.
 */
public class PatchInterceptor extends AbstractInDatabindingInterceptor {

    private static final String PATCH = "PATCH";
    private static final String ASYNC_REQUEST = "use.async.http.conduit";

    public PatchInterceptor() {
        super(Phase.PRE_LOGICAL);
    }

    public void handleMessage(Message message) throws Fault {
        if ( message.get(Message.HTTP_REQUEST_METHOD).equals(PATCH) ){
            message.put(ASYNC_REQUEST, true);
        }
    }
}
