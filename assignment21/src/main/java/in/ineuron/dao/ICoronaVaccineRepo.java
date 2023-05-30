package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.bo.CollegeData;


public interface ICoronaVaccineRepo extends CrudRepository<CollegeData, Long> {

}
