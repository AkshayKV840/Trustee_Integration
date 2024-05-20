package com.trustee.model.dto;

import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TokenLogDto {

    private Integer id;

    private String userId;

    private String userType;

    private String email;

    private String token;

    private String ip;

    private Integer attempt;

    private Integer isValid;

    private OffsetDateTime expiredAt;

    public Integer getAttempt() {
        if (this.attempt == null) {
            return 0;
        }
        return this.attempt;
    }
}
