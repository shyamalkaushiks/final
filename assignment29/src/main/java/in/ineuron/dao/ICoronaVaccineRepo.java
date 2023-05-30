package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import in.ineuron.bo.CoronaVacine;

public interface ICoronaVaccineRepo extends PagingAndSortingRepository<CoronaVacine, Long> {

}
