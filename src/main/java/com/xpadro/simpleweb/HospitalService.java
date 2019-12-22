package com.xpadro.simpleweb;

import java.util.List;

public interface HospitalService {

    List<Hospital> findHospitals(String city);
}
