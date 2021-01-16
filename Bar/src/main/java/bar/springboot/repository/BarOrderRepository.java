package bar.springboot.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bar.springboot.model.BarOrder;

@Repository
public interface BarOrderRepository extends CrudRepository<BarOrder, Long>{

	List<BarOrder> findByBarClient(String barClient);
}
