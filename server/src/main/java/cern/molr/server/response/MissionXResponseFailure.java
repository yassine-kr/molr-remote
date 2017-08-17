/**
 * Copyright (c) 2017 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package cern.molr.server.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import cern.molr.commons.trye.Failure;

@JsonDeserialize(as = MissionXResponseFailure.class)
public class MissionXResponseFailure<X> extends Failure<X> implements MissionXResponse<X>{

    public MissionXResponseFailure() {
        super(null);
    }
    
    /**
     * @param l
     */
    public MissionXResponseFailure(Throwable l) {
        super(l);
    }

}
