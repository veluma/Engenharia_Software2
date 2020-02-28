package com.es2.bridge;

public class APIRequestContentAggregator extends APIRequest {
    @Override
    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if (!services.containsKey(serviceId)) {
            throw new ServiceNotFoundException();
        }
        return services.get(serviceId).getContent("0");
    }
}