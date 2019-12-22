package com.xpadro.simpleweb;

import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

@Service
public class HospitalServiceImpl implements HospitalService {
    private static final Map<String, List<Hospital>> mappings;

    static {
        mappings = new HashMap<>();
        mappings.put("Barcelona", asList(
                new Hospital("Hospital de Barcelona"),
                new Hospital("Hospital Clinic")));

        mappings.put("Sabadell", singletonList(
                new Hospital("Parc Tauli")
        ));
    }

    @Override
    public List<Hospital> findHospitals(String city) {
        return mappings.getOrDefault(city, emptyList());
    }
}
