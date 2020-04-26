package streafa.tech.polcar.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import streafa.tech.polcar.model.StockProductData;

@Repository
public interface StockListRepo extends CrudRepository<StockProductData, String> {
}
