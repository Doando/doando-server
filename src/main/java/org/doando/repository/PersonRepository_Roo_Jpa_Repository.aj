// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.doando.repository;

import org.doando.domain.Person;
import org.doando.repository.PersonRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect PersonRepository_Roo_Jpa_Repository {
    
    declare parents: PersonRepository extends JpaRepository<Person, Long>;
    
    declare parents: PersonRepository extends JpaSpecificationExecutor<Person>;
    
    declare @type: PersonRepository: @Repository;
    
}
