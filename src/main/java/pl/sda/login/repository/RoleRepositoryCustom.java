package pl.sda.login.repository;

import pl.sda.login.model.User;

public interface RoleRepositoryCustom {
    User nonStandardSearch(String param1, String param2);
}
