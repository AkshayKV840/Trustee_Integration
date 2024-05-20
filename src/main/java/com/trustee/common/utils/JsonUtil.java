package com.trustee.common.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.hibernate.service.spi.ServiceException;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class JsonUtil {

    private JsonUtil() {
    }

    public static String toString(Object obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            SimpleModule simpleModule = new SimpleModule();
            simpleModule.addSerializer(OffsetDateTime.class, new JsonSerializer<OffsetDateTime>() {
                @Override
                public void serialize(OffsetDateTime offsetDateTime, JsonGenerator jsonGenerator,
                        SerializerProvider serializerProvider) throws IOException {
                    jsonGenerator.writeString(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime));
                }
            });
            mapper.registerModule(simpleModule);

            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new ServiceException(e.toString());
        }
    }

    public static <T> T toObject(String str, Class<T> objClass) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(str, objClass);
        } catch (Exception ex) {
            try {
                return mapper.readValue(str, mapper.getTypeFactory().constructCollectionType(List.class, objClass));
            } catch (Exception e) {
                throw new ServiceException(e.toString());
            }
        }
    }

}
