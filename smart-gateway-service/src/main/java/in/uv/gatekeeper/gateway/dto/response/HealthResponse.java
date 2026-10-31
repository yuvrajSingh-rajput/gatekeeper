package in.uv.gatekeeper.gateway.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class HealthResponse {
    private String serviceName;
    private String serviceDescription;
    private String appStatus;
}