package com.example.p_64_260806;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    //Qualifier를 통해 어떤 메서드를 통해 빈을 주입받을 것인지 선택 가능
    public PersonService(@Qualifier("personRepository") PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public int count() {
        return personRepository.count();
    }
}