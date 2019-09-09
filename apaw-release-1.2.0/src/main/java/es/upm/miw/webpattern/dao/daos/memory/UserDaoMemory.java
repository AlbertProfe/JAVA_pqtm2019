package es.upm.miw.webpattern.dao.daos.memory;

import es.upm.miw.webpattern.dao.daos.UserDao;
import es.upm.miw.webpattern.dao.entities.User;

import java.util.Collections;
import java.util.List;

public class UserDaoMemory extends GenericMemoryDao<User, Integer> implements UserDao {

    @Override
    protected Integer getId(User entity) {
        return entity.getId();
    }

    @Override
    public List<User> findByName(String name) {
        return Collections.emptyList();
    }

}
