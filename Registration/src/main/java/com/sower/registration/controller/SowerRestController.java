package com.sower.registration.controller;
 
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class SowerRestController 
{
	
	Logger logger = Logger.getLogger(SowerRestController.class.getName());
	/**
	 * Entry Method for every user.
	 * Using mobileNumber we need to send the OTP.
	 * OTP registration is mandatory
	 * @param username
	 * @param mobileNumber
	 * @return
	 */
    @RequestMapping(value = "/registerUser/{username}&{mobileNumber}")
    public @ResponseBody boolean registerUser(@PathVariable("username") String username,
    		@PathVariable("mobileNumber") String mobileNumber
    		) 
    {
       System.out.println("Input Name:"+username);
       System.out.println("Input age:"+mobileNumber);
       
       //TODO give a OTP call to the registered mobileNumber.
         
        return Boolean.TRUE;
    }
    
    
    
    /**
     * Used to register Customer
     * @param username
     * @param mobileNumber
     * @param firstName
     * @param lastName
     * @param dob
     * @param street
     * @param city
     * @param state
     * @param country
     * @param pincode
     * @param customerType
     * @param gps_longitude
     * @param gps_latitude
     * @param gender
     * @return
     */
    @RequestMapping(value = "/registerCustomer/{username}&"
    		+ "{mobileNumber}"
    		+ "&{firstName}"
    		+ "&{lastName}"
    		+ "&{dob}"
    		+ "&{street}"
    		+ "&{city}"
    		+ "&{state}"
    		+ "&{country}"
    		+ "&{pincode}"
    		+ "&{customerType}"
    		+ "&{gps_longitude}"
    		+ "&{gps_latitude}"
    		+ "&{gender}")
   
    public @ResponseBody boolean registerCustomer
    (
    		@PathVariable("username") String username,
    		@PathVariable("mobileNumber") String mobileNumber,
    		@PathVariable("firstName") String firstName,
    		@PathVariable("lastName") String lastName,
    		@PathVariable("dob") String dob,
    		@PathVariable("street") String street,
    		@PathVariable("city") String city,
    		@PathVariable("state") String state,
    		@PathVariable("country") String country,
    		@PathVariable("pincode") String pincode,
    		@PathVariable("customerType") String customerType,
    		@PathVariable("gps_longitude") String gps_longitude,
    		@PathVariable("gps_latitude") String gps_latitude,
    		@PathVariable("gender") String gender
    		
    		) 
    {
       //TODO RDBMS Call to store this data
         
        return Boolean.TRUE;
    }
    
    
    
     
//    @RequestMapping(value = "/employees/{id}")
//    @ResponseBody
//    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id) 
//    {
//        if (id <= 3) {
//            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
//            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
//        }
//        return new ResponseEntity(HttpStatus.NOT_FOUND);
//    }
}