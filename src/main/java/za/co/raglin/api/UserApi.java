package za.co.raglin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.raglin.model.User;
import za.co.raglin.repository.UserRepository;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserApi {

    private UserRepository userRepository;

    @Autowired
    public UserApi(UserRepository userRepositoryInput) {
        userRepository = userRepositoryInput;
    }
    private static final Logger LOGGER = LoggerFactory.getLogger(UserApi.class);

    @GetMapping
    public List<User> getUser(){
        LOGGER.info("Get all users");
        return userRepository.findAll();

    }
}
