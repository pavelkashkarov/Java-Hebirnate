package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(Person person) {
        entityManager.persist(person);
    }

    @Transactional
    public List<Person> findByCityOfLiving(String cityOfLiving) {
        var query = entityManager.createQuery("select person from Person person where person.cityOfLiving = cityOfLiving", Person.class);
        return query.getResultList();
    }

    @Transactional
    public void delete(Long id) {
        var person = entityManager.find(Person.class, id);
        entityManager.remove(person);
    }
}