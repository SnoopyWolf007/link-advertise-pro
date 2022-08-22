package org.link.advertise.core.model;

import lombok.Data;

/**
 * @author jcm
 */
@Data
public class IRequest<T> {
    private Header header;
    private T body;

    @Data
    public static class Header {
        private String token;
        private Long tenantId;
        private Long userId;
    }
}
