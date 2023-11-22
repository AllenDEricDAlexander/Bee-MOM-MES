package top.atluofu.auth_center.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import top.atluofu.common.result.ResultUtils;

@Slf4j
@Component
public class NoAuthAccessDeniedHandler implements AccessDeniedHandler {
    @Autowired
    private ObjectMapper objectMapper;

    @SneakyThrows
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) {
        log.info("认证未通过:{}", accessDeniedException.getMessage());
        response.setContentType("application/json;charset=UTF-8");
        response.setStatus(500);
        response.getWriter().write(ResultUtils.error(400, accessDeniedException.getMessage()).toString());
    }
}
