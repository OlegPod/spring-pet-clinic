package com.olehpodolin.sfgpetclinic.repositories;

import com.olehpodolin.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
