package org.link.advertise.core.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jcm
 */
@Data
@Accessors(chain = true)
public class IResponse {

    private Integer code;

    private String message;

    private Object data;

    public static IResponse getInstance() {
        return new IResponse();
    }

    public static IResponse success() {
        return getInstance().setCode(0).setMessage("success");
    }

    public static IResponse success(String message) {
        return getInstance().setCode(0).setMessage(message);
    }

    public static IResponse fail() {
        return getInstance().setCode(1).setMessage("fail");
    }

    public static IResponse fail(String message) {
        return getInstance().setCode(1).setMessage(message);
    }
}
