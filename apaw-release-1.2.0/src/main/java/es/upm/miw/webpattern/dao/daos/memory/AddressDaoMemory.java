package es.upm.miw.webpattern.dao.daos.memory;

import es.upm.miw.webpattern.dao.daos.AddressDao;
import es.upm.miw.webpattern.dao.entities.Address;

import java.util.Collections;
import java.util.List;

public class AddressDaoMemory extends GenericMemoryDao<Address, Integer> implements AddressDao {

    @Override
    protected Integer getId(Address entity) {
        return entity.getId();
    }

    @Override
    public List<Address> findByCityAndStreet(String city, String street) {
        return Collections.emptyList();
    }

}
