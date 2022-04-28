package service;

import com.example.defaultspringbootapp.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> list() {
        return List.of(
                new User("Alex",25),
                new User ("Bob",28)
        );
    }

}
