/**
 * Copyright (c) 2017 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package cern.molr.server.serialize;

import cern.molr.commons.trye.TryResponseDeserializer;
import cern.molr.server.response.MissionCancelResponse;
import cern.molr.server.response.MissionCancelResponseFailure;
import cern.molr.server.response.MissionCancelResponseSuccess;

public class MissionCancelResponseDeserializer extends TryResponseDeserializer<MissionCancelResponse>{

    @Override
    public Class<? extends MissionCancelResponse> getSuccessDeserializer() {
        return MissionCancelResponseSuccess.class;
    }

    @Override
    public Class<? extends MissionCancelResponse> getFailureDeserializer() {
        return MissionCancelResponseFailure.class;
    }

}
