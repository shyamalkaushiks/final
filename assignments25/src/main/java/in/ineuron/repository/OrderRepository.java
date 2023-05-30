package in.ineuron.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ineuron.entity.Ordersdata;

@Repository
public interface OrderRepository extends JpaRepository<Ordersdata, Long> {

   // List<Ordersdata> findByUserId(Long userId);
}
