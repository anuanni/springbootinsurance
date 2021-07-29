package com.insurance.repository;
import org.springframework.data.repository.CrudRepository;

import com.insurance.model.Insurance;
public interface InsuranceRepository extends CrudRepository<Insurance, Integer>
{
}
