package com.trustee.common.utils;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;
import java.util.stream.Collectors;



public class ClassUtil {

    private ClassUtil() {
    }

    public static <T> T convert(Object data, Class<T> classToConvert) {
        ModelMapper mm = new ModelMapper();
        mm.getConfiguration().setDeepCopyEnabled(false);
        mm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return mm.map(data, classToConvert);
    }

    public static <S, T> List<T> convertList(List<S> dl, Class<T> classToConvert) {
        return dl.stream().map(r -> ClassUtil.convert(r, classToConvert)).collect(Collectors.toList());
    }
}
