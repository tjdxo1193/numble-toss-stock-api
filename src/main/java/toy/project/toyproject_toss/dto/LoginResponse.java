package toy.project.toyproject_toss.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String accessToken;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String refreshToken;

    public static class Builder {
        private String accessToken;
        private String refreshToken;

        public Builder(){}

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public LoginResponse build() {
            return new LoginResponse(this.accessToken, this.refreshToken);
        }
    }
}
