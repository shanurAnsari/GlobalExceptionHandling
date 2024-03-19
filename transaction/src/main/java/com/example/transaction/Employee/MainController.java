package com.example.transaction.Employee;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class MainController {

    @Autowired private EmployeeService employeeService;
    @Autowired private ModelMapper modelMapper;

    @PostMapping("/add")
    public ResponseEntity<Employee> add(@RequestBody Employee employee) throws Exception {
        Employee newEmp = this.employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(newEmp, HttpStatus.CREATED);
    }

    @GetMapping("/Id/{Id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int Id){
        Employee emp = employeeService.getEmployeeById(Id);

        EmployeeDTO empDto = modelMapper.map(emp, EmployeeDTO.class);
        return ResponseEntity.ok(empDto);
    }
}
