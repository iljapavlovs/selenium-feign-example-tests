package com.example.at.support.rest.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swissre.lhcp.common.server.infrastructure.utils.ObjectMapperUtils;

import java.io.File;
import java.io.IOException;

public class RestHelper {
    public static <T> T deserialize(File file, Class<T> targetClass) throws IOException {
        ObjectMapper mapper = ObjectMapperUtils.createObjectMapper();
        return mapper.readValue(file, targetClass);
    }
}