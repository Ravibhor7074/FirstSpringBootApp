package com.example.SpringBootExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.SpringBootExample.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);
	
	@Query("select e from Employee e where e.id = :id And e.name=:name")
	Employee findByIdAndName(@Param("id") int id,@Param("name") String name);
}
