package in.uv.gatekeeper.management.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HealthResponse {
    private String serviceStatus;
    private String dbStatus;
    private LocalDateTime timestamp;
}