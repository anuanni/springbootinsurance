package com.insurance.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Insurance;
import com.insurance.service.InsuranceService;
//mark class as Controller
@RestController
public class InsuranceController 
{
//autowire the InsuranceService class
@Autowired
InsuranceService insuranceService;
//creating a get mapping that retrieves all the insurance detail from the database 
@GetMapping("/Insurance")
private List<Insurance> getAllinsurance() 
{
return insuranceService.getAllInsurance();
}
//creating a get mapping that retrieves the detail of a specific policy
@GetMapping("/Insurance/{policyid}")
private Insurance getInsurance(@PathVariable("policyid") int policyid) 
{
return insuranceService.getInsuranceById(policyid);
}
//creating a delete mapping that deletes a specified policy
@DeleteMapping("/Insurance/{policyid}")
private void deleteInsurance(@PathVariable("policyid") int policyid) 
{
insuranceService.delete(policyid);
}
//creating post mapping that post the policy detail in the database
@PostMapping("/Insurance")
private int saveInsurance(@RequestBody Insurance insurance) 
{
	insuranceService.saveOrUpdate(insurance);
return insurance.getpolicyid();
}
//creating put mapping that updates the insurance detail 
@PutMapping("/Insurance")
private Insurance update(@RequestBody Insurance insurance) 
{
insuranceService.saveOrUpdate(insurance);
return insurance;
}
}
