package org.link.advertise.core.model.dto;

import lombok.Data;

/**
 * @author g
 */
@Data
public class UserLoginDTO {

    private Long expireTime;
    private String token;


}
