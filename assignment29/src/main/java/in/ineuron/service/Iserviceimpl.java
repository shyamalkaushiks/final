package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import in.ineuron.bo.CoronaVacine;
import in.ineuron.dao.ICoronaVaccineRepo;
@Service
public class Iserviceimpl implements IService {

	@Autowired
	ICoronaVaccineRepo repo;

	@Override
	public Iterable<CoronaVacine> fetchDetails(boolean asc, String... properties) {
		// TODO Auto-generated method stub
		   Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
		
		
	}

	@Override
	public Iterable<CoronaVacine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {
		// TODO Auto-generated method stub
		PageRequest name=PageRequest.of(pageNo, pageSize, asc?Direction.ASC:Direction.DESC, properties);
		 Page<CoronaVacine> pagedata= repo.findAll(name);
		return pagedata.getContent();
	}

	@Override
	public void fetchDetailsByPagination(int pageSize) {
		// TODO Auto-generated method stub
		// total record count
		long count = repo.count();// total = 7

		// deciding pagesCount
		long pagesCount = count / pageSize;// pagesCount = 7/3 = 2
		pagesCount = count % pageSize == 0 ? pagesCount : ++pagesCount; // pagesCount = 3

		for (int i = 0; i < pagesCount; i++) {
			// loop running from 0,1,2
			Pageable pageable = PageRequest.of(i, pageSize);
			Page<CoronaVacine> page = repo.findAll(pageable);
			page.getContent().forEach(System.out::println);
			System.out.println("-------------------" + (i + 1) + " of :: " + page.getTotalPages());
		}
		
	}
	


}
