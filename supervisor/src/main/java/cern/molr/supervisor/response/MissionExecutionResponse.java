/**
 * Copyright (c) 2017 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package cern.molr.supervisor.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import cern.molr.type.trye.TryResponse;

@JsonDeserialize(using = MissionExecutionResponseDeserializer.class)
public interface MissionExecutionResponse extends TryResponse<Object>{

}