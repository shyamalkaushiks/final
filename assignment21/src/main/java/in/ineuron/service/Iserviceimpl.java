package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CollegeData;
import in.ineuron.dao.ICoronaVaccineRepo;

@Service
public class Iserviceimpl implements IService {

	@Autowired
	ICoronaVaccineRepo repo;

	@Override
	public String SaveApp(CollegeData vaccine) {
		// TODO Auto-generated method stub
		  CollegeData college=repo.save(vaccine);
		      
		return "value is"+college.getRegNo();
	}


}
