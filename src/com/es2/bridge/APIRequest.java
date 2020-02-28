package com.es2.bridge;

import java.util.HashMap;

public class APIRequest {
    // Attributes
    protected HashMap<String, APIServiceInterface> services = new HashMap<String, APIServiceInterface>();

    // Methods
    public String addService(APIServiceInterface service) {
        String serv_Id = Integer.toString(service.hashCode());
        services.put(serv_Id, service);
        return serv_Id;
    }

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if (!services.containsKey(serviceId)) {
            throw new ServiceNotFoundException();
        }
        return services.get(serviceId).getContent(contentId);
    }

    public String setContent(String serviceId, String content) throws ServiceNotFoundException {
        if (!services.containsKey(serviceId)) {
            throw new ServiceNotFoundException();
        }

        return services.get(serviceId).setContent(content);
    }
}