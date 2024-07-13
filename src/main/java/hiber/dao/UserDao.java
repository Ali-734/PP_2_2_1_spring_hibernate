package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
   void add(User user);

   void add(User user, Car car);

   List<User> listUsers();

   User UsersByCar(String model, int series);
}
