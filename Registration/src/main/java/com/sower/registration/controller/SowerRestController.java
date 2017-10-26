package com.sower.registration.controller;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class SowerRestController 
{
    @RequestMapping(value = "/registerUser/{username}&{mobileNumber}")
    public @ResponseBody boolean registerUser(@PathVariable("username") String username,
    		@PathVariable("mobileNumber") String mobileNumber
    		) 
    {
       System.out.println("Input Name:"+username);
       System.out.println("Input age:"+mobileNumber);
         
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