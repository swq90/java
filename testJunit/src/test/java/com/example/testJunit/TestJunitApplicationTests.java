package com.example.testJunit;

import com.example.testJunit.demos.web.BasicController;
import com.example.testJunit.demos.web.MyCrudRepository;
import com.example.testJunit.demos.web.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;


@SpringBootTest
@AutoConfigureMockMvc
class TestJunitApplicationTests {

    @MockBean
    MyCrudRepository crud;

    @Autowired
    BasicController basicController;

    @Test
    void contextLoads() {
        User user = new User();
        user.setAge(111);
        user.setName("jjjj");
        when(crud.findById(anyLong())).thenReturn(java.util.Optional.of(user));
//        System.out.println("999aaaa".replaceAll("\\d","bbb"));
//        System.out.println("\\999aaaa".replaceAll("\\\\\\d","bbb"));
//        System.out.printf("!!!!");
        User mockuser = crud.findById(999l).get();

        assert mockuser.getName().equals("jjjj");
        System.out.println(basicController.saveUser(user));
        user.setName("tttt");
        System.out.println(basicController.saveUser(user));
        System.out.println(basicController.user().getName());
    }

//tomcat debug yuancheng
//git chongtu
}
