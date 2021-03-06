/**
 * Copyright (c) 2017 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package cern.molr.sample.mission;

import java.util.function.Function;

import cern.molr.commons.RunWithMole;
import cern.molr.sample.mole.IntegerFunctionMole;

@RunWithMole(IntegerFunctionMole.class)
public class IntDoubler implements Function<Integer,Integer>{

    @Override
    public Integer apply(Integer v) {
        return v * 2;
    }


}
