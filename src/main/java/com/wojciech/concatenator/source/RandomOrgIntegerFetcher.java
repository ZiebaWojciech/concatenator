package com.wojciech.concatenator.source;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wojciech.concatenator.dto.random_org.BasicApiMethods;
import com.wojciech.concatenator.dto.random_org.GenerateIntegersParams;
import com.wojciech.concatenator.dto.random_org.Request;
import com.wojciech.concatenator.dto.random_org.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Fetches the random integer number from Random.org API service
 */
@Component
public class RandomOrgIntegerFetcher implements DataSource<Integer> {
    @Value("${integration.random.org.api.key}")
    private String apiKey;

    @Value("${integration.random.org.api.url}")
    private String apiUrl;

    private final ObjectMapper jsonMapper = new ObjectMapper();
    @Override
    public Integer getValue() {
        if (StringUtils.isEmpty(apiKey) || StringUtils.isEmpty(apiUrl)) {
            throw new IllegalStateException("Required API information is missing");
        }
        String requestObject = createRequestJson();
        String response = getApiResponse(requestObject);
        return retrieveSingleOutputFromApiResponse(response);
    }

    private Integer retrieveSingleOutputFromApiResponse(String response) {
        Integer resultRandom = null;
        try {
            Response responseObject = jsonMapper.readValue(response, Response.class);
            int[] data = responseObject.getResult().getRandom().getData();
            if (data.length != 1) {
                throw new IllegalStateException("Wrong response data quantity");
            } else {
                resultRandom = data[0];
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultRandom;
    }

    private String getApiResponse(String requestObject) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(requestObject, headers);
        return restTemplate.postForObject(apiUrl, requestEntity, String.class);
    }

    private String createRequestJson() {
        GenerateIntegersParams params = new GenerateIntegersParams(apiKey, 1, 0, 100_000);

        Request request = new Request(BasicApiMethods.GENERATE_INTEGERS.methodName, params, 0);

        String requestObject = null;
        try {
            requestObject = jsonMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return requestObject;
    }

}
