package top.atluofu.auth_center.service;

import top.atluofu.auth_center.domain.User;
import top.atluofu.common.result.ResultUtils;

public interface LoginService {
    ResultUtils login(User user);

    ResultUtils logout();
}
