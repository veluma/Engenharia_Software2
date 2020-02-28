package com.es2.bridge;

import java.util.LinkedHashMap;

public class APIMoodle implements APIServiceInterface {
    protected LinkedHashMap<String, String> contentMap = new LinkedHashMap<String, String>();

    @Override
    public String getContent(String contentId) {
        if ("0".equals(contentId)) {
            StringBuilder output = new StringBuilder();
            for (String value : contentMap.values()) {
                output.append(value);
            }
            return output.toString();
        }

        return contentMap.get(contentId);
    }

    @Override
    public String setContent(String content) {
        String contentId = Integer.toString(content.hashCode());
        contentMap.put(contentId, content);

        return contentId;
    }

}