package in.ineuron.service;
import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVacine;

public interface IService {
	public Iterable<CoronaVacine> fetchDetails(boolean asc, String... properties);

	public Iterable<CoronaVacine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties);

	public void fetchDetailsByPagination(int pageSize);


}
