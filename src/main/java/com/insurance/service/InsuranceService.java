package com.insurance.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Insurance;
import com.insurance.repository.InsuranceRepository;
//defining the business logic
@Service
public class InsuranceService 
{
@Autowired
InsuranceRepository InsuranceRepository;
//getting all insurance record by using the method findaAll() of CrudRepository
public List<Insurance> getAllInsurance() 
{
List<Insurance> Insurance = new ArrayList<Insurance>();
InsuranceRepository.findAll().forEach(Insurance1 -> Insurance.add(Insurance1));
return Insurance;
}
//getting a specific record by using the method findById() of CrudRepository
public Insurance getInsuranceById(int id) 
{
return InsuranceRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Insurance Insurance) 
{
InsuranceRepository.save(Insurance);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
InsuranceRepository.deleteById(id);
}
//updating a record
public void update(Insurance Insurance, int policyid) 
{
InsuranceRepository.save(Insurance);
}
}