/**
 * Copyright (c) 2017 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package cern.molr.supervisor.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import cern.molr.type.trye.Success;

@JsonDeserialize(as = MissionExecutionResponseSuccess.class)
public class MissionExecutionResponseSuccess extends Success<Object> implements MissionExecutionResponse{

    public MissionExecutionResponseSuccess() {
        super(null);
    }
    
    /**
     * @param r
     */
    public MissionExecutionResponseSuccess(Object r) {
        super(r);
    }

    @Override
    public Exception getException() {
        return null;
    }

    @Override
    public void setException(Exception e) {
        return;
    }

    @Override
    public Object getResult() {
        return r;
    }

    @Override
    public void setResult(Object r){
        this.r = r;
    }

}